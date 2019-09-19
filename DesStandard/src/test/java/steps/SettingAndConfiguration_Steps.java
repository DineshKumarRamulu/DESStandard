package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.action.LMSHomePage_Actions;
import pages.action.Reports_Actions;
import pages.action.SettingAndConfiguration_Actions;

public class SettingAndConfiguration_Steps {

	SettingAndConfiguration_Actions settingAndConfiguration_Actions = new SettingAndConfiguration_Actions();
	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();

	@And("^Click the Global Options link from the LMS Home page$")
	public void click_the_Global_Options_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickGlobalOptions();
	}

	@And("^Click the Course Login Settings module$")
	public void click_the_Course_Login_Settings_module() throws Throwable {
		settingAndConfiguration_Actions.clickLoginSettingsModule();
	}

	@And("^Provide the Logout Time Minutes \"([^\"]*)\"$")
	public void provide_the_Logout_Time_Minutes(String Timeout) throws Throwable {
		settingAndConfiguration_Actions.provideLogoutTimeAndValidateAlert(Timeout);
	}

	@And("^Click the Global options Save button$")
	public void click_the_Global_options_Save_button() throws Throwable {

	}

	@And("^Click the Ok button for the message You have chosen to Save\\. Please click OK to proceed with this action$")
	public void click_the_Ok_button_for_the_message_You_have_chosen_to_Save_Please_click_OK_to_proceed_with_this_action()
			throws Throwable {

	}

	@Then("^The Global Options should be saved successfully with the message Global Options saved successfully\\.$")
	public void the_Global_Options_should_be_saved_successfully_with_the_message_Global_Options_saved_successfully()
			throws Throwable {

	}

}
