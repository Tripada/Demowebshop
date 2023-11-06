package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	public WebDriver driver;
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='https://demowebshop.tricentis.com/jewelry?price=0-500']")
	private WebElement priceRangeFilter;

	@FindBy(xpath="//img[@alt='Picture of Create Your Own Jewelry']")
	private WebElement jewelryProduct;

	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailFriendButton;

	@FindBy(id="FriendEmail")
	private WebElement friendsEmailTextField;

	@FindBy(id="YourEmailAddress")
	private WebElement yourEmailTextField;
	
	@FindBy(xpath="//input[@value='Send email']")
	private WebElement sendEmailButton;
	
	@FindBy(id="PersonalMessage")
	private WebElement personalMessageTextField;
	
	@FindBy(xpath="//a[text()='Black & White Diamond Heart']")
	private WebElement heartPendeantChainButton;
	
	@FindBy(id="add-to-wishlist-button-14")
	private WebElement addToWishListButton;

	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getPriceRangeFilter() {
		return priceRangeFilter;
	}

	public WebElement getjewelryProduct() {
		return jewelryProduct;
	}

	public WebElement getemailFriendButton() {
		return emailFriendButton;
	}
	public WebElement getfriendsEmailTextField() {
		return friendsEmailTextField;
	}

	public WebElement getyourEmailTextField() {
		return yourEmailTextField;
	}
	
	public WebElement getsendEmailButton() {
		return sendEmailButton;
	}
	public WebElement getpersonalMessageTextField() {
		return personalMessageTextField;
	}
	public WebElement getheartheartPendeantChainButton() {
		return heartPendeantChainButton;
	}
	
	public WebElement getaddToWishListButton() {
		return addToWishListButton;
	}


}
