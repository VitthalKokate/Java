package JDBC;
import java.sql.*;

public class Second {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		Statement stmt =null;
		ResultSet rs=null;
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","root123");
		stmt=conn.createStatement();
		rs= stmt.executeQuery("select * from student;");
		
		while(rs.next()) {
			System.out.println("Student id->"+rs.getInt(1)+"\tName->"+rs.getString(2)+"\tAge->"+rs.getInt(3));
		
		}
		

	}

}
