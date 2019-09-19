package pages.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.UserGeneralInformation_Locators;
import utils.SeleniumDriver;

public class SettingAndConfiguration_Actions {

	UserGeneralInformation_Locators userGeneralInformation_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 30);

	public SettingAndConfiguration_Actions() {
		// SeleniumDriver.setUpDriver();
		this.userGeneralInformation_Locators = new UserGeneralInformation_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), userGeneralInformation_Locators);
	}

	public void clickLoginSettingsModule() {
		SeleniumDriver.getdriver().findElement(By.xpath("//a[contains(text(),'Login Settings')]")).click();
	}

	public void provideLogoutTimeAndValidateAlert(String Timeout) throws InterruptedException {
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@ng-model=\"sc.globalOptions.numLogoutTime\"]"))
				.clear();
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@ng-model=\"sc.globalOptions.numLogoutTime\"]"))
				.sendKeys(Timeout);

		WebElement savebtn = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn);

		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath(
				"//div[contains(@class,'modal fade in')]//button[contains(@class,'btn-lms fixed active')][contains(text(),'Ok')]"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[contains(@class,'btn-lms fixed
		// active')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		String GlobalOptionalert = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Global Options saved successfully.')]")).getText();
		System.out.println(GlobalOptionalert);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

	}

}
