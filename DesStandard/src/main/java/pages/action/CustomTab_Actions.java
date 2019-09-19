package pages.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.CustomTab_Locators;
import pages.locators.GroupsList_Locators;
import utils.SeleniumDriver;

public class CustomTab_Actions {

	CustomTab_Locators customTab_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public CustomTab_Actions() {
		// SeleniumDriver.setUpDriver();
		this.customTab_Locators = new CustomTab_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), customTab_Locators);

	}

	public void CustomAddButton() {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		// groupsList_Locators.btn_AddGroup.click();
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", customTab_Locators.btn_CustomADD);
		javaScriptExecutor.executeScript("arguments[0].click();", customTab_Locators.btn_CustomADD);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void type_TabName(String value) {
		customTab_Locators.txtbox_TabName.sendKeys(value);
	}

	public void customSave() throws InterruptedException {
		customTab_Locators.btn_CustomSave.click();
		Thread.sleep(2000);
		customTab_Locators.btn_CustomSaveAlertOk.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void customSaveAlertvalidation(String expected) {
		String actual = customTab_Locators.txt_CustomInsertedsuccessAlert.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		customTab_Locators.btn_CustomInsertSuccessAlertOk.click();
	}

	public void click_ContentTab() {
		customTab_Locators.btn_ContentTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void Click_ContentAddImage() throws InterruptedException {
		customTab_Locators.img_ContentTabAdd.click();
		wait.until(ExpectedConditions
				.visibilityOf((SeleniumDriver.getdriver().findElement(By.id("customTabsEditorArea_ifr")))));
		// Thread.sleep(10000);
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("customTabsEditorArea_ifr"));
		WebElement frame = SeleniumDriver.getdriver().findElement(By.id("customTabsEditorArea_ifr"));
		SeleniumDriver.getdriver().switchTo().frame(frame);
		// SeleniumDriver.getdriver().switchTo().alert().accept(); // this one line
		// accepts the alert
		// SeleniumDriver.getdriver().switchTo().defaultContent();
	}

	public void type_ContentAreaText(String value) throws InterruptedException {

		customTab_Locators.editor_ContentEditor.click();
		customTab_Locators.editor_ContentEditor.sendKeys(value);
		SeleniumDriver.getdriver().switchTo().parentFrame();
	}

	public void click_ContentSaveBtn() throws InterruptedException {
		customTab_Locators.btn_ContentSave.click();
		Thread.sleep(2000);
		customTab_Locators.btn_CustomSaveAlertOk.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void contentSaveAlertvalidation(String expected) {
		String actual = customTab_Locators.txt_ContentTabupdateAlertMsg.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		customTab_Locators.btn_ContentTabupdateAlertOk.click();
	}

}
