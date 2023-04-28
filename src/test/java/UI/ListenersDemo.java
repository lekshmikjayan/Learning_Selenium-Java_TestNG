package UI;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Bastest;

public class ListenersDemo extends Bastest {

	@Test
	public void action() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
