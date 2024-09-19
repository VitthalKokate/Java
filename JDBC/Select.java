package JDBC;
import java.sql.*;

public class Select {

	public static void main(String[] args)  {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
		stmt=conn.createStatement();
		rs=stmt.executeQuery("SELECT * FROM emp ");
		
		System.out.println(" Id\tName\tSalary");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		conn.close();
		}
		catch(Exception e) {
			System.out.println("Error Name ->"+e);
		}

	}

}
