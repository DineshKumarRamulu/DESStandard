package pages.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.LoginPage_Locators;
import pages.locators.UserGeneralInformation_Locators;
import utils.SeleniumDriver;

public class UserGeneralInformation_Actions {

	UserGeneralInformation_Locators userGeneralInformation_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 30);

	public UserGeneralInformation_Actions() {
		// SeleniumDriver.setUpDriver();
		this.userGeneralInformation_Locators = new UserGeneralInformation_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), userGeneralInformation_Locators);
	}

	public void identificationDetails(String userid, String LastName, String FirstName, String EmailID,
			String ConfrimEmailID) throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.txt_Identification);
		userGeneralInformation_Locators.txtbox_UserID.sendKeys(userid);

		userGeneralInformation_Locators.txtbox_LastName.sendKeys(LastName);
		userGeneralInformation_Locators.txtbox_FirstName.sendKeys(FirstName);
		userGeneralInformation_Locators.txtbox_EmailID.sendKeys(EmailID);
		userGeneralInformation_Locators.txtbox_ConfirmEmailID.sendKeys(ConfrimEmailID);
	}

	public void authenticationDetails(String password, String Confirmpwd) throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.txt_Authentication);
		userGeneralInformation_Locators.txtbox_Password.sendKeys(password);
		userGeneralInformation_Locators.txtbox_ConfirmPassword.sendKeys(Confirmpwd);

	}

	public void rolesDetails(String rolename) throws InterruptedException {

		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.txt_RolesLink);
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.checkbox_SelectAll);
		Thread.sleep(2000);
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.btn_SelectAll_OkBtn);
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.dropdown_DefaultRole);
		userGeneralInformation_Locators.text_DefaultRole.sendKeys(rolename);
		userGeneralInformation_Locators.text_DefaultRole.sendKeys(Keys.ENTER);

	}

	public void clickSavebtn() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
				userGeneralInformation_Locators.btn_SaveButton);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(2000);
		userGeneralInformation_Locators.btn_SaveButton.click();
		Thread.sleep(5000);
		Alert alert = SeleniumDriver.getdriver().switchTo().alert();
		alert.accept();
	}

	public void userCreateAlert(String expected) throws InterruptedException

	{
		String Expected = userGeneralInformation_Locators.txt_UserCreateAlert.getText();
		System.out.println(Expected);
		userGeneralInformation_Locators.btn_SaveAlertOk.click();
		// javaScriptExecutor.executeScript("arguments[0].click();",
		// userGeneralInformation_Locators.btn_SaveAlertOk);
		Assert.assertEquals("User information inserted successfully.", expected);

	}

	public void userUpdateAlert(String expected)

	{
		String Expected = userGeneralInformation_Locators.txt_UserUpdateAlert.getText();
		System.out.println(Expected);
		userGeneralInformation_Locators.btn_SaveAlertOk.click();
		// javaScriptExecutor.executeScript("arguments[0].click();",
		// userGeneralInformation_Locators.btn_SaveAlertOk);
		Assert.assertEquals("User information updated successfully.", expected);

	}

	public void searchIconClick() {
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.img_SearchimageIcon);
		// userGeneralInformation_Locators.img_SearchimageIcon.click();
	}

	public void click_btn_radio() {
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.Radiobtn_UserID);
		// userGeneralInformation_Locators.Radiobtn_UserID.click();
	}

	public void searchByUserID(String Searchvalue) throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].click();", userGeneralInformation_Locators.txtbox_Search);
		// userGeneralInformation_Locators.txtbox_Search.click();
		userGeneralInformation_Locators.txtbox_SearchInput.sendKeys(Searchvalue);
		Thread.sleep(1000);
		userGeneralInformation_Locators.txtbox_SearchInput.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void selectSearchUser() {
		userGeneralInformation_Locators.checkbox_Searchvalue.click();

	}

	public void clickEditButton() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", userGeneralInformation_Locators.btn_Edit);
		userGeneralInformation_Locators.btn_Edit.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void selectuserpreferences(String Language) throws InterruptedException {
		userGeneralInformation_Locators.txt_UserPreferences.click();
		Thread.sleep(2000);
		// javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
		// userGeneralInformation_Locators.txtbox_select_Language);
		javaScriptExecutor.executeScript("arguments[0].click();",
				userGeneralInformation_Locators.txtbox_select_Language);
		// userGeneralInformation_Locators.txtbox_select_Language.click();
		userGeneralInformation_Locators.txtbox_select_Language_Value.sendKeys(Language);
		userGeneralInformation_Locators.txtbox_select_Language_Value.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_PermissionsTab() {
		userGeneralInformation_Locators.txt_PermissionsTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_AccessBoundariesTab() {
		userGeneralInformation_Locators.txt_AccessBoundariesTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_TrainingAssignmentsTab() {
		userGeneralInformation_Locators.txt_TrainingAssignmentsTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void click_GeneralTab() {
		userGeneralInformation_Locators.txt_GeneralTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickGroupAssignmentModule() {
		userGeneralInformation_Locators.txt_GroupAssignments.click();

	}

	public void clickRegionGroupLink() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
				userGeneralInformation_Locators.link_RegionGroup);
		userGeneralInformation_Locators.link_RegionGroup.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void SearchRegionGroup(String value) throws InterruptedException {
		userGeneralInformation_Locators.txtbox_RegionGroupSearch.click();
		// userGeneralInformation_Locators.txtbox_RegionGroupSearchText.sendKeys(value);
		// Thread.sleep(2000);
		// userGeneralInformation_Locators.txtbox_RegionGroupSearch.sendKeys(Keys.ENTER);
		// Thread.sleep(10000);
		javaScriptExecutor.executeScript("arguments[0].click();",
				userGeneralInformation_Locators.txtbox_RegionGroupSearchText);
		userGeneralInformation_Locators.txtbox_RegionGroupSearchText.sendKeys(value);
		userGeneralInformation_Locators.txtbox_RegionGroupSearchText.click();
		Thread.sleep(1000);
	}

	public void ClickRadioBtn_SearchRegionGroup() {
		userGeneralInformation_Locators.radiobtn_RegionGroupSearch.click();
	}

	public void ClickDone_SearchRegionGroup() throws InterruptedException {
		userGeneralInformation_Locators.btn_RegionGroupSearchDone.click();
		Thread.sleep(2000);
	}
}
