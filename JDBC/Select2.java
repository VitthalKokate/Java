package JDBC;
import java.sql.*;


public class Select2 {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/store","root","root123");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("Select * from book");
			
			System.out.println("Id\tName\tCost");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			
			
		}catch(Exception e) {
			System.out.println("Error Comes ->"+e);
		}
	}

}
