package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.action.CustomTab_Actions;
import pages.action.GroupsList_Actions;
import pages.action.LMSHomePage_Actions;
import pages.action.LoginPage_Actions;
import pages.action.RolesList_Actions;
import pages.action.UserGeneralInformation_Actions;
import pages.locators.CustomTab_Locators;
import utils.SeleniumDriver;

public class UserManagement_Steps {

	LoginPage_Actions loginPage_Actions = new LoginPage_Actions();
	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();
	UserGeneralInformation_Actions userGeneralInformation_Actions = new UserGeneralInformation_Actions();
	GroupsList_Actions groupsList_Actions = new GroupsList_Actions();
	RolesList_Actions rolesList_Actions = new RolesList_Actions();
	CustomTab_Actions customTab_Actions = new CustomTab_Actions();

	@Given("^I am on Login Page \"([^\"]*)\" of DES UAT Site$")
	public void i_am_on_Login_Page_of_DES_UAT_Site(String url) throws Throwable {
		SeleniumDriver.openPage(url);
	}

	@And("^I Enter the UserID \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_Enter_the_UserID_and_password(String userid, String pwd) throws Throwable {
		loginPage_Actions.EnterUserid(userid);
		loginPage_Actions.Enterpassword(pwd);
	}

	@And("^Click on the LoginButton$")
	public void click_on_the_LoginButton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginPage_Actions.submitbuttonclick();
	}

	@And("^Click the User link from the LMS Home page$")
	public void click_the_User_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickUserLink();
	}

	@And("^Click the Add User button from the User List page$")
	public void click_the_Add_User_button_from_the_User_List_page() throws Throwable {
		lMSHomePage_Actions.adduserbtn();
	}

	// @And("^Provide the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and
	// \"([^\"]*)\" in the User General Identification Module$")
	@Given("^Provide the UserID \"([^\"]*)\" ,LastName \"([^\"]*)\" ,FirstName \"([^\"]*)\" ,EmailID \"([^\"]*)\" and ConfirmEmailID \"([^\"]*)\" in the User General Identification Module$")
	public void provide_the_and_in_the_User_General_Identification_Module(String userid, String LastName,
			String FirstName, String EmailID, String ConfrimEmailID) throws Throwable {
		userGeneralInformation_Actions.identificationDetails(userid, LastName, FirstName, EmailID, ConfrimEmailID);
	}

	// @And("^Provide the \"([^\"]*)\" and \"([^\"]*)\" in the Authentication
	// module$")
	@And("^Provide the Password \"([^\"]*)\" and ConfirmPassword \"([^\"]*)\" in the Authentication module$")
	public void provide_the_and_in_the_Authentication_module(String password, String Confirmpwd) throws Throwable {
		userGeneralInformation_Actions.authenticationDetails(password, Confirmpwd);
	}

	@And("^select all the Roles and assign Default Role as \"([^\"]*)\" in the Roles module$")
	public void select_all_the_Roles_and_assign_Default_Role_as_in_the_Roles_module(String rolename) throws Throwable {
		userGeneralInformation_Actions.rolesDetails(rolename);
	}

	@And("^click the save button$")
	public void click_the_save_button() throws Throwable {
		userGeneralInformation_Actions.clickSavebtn();
	}

	@Then("^The user should be saved successfully with the message \"([^\"]*)\"$")
	public void the_user_should_be_saved_successfully_with_the_message(String expected) throws Throwable {
		userGeneralInformation_Actions.userCreateAlert(expected);
	}

	@Then("^The user should be Updated successfully with the message \"([^\"]*)\"$")
	public void the_user_should_be_Updated_successfully_with_the_message(String expected) throws Throwable {

		userGeneralInformation_Actions.userUpdateAlert(expected);
	}

	@And("^Select the Search Image button$")
	public void select_the_Search_Image_button() throws Throwable {
		userGeneralInformation_Actions.searchIconClick();
	}

	@And("^Select the UserID radio button$")
	public void select_the_UserID_radio_button() throws Throwable {
		userGeneralInformation_Actions.click_btn_radio();
	}

	@And("^provid the Search UserID \"([^\"]*)\" and click the search icon$")
	public void provid_the_Search_UserID_and_click_the_search_icon(String Searchvalue) throws Throwable {
		userGeneralInformation_Actions.searchByUserID(Searchvalue);
	}

	@And("^Select the Searched user from the user list$")
	public void select_the_Searched_user_from_the_user_list() throws Throwable {
		userGeneralInformation_Actions.selectSearchUser();
	}

	@And("^Click the edit button$")
	public void click_the_edit_button() throws Throwable {
		userGeneralInformation_Actions.clickEditButton();
	}

	@And("^Select the User Preference and change the \"([^\"]*)\"$")
	public void select_the_User_Preference_and_change_the(String Language) throws Throwable {
		userGeneralInformation_Actions.selectuserpreferences(Language);
	}

	@And("^Select the Permissions Tab$")
	public void select_the_Permissions_Tab() throws Throwable {
		userGeneralInformation_Actions.click_PermissionsTab();
	}

	@And("^Select the Access Boundaries Tab$")
	public void select_the_Access_Boundaries_Tab() throws Throwable {
		userGeneralInformation_Actions.click_AccessBoundariesTab();
	}

	@And("^Select the Training Assignments Tab$")
	public void select_the_Training_Assignments_Tab() throws Throwable {
		userGeneralInformation_Actions.click_TrainingAssignmentsTab();
	}

	@And("^Click the Groups link from the LMS Home page$")
	public void click_the_Groups_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickGroupLink();
	}

	@And("^Click the Add button$")
	public void click_the_Add_button() throws Throwable {
		groupsList_Actions.GroupAddButton();
	}

	@And("^I Enter the Group Value as \"([^\"]*)\"$")
	public void i_Enter_the_Group_Value_as(String value) throws Throwable {
		groupsList_Actions.type_GroupValue(value);
	}

	@And("^I Click the SaveButton$")
	public void i_Click_the_SaveButton() throws Throwable {
		groupsList_Actions.click_GroupSaveButton();
	}

	@Then("^The Group should be saved successfully with the message \"([^\"]*)\"$")
	public void the_Group_should_be_saved_successfully_with_the_message(String expected) throws Throwable {
		groupsList_Actions.click_GroupAddAlertOK(expected);
	}

	@And("^Select the General Tab$")
	public void select_the_General_Tab() throws Throwable {
		userGeneralInformation_Actions.click_GeneralTab();
	}

	@And("^Click the Group Assignments Module$")
	public void click_the_Group_Assignments_Module() throws Throwable {
		userGeneralInformation_Actions.clickGroupAssignmentModule();
	}

	@And("^Click the Region Group Link$")
	public void click_the_Region_Group_Link() throws Throwable {
		userGeneralInformation_Actions.clickRegionGroupLink();
	}

	@And("^Search the Region with Search Value \"([^\"]*)\"$")
	public void search_the_Region_with_Search_Value(String value) throws Throwable {
		userGeneralInformation_Actions.SearchRegionGroup(value);
	}

	@And("^Click the Search result radio button$")
	public void click_the_Search_result_radio_button() throws Throwable {
		userGeneralInformation_Actions.ClickRadioBtn_SearchRegionGroup();
	}

	@And("^Click the Done button$")
	public void click_the_Done_button() throws Throwable {
		userGeneralInformation_Actions.ClickDone_SearchRegionGroup();
	}

	@And("^Click the Role link from the LMS Home page$")
	public void click_the_Role_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickRolesLink();
	}

	@And("^Select the Administrator in the Role List$")
	public void select_the_Administrator_in_the_Role_List() throws Throwable {
		rolesList_Actions.click_RadioAdministratorRole();
	}

	@And("^Click the Roles Add button$")
	public void click_the_Roles_Add_button() throws Throwable {
		rolesList_Actions.RoleAddButton();
	}

	@And("^I Enter the Role Name as \"([^\"]*)\"$")
	public void i_Enter_the_Role_Name_as(String value) throws Throwable {
		rolesList_Actions.type_RoleName(value);
	}

	@And("^Select the Roles Security as Administrator$")
	public void select_the_Roles_Security_as_Administrator() throws Throwable {
		rolesList_Actions.click_AdministratorCheckbox();
	}

	@And("^I Click the Roles SaveButton$")
	public void i_Click_the_Roles_SaveButton() throws Throwable {
		rolesList_Actions.roleSave();
	}

	@Then("^The Role should be saved successfully with the message \"([^\"]*)\"$")
	public void the_Role_should_be_saved_successfully_with_the_message(String expected) throws Throwable {
		rolesList_Actions.roleSaveAlertvalidation(expected);
	}

	@And("^Click the Custom Tabs link from the LMS Home page$")
	public void click_the_Custom_Tabs_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickCustomTabsLink();
	}

	@And("^Click the Tab List Add button$")
	public void click_the_Tab_List_Add_button() throws Throwable {
		customTab_Actions.CustomAddButton();
	}

	@And("^I Enter the Tab Name as \"([^\"]*)\"$")
	public void i_Enter_the_Tab_Name_as(String value) throws Throwable {
		customTab_Actions.type_TabName(value);
	}

	@And("^I Click the Tab SaveButton$")
	public void i_Click_the_Tab_SaveButton() throws Throwable {
		customTab_Actions.customSave();
	}

	@Then("^The Tab should be saved successfully with the message \"([^\"]*)\"$")
	public void the_Tab_should_be_saved_successfully_with_the_message(String expected) throws Throwable {
		customTab_Actions.customSaveAlertvalidation(expected);
	}

	@And("^Click the Content Tab$")
	public void click_the_Content_Tab() throws Throwable {
		customTab_Actions.click_ContentTab();
	}

	@And("^Click the Content Add Image Button$")
	public void click_the_Content_Add_Image_Button() throws Throwable {
		customTab_Actions.Click_ContentAddImage();
	}

	@And("^Provide the Content Editor text as \"([^\"]*)\"$")
	public void provide_the_Content_Editor_text_as(String value) throws Throwable {
		customTab_Actions.type_ContentAreaText(value);
	}

	@And("^click the Content Save button$")
	public void click_the_Content_Save_button() throws Throwable {
		customTab_Actions.click_ContentSaveBtn();
	}

	@Then("^The Tab should be Updated successfully with the message \"([^\"]*)\"$")
	public void the_Tab_should_be_Updated_successfully_with_the_message(String expected) throws Throwable {
		customTab_Actions.contentSaveAlertvalidation(expected);
	}

}
