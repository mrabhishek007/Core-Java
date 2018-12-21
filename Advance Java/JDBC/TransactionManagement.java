//Illustarte a JDBC program for Transaction Management Using Oracle thin driver
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class  TransactionManagement
{
	public static void main(String[] args) throws Exception
	{
	    System.out.println("Driver Loaded Automatically");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		Statement stmt = con.createStatement();
		con.setAutoCommit(false);//Disable Auto Commit mode (DEFAULT-ENABLED)
		try
		{
			stmt.executeUpdate("insert into coffee_sales_week values('Green',4500,1)");
			stmt.executeUpdate("insert into coffee_sales_week values('Black',5000,1)");
			stmt.executeUpdate("insert into coffee_sales_week values('Green',2500,2)");
			stmt.executeUpdate("insert into coffee_sales_week values('Black',3000,2)");
			stmt.executeUpdate("insert into coffee_sales_month values('January',15000)");
			con.commit();
			System.out.println("Transaction Completed/Commited Successfully");			
		}

		catch (Exception e)
		{
			con.rollback();
			System.out.println("Transaction Cancelled");

		}
		stmt.close();
		con.close();
	}
}
