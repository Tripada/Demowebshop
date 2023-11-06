package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public WebDriver Driver;
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement bookName;
	
	public WebDriver getDriver() {
		return Driver;
	}

	public WebElement getBookName() {
		return bookName;
	}	
	


}
