package NewFramework.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import NewFramework.TestComponents.BaseTest;
import NewFramework.pageObjects.CartPage;
import NewFramework.pageObjects.CheckoutPage;
import NewFramework.pageObjects.ConfirmationPage;
import NewFramework.pageObjects.LandingPage;
import NewFramework.pageObjects.OrderPage;
import NewFramework.pageObjects.ProductCatalogue;
import Newselenium.AbstractComponents.AbstractComponents;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest extends BaseTest {
	// BaseTest is the parent Class

	String productName = "ZARA COAT 3";

	@Test(dataProvider = "getData", groups = "purchase")
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {
		// LandingPage landingpage = launchApplication();

		ProductCatalogue productcatalogue = landingpage.loginApplication(input.get("email"), input.get("password"));
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addproductToCart(input.get("productName"));
		CartPage cartpage = productcatalogue.goToCartPage();
		Boolean match = cartpage.verifyProductDisplay(input.get("productName"));
		// No assertion is page object
		// Page object only should have actions
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartpage.goToCheckout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		String orderID = driver.findElement(By.cssSelector("label[class='ng-star-inserted']")).getText();
		System.out.println("The Order ID is" + orderID);
	}

	// To verify ZARA COAT 3 is displaying in orders page
	@Test(dependsOnMethods = { "submitOrder" })
	public void OrderHistorytest() {

		ProductCatalogue productcatalogue = landingpage.loginApplication("mahendiran.msp@gmail.com", "Mahendiran@2000");
		OrderPage ordersPage = productcatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.verifyOrderDisplay(productName));

	}

	
	@DataProvider
	public Object[][] getData() throws IOException {
		/*
		 * HashMap<String,String> map = new HashMap();
		 * map.put("userName","mahendiran.msp@gmail.com"); map.put("password",
		 * "Mahendiran@2000"); map.put("productName", "ZARA COAT 3");
		 * 
		 * HashMap<String,String> map1 = new HashMap();
		 * map1.put("userName","mahendiran.msp@gmail.com"); map1.put("password",
		 * "Mahendiran@2000"); map1.put("productName", "ADIDAS ORIGINAL"); return new
		 * Object[][] {
		 * {map},{"mahendiran.msp@gmail.com","Mahendiran@2000","ADIDAS ORIGINAL"} };
		 */
		List<HashMap<String, String>> data = getJsonDataToMAP(
				System.getProperty("user.dir") + "//src//test//java//Newselenium//data//PurchaseOrder.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
