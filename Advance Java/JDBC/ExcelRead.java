//Read data from MS Excel using Oracle thin driver
//ExcelRead.java
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
class  ExcelRead
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Driver Loaded Automatically");
		Connection con =DriverManager.getConnection("jdbc:odbc:exceldsn");
		Statement stmt =con.createStatement();
		ResultSet rs =stmt.executeQuery("select * from [sheet1$]");
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}//main()
}
