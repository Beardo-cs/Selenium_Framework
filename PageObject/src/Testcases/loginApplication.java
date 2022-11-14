package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.homePage;
import objectRepository.loginPage;

public class loginApplication {
	// Login page class implemented in normal page object pattern style
	// Home page class implemented in Page object factory methods.

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		loginPage login = new loginPage(driver);
		login.Emailid().sendKeys("hello");
		login.Password().sendKeys("12345");
		// login.submit().click();
		login.Home().click();
		homePage home = new homePage(driver);
		home.Search().sendKeys("rediff");
		home.Search().sendKeys(Keys.ENTER);

	}

}
