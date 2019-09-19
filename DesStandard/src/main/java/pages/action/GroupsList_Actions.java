package pages.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.GroupsList_Locators;
import pages.locators.LMSHomePage_Locators;
import utils.SeleniumDriver;

public class GroupsList_Actions {

	GroupsList_Locators groupsList_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public GroupsList_Actions() {
		// SeleniumDriver.setUpDriver();
		this.groupsList_Locators = new GroupsList_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), groupsList_Locators);

	}

	public void GroupAddButton() {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		// groupsList_Locators.btn_AddGroup.click();
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", groupsList_Locators.btn_AddGroup);
		javaScriptExecutor.executeScript("arguments[0].click();", groupsList_Locators.btn_AddGroup);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void type_GroupValue(String value) {
		groupsList_Locators.txtBox_GroupValue.sendKeys(value);
	}

	public void click_GroupSaveButton() {
		groupsList_Locators.btn_GroupSave.click();
	}

	public void click_GroupAddAlertOK(String expected) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		groupsList_Locators.btn_GroupAlert_Ok.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		String ActualAlertMsg = groupsList_Locators.txt_GroupInsertedSuccessAlert.getText();
		System.out.println(ActualAlertMsg);
		Assert.assertEquals(ActualAlertMsg, expected);
		groupsList_Locators.btn_GroupAlert_Ok.click();

	}

}
