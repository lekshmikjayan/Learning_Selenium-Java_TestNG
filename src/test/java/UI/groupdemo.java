package UI;

import org.testng.annotations.Test;

@Test(groups="user")
public class groupdemo extends Commondatasetup{
	@Test(groups="regression")
	public void validate() {
		System.out.println("1");
		
	}
	
	@Test(groups= {"regression, bvt"})
	public void clear() {
		System.out.println("2");
	}
	 
	@Test(groups="bvt")
	public void demo() {
		System.out.println("3");
	}
	
	@Test(groups="regression")
	public void find() {
		System.out.println("4");
	}
}
