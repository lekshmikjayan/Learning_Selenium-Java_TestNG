package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifydatap {

	@Test(dataProvider = "execute")
	public void display(String username, String passwrd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwrd);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.close();

	}

	@DataProvider(name = "execute")
	public Object[][] enter() {
		return new Object[][] { { "standard_user", "secret_sauce" }, { "problem_user", "secret_sauce" } };
	}

	@DataProvider(name = "details")
	public Object[][] folder() {
		return new Object[][] { { "Sony", "Kerala" },

				{ "Bony", "Karnataka" }

		};

	}
}

//https://www.saucedemo.com/