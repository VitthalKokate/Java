package JDBC;

import java.sql.*;

public class First {

	public static void main(String[] args)throws Exception{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost/car","root","root123");
		
		stmt=conn.createStatement();
		
		rs=stmt.executeQuery("Select * from car;");
		
		while(rs.next()) {
			System.out.println("Car no ->"+rs.getInt(1)+"\t Name ->"+rs.getString(2)+"\t Price ->"+rs.getInt(3));
		}
		
		conn.close();
		
		
		
		

	}

}
