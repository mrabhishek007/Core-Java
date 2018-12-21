//LoginServlet.java
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class LoginServlet extends GenericServlet 
{
	public LoginServlet()
	{
		System.out.println("Constructer is called");
	}
	public void init()
	{
        System.out.println("init() is called");
	}

public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException
	{
	  System.out.println("service() is called");
	  //reads input values
	  String s1=request.getParameter("uname");
	  String s2= request.getParameter("pswd");

	  PrintWriter  out=response.getWriter();
	  if(s1.equals("root") && s2.equals("12345"))
		{
			out.print("Login Success");
		}
		else
		{
			out.println("Login Failed");
		}
		out.close();

    }
}