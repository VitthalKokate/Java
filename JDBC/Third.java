package JDBC;
import java.sql.*;

public class Third {

	public static void main(String[] args) throws Exception {
	
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");//Load the driver
		conn=DriverManager.getConnection("jdbc:mysql://localhost/courses","root","root123");//Establish Connection
		stmt =conn.createStatement();
		rs=stmt.executeQuery("Select * from coding");
		while(rs.next()) {
			System.out.println("Course id->"+rs.getInt(1)+"\tName->"+rs.getString(2)+"\tFees->"+rs.getInt(3));
		}
		
		

	}

}
