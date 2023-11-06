package Home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)
public class DWS_Home_07_Test extends BaseClass{
	@Test
	
	public void Verify_whether_the_product_is_displaying_as_per_filter_for_jewellery() {
		homepage.getjewelryLink().click();
		jewelryPage.getPriceRangeFilter().click();
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='prices']"));
		for(WebElement Price:allPrice) {
			String p= Price.getText().substring(0,3);
			int val=Integer.parseInt(p);
			if(val<=500) {
				System.out.println("Test case is passed"+Price.getText());
			}
			else {
				System.out.println("Test case is failed");
			}
						
			}
		
	
	}


}
