package Home;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)
public class DWS_Home_03_Test extends BaseClass{
	@Test(groups = "IT")
	public void Add_the_product_to_the_cart_from_home_Page() {
		homepage.getAddToCartButtonOfHomePage().click();
		logger.log(Status.INFO, "User adding the product to cart");
		homepage.getAddtocartInProductPage().click();
		
	}


}