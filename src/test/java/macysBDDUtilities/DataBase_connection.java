package macysBDDUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase_connection {
	
	public Statement st;

	public DataBase_connection() {
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">>>> OracleDriver Loaded <<<<");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "hr");
			this.st = con.createStatement();

		} catch (Exception e) {
			System.out.println("!!Database Connectivity Failed!!");
			e.printStackTrace();
		}
	}


}
