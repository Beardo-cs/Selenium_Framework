package Newselenium.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

import NewFramework.TestComponents.BaseTest;
import NewFramework.pageObjects.CartPage;
import NewFramework.pageObjects.CheckoutPage;
import NewFramework.pageObjects.ConfirmationPage;
import NewFramework.pageObjects.LandingPage;
import NewFramework.pageObjects.ProductCatalogue;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImpl extends BaseTest {

	public LandingPage landingpage;
	public ProductCatalogue productcatalogue;
	public CartPage cartpage;
	public CheckoutPage checkoutPage;
	public ConfirmationPage confirmationPage;
	// public to access globally.

	@Given("I landed on ECommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException {
		landingpage = launchApplication();

	}

	// start with ^ and end with $ and dynamic param (.+)
	@Given("^Logged in with UserName (.+) and password (.+)$")
	public void logged_in_username_and_password(String UserName, String password) throws IOException {
		//landingpage = launchApplication();
		productcatalogue = landingpage.loginApplication(UserName, password);

		//ProductCatalogue productcatalogue = landingpage.loginApplication("mahendiran.msp@gmail.com", "Mahendiran@2000");

	}
	

	@When("^I add product (.+) to Cart$")
	public void i_add_product_to_card(String productName) throws InterruptedException {
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addproductToCart(productName);
	}

	@And("^Checkout (.+) and submit the Order$")
	public void checkout_submit_the_order(String productName) {
		cartpage = productcatalogue.goToCartPage();
		Boolean match = cartpage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		checkoutPage = cartpage.goToCheckout();
		checkoutPage.selectCountry("india");
		confirmationPage = checkoutPage.submitOrder();
	}

	// @Then "THANKYOU FOR THE ORDER" message is displayed on ConfirmationPage
	@Then("{string} message is displayed on ConfirmationPage") // {string} get string on runtime
	public void message_displayed_on_confirmationPage(String string) {
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
	
	}
	@Then("^\"([^\"]*)\" message is displayed$")
    public void something_message_is_displayed(String strArg1) throws Throwable {
		Assert.assertEquals(strArg1, landingpage.getErrorMessage());
		driver.close();
    }
}









