package UI;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practise {

	
	@BeforeTest
	public void z() {
		System.out.println("Test case 1");
	}
	
	@Test(groups = "abc")
	public void w() {
		System.out.println("Implementing");
	}
	
	@AfterTest
	public void j() {
		System.out.println("Finished Test Case1");
	}
	
	@BeforeMethod
	public void p() {
		System.out.println("where should I come?");
	}
	
	@AfterMethod
	public void e() {
		System.out.println("where should i go?");
	}
	
	@BeforeGroups(value = "abc")
	public void a() {
		System.out.println("Lets Start");
		Assert.assertTrue(false);
	}
	
	@AfterGroups(value="abc")
	public void k() {
		System.out.println("Lets end");
	}
	
}
