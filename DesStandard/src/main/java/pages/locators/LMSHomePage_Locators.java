package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LMSHomePage_Locators {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Users')]")
	public WebElement link_Users;

	@FindBy(how = How.XPATH, using = "//button[@ng-click='Uc.AddUser()']")
	public WebElement btn_AddUser;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-4 col-md-4 hidden-xs options']//img[@class='img-default non-selected_image']")
	public WebElement img_SearchIcon;

	@FindBy(how = How.XPATH, using = "//div[@id='des-search']//div[3]//label[1]//div[1]")
	public WebElement radiobtn_SearchByUserid;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control ng-pristine ng-valid ng-empty ng-touched']")
	public WebElement txt_Searchtxt;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Groups')]")
	public WebElement link_Groups;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Roles')]")
	public WebElement link_Roles;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Custom Tabs')]")
	public WebElement link_CustomTabs;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Reports')]")
	public WebElement link_Reports;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'CustomEase Courses')]")
	public WebElement link_CustomEaseCourses;

	@FindBy(how = How.XPATH, using = "//a[@class='LINKNL'][contains(text(),'Authoring Tool')]")
	public WebElement link_AuthoringTool;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Curriculums')]")
	public WebElement link_Curriculum;

	@FindBy(how = How.XPATH, using = "//div[@id='innerTab2']//a[contains(@class,'LINKNL')][contains(text(),'Courses')]")
	public WebElement link_Courses;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Course/Assessment/Options Template')]")
	public WebElement link_CourseOptionTemplate;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Classroom & Hands-On Scores')]")
	public WebElement link_Classroomandhandsonscore;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Global Options')]")
	public WebElement link_GlobalOptions;

}
