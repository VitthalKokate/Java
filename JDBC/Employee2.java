package jDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Employee2 {
	
	int eid;
	String ename;
	int sal;
	
public static void main(String[] args) throws Exception {
	Emp emp=new Emp();
	
	
	Employee2 e=new Employee2();
	
	
		System.out.println(e.list());
}


List list() throws Exception
{
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Demo", "root", "root123");
	Statement stmt = conn.createStatement();
	
	ArrayList<Emp> arrayList=new ArrayList<>();

	ResultSet resultset = stmt.executeQuery("SELECT * FROM emp");
	while (resultset.next()) {
		int id = resultset.getInt("eid");
		String nm = resultset.getString("ename");
		int sal = resultset.getInt("sal");
		System.out.println(id + " " + nm + " " + sal);
		
		Emp emp=new Emp();
		
//		emp.setEid(id);
//		emp.setEname(nm);
//		emp.setSal(sal);
//		
		
		arrayList.add(emp);
				
	}
	
	return arrayList;
	
}
}
