import java.util.Scanner;

public class StringSplitter {

    private void  getReverseString(String sentence) {

        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++){

            for(int j=words[i].length()-1 ; j>=0; j--){
                System.out.print(words[i].charAt(j));
            }

            System.out.print(" ");
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        StringSplitter split = new StringSplitter();
        split.getReverseString(sentence);

    }

}
