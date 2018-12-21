//VoterServlet.java
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import java.io.PrintWriter;
import java.io.IOException;
public class VoterServlet extends GenericServlet
{
	public void service (ServletRequest request,ServletResponse response) throws IOException,ServletException
	{
		//Read user and age
		String s1=request.getParameter("user");
		String s2=request.getParameter("age");
		int i=Integer.parseInt(s2);
		//Writes output on WebPage according to input
		PrintWriter out=response.getWriter();
		if(i>=18)
		{
			out.println("Hello "+s1);
			out.println("You are eligible to vote");
		}
		else
		{
			out.println("Hello "+s1);
			out.println("Sorry,not eligible to vote");
		}
		out.close();
	}
}