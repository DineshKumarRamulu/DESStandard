package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_Locators {
	@FindBy(how = How.XPATH, using = "//input[@id='txtuid']")
	public WebElement txtbox_UserID;

	@FindBy(how = How.XPATH, using = "//input[@id='txtpwd']")
	public WebElement txtbox_Password;

	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])[1]")
	public WebElement btn_Submit;

}
