package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPagePF {
	
	WebDriver driver;

	public loginPagePF(WebDriver driver) { //Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	/*By username = By.xpath("//*[@id='login1']"); //tag name is optional.
	By password = By.xpath("//*[@id='password']");
	By submit = By.name("proceed");
	By home = By.cssSelector("a[class='f12']");*/
	
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement submit;
	
	@FindBy(css="a[class='f12']")
	WebElement home;
	
	
	
	public WebElement Emailid() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Submit() {
		return submit;
	}
	
	public WebElement Home() {
		return home;
	}
	
}
