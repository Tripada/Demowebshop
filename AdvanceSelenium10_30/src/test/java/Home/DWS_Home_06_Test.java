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
public class DWS_Home_06_Test extends BaseClass{
	@Test
	public void Remove_the_product_from_comparelist() {
		homepage.getcomputerLink().click();
		computerPage.getDesktopButton().click();
		computerPage.getFirstProductfromDeskttop().click();
		computerPage.getaddToCompareList().click();
		logger.log(Status.INFO, "User added first product to comapre list");
		driver.navigate().back();
		driver.navigate().back();
		computerPage.getThirdElementFromDesktop().click();
		computerPage.getThirdElementFromDesktop().click();
		computerPage.getaddToCompareList().click();
		logger.log(Status.INFO, "User added second product to comapre list");
		List<WebElement> removeButtonFromComparelist = driver.findElements(By.xpath("removeButton"));
		int count=0;
				for(WebElement ele:removeButtonFromComparelist) {
			count++;
		}
	if(count==2) {
		logger.log(Status.INFO, "user can able see 2 products in compare list");
	}	
	computerPage.getremoveButton().click();
	computerPage.getremoveButton().click();
	logger.log(Status.INFO, "User able to remove two products from campare list");
	
	
	}
}
