package JDBC;
import java.sql.*;
import java.util.Scanner;
public class BookInfo {

	public static void main(String[] args)  throws Exception{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		Scanner s1=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/store","root","root123");
		stmt=conn.createStatement();
		
		System.out.println("How many records you want to insert :");
		int n=s1.nextInt();
		for(int i=1;i<=n;i++) {
		
		ps1=conn.prepareStatement("insert into book values (?,?,?)");
		System.out.println("Entere book id , name and cost");
		int id=s1.nextInt();
		String nm=s1.next();
		int p=s1.nextInt();
		
		ps1.setInt(1,id); 
		ps1.setString(2,nm);
		ps1.setInt(3, p);
		ps1.executeUpdate();
		
		
		}
		
		
		System.out.println("\n\nDisplay all records \n\n");
		System.out.println("ID \tName \tcost");
		rs=stmt.executeQuery("SELECT * FROM book");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		
		
		
	}

}
