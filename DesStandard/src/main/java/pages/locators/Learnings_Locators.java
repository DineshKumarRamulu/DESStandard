package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Learnings_Locators {

	@FindBy(how = How.XPATH, using = "//img[@class='img-selected hidden-xs common_mousetip' and @title='Expand Tree']")
	public WebElement expand_TreeIcon;

	@FindBy(how = How.XPATH, using = "//div[@class='modal-content']//div[@class='modal-footer']//button[@class='btn-lms auto active'][contains(text(),'Launch Course')]")
	public WebElement btn_LaunchCourse;

	@FindBy(how = How.XPATH, using = "//button[@class='eng_global_button eng_menu_start_button']")
	public WebElement btn_Start;

	@FindBy(how = How.XPATH, using = "//div[@id='eng_btn_user']")
	public WebElement btn_User;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Course Exit')]")
	public WebElement btn_UserExit;

	@FindBy(how = How.XPATH, using = "//button[text()='YES']")
	public WebElement btn_ExitAlertYes;

	@FindBy(how = How.XPATH, using = "//span[text()='Launch Course']")
	public WebElement link_Remorelaunchcourse;

}
