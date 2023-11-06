package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BookPage;
import objectRepository.ComputetrsPage;
import objectRepository.HomePage;
import objectRepository.JewelryPage;
import objectRepository.LoginPage;
import objectRepository.ShoppingCartPage;
import objectRepository.WishlistPage;

public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	PropertyUtility property;
	public static TakesScreenshotUtility screenshot;
	public static WebDriverUtility wbUtility;
	public static ExtentTest logger;
	public static HomePage homepage;
	public static BookPage bookPage;
	public static LoginPage loginPage;
	public static ComputetrsPage computerPage;
	public static ShoppingCartPage shopingCartPage;
	public static JewelryPage jewelryPage;
	public static WishlistPage wishlistPage;
	
	DataBaseUtility dbUtility;
	JavaUtility javaUtility;
	
	@BeforeClass(alwaysRun = true)
	public void launchingBrowserAndNavigateToApplication() {
		property=new PropertyUtility();
		

		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(BROWSER.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();		
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();		
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		
		screenshot=new TakesScreenshotUtility(driver);
		wbUtility=new WebDriverUtility(driver);
		dbUtility=new DataBaseUtility();
		javaUtility=new JavaUtility();
		
		
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() {
		homepage=new HomePage(driver);
		loginPage=new LoginPage(driver);
		bookPage=new BookPage(driver);
		computerPage=new ComputetrsPage(driver);
		shopingCartPage=new ShoppingCartPage(driver);
		jewelryPage=new JewelryPage(driver);
		wishlistPage=new WishlistPage(driver);
		System.out.println("logged in to the Application");
	}
	@AfterMethod(alwaysRun = true)
	public void logOutFromApplication() {
		System.out.println("logged out to the Application");
	}
	@AfterClass(alwaysRun = true)
	public void tearDownTheBrowser() {
		driver.quit();

	}


}
