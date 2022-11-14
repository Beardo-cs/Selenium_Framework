package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;

	public homePage(WebDriver driver) { //Constructor
		this.driver = driver; //test case driver to local driver by keyword this
		
	}
	
	By searchBox = By.id("srchword");
	
	public WebElement Search() {
		return driver.findElement(searchBox);
	}
	
}