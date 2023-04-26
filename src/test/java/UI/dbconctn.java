package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class dbconctn {
	
	
	@Test
	public void Execute() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","root97");
	Statement s = c.createStatement();
	
	s.executeUpdate("update students set name= \"monkey\" where id = 5");
	ResultSet rs = s.executeQuery("SELECT * FROM main.students");
	while(rs.next()) {
		System.out.println(rs.getInt(1) +"  "+ rs.getString(4) + "  " + rs.getString(2));
	}
	c.close();
	}
}
