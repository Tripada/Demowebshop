package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
import objectRepository.RegistrationPage;
@Listeners(ITestListnerUtility.class)

public class DWS_Login_02_Test extends BaseClass {

	@Test
	public void Register_to_the_application_with_valid_credentials() {
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.getRegisterLink().click();
		logger.log(Status.INFO, "User click on register link");
		registrationPage.getGenderRadioButton().click();
		logger.log(Status.INFO, "User selected gender radio button");
		registrationPage.getFirstNameTF().sendKeys("chandrika");
		logger.log(Status.INFO, "User entered firstname");
		registrationPage.getLastNameTF().sendKeys("cc");
		logger.log(Status.INFO, "User entered lastname");
		registrationPage.getEmailTF().sendKeys("chanduchondira@gmail.com");
		logger.log(Status.INFO, "User entered email address");
		registrationPage.getPasswordTF().sendKeys("112233");
		logger.log(Status.INFO, "User entered password");
		registrationPage.getConfirmPasswordTF().sendKeys("112233");
		logger.log(Status.INFO, "User entered confirm password");
		registrationPage.getRegisterButton().click();
	}
}
