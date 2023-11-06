package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputetrsPage {
	public WebDriver driver;
	public ComputetrsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='Show products in category Desktops']")
	private WebElement desktopButton;
	
	
	@FindBy(xpath="//a[@href='/build-your-cheap-own-computer']")
	private WebElement firstProductfromDeskttop;
	
	@FindBy(xpath="//img[@alt='Picture of Build your own expensive computer']")
	private WebElement thirdElementFromDesktop;
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	private WebElement addToCompareList;
	
	@FindBy(xpath="//input[@value='Remove']")
	private WebElement removeButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDesktopButton() {
		return desktopButton;
	}

	public WebElement getFirstProductfromDeskttop() {
		return firstProductfromDeskttop;
	}

	public WebElement getThirdElementFromDesktop() {
		return thirdElementFromDesktop;
	}
	
	public WebElement getaddToCompareList() {
		return addToCompareList;
	}
	public WebElement getremoveButton() {
		return removeButton;
	}
}
