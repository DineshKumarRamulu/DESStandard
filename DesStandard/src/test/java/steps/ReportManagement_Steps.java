package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.action.LMSHomePage_Actions;
import pages.action.LoginPage_Actions;
import pages.action.Reports_Actions;

public class ReportManagement_Steps {

	Reports_Actions reports_Actions = new Reports_Actions();
	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();

	@And("^Click the Reports link from the LMS Home page$")
	public void click_the_Reports_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickReportsLink();
	}

	@And("^Select the Basic Report in the Report Type Field$")
	public void select_the_Basic_Report_in_the_Report_Type_Field() throws Throwable {
		reports_Actions.SelectReportType();
	}

	@And("^Search the \"([^\"]*)\" in search field$")
	public void search_the_in_search_field(String ReportName) throws Throwable {
		reports_Actions.SearchReport(ReportName);
	}

	@And("^Select the Searched Report in the Report Name List$")
	public void select_the_Searched_Report_in_the_Report_Name_List() throws Throwable {
		reports_Actions.SelectRadioReportName();
	}

	@Given("^Click the Run Report Button$")
	public void click_the_Run_Report_Button() throws Throwable {
		reports_Actions.ClickRunReportButton();
	}

	@And("^Click the Process Report button in the Report Filter Criteria Page$")
	public void click_the_Process_Report_button_in_the_Report_Filter_Criteria_Page() throws Throwable {
		reports_Actions.ClickProcessReportButton();
	}

	@Then("^The \"([^\"]*)\" Should be displayed inside the processed Report$")
	public void the_Should_be_displayed_inside_the_processed_Report(String expected) throws Throwable {
		reports_Actions.ReportNamevalidation(expected);
	}

	@And("^Click the Edit button$")
	public void click_the_Edit_button() throws Throwable {
		reports_Actions.ClickEditButton();
	}

	@And("^Click the Save As button in the Report General Page$")
	public void click_the_Save_As_button_in_the_Report_General_Page() throws Throwable {
		reports_Actions.ClickSaveAsButton();
	}

	@And("^Provide the Report Title as \"([^\"]*)\"$")
	public void provide_the_Report_Title_as(String ReportTitle) throws Throwable {
		reports_Actions.typeReportTitle(ReportTitle);
	}

	@And("^Click the Save button$")
	public void click_the_Save_button() throws Throwable {
		reports_Actions.ClickSaveButton();
	}

	@Then("^The Report should be saved with the alert message \"([^\"]*)\"$")
	public void the_Report_should_be_saved_with_the_alert_message(String expected) throws Throwable {
		reports_Actions.ReportSavevalidation(expected);
	}

	@And("^Click the Ok button$")
	public void click_the_Ok_button() throws Throwable {
		reports_Actions.ClickCustomReportAlertOkButton();
		Thread.sleep(2000);
	}

	@And("^Click the Reports Link in the Report General page$")
	public void click_the_Reports_Link_in_the_Report_General_page() throws Throwable {
		reports_Actions.ClickReportLink();
	}

	@And("^Select the Custom Report in the Report Type Field$")
	public void select_the_Custom_Report_in_the_Report_Type_Field() throws Throwable {
		reports_Actions.SelectCustomReportType();
	}

	@And("^Click the Unformatted Data Only Yes Radio button$")
	public void click_the_Unformatted_Data_Only_Yes_Radio_button() throws Throwable {
		reports_Actions.ClickUnformattedRadioBtn();
	}

	@Then("^The Report heading should be displayed in a single line$")
	public void the_Report_heading_should_be_displayed_in_a_single_line() throws Throwable {
		reports_Actions.ReportunformattedHeadervalidation();
	}

	@And("^Click the ExportTo DropDown and download all the export file formats$")
	public void click_the_ExportTo_DropDown_and_download_all_the_export_file_formats() throws Throwable {
		reports_Actions.Click_ExportToAllFileFormats();
	}

	@Then("^All the exported file formats should be downloaded to the default \"([^\"]*)\"$")
	public void all_the_exported_file_formats_should_be_downloaded_to_the_default(String downloadPath)
			throws Throwable {
		reports_Actions.ExportReportDownloadvalidation(downloadPath);
	}

}
