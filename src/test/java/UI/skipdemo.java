package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipdemo {
	
	Boolean datasetup = false;
	
	@Test(enabled=false)
	public void file() {
		System.out.println("checking skip");
	}
	@Test 
	public void file2() {
		System.out.println("hallo there...");
		throw new SkipException("u will be skipped..");
	}
	
	@Test
	public void file3() {
		if(datasetup == true) {
			System.out.println("proceed");
		}else {
			System.out.println("Stop");
			throw new SkipException("condition failed");
		}
	}
	
}
