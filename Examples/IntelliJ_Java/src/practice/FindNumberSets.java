package practice;/*Que :  Find Sets Of Numbers That Add Up To 16
       EX: [2, 4, 6 ,10]    */

import java.util.ArrayList;
import java.util.Arrays;

public class FindNumberSets {

    private ArrayList<int[]> getSets(int[] set, int sum) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        int count = 1;
        for(int i=0 ; i<set.length ; i++){
            if(count==1){
                if(sum==set[i]){
                    res.add(new int[]{set[i]});
                }
                count++;

            }
            if(count==2 && i<3){
                if(sum==set[i]+set[i+1]){
                    res.add(new int[]{set[i], set[i+1]});
                }
                count++;
            }
            if(count==3 && i<2){
                if(sum==set[i]+set[i+1]+set[i+2]){
                    res.add(new int[]{set[i],set[i+1],set[i+2]});
                }
                count++;
            }
            if (count==4 && i<1){
                if(sum==set[i]+set[i+1]+set[i+2]+set[i+3]){
                    res.add(new int[]{set[i],set[i+1],set[i+2],set[i+3]});
                }
            }
            count=1;
        }
        return res;
    }


    public static void main(String[] args){

        int[] set = {0, 16, 6, 10};  //only for 4 elements allowed as code is written
        int sum = 16;

        FindNumberSets obj = new FindNumberSets();
        ArrayList<int[]> res = obj.getSets(set,sum);

        for(int[] x: res){
            System.out.println(Arrays.toString(x));
        }
    }

    }
