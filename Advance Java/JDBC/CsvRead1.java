//Read csv file using third party driver Software
//CsvRead1.java
//set "csvjdbc-1.0-32.jar" as classpath to run this program(provided by third party vendor)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class  CsvRead1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.relique.jdbc.csv.CsvDriver");//optional
		System.out.println("Driver Loaded ");
		Connection con =DriverManager.getConnection("jdbc:relique:csv:C:/Users/Vikash/Desktop/Java programs/ExtraStuff");
		Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
		while (rs.next())
		{
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
