package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePagePF {
	
	WebDriver driver;

	public homePagePF(WebDriver driver) { //Constructor
		this.driver = driver; //test case driver to local driver by keyword this
		PageFactory.initElements(driver, this);
	}
	
	//By searchBox = By.id("srchword");
	@FindBy(id="srchword")
	WebElement searchBox;
	
	public WebElement Search() {
		return searchBox;
	}
	
}