//Write a JDBC program to copy the data from Worksheet to database table
//ExcelToOracle.java
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
class ExcelToOracle
{
	public static void main(String [] args) throws Exception
	{
		System.out.println("Driver Loaded Automatically");
		Connection con1 = DriverManager.getConnection("jdbc:odbc:exceldsn");
		Statement stmt = con1.createStatement();
		ResultSet rs=stmt.executeQuery("select * from [sheet1$]");


		Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		PreparedStatement pstmt = con2.prepareStatement("insert into mobiledetails values(?,?,?)");
		while (rs.next())
		{
			pstmt.setInt(1,rs.getInt(1));
			pstmt.setString(2,rs.getString(2));
			pstmt.setInt(3,rs.getInt(3));
			int i=pstmt.executeUpdate();
			System.out.println(i+"row is inserted successfully");
		}
		rs.close();
        stmt.close();
	    con1.close();
		pstmt.close();
		con2.close();

	}
}