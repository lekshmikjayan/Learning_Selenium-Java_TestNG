package UI;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commondatasetup {
	
	@BeforeSuite
	public void show() {
		System.out.println("display");
	}
	
	@AfterSuite
	public void hide() {
		System.out.println("hhide");
	}
}
