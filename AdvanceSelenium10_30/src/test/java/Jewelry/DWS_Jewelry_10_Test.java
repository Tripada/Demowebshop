package Jewelry;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)

public class DWS_Jewelry_10_Test extends BaseClass {
	@Test
	public void Verify_User_can_able_to_remove_the_product_from_wishlist(){ 

	homepage.getjewelryLink().click();
	jewelryPage.getheartheartPendeantChainButton().click();
	logger.log(Status.INFO, "user able to click on the product");
	wbUtility.explicitWaitReference(10).until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-wishlist-button-14")));
	jewelryPage.getaddToWishListButton().click();
	logger.log(Status.INFO, "user able to add product in the wishlist");
	wbUtility.explicitWaitReference(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Wishlist']")));
	homepage.getwishListLink().click();
	wishlistPage.getCheckBoxOfRemove().click();
	wishlistPage.getUpdateWishlistButton().click();
	logger.log(Status.INFO, "User able to remove the product from cart");
	
}

}
