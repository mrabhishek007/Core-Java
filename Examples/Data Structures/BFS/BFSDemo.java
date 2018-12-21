import java.util.*;

class Graph
{

    public LinkedList<Integer> adjecent[];
     
	 int vertices;


          //Constructer

	Graph(int vertices)
	{
	   this.vertices = vertices;

	   adjecent = new LinkedList[vertices]; //Total no of adjecent vertices present in BFS which is 4 in this case

	   for(int i=0;i<vertices;i++)
		{
	   
	    adjecent[i] = new LinkedList(); //creates a linked list for every vertices

	    }

	}

          //adding an edge in a graph

	void addEdge(int vert,int adj ) //vert = vertices which u want to add, adj = adjecent of vertices  
	{
	
	   adjecent[vert].add(adj);//It will add adject vertices in current vertice linked list

	}


	//Print BFS

    void 	BFS(int startVertices)
	
	{
	
	  //creates visited status for every vertices (By default false )

	  boolean visited[] = new boolean [vertices];

        //Creates a queue which will help to reterive and print data of BFS

	  LinkedList<Integer> queue = new LinkedList<Integer>();


      visited[startVertices] = true;

      
	  queue.add(startVertices);

       while(queue.size()!=0)
		{
              //Dequeue a vertex from queue and print it

			 int s =  queue.poll();  // deque process
			 
			 System.out.print(s+" ");


			 //Getting all the adject vertices of qued vertices

		  ListIterator<Integer> li  =  adjecent[s].listIterator(); 


          //Reteving data from a queue vertices
          
		  while(li.hasNext())
			{
		       int nextVer =   li.next();

                if(!visited[nextVer])//
				{
                  visited[nextVer] = true;

				  queue.add(nextVer);//adding vertices to queue  
				}


		    }//while
	   
	    }//end of main while loop
	
	}//--------------BFS

}



  class BFSDemo
 {
	public static void main(String[] args) 
	{
	   Graph g = new Graph(4);	//Total no of vertices in BFS

	    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
         
		 //Let's assume Starting vertex is 2 

		 g.BFS(2);//starting vertex = 2

	}
}
