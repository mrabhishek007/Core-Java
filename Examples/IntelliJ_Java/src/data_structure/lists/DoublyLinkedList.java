package data_structure.lists;
import static java.lang.System.out;

class Node{
    int data;
    Node next;
    Node prev;
}


public class DoublyLinkedList {

    private int length = 0;
    private Node head = null;
    private Node tail = null;

    private void insert(int data) {

        Node node = new Node();
        node.data = data;

        length++;

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next!=null){
            temp = temp.next;
        }

        temp.next = node;
        temp.next.prev = temp;
        tail = temp.next;

    }

    private void insertAtBeg(int data) {

        Node node = new Node();
        node.data = data;

        length++;

        Node temp = head;
        temp.prev = node;
        node.next = temp;
        head = node;

    }

    private int[] delete(int index){

        // index always starts from 0

        if(length >0 && length > index && index>=0 ){

            int tempIndex = 0;
            Node temp = head;

            while (tempIndex != index){
                temp = temp.next;
                tempIndex++;
            }

            // changing the head if deleted element is the 1st element
            if(index == 0){
                head = head.next;
            }

            // changing the tail if deleted element is the last element
            if(index == length-1){
                tail = tail.prev;
            }

            if(temp.prev != null) // checking if deleted element is the first element
            temp.prev.next = temp.next;

            if(temp.next != null)  // checking if deleted element is the last element
            temp.next.prev = temp.prev;
            length-- ;

            return new int[] { index, temp.data } ;
        }
        return null;
    }


    private int getLength(){
        return length;
    }

    private void show() {
        Node temp = head;

        out.print(" Elements are : ");
        while (temp != null){
            out.print(temp.data + " ");
            temp = temp.next;
        }

        out.println();
    }

    private void showReverse(){
        Node temp = tail;

        out.print(" Reverse Elements are : ");
        while (temp != null){
            out.print(temp.data + " ");
            temp = temp.prev;
        }

        out.println();
    }

    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(45);
        list.insertAtBeg(21);
        list.insert(75);
        list.insert(63);
        list.insertAtBeg(51);
        list.show();
        list.showReverse();
        out.println(" Length : "+ list.getLength());

//        int[] res = list.delete(6);
        int[] res = list.delete(0);
        list.insert(100);
        if(res != null) out.println("Deletion successful at index : " + res[0] + " , Data :  " + res[1] );

        list.show();
        list.showReverse();
        out.println(" Length : "+ list.getLength());



    }




}
