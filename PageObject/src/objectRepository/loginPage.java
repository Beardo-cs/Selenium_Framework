package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;

	public loginPage(WebDriver driver) { //Constructor
		this.driver = driver;
		
	}
	By username = By.xpath("//*[@id='login1']"); //tag name is optional.
	By password = By.xpath("//*[@id='password']");
	By submit = By.name("proceed");
	By home = By.cssSelector("a[class='f12']");
	
	public WebElement Emailid() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public WebElement Home() {
		return driver.findElement(home);
	}

}
