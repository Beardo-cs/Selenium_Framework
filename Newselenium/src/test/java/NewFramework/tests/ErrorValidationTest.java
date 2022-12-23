package NewFramework.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import NewFramework.TestComponents.BaseTest;
import NewFramework.TestComponents.Retry;
import NewFramework.pageObjects.CartPage;
import NewFramework.pageObjects.CheckoutPage;
import NewFramework.pageObjects.ConfirmationPage;
import NewFramework.pageObjects.ProductCatalogue;

public class ErrorValidationTest extends BaseTest {
	// BaseTest is the parent Class

	@Test(groups = { "ErrorHandling" },retryAnalyzer=Retry.class)
	public void productErrorValidation() throws IOException, InterruptedException {
		String productName = "ZARA COAT 33";
		// LandingPage landingpage = launchApplication();
		ProductCatalogue productcatalogue = landingpage.loginApplication("mahendiran.msp@gmail.com", "Mahendiran@2000");
		Assert.assertEquals("Incorrect email r Password", landingpage.getErrorMessage());
	}

	@Test
	public void submitOrder() throws IOException, InterruptedException {
		String productName = "ZARA COAT 33";
		// LandingPage landingpage = launchApplication();
		ProductCatalogue productcatalogue = landingpage.loginApplication("mahendiran.msp@gmail.com", "Mahendiran@2000");
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addproductToCart(productName);
		CartPage cartpage = productcatalogue.goToCartPage();
		Boolean match = cartpage.verifyProductDisplay(productName);
		// No assertion is page object
		// Page object only should have actions
		Assert.assertFalse(match);

	}

}
