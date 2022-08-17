package runall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC2 {
	public static void main(String[] args) throws Exception{
		//Step 1 - Register or Load the Driver
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 - Establish a connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/layla","root","root");
		
		//Step 3 - Process the connection and result
			
			System.out.println(con);
			
			Statement stmt=con.createStatement();
			int n=0;
			//n=stmt.executeUpdate("insert into users values (4,'rani','secret',0)");
			
			//System.out.println("No of rows inserted ..:"+n);
			
			n=stmt.executeUpdate("update users set flag=1");
			System.out.println("No of flags updated ..:"+n);
			
			n=stmt.executeUpdate("delete from users where uid=3");
			System.out.println("No of rows deleted ..:"+n);
			
			boolean result=stmt.execute("create table trans (tid int(1), tname varchar(30), date DATETIME)");
			System.out.println("Table created....:"+result);
			
			result=stmt.execute("select * from users");//only for select queries which return RESULTSET, execute method will return true
			System.out.println("Result...:"+result);
			
	}
}
