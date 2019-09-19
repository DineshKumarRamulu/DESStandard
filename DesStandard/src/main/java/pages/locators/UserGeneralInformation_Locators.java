package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserGeneralInformation_Locators {
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Identification')]")
	public WebElement txt_Identification;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='User ID']")
	public WebElement txtbox_UserID;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	public WebElement txtbox_LastName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	public WebElement txtbox_FirstName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email ID']")
	public WebElement txtbox_EmailID;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Confirm Email ID']")
	public WebElement txtbox_ConfirmEmailID;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Authentication')]")
	public WebElement txt_Authentication;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Authentication')]//following::div[2]/div/div/div[1]/div[3]/input")
	public WebElement txtbox_Password;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Authentication')]//following::div[2]/div/div/div[2]/div[3]/input")
	public WebElement txtbox_ConfirmPassword;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Authentication')]//following::div[2]/div/div/div[2]/div[3]/input//following::div[1]/div/div/div/a")
	public WebElement txt_RolesLink;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select All')]/../div")
	public WebElement checkbox_SelectAll;

	@FindBy(how = How.XPATH, using = "//div[@class='modal-dialog ']/div/div[3]/button[1]")
	public WebElement btn_SelectAll_OkBtn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Default Role')]/following::div[1]/div/div[1]/div")
	public WebElement dropdown_DefaultRole;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Default Role')]/following::div[1]/div/div[1]/div/following::input[1]")
	public WebElement text_DefaultRole;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active'][contains(text(),'Save')]")
	public WebElement btn_SaveButton;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'User information inserted successfully.')]")
	public WebElement txt_UserCreateAlert;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'User information updated successfully.')]")
	public WebElement txt_UserUpdateAlert;

	@FindBy(how = How.XPATH, using = "//button[@ng-click='alertCtrl.ok()']")
	public WebElement btn_SaveAlertOk;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-4 col-md-4 hidden-xs options']//img[@class='img-default non-selected_image']")
	public WebElement img_SearchimageIcon;

	@FindBy(how = How.XPATH, using = "//div[@id='des-search']//div[3]//label[1]//div[1]")
	public WebElement Radiobtn_UserID;

	@FindBy(how = How.XPATH, using = "//div[@id='des-search']//div[3]//label[1]//div[1]/following::div[1]")
	public WebElement txtbox_Search;

	@FindBy(how = How.XPATH, using = "//div[@id='des-search']//div[3]//label[1]//div[1]/following::div[1]/input")
	public WebElement txtbox_SearchInput;

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-5 col-sm-4']//div[@class='control-indicator']")
	public WebElement checkbox_Searchvalue;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms autousr btn-user active'][contains(text(),'Edit')]")
	public WebElement btn_Edit;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Preferences')]")
	public WebElement txt_UserPreferences;

	// @FindBy(how=How.XPATH,using= "//a[contains(text(),'User
	// Preferences')]//following::div[8]")
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Preferences')]//following::div[8]/div[1]/div[1]")
	public WebElement txtbox_select_Language;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Preferences')]//following::input[1]")
	public WebElement txtbox_select_Language_Value;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Permissions')]")
	public WebElement txt_PermissionsTab;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Access Boundaries')]")
	public WebElement txt_AccessBoundariesTab;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Training Assignments')]")
	public WebElement txt_TrainingAssignmentsTab;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'General')]")
	public WebElement txt_GeneralTab;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Group Assignments')]")
	public WebElement txt_GroupAssignments;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-xs-6 small-label control-text')]//a[contains(text(),'Region (Group 1)')]")
	public WebElement link_RegionGroup;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-md-10 col-sm-10 search-box')]")
	public WebElement txtbox_RegionGroupSearch;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-md-10 col-sm-10 search-box')]/input")
	public WebElement txtbox_RegionGroupSearchText;

	@FindBy(how = How.XPATH, using = "//label[contains(@class,'control control-radio control-text V-align-middle beside')]//div[contains(@class,'control-indicator')]")
	public WebElement radiobtn_RegionGroupSearch;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn-lms fixed active')][contains(text(),'Done')]")
	public WebElement btn_RegionGroupSearchDone;

}
