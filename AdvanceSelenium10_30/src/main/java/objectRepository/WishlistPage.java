package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	public WebDriver driver;
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='checkbox' and @name='removefromcart']")
	private WebElement checkBoxOfRemove;
	
	@FindBy(xpath="//input[@value='Update wishlist']")
	private WebElement updateWishlistButton;
	
	@FindBy(xpath="//a[@href='/black-white-diamond-heart']")
	private WebElement blackAndWhiteHeartPendantChain;
	
	public WebElement getCheckBoxOfRemove() {
		return checkBoxOfRemove;
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}

	public WebElement getBlackAndWhiteHeartPendantChain() {
		return blackAndWhiteHeartPendantChain;
	}
	

}
