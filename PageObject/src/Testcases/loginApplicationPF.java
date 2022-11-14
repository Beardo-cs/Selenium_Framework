package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.homePage;
import objectRepository.loginPage;
import objectRepository.loginPagePF;

public class loginApplicationPF {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		loginPagePF login = new loginPagePF(driver);
		login.Emailid().sendKeys("hello");
		login.Password().sendKeys("12345");
		//login.Submit().click();
	    login.Home().click();
		homePage home = new homePage(driver);
		home.Search().sendKeys("rediff",Keys.ENTER);

	}

}
