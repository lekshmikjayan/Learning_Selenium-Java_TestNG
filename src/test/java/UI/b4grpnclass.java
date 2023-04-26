package UI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class b4grpnclass {
@BeforeGroups(value="bvt")
	
public void sample1() {
		System.out.println("hai");
	}
@BeforeClass
	public void sample2() {
		System.out.println("I am first");
	}
	
	@Test(groups="bvt")
	public void sample3() {
		System.out.println("dhetj");
	}
	@AfterGroups(value="bvt")
	public void sample4() {
		System.out.println("sherh");
	}
	
	@AfterClass
	public void sample5() {
		System.out.println("I am last");
	}

}
