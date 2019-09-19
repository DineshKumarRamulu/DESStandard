package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.action.ContentManagement_Actions;
import pages.action.LMSHomePage_Actions;
import pages.action.Learnings_Actions;

public class ContentManagement_Steps {

	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();
	ContentManagement_Actions contentManagement_Actions = new ContentManagement_Actions();

	@And("^Click the CustomEase Courses link from the LMS Home page$")
	public void click_the_CustomEase_Courses_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickCustomizeCourseLink();
	}

	@And("^Click the Filter button and click the curriculum link$")
	public void click_the_Filter_button_and_click_the_curriculum_link() throws Throwable {
		contentManagement_Actions.ClickFilterandCurriculumlink();
	}

	@And("^Search the Curriculum with \"([^\"]*)\" and select the curriculum and click done button$")
	public void search_the_Curriculum_with_and_select_the_curriculum_and_click_done_button(String CurriculumName)
			throws Throwable {
		contentManagement_Actions.serachCurriculumandSlectandDone(CurriculumName);
	}

	@And("^Select the Search button and searchBy coursename \"([^\"]*)\"$")
	public void select_the_Search_button_and_searchBy_coursename(String CourseName) throws Throwable {
		contentManagement_Actions.searchbuttonSearchByCourseName(CourseName);
	}

	@And("^Select the Course from the Customase Courses List$")
	public void select_the_Course_from_the_Customase_Courses_List() throws Throwable {
		contentManagement_Actions.selectcoursefromlist();
	}

	@And("^Click the open button$")
	public void click_the_open_button() throws Throwable {
		contentManagement_Actions.clickopenbutton();
	}

	@And("^If BookMark message occurs then click the Course Menu button$")
	public void if_BookMark_message_occurs_then_click_the_Course_Menu_button() throws Throwable {
		contentManagement_Actions.takeCourseandValidate();
	}

	@And("^Click the Start button$")
	public void click_the_Start_button() throws Throwable {

	}

	@And("^Click the Customize this storyboard button$")
	public void click_the_Customize_this_storyboard_button() throws Throwable {

	}

	@And("^Click the Preview this storyboard button$")
	public void click_the_Preview_this_soryboard_button() throws Throwable {

	}

	@And("^Click the return button$")
	public void click_the_return_button() throws Throwable {

	}

	@And("^Click the Exit button and Click ok to the Alert$")
	public void click_the_Exit_button_and_Click_ok_to_the_Alert() throws Throwable {

	}

	@And("^Click the Authoring Tool link from the LMS Home page$")
	public void click_the_Authoring_Tool_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickAuthoringToolLink();
	}

	@And("^Click the HTML(\\d+)/MICROLEARNING Course Type$")
	public void click_the_HTML_MICROLEARNING_Course_Type(int arg1) throws Throwable {
		contentManagement_Actions.clickHTML5MLCourseType();
	}

	@And("^Select the Existing Course \"([^\"]*)\"$")
	public void select_the_Existing_Course(String CourseName) throws Throwable {
		contentManagement_Actions.validateCoursePublishSuccess(CourseName);
	}

	@And("^Search the CourseBy \"([^\"]*)\" and click the Go button$")
	public void search_the_CourseBy_and_click_the_Go_button(String arg1) throws Throwable {

	}

	@And("^select the course from the course list and click the Open button$")
	public void select_the_course_from_the_course_list_and_click_the_Open_button() throws Throwable {

	}

	@And("^Click the preview button$")
	public void click_the_preview_button() throws Throwable {

	}

	@And("^Clicl the Start button$")
	public void clicl_the_Start_button() throws Throwable {

	}

	@And("^click the user icon and click the exit button$")
	public void click_the_user_icon_and_click_the_exit_button() throws Throwable {

	}

	@And("^Click the publish Finish button$")
	public void click_the_publish_Finish_button() throws Throwable {

	}

	@And("^Click the NO button for the alert Do you want to publish the course with a new CourseID$")
	public void click_the_NO_button_for_the_alert_Do_you_want_to_publish_the_course_with_a_new_CourseID()
			throws Throwable {

	}

	@Then("^The Course has been published Successfully alert message should be displayed$")
	public void the_Course_has_been_published_Successfully_alert_message_should_be_displayed() throws Throwable {

	}

	@And("^Click the Import an Interactive Coruse \"([^\"]*)\"$")
	public void click_the_Import_an_Interactive_Coruse(String CourseName) throws Throwable {
		contentManagement_Actions.validateImportCourseSuccess(CourseName);
	}

	@And("^Click the Import to Authoring Tool button$")
	public void click_the_Import_to_Authoring_Tool_button() throws Throwable {

	}

	@And("^Click on the Save button in the Course Property Page$")
	public void click_on_the_Save_button_in_the_Course_Property_Page() throws Throwable {

	}

	@Then("^The Course has been imported successfully alert message should be displayed$")
	public void the_Course_has_been_imported_successfully_alert_message_should_be_displayed() throws Throwable {

	}

}
