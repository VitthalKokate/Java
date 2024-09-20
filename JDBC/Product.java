package jDBC;
import java.sql.*;
import java.util.*;
public class Product {
	public ArrayList<Product2> getProduct(String cat) throws Exception {

		ArrayList<Product2> li = new ArrayList<>();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "root123");
		PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM Product WHERE cate = '" + cat + "'");
		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {
			int pid = rs.getInt(1);
			String nm = rs.getString(2);
			int price = rs.getInt(3);
			String cat2 = rs.getString(4);

			li.add(new Product2(pid, nm, price, cat2));
		}
		return li;
	}

	public static void main(String[] args) throws Exception {
		Product p = new Product();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Categary");
		String ch=sc.next();
		
		ArrayList<Product2> l2 = p.getProduct(ch);

		for (Product2 p2 : l2) {
			System.out.println(p2);
		}
	}
}
