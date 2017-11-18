package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import implementation.Checkout;

public class CheckoutStepsCn {

	Checkout checkout;
	Map<String, Integer> priceMap = new HashMap<String, Integer>();

	@假设("^\"([^\"]*)\"的价格是(\\d+)元$")
	public void 的价格是_元(String name, int price) throws Exception {
		checkout = new Checkout();
		priceMap.put(name, price);
	}

	@当("^我又?买了(\\d+)斤\"([^\"]*)\"$")
	public void 我买了_斤(int itemCount, String itemName) throws Exception {
		int price = priceMap.get(itemName);
		checkout.add(itemCount, price);
	}

	@那么("^总价格应该是(\\d+)元$")
	public void 总价格应该是_元(int total) throws Exception {
		assertEquals(total, checkout.total());
	}

}