package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import FileUtility.ExcelUtility;
import FileUtility.FileUtility;
import FileUtility.JavaUtility;
import WebDriverUtility.UtilityClassObject;
import WebDriverUtility.WebDriverUtility;

public class BaseClass {

	public FileUtility flib = new FileUtility();
	public JavaUtility jlib = new JavaUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public WebDriver driver = null;
	public static WebDriver edriver = null;

	// @Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable {
		// public void configBC(@Optional("chrome")String browser) throws Throwable {
		// String browser
		System.out.println("==launch the Browser==");
		String BROWSER = flib.getDataFromPropertiesFile("browser");
		// flib.getDataFromPropertiesFile("browser");
		// browser;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		edriver = driver;
		UtilityClassObject.setDriver(driver);

	}

	@BeforeMethod(alwaysRun = true)
	public void configBm() throws Throwable {
		wlib.maxWindow(driver);
		wlib.waitForPageLoad(driver);
		String url = flib.getDataFromPropertiesFile("url");
		driver.get(url);

	}

	@AfterClass(alwaysRun = true)
	public void configAC() {
		System.out.println("==close the browser==");
		driver.quit();
	}

}
