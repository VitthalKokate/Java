package JDBC;
import java.sql.*;

public class DelSalCol {

	public static void main(String[] args) throws Exception {
		Connection conn =null;
		Statement stmt=null;
//		ResultSet rs=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root123");
		stmt=conn.createStatement();
		
		stmt.executeUpdate("ALTER TABLE employee DROP COLUMN sal");
		
		System.out.println("DONe!");
		

	}

}
