package JDBC;
import java.util.Scanner;
import java.sql.*;

public class Found {

	public static void main(String[] args)  throws Exception{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		Scanner s1=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/store","root","root123");
		stmt=conn.createStatement();
		
		System.out.println("Enter ID you want to be searched");
		int id=s1.nextInt();
		rs=stmt.executeQuery("SELECT * FROM student WHERE rollno ="+id);
		System.out.println("ID \tName \tAddres");
		if(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		else {
			System.out.println("Record not found");
		}

	}

}
