import java.util.*;

class Website 
{
	 static String urls[] = {"https://www.google.com","https://www.hackerearth.com","https://www.wikipedia.com"};

	static  int countgoogle,countearth,countwiki = 0;
	static ArrayList<String> urlInput= new ArrayList<String> (); 

   public static ArrayList setUrl(ArrayList<String> url)
	{
       ArrayList<String> sortedList = new ArrayList<String>();

         for(String userurl : url)
		 {
		    if(userurl.equals(urls[0]))
			 {
			   countgoogle++;
			 }
			 else if(userurl.equals(urls[1]))
			 {
			   countearth++;
			 }
			   else if(userurl.equals(urls[2]))
			   {
                 countwiki++;
			   }
		 }

           
        for(int i=0;i<3;i++)
		{

         if(countgoogle>countearth)
		 {
		    if(countgoogle>countwiki)
			 {
			   sortedList.add(urls[0]);
			   countgoogle = -1;
			 }
			 else
			 {
			   sortedList.add(urls[2]);
			   countwiki = -1;
			 }
		 }
		 else
		 {
			 if(countearth>countwiki)
			 {
			    sortedList.add(urls[1]);
				countearth = -1;
			 }

		     else
			 {
                sortedList.add(urls[2]);
				countwiki = -1;
			 }
		 
		 }

		}

		return sortedList;

    }

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

        System.out.println("Enter total no. of user participating in survey");
        
		int n = Integer.parseInt(s.nextLine());

        System.out.println("Please enter choice between 1 to 3 : \n "+ "1 : "+urls[0]+"\n 2 : "+urls[1]+"\n 3 : "+urls[2]);

        for(int i=1;i<=n;i++)
		{
		   System.out.println("User "+i +"choice = ");

		   int choice = Integer.parseInt(s.nextLine());
		   
		   switch(choice)
			{ 
			   case 1:
				   urlInput.add(urls[0]);
			       break;
			   case 2:
				   urlInput.add(urls[1]);
			       break;
			   case 3:
				   urlInput.add(urls[2]);
			       break;
			   default:
				   System.out.println("Wrong choice");
			       break;
		    }
		}

		ArrayList<String> optimizedUrlList =  setUrl(urlInput);

		for(String urlName : optimizedUrlList)
		{
		   System.out.println(urlName+"\n");
		}
	}
}
