package JDBC;
import java.sql.*;
import java.util.*;
public class InsertRec2 {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps1=null;
		Scanner s1=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/store","root","root123");
			ps1=conn.prepareStatement("Insert into book values(?,?,?)");
			
			System.out.println("Enter the book id,name and cost");
			int bid=s1.nextInt();
			String bnm=s1.next();
			int c=s1.nextInt();
			
			ps1.setInt(1, bid);
			ps1.setString(2, bnm);
			ps1.setInt(3,c);
			ps1.executeUpdate();
		
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println("Error Name ->"+e);
		}
		
		
		
	}

}
