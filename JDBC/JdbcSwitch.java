package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JdbcSwitch {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps1 = null, ps2 = null;
		ResultSet rs = null;
		Scanner s1 = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/tybca", "root", "root123");
		stmt = conn.createStatement();

		ps1 = conn.prepareStatement("insert into customer values(?,?,?,?);");
		ps2 = conn.prepareStatement("update customer set name=? where id=?");

		int ch;
		do {
			System.out.println("1.view record \n2.insert into record \n3.update records\n4.Delete records \n5.search records");
			System.out.println("6.Alter \n7.exit \n Enter choice");
			ch = s1.nextInt();

			switch (ch) {
			case 1:
				rs = stmt.executeQuery("select* from customer");
				System.out.println("customer id\t Name\t Address\t Phone Number");
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
				}
				break;

			case 2:
				System.out.println("Enter customer id , name, adress and mob.number");
				int id = s1.nextInt();
				String nm = s1.next();
				String addr = s1.next();
				;
				String mob = s1.next();

				ps1.setInt(1, id);
				ps1.setString(2, nm);
				ps1.setString(3, addr);
				ps1.setString(4, mob);
				ps1.executeUpdate();
				break;

			case 3:
				System.out.println("Enter customer Id and Name to be updated:");
				id = s1.nextInt();
				nm = s1.next();
				ps2.setString(1, nm);
				ps2.setInt(2, id);

				ps2.executeUpdate();
				break;

			case 4:
				System.out.println("Enter customer Id to be deleted :");
				id = s1.nextInt();
				stmt.executeUpdate("delete from customer where id =" + id);
				System.out.println("Record deleted :");
				break;

			case 5:
				System.out.println("Enter customer id to be searched :");
				id = s1.nextInt();

				rs = stmt.executeQuery("select * from customer where id=" + id);
				if (rs.next()) {
					System.out.println("Record found");
					System.out.println(
							rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
				} else
					System.out.println("Record is not found");
				break;

			case 6:
				stmt.executeUpdate("alter table customer add email varchar(20)");
				break;

			case 7:System.out.println("DONE");

				System.exit(1);
				break;

			default:
				System.out.println("Enter correct choice :");

			}

		} while (ch != 7);
		
		

		s1.close();

	}

}
