package JDBC;

import java.util.Scanner;
import java.sql.*;

public class Login {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs = null;
		PreparedStatement ps1 = null,ps2=null;
		Scanner s1 = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","root123");
			stmt = conn.createStatement();

			ps1 = conn.prepareStatement("INSERT INTO login values (?,?)");
			

			System.out.println("Enter Id");
			String id = s1.next();
			System.out.println("Enter Password");
			String pw = s1.next();

			ps1.setString(1, id);
			ps1.setString(2, pw);
			ps1.executeUpdate();

			System.out.println("Check");
		ps2=conn.prepareStatement("select * from login where id =? and pass=?");
		
		System.out.println("Enter Id to check");
		String id2 = s1.next();
		System.out.println("Enter Password to check");
		String pw2= s1.next();
		
		ps2.setString(1, id2);
		ps2.setString(2, pw2);
		rs=ps2.executeQuery();
		
		if(rs.next()) {
			System.out.println("Correct");
		}else {
			System.out.println("Not present");
		}
		
		

		
		} catch (Exception e) {
			System.out.println("Error comes ->" + e);
		}
	}

}
