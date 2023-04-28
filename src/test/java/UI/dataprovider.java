package UI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	
	@Test(dataProvider="login")
	public void run(String username, String password) {
		System.out.println(username + "   " + password);
	}
	
	@Test(priority = 1, dataProvider = "Learn")
	public void view(String user, String paswd, String fruit) {
		System.out.println(user + " " + paswd + " " + fruit);
	}
	
	@DataProvider
	public Object[][] login() {
		Object[][] testdata = new Object[2][2];
		testdata[0][0] = "user1";
		testdata[0][1] = "pwd1";
		
		testdata[1][0] = "user2";
		testdata[1][1]="pwd2";
		
		return testdata;
		
	}
	@BeforeTest
	public void welcome() {
		System.out.println("Welcome Home");
	}
	
	@DataProvider(name = "Learn")
	public Object[][] signin() {
		return new Object[][] {
			{"user1", "pwd1","apple"},
			{"user2", "pwd2","mango"},
			{"user3", "pwd3","orange"},
			{"user4", "pwd","grapes"}
		};
		
	}
	@AfterTest
	public void signoff() {
		System.out.println("Take Care");
	}
	
	
	
}
