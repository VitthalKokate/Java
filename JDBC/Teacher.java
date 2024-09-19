package JDBC;
import java.sql.*;
import java.util.Scanner;
public class Teacher {
	public static void main(String[] args) throws Exception {
		Connection conn=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		PreparedStatement ps1=null;
		Scanner s1=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/school","root","root123");
		stmt=conn.createStatement();	
		ps1=conn.prepareStatement("insert into teacher values(?,?,?,?);");
		System.out.println("Enter Teacher id ,name , salary and designation ->");
		int tid=s1.nextInt();
		String tnm=s1.next();
		int sal =s1.nextInt();
		String des=s1.next();
		
		ps1.setInt(1, tid);
		ps1.setString(2, tnm);
		ps1.setInt(3, sal);
		ps1.setString(4,des);
			ps1.executeUpdate();
			
		rs=stmt.executeQuery("SELECT * FROM teacher;");
		System.out.println("Teacher id\t Name\t Salary\t Destination");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		s1.close();
		conn.close();
	}
}
