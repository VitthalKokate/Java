package jDBC;
import java.sql.*;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Demo","root","root123");
		Statement stmt=conn.createStatement();
//		int c=stmt.executeUpdate("insert into emp values (106,'Kiran',100)");
////		ResultSet rs=stmt.executeQuery("insert into emp values (107,'Modi',500)");
//		int n=stmt.executeUpdate("insert into emp values (107,'Modi',500)");
//		
//		
//		System.out.println(c+"Rows affect");
//		System.out.println(n+ " Rows affect");
//		System.out.println("Done?");
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Choice");
//		int c=sc.nextInt();
//		switch(c) {
//		case 1: int c1=stmt.executeUpdate("insert into emp values (106,'Kiran',100)");
//					System.out.println(c1+"Rows affect");
//			break;
//		case 2:int n=stmt.executeUpdate("insert into emp values (107,'Modi',500)");
//		           System.out.println(n+ " Rows affect");
//			break;
//			
//		case 3://System.out.println("Enter name you want to delete");
//				//String nm=sc.next();
//				boolean b =stmt.execute("Delete from emp Where ename  = Modi");
//				System.out.println(b);
//			
//		default:System.out.println("Incorrect Choice.");
//			
//		
//		}
		
//		
//		int count =stmt.executeUpdate("DELETE from emp");
//		System.out.println(count+" records Deleted");
		
		
//		int c2=stmt.executeUpdate("DELETE from emp where eid=101");
//		System.out.println(c2+" reords Deleted");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the name");
//		String ch=sc.next();
//		int num=stmt.executeUpdate("DELETE from emp where ename='Kiran'");
//		System.out.println(num+" reords Deleted");
		int num2=stmt.executeUpdate("Update emp set ename='Queen',sal=3000 where eid=102");
		System.out.println(num2+" Records updated");
		

		}catch(Exception e) {
			System.out.println("Error ->"+e);
			
		}

	}

}
