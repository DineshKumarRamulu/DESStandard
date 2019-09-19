package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.action.LMSHomePage_Actions;
import pages.action.Reports_Actions;
import pages.action.TrainingManagement_Actions;
import pages.locators.ContentManagement_Locators;
import utils.SeleniumDriver;

public class TrainingManagement_Steps {

	TrainingManagement_Actions trainingManagement_Actions = new TrainingManagement_Actions();
	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();

	@And("^Click the Curriculums link from the LMS Home page$")
	public void click_the_Curriculums_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickCurriculumLink();
	}

	@And("^Provide the Curriculm ID \"([^\"]*)\"$")
	public void provide_the_Curriculm_ID(String curriculumID) throws Throwable {
		trainingManagement_Actions.provideCurriculumID(curriculumID);
	}

	@And("^Provide the Curriculum Name \"([^\"]*)\"$")
	public void provide_the_Curriculum_Name(String curriculumname) throws Throwable {
		trainingManagement_Actions.provideCurriculumName(curriculumname);
	}

	@And("^Click the ok button for the message You have chosen to Save\\. Please click OK to proceed with this action\\.$")
	public void click_the_ok_button_for_the_message_You_have_chosen_to_Save_Please_click_OK_to_proceed_with_this_action()
			throws Throwable {

	}

	@And("^Click the Curriculum save button$")
	public void click_the_Curriculum_save_button() throws Throwable {
		trainingManagement_Actions.CurriculumsaveandClickcourseTab();
	}

	@Then("^The Curriculum should be saved successfully with the message Curriculum has been created successfully\\.$")
	public void the_Curriculum_should_be_saved_successfully_with_the_message_Curriculum_has_been_created_successfully()
			throws Throwable {

	}

	@And("^Click the Courses Tab$")
	public void click_the_Courses_Tab() throws Throwable {

	}

	@And("^Select the first course in the course list$")
	public void select_the_first_course_in_the_course_list() throws Throwable {

	}

	@And("^Click the save button$")
	public void click_the_save_button() throws Throwable {

	}

	@And("^Click the OK button for the message Are you sure you want to assign course\\(s\\) to the curriculum\\?$")
	public void click_the_OK_button_for_the_message_Are_you_sure_you_want_to_assign_course_s_to_the_curriculum()
			throws Throwable {

	}

	@And("^Click the course button for the message Should the Course Option Template and Feedback Template match the default set in the Course or in the Curriculum\\?$")
	public void click_the_course_button_for_the_message_Should_the_Course_Option_Template_and_Feedback_Template_match_the_default_set_in_the_Course_or_in_the_Curriculum()
			throws Throwable {

	}

	@Then("^The Course should be assigned successfully with the message Course\\(s\\) assignment for Curriculum updated successfully\\.$")
	public void the_Course_should_be_assigned_successfully_with_the_message_Course_s_assignment_for_Curriculum_updated_successfully()
			throws Throwable {

	}

	@And("^Click the Assignments Tab$")
	public void click_the_Assignments_Tab() throws Throwable {

	}

	@And("^Select the user in the userlist$")
	public void select_the_user_in_the_userlist() throws Throwable {

	}

	@And("^Click the userlist Save button$")
	public void click_the_userlist_Save_button() throws Throwable {

	}

	@And("^Click the Ok button for the message Are you sure you want to assign user\\(s\\) to the curriculum\\?$")
	public void click_the_Ok_button_for_the_message_Are_you_sure_you_want_to_assign_user_s_to_the_curriculum()
			throws Throwable {

	}

	@Then("^The user should be saved successfully with the message Curriculum assignment updated successfully\\.$")
	public void the_user_should_be_saved_successfully_with_the_message_Curriculum_assignment_updated_successfully()
			throws Throwable {

	}

	@And("^Click the Search Image button and search by Course ID \"([^\"]*)\"$")
	public void click_the_Search_Image_button_and_search_by_Course_ID(String coursename) throws Throwable {
		trainingManagement_Actions.searchcourseandSaveandClickAssignTab(coursename);
	}

	@And("^Click the OK button for the message Are you sure you want to assign courses to the curriculum\\?$")
	public void click_the_OK_button_for_the_message_Are_you_sure_you_want_to_assign_courses_to_the_curriculum()
			throws Throwable {

	}

	@Then("^The Course should be assigned successfully with the message Courses assignment for Curriculum updated successfully\\.$")
	public void the_Course_should_be_assigned_successfully_with_the_message_Courses_assignment_for_Curriculum_updated_successfully()
			throws Throwable {

	}

	@And("^Click the Search Image button and search by User ID \"([^\"]*)\"$")
	public void click_the_Search_Image_button_and_search_by_User_ID(String userid) throws Throwable {
		trainingManagement_Actions.searchimageByuseridandValidateuserassign(userid);
	}

	@And("^Click the Ok button for the message Are you sure you want to assign users to the curriculum\\?$")
	public void click_the_Ok_button_for_the_message_Are_you_sure_you_want_to_assign_users_to_the_curriculum()
			throws Throwable {

	}

	@And("^Click the Courses link from the LMS Home page$")
	public void click_the_Courses_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickCourseLink();
	}

	@And("^Click the Search Image button and search by Course name \"([^\"]*)\"$")
	public void click_the_Search_Image_button_and_search_by_Course_name(String coursename) throws Throwable {
		trainingManagement_Actions.searchimageByCourseandClickAssignTab(coursename);
	}

	@And("^Select the first course in the list$")
	public void select_the_first_course_in_the_list() throws Throwable {

	}

	@And("^Click the assignments tab$")
	public void click_the_assignments_tab() throws Throwable {

	}

	@And("^Click the Search Image button and search by UserID \"([^\"]*)\"$")
	public void click_the_Search_Image_button_and_search_by_UserID(String UserID) throws Throwable {
		trainingManagement_Actions.searchimageByuseridandValidateuserassign(UserID);
	}

	@And("^Select the first User in the list$")
	public void select_the_first_User_in_the_list() throws Throwable {

	}

	@And("^Click the OK button for the message Do you want to assign Users to Course\\?$")
	public void click_the_OK_button_for_the_message_Do_you_want_to_assign_Users_to_Course() throws Throwable {

	}

	@Then("^The Course Assignemnts should be updated successfully with the message Course Assignments Updated Successfully$")
	public void the_Course_Assignemnts_should_be_updated_successfully_with_the_message_Course_Assignments_Updated_Successfully()
			throws Throwable {

	}

	@And("^Click the edit button in the course list$")
	public void click_the_edit_button_in_the_course_list() throws Throwable {

	}

	@And("^Click the Courses Options Template link from the LMS Home page$")
	public void click_the_Courses_Options_Template_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.clickCourseOptionTemplate();
	}

	@And("^Search the template \"([^\"]*)\"$")
	public void search_the_template(String CourseTemplate) throws Throwable {
		trainingManagement_Actions.searchcoursetemplateandupdateandvalidate(CourseTemplate);
	}

	@And("^Click the template edit button$")
	public void click_the_template_edit_button() throws Throwable {

	}

	@And("^Click the Mastery Options module$")
	public void click_the_Mastery_Options_module() throws Throwable {

	}

	@And("^Check the Grant Mastery When User Masters All Self-Checks and click Yes button$")
	public void check_the_Grant_Mastery_When_User_Masters_All_Self_Checks_and_click_Yes_button() throws Throwable {

	}

	@And("^Click the Grant Mastery Save button$")
	public void click_the_Grant_Mastery_Save_button() throws Throwable {

	}

	@Then("^The Course Options Template should be updated successfully with the message Course Options Template updated successfully\\.$")
	public void the_Course_Options_Template_should_be_updated_successfully_with_the_message_Course_Options_Template_updated_successfully()
			throws Throwable {

	}

	@And("^Click the Classroom & Hands-On Scores link from the LMS Home page$")
	public void click_the_Classroom_Hands_On_Scores_link_from_the_LMS_Home_page() throws Throwable {
		lMSHomePage_Actions.classroomhandsonscore();
	}

	@And("^Click the Search Image button and search by Course name \"([^\"]*)\" in the Classroom handson page$")
	public void click_the_Search_Image_button_and_search_by_Course_name_in_the_Classroom_handson_page(String course)
			throws Throwable {
		trainingManagement_Actions.searchcoursehandson(course);
	}

	@And("^Select the first course in the list in the Classroom handson page$")
	public void select_the_first_course_in_the_list_in_the_Classroom_handson_page() throws Throwable {

	}

	@And("^Click the Search Image button and search by User ID \"([^\"]*)\" in the Classroom handson page$")
	public void click_the_Search_Image_button_and_search_by_User_ID_in_the_Classroom_handson_page(String user)
			throws Throwable {
		trainingManagement_Actions.searchUserhandson(user);
	}

	@And("^Select the first User in the list in the Classroom handson page$")
	public void select_the_first_User_in_the_list_in_the_Classroom_handson_page() throws Throwable {

	}

	@And("^Select the course status radio button$")
	public void select_the_course_status_radio_button() throws Throwable {

	}

	@And("^In the Post Test Date field select the calender and click the Today date$")
	public void in_the_Post_Test_Date_field_select_the_calender_and_click_the_Today_date() throws Throwable {

	}

	@And("^Select the CourseStatus \"([^\"]*)\"$")
	public void select_the_CourseStatus(String coursestatus) throws Throwable {
		trainingManagement_Actions.searchCourseStatusandValidate(coursestatus);
	}

	@And("^Click the save button in the Classroom handson page$")
	public void click_the_save_button_in_the_Classroom_handson_page() throws Throwable {

	}

	@And("^Again click the save button in the confirmation screen$")
	public void again_click_the_save_button_in_the_confirmation_screen() throws Throwable {

	}

	@Then("^The Classroom score should be updated successfully with the message Classroom scores updated successfully\\.$")
	public void the_Classroom_score_should_be_updated_successfully_with_the_message_Classroom_scores_updated_successfully()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
