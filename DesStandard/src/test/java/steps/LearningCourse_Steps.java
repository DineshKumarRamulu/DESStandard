package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.action.LMSHomePage_Actions;
import pages.action.Learnings_Actions;
import utils.SeleniumDriver;

public class LearningCourse_Steps {

	LMSHomePage_Actions lMSHomePage_Actions = new LMSHomePage_Actions();
	Learnings_Actions learnings_Actions = new Learnings_Actions();

	@And("^Click the Expand Tree Icon in the Learning Due Tab$")
	public void click_the_Expand_Tree_Icon_in_the_Learning_Due_Tab() throws Throwable {
		learnings_Actions.expandTreeIcon();
	}

	@And("^Click the Course link \"([^\"]*)\" in the Learning Tab$")
	public void click_the_Course_link_in_the_Learning_Tab(String CourseName) throws Throwable {
		learnings_Actions.clickCourseLink(CourseName);
	}

	@And("^Click the Course Launch button$")
	public void click_the_Course_Launch_button() throws Throwable {
		learnings_Actions.clickCourseLaunch();
	}

	@And("^Switch to the \"([^\"]*)\" Menu Page$")
	public void switch_to_the_Menu_Page(String CourseTitle) throws Throwable {
		learnings_Actions.switchwindow(CourseTitle);
	}

	@And("^Switch to the Remote \"([^\"]*)\" Menu Page$")
	public void switch_to_the_Remote_Menu_Page(String CourseTitle) throws Throwable {
		learnings_Actions.switchwindowforRemoteCourse(CourseTitle);
	}

	@And("^Click the Course Start button$")
	public void click_the_Course_Start_button() throws Throwable {

	}

	@And("^Click the User Icon inside the HTML(\\d+) Course$")
	public void click_the_User_Icon_inside_the_HTML_Course(int arg1) throws Throwable {

	}

	@And("^Click the Course Exit button$")
	public void click_the_Course_Exit_button() throws Throwable {

	}

	@And("^Click the Yes button in the confirmation Alert message$")
	public void click_the_Yes_button_in_the_confirmation_Alert_message() throws Throwable {

	}

	@Then("^The Course \"([^\"]*)\" Status should be changed from Not Started to Started in the Course Listing Page$")
	public void the_Course_Status_should_be_changed_from_Not_Started_to_Started_in_the_Course_Listing_Page(
			String CourseName) throws InterruptedException {
		learnings_Actions.ValidateCourseStatus(CourseName);
	}

	@Given("^I Launch the Remote URL \"([^\"]*)\"$")
	public void i_Launch_the_Remote_URL(String url) throws Throwable {
		SeleniumDriver.openPage(url);
	}

	@And("^Click the Launch Course link$")
	public void click_the_Launch_Course_link() throws Throwable {
		learnings_Actions.clickRemoteLaunchCourse();
	}

	@And("^I Close the parent window$")
	public void i_Close_the_parent_window() throws Throwable {
		SeleniumDriver.getdriver().quit();
	}

	@And("^Search the Course with the courseName \"([^\"]*)\"$")
	public void search_the_Course_with_the_courseName(String CourseName) throws Throwable {
		learnings_Actions.CourseSearchListing(CourseName);
	}
}
