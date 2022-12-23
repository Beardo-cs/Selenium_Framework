package WebAutomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class linearAutomation {
	//public WebDriver driver;

	public void intializeDriver() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/home/qqa0407/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("chrome.switches", "--disable-extensions");
		options.addArguments("user-data-dir=/home/qqa0407/.config/google-chrome/Profile 2/");
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypas
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://linear.app/udaan/team/QAT/active");
		Thread.sleep(90);
		driver.findElement(By.xpath("(//div[@class='sc-bczRLJ gxNwGB'])[1]")).click();
		Thread.sleep(4);
		driver.close();

	}
}
