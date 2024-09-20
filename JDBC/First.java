package jDBC;
import java.sql.*;

public class First {

	public static void main(String[] args)  {
		try {
		// Class is Class name. hence  C must be capital
//		forName() is method.hence N must be capital.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// forName will load Driver class into memory
		//and then static block of Driver class is executed where new Driver() is write
		System.out.println("Done!");
		}catch(Exception e) {
			System.out.println("Error name ->"+e);
		}
	}

}
