package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RolesList_Locators {

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-xs-12 col-sm-12 col-md-10 content-height pb-70')]//div[2]//div[1]//label[1]//div[1]")
	public WebElement radiobtn_RoleListAdministrator;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
	public WebElement btn_AddRoles;

	@FindBy(how = How.XPATH, using = "//input[@id='txtRoleName']")
	public WebElement txtbox_RoleName;

	@FindBy(how = How.XPATH, using = "//div[@id='customTablechk1']//div[1]//label[1]//div[1]")
	public WebElement checkbox_RoleSecurityAdministrator;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	public WebElement btn_RoleSave;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'modal fade in')]//button[contains(@class,'btn-lms fixed active')][contains(text(),'Ok')]")
	public WebElement btn_RoleSaveAlertOK;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Role created successfully.')]")
	public WebElement txt_RolecreatedAlertmsg;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'modal alert-dialog-uib fade in')]//button[contains(@class,'btn-lms fixed active')][contains(text(),'Ok')]")
	public WebElement btn_RolecreatedAlertmsgOk;

}
