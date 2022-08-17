package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

//import com.sun.jdi.connect.spi.Connection;



public class Jdbcprogram1 {
	public static void main(String[] args) throws Exception{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection  con= DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Vaibhav@123");
		
		System.out.println("Connection......."+con);
		
String sql="select * from users";
		
        Statement stmt=con.createStatement();
		
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("UID..:"+rs.getInt(1)+":UNAME..:"+rs.getString(2)+":city..:"+rs.getString(4));
		}
		
		System.out.println("...........................................................");
		sql="select * from users where city='madurai'";
		
		stmt=con.createStatement();
		
		rs= stmt.executeQuery(sql);
		
		if(rs.next()) {
			System.out.println("UID..:"+rs.getInt(1)+":UNAME..:"+rs.getString(2)+":city..:"+rs.getString(4));
		}
		else {
			System.out.println("no records...");
		}
	}

}
