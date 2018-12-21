//package practice;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
}

public class ReverseLinkList {

    private Node head = null;

    private void add(int num) {

        Node node = new Node();
        node.data = num;

        if(head == null){

            head = node;
            return;
        }

        Node temp = head;

        while (temp.next!= null){

            temp = temp.next;

        }
        temp.next = node;

    }


    private void reverseList() {

        int count=0;
        Node current = head;
		Node prev = null;
		Node next = null;

        // 10 20 30 40
        while (current != null){

            next = current.next ;
			current.next = prev;
			prev = current;
			current = next;
            
		}

		head = prev;

    }



    private void show() {

        Node temp = head ;

        while (temp != null){

            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
	
    }

    public static void main(String[] args){

        ReverseLinkList list = new ReverseLinkList();
        list.add( 10 );
        list.add( 20 );
        list.add( 30 );
        list.add( 40 );
		System.out.print(" Linked List : ");
        list.show();    

		System.out.print("\n Reversed Linked List : ");
        list.reverseList();
        list.show();
    }




}
