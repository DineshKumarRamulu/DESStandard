package pages.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.GroupsList_Locators;
import pages.locators.RolesList_Locators;
import utils.SeleniumDriver;

public class RolesList_Actions {
	RolesList_Locators rolesList_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public RolesList_Actions() {
		// SeleniumDriver.setUpDriver();
		this.rolesList_Locators = new RolesList_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), rolesList_Locators);

	}

	public void RoleAddButton() {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		// groupsList_Locators.btn_AddGroup.click();
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", rolesList_Locators.btn_AddRoles);
		rolesList_Locators.btn_AddRoles.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_RadioAdministratorRole() {
		rolesList_Locators.radiobtn_RoleListAdministrator.click();
	}

	public void type_RoleName(String value) {
		rolesList_Locators.txtbox_RoleName.sendKeys(value);
	}

	public void click_AdministratorCheckbox() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
				rolesList_Locators.checkbox_RoleSecurityAdministrator);
		rolesList_Locators.checkbox_RoleSecurityAdministrator.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_ReportLink() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", rolesList_Locators);
		rolesList_Locators.checkbox_RoleSecurityAdministrator.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void roleSave() throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", rolesList_Locators.btn_RoleSave);
		rolesList_Locators.btn_RoleSave.click();
		// rolesList_Locators.btn_RoleSave.click();
		Thread.sleep(2000);
		rolesList_Locators.btn_RoleSaveAlertOK.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void roleSaveAlertvalidation(String expected) {
		String actual = rolesList_Locators.txt_RolecreatedAlertmsg.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		rolesList_Locators.btn_RolecreatedAlertmsgOk.click();
	}

}
