package NewFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Newselenium.AbstractComponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents {
	
	WebDriver driver = new ChromeDriver();
	
	//Initializer for this class. 1st it will run
	public ProductCatalogue(WebDriver driver) {
		super(driver); //sending super of driver from child to parent
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//instead of using driver.findElements we can use page Factory && to know the syntax ctrl + click on FindBy
	 
	@FindBy(css=".mb-3")
	List <WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	By ProductsBy = By.cssSelector(".mb-3");
	By addtoCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	
	public List<WebElement> getProductList(){
		waitForElementsToAppear(ProductsBy);
		return products;
	}
	
	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		return prod;

	}
	
	//page factory within findelement not possible
	public void addproductToCart(String productName) throws InterruptedException {
		WebElement prod = getProductByName(productName);
		prod.findElement(addtoCart).click();
		waitForElementsToAppear(toastMessage);
		waitForElementToDisappear(spinner);
	}

	
	 
}
