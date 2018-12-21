class Node 
{
	int info;
	Node next;
}

class LinkedList
{

  int count = -1;
  Node head;

	void insertAtEnd(int data)
	{
        Node node = new Node();

		node.info = data;
		node.next = null;

		if(head==null)
		{
			head = node;	
		}

		else	
		{
			Node n = head;
			while(n.next!=null)
			{
             n = n.next;
			}
			n.next=node;
		}
	}

	void insertAtBeg(int data)
	{
		Node node = new Node();
		node.info=data;
		node.next=null;
        
		if(head==null)
		{
           head = node;
		}
		else
		{
			node.next = head;
			head = node;
		}
	}

	void deleteAtEnd()
    {
		Node previous=null;
		Node n=head;
		if(n==null)
		{
			System.out.println("Linklist is empty!");
		
		}
		else
		{
		while(n.next!=null)
			{
               previous = n;
               n = n.next;  
		   }
		   previous.next = null;
		}
		
	}

	void deleteAtBeg()
	{
         if(head==null)
		 {
		    System.out.println("Linklist is empty!");
		 }
		 else
		{
		head = head.next;
		}
	}


	void deleteAt(int position)
	{
        Node n = head;
		while(n!=null)//checking how many nodes are present in a link list
		{
			++count;
		  n = n.next;
		}

		if(position>count)
		{
		  System.out.println("Plz enter valid position/Linklist is smaller than given position");
		}
		else
		{
			Node curr = head;
			Node prev = null;
			//When position is valid
			for(int i = 1;i<=position;i++)
			{
				prev = curr;
				curr = curr.next;
			
			}
			prev.next=curr.next;
			}
		}
	

	void insertAt(int position,int data)
	{
        Node n = head;
		while(n!=null)//checking how many nodes are present in a link list
		{
			++count;
		  n = n.next;

		}

		if(position>count)
		{
		  System.out.println("Plz enter valid position/Linklist is smaller than given position");
		}
		else
		{
			//When position is valid
           Node node = new Node();
		   node.info = data;
		   node.next = null;

			if(head==null)
			{
               head = node;
			}
			else
			{
			  Node nx = head;
              count=0;

			  for(int i=1;i<position;i++)
				{
				  nx=nx.next;
			  
			   }
			   node.next = nx.next;
			   nx.next=node;
			}		
		}
	}

	void show()
	{
		Node n1 = head;

		while(n1!=null)
		{
		  System.out.println(n1.info);
		  n1 = n1.next;
		}
	}
}

class LinkedListDemo
{
	public static void main(String[] args) 
	{

		LinkedList ll = new LinkedList();
		ll.insertAtEnd(20);
		ll.insertAtEnd(30);
		ll.insertAtEnd(60);
		ll.insertAtEnd(90);
		ll.insertAtBeg(15);
		/**
		ll.show();
		ll.insertAt(3,26);
		ll.show();
		ll.deleteAtEnd();
		ll.show();
		ll.deleteAtBeg();
		ll.show();*/
		ll.deleteAt(2);
		ll.show();

	}
}
