package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomTab_Locators {

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active']")
	public WebElement btn_CustomADD;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Tab Name']")
	public WebElement txtbox_TabName;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	public WebElement btn_CustomSave;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active'][contains(text(),'Ok')]")
	public WebElement btn_CustomSaveAlertOk;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Tab inserted successfully.')]")
	public WebElement txt_CustomInsertedsuccessAlert;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active']")
	public WebElement btn_CustomInsertSuccessAlertOk;

	@FindBy(how = How.XPATH, using = "//button[text()='Content']")
	public WebElement btn_ContentTab;

	@FindBy(how = How.XPATH, using = "//img[@title='Add']")
	public WebElement img_ContentTabAdd;

	@FindBy(how = How.XPATH, using = "//body[@id='tinymce']")
	public WebElement editor_ContentEditor;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	public WebElement btn_ContentSave;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Tab contents updated successfully.')]")
	public WebElement txt_ContentTabupdateAlertMsg;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active'][contains(text(),'Ok')]")
	public WebElement btn_ContentTabupdateAlertOk;

}
