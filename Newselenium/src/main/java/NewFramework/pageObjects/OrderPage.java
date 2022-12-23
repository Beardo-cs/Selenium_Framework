package NewFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Newselenium.AbstractComponents.AbstractComponents;

public class OrderPage extends AbstractComponents {
	
	WebDriver driver = new ChromeDriver();
	
	//Initializer for this class. 1st it will run
	public OrderPage(WebDriver driver) {
		super(driver); //sending super of driver from child to parent
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//instead of using driver.findElements we can use page Factory && to know the syntax ctrl + click on FindBy
	 
	@FindBy(css="tr td:nth-child(3)")
	List <WebElement> productNames;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	public Boolean verifyOrderDisplay(String productName) {
		Boolean match = productNames.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	public CheckoutPage goToCheckout() {
		checkoutEle.click();
		return new CheckoutPage(driver);
	}

	
	 
}
