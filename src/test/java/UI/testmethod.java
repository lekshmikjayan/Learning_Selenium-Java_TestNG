package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testmethod extends Commondatasetup {

	@BeforeTest(groups="regression")
	public void login() {
		System.out.println("Login to app");
	}
	
	@Test
	public void test1() {
		System.out.println("first test case");
	}
	
	
	
	@Test(groups="regression")
	public void test2() {
		System.out.println("second test case");
	}
	
	@AfterTest()
	public void logout() {
		System.out.println("logout from app");
	}
	
	@BeforeMethod
	public void database() {
		System.out.println("connected to DB ");
	}
	
	@AfterMethod()
	public void database2() {
		System.out.println("disconnected from DB");
	}
}
