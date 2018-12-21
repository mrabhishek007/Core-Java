//Program on transaction Management  Using Savepoint Using Oracle Thin Driver(Type-4 Driver)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;
class  TMSavepoint
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Driver Automatically Loaded");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		Statement stmt =con.createStatement();
		con.setAutoCommit(false);//disable autocommit
		int i=0;
		Savepoint sp=null;
        try
        {
			stmt.executeUpdate("insert into coffee_sales_week values('Lemon',6000,1)");
			stmt.executeUpdate("insert into coffee_sales_week values('Lemon',2000,2)");
			sp=con.setSavepoint();
			 i=1;
			stmt.executeUpdate("delete from student where SID=103");
			con.commit();
			System.out.println("Entire Transaction Commited");			
        }

        catch (Exception e)
        {
			if(i==1)
			{
				con.rollback(sp);
				con.commit();
				System.out.println("Below savepoint are cancelled and above savepoint are commited");
			}

			else
			{
				con.rollback();
				con.commit();
				System.out.println("Entire Transaction is Cancelled ");
			}
        }
		stmt.close();
		con.close();
	}//main()
}
