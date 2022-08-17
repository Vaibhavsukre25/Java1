package runall;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC1 {

	
		public static void main(String[] args) throws Exception{
			//Step 1 - Register or Load the Driver
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 - Establish a connection
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/layla","root","root");
			
			//Step 3 - Process the connection and result
				
				System.out.println(con);
		}
	}

