package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public WebDriver driver;
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCartFromBookPage;


	public WebElement getAddToCartFromBookPage() {
		return addToCartFromBookPage;
	}



}
