package NewFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Newselenium.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {

	WebDriver driver = new ChromeDriver();

	// Initializer for this class. 1st it will run
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// instead of using driver.findElements we can use page Factory && to know the
	// syntax ctrl + click on FindBy

	// driver.findElement(By.id("userEmail")).sendKeys("mahendiran.msp@gmail.com");
	// driver.findElement(By.id("userPassword")).sendKeys("Mahendiran@2000");
	// driver.findElement(By.id("login")).click();

	@FindBy(id = "userEmail")
	WebElement useremail;

	@FindBy(id = "userPassword")
	WebElement userpassword;

	@FindBy(id = "login")
	WebElement submit;
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;

	public ProductCatalogue loginApplication(String useremai, String password) {
		useremail.sendKeys(useremai);
		userpassword.sendKeys(password);
		submit.click();

		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		return productcatalogue;
	}
	
	public  String getErrorMessage() {
		waitForWebElementsToAppear(errorMessage);
		return errorMessage.getText();
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

}
