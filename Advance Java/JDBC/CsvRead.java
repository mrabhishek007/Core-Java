//Read csv file using Sun povided driver Software
//CsvRead.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class  CsvRead
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Driver Loaded Automatically");
		Connection con =DriverManager.getConnection("jdbc:odbc:csvdsn");
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
