//Impleting dynamic static stack in java

import java.util.Scanner;

class DynamicStack
{



	int select;
	int size=2;
	int stack[];
	int position = -1;

 Scanner s = new Scanner(System.in);

void init() //Assigning size of an stack 
{
	stack = new int[size];
}

void choice()
{

    System.out.println("\n Please select one of the option  : \n");

	System.out.println("1.push");
	System.out.println("2.pop");
	System.out.println("3.peek"); //Viewing the top element
	System.out.println("4.view");
	System.out.println("5.exit"); 

     try
     {
		

	System.out.print("\nSelect Operation on Stack : ");
	select = Integer.parseInt(s.nextLine());

	 }

	 catch(NumberFormatException e)
	 {
		 System.out.println("Plz enter only integer value");
		 choice();
	 }

	switch(select)
	{

	
	    case 1 :
		push();
	    break;

		case 2 :
		pop();
	    break;

		case 3 :
		peek();
	    break;

		case 4 :
		view();
	    break;

		case 5 :
		System.exit(1);
	    break;

		default:
        System.out.println("Invalid choice");
		choice();
		
	}
	choice();

}//end of choice()



void push()
{

	System.out.println("*****************Push Operation *******************\n");



     ++position;

	if(position<size)
	{
	System.out.print("Enter an element to insert : ");
	int insert = Integer.parseInt(s.nextLine());
	
	stack[position]=insert;
    System.out.print("Element inserted Successfully ");
	}


	else
	{
		

		//if stack is full we are incrementing (size*2) and copying into a new array

		size = size *2;
		int newstack[] = new int[size];

		for(int i=0;i<stack.length;i++)
		{
			newstack[i] = stack[i];
		
		}

		stack = newstack;

	   System.out.print("Enter an element to insert : ");
	   int insert = Integer.parseInt(s.nextLine());
	
	   stack[position]=insert;
       System.out.print("Element inserted Successfully ");

	}

}



void pop()
{
		System.out.println("*****************Pop Operation *******************\n");

		if(position>=0)
	   {
		
		stack[position]=0;
		System.out.print("Element Popped Successfully ");
		--position;
		decreaseStackSize();
	   }
	   else
	   {
         System.out.println("Stack is Empty!");
	   }

}

   void decreaseStackSize()
	{
	   if(position<(stack.length/2) && position>0)//When element is deleted we r decreasing stack size &Minimum stack size will be 2
		{

          size = stack.length/2;

		  int newstack[] = new int[size];

		  for(int i=0;i<size;i++)
		  {
		    newstack[i]=stack[i];
		  }
		  stack = newstack;
	   
	    }

    }



void view()//viewing all elements of the stack
{
	System.out.print("Elements in stack are : [");
	for(int x:stack)
	{
	 	System.out.print(x+",");
	}
	System.out.print("]");

}



void peek()
{

 if(position>=0)
	{
      
	  System.out.println("Top Element is : "+stack[(position)]);
      
    }

	else
	{
	  System.out.println("Stack is empty!");
	
	}
	
}

}//BLC



class  DynamicStackDemo
{
	public static void main(String[] args) 
	{
		DynamicStack st = new DynamicStack();
		st.init();
		st.choice();
	}
}//ELC
