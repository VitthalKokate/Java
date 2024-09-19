package JDBC;
import java.sql.*;
import java.util.*;

public class InsertRec {

	public static void main(String[] args)  {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		Scanner sc=new Scanner(System.in);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
		
		ps1=conn.prepareStatement("Insert into emp values (?,?,?)");
		
		System.out.println("Enter Employee id, name and Salary you want to insert.");
		int id=sc.nextInt();
		String nm=sc.next();
		int sal=sc.nextInt()	;
		
		ps1.setInt(1, id);
		ps1.setString(2, nm);
		ps1.setInt(3, sal);
		ps1.executeUpdate();
		
		System.out.println("Done");
		
		}
		catch(Exception e) {
			System.out.println("Exception Name ->"+e);
		}
		
		
	}

}
