
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class connection {
	public static void main (String[]args) throws SQLException {
	String host= "localhost";
	String port = "3306";

	
	Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root ", "root97");
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select * from EmployeeInfo where name = 'apple'");
	
	while(rs.next()) {
		System.out.println(rs.getString("location"));
	
	
	}
	
	}
}
