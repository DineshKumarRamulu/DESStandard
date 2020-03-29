package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitdriver;
	private final static int timeout = 30;
	private final static int pageloadtimeout = 60;

	private SeleniumDriver() {
		LaunchBrowser("Chrome");
	}

	protected void LaunchBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\DESStandard\\DesStandard\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			caps.setCapability("nativeEvents", false);

			System.setProperty("webdriver.ie.driver", "C:\\Automation\\Drivers\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageloadtimeout, TimeUnit.SECONDS);
	}

	public static void openPage(String url) {
		driver.get(url);
		// ATUReports.add("Launch URL",url, LogAs.PASSED, new CaptureScreen(
		// ScreenshotOf.DESKTOP));

	}

	public static WebDriver getdriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			// driver.close();
			driver.quit();
		}

		seleniumDriver = null;
	}

}
