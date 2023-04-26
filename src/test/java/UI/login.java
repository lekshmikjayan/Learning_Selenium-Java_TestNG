package UI;

import org.testng.annotations.Test;

public class login extends Commondatasetup{

	@Test(priority=1, description="Verifying login")
	public void aboginTest() {
		System.out.println("Login completed");
	}
	@Test(groups="regression")
	public void xapple() {
		System.out.println("check");
	}
}
