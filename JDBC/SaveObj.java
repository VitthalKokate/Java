package jDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveObj {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SaveObj so=new SaveObj();
		
		Emp emp=new Emp();
		emp.setEid(189);
		emp.setEname("Rock");
		emp.setSal(98000);
		
		so.save(emp);
		

	}
	
	void save(Emp emp) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Demo", "root", "root123");
		Statement stmt = conn.createStatement();
		
		int eid=emp.getEid();
		String nm=emp.getEname();
		int sal=emp.getSal();
		
		stmt.executeUpdate("insert into emp (eid,ename,sal) values ("+eid+",'"+nm+"',"+sal+")");
		System.out.println("Data Stored");
		
	}

}
