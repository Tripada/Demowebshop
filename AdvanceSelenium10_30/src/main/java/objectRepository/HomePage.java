package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCartButtonOfHomePage;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addtocartInProductPage;
	
	@FindBy(xpath="//a[@href='/books']")
	private WebElement bookLink;
			
	@FindBy(xpath="//span[text()='Shopping cart']")
		private WebElement shoppingCartButton;
	
	@FindBy(xpath="//a[@href='/computers']")
	private WebElement computerLink;
	
	@FindBy(xpath="//a[@href='/jewelry']")
	private WebElement jewelryLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	public WebElement getshoppingCartButton() {
		return shoppingCartButton;
	}
	
	
	public WebElement getAddToCartButtonOfHomePage() {
		return addToCartButtonOfHomePage;
	}

	public WebElement getAddtocartInProductPage() {
		return addtocartInProductPage;
	}
	
	public WebElement getbookLink() {
		return bookLink;
		
	}
	
	public WebElement getcomputerLink(){
		return computerLink;
	}
	public WebElement getjewelryLink() {
		return jewelryLink;
	}
	
	public WebElement getwishListLink() {
		return wishListLink;
	}
	


}
