package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertn  {

	@Test
	public void check() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		String expectedtest = "Searcddh";
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();

		soft.assertEquals(actualTitle, expectedTitle, "Test passed succesfully");
		Thread.sleep(2000);
		String actualtext = driver.findElement(By.cssSelector("input[type=submit]")).getAttribute("value");
		soft.assertEquals(actualtext, expectedtest,"failed..!!");
		
		soft.assertAll();
		driver.close();
	}

}
