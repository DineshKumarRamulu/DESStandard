package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GroupsList_Locators {

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active']")
	public WebElement btn_AddGroup;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Group Value']")
	public WebElement txtBox_GroupValue;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-md-10 content-height')]//div[5]//button[2]")
	public WebElement btn_GroupSave;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	public WebElement btn_GroupAlert_Ok;

	// @FindBy(how=How.XPATH,using= "//button[contains(text(),'Ok')]")
	// public WebElement btn_GroupInsertedSuccess_Ok;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'- Inserted Successfully!!!')]")
	public WebElement txt_GroupInsertedSuccessAlert;

}
