package JDBC;
import java.sql.*;

public class EmployeeInfo {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/company","root","root123");
		stmt=conn.createStatement();
		rs=stmt.executeQuery("SELECT * FROM employee WHERE dept = 'Comp-Science'");
		System.out.println("Employee id\tName\t Salary\tDepartment");
		
		while(rs.next()) {
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t+"+rs.getString(4));
		}

	}

}
