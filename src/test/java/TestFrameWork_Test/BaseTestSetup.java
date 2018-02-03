package TestFrameWork_Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class BaseTestSetup {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}
	
	@Parameters({ "browser", "start-page", "chrome-driver", "firefox-driver"})
	@BeforeTest
	public void beforeTest(String browserName, String startPage, String chromeDriver, String fireFoxDriver) {
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		System.setProperty("webdriver.gecko.driver", fireFoxDriver);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} 	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(startPage);	
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();		
	}

}
