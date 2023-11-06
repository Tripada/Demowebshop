package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id="gender-female")
	private WebElement genderRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTF;
	
	@FindBy(id="LastName")
	private WebElement lastNameTF;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passwordTF;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTF;
	
	@FindBy(id="register-button")
	private WebElement registerButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	

}
