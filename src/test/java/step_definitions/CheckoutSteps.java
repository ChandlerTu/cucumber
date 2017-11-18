package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Checkout;

public class CheckoutSteps {

	Checkout checkout;
	Map<String, Integer> priceMap = new HashMap<String, Integer>();

	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Exception {
		checkout = new Checkout();
		priceMap.put(name, price);
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Exception {
		int price = priceMap.get(itemName);
		checkout.add(itemCount, price);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Exception {
		assertEquals(total, checkout.total());
	}

}