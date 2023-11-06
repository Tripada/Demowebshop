package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)
public class DWS_Home_08_Test extends BaseClass {
	@Test

	public void Verify_whethere_user_is_getting_error_message_while_sending_mail_Registering() {
		homepage.getjewelryLink().click();
		jewelryPage.getjewelryProduct().click();
		logger.log(Status.INFO, "User clicked on product");
		jewelryPage.getemailFriendButton().click();
		jewelryPage.getfriendsEmailTextField().sendKeys("chanduchondira@gmail.com");
		logger.log(Status.INFO, "User entered friends email address");
		jewelryPage.getyourEmailTextField().sendKeys("chanduchondira@gmail.com");
		logger.log(Status.INFO, "User entered his/her email address");
		jewelryPage.getpersonalMessageTextField().sendKeys("This is dummy message");
		logger.log(Status.INFO, "User entered the message");
		jewelryPage.getsendEmailButton().click();
		logger.log(Status.INFO, "User entered friends email address");

		String expectedError="Only registered customers can use email a friend feature";
	WebElement errorMessage = driver.findElement(By.xpath("//li[text()='Only registered customers can use email a friend feature']"));
		if(errorMessage.getText().equalsIgnoreCase(expectedError)) {
			System.out.println("Tescase is passed");
		}else {
			System.out.println("Tescase is failed");
		}
		
		
		
				
		
	}
}
