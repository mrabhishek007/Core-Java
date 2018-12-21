//Queue using linked list

import java.util.Scanner;

class Node
{
	int data;
	Node next;
}


class Queue 
{
	Node rear=null;
	Node front=null;
	
	void enque(int data)
	{
		Node node =new Node();
        node.data = data;
		node.next = null;

       if(front==null)//when there is no data in queue
		{
          rear = node;
		  front =node;
	    }
		else
		{
			Node x = front;
			while(x.next!=null)
			{
			 x = x.next;
			}
			x.next=node;
			rear = node;		
		}
	
	}//enque




	int deque()
	{
		Node x = front;
		int dequed = front.data;
		front = x.next;
		return dequed;
	}

	int front()
	{
        return front.data ;      

	}

	int rear()
	{
	   return rear.data;
	}

	boolean isEmpty()
	{

	   if(front==null)
		{
			return true; 
		}

		else
		{
		    return false;
		}
	}


	void show()
	{
		Node x= front;

		while(x!=null)
		{
		 System.out.print(x.data+",");
		 x =  x.next;
		 
		}
	
	}

}


class QueueDemo
{
		public static void main(String[] args) 
	{
		Queue queue  = new Queue();
        System.out.println("\n"+queue.isEmpty());
		queue.enque(15);
		queue.enque(19);
		queue.enque(30);
		queue.enque(99);
		System.out.println("\n"+queue.front());
		System.out.println("\n"+queue.rear());
		queue.show();
		System.out.println("\n"+queue.deque());
		queue.show();
		System.out.println("\n"+queue.isEmpty());
		System.out.println("\n"+queue.deque());
	}
}
