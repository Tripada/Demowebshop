package genericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	JavascriptExecutor jse;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;	
		jse=(JavascriptExecutor)driver;
	}
	/**
	 * This method is used to click on element using JavaScript executor.
	 * @param element
	 */
	public void clickOnElementUsingJSE(WebElement element) {
		jse.executeScript("arguments[0].click();", element);
	}
	/**
	 * This method is used to enter the data using JavaScript executor.
	 * @param element
	 * @param data which has to enter to the element
	 */
	public void enteringDataIntoElement(WebElement element,String data) {
		jse.executeScript("arguments[0].value='"+data+"'", element);
	}
	/**
	 * This method return the reference for webDriverwait to achieve explicitwait.
	 * @param time to wait
	 * @return
	 */
	public WebDriverWait explicitWaitReference(int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait;
	}
	/**
	 * This method returns the actions class reference
	 * @return
	 */
	public Actions actionReference() {
		Actions action=new Actions(driver);
		return action;  	
	}
	public void handingDropdown(WebElement element,String value) {
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		}
		catch(Exception e) {
			try {
				select.selectByValue(value);
			}
			catch(Exception e1) {
				int val=Integer.parseInt(value);
				select.selectByIndex(val); 		
			}
		}

	}
	/**
	 * This method is used to perform scrollTo action.
	 * @param x
	 * @param y
	 */
	public void scrollToAction(int x,int y) {
		jse.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * This method is used to perform scrollBy action.
	 * @param x
	 * @param y
	 */
	public void scrollByAction(int x,int y) {
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * This method is used to scroll to the element to increase the element visibility
	 * If the status is true the window will scroll until the element reaches the top of the webPage
	 * If the status is false the window will scroll until the element reaches the Bottom of the webPage
	 * @param element
	 * @param status
	 */
	public void scrollIntoViewAction(WebElement element,Boolean status) {
		jse.executeScript("arguments[0].scrollIntoView("+status+")",element);
	}
	/**
	 * This method is used to switch the driver control from window to frame with the help of index
	 * @param index
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the driver control from window to frame with the help of name
	 * @param index
	 */
	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method is used to switch the driver control from window to frame with the help of element.
	 * @param index
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch the driver control from frame to window.
	 * @param index
	 */
	public void switchingBackToMainWindow() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is returning the alert reference
	 * @return
	 */
	public Alert returnAlertReference() {
		return driver.switchTo().alert();
	}
	/**
	 * This method is used to switch the driver control from one window to another window
	 * @param allWindowId
	 * @param expectedTitle
	 * @param parentId
	 */
	public void switchingToWindow(Set<String> allWindowId,String expectedTitle,String parentId) {
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}  	
	}
//	/**
//	 * This method is used switch the control back to main window/parent window
//	 * @param parentId
//	 */
//	public void switchingBackToMainWindow(String parentId) {
//		driver.switchTo().window(parentId);
//		    }
}

