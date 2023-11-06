package Home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)
public class DWS_Home_04_Test extends BaseClass {
	@Test
	
	public void Add_the_product_from_Booklink_and_check_whether_the_product_is_been_added_to_cart() {
		homepage.getbookLink().click();
		logger.log(Status.INFO, "User clicked on book link");
		bookPage.getAddToCartFromBookPage().click();
		homepage.getshoppingCartButton().click();
		boolean status = shopingCartPage.getBookName().isDisplayed();
		assertTrue(status,"User able to add the product to cart");
		logger.log(Status.INFO, "user able to see the product added to cart");	
		
	}


}
