package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenshotUtility {
	WebDriver driver;
	TakesScreenshot ts;
	public TakesScreenshotUtility(WebDriver driver) {
		this.driver=driver;
		ts=(TakesScreenshot) this.driver;
	}
	/**
	 * This method is used to take Screenshot of WebPage.
	 * @param screenshotName
	 * @return 
	 */
	public String capturingScreenshot(String screenshotName) {
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(':','-');
		String directory = System.getProperty("user.dir");
		String path=""+directory+"./target/Errorshots/"+screenshotName+" "+time+".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

}
