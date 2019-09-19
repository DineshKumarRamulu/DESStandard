package pages.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPage_Locators;
import utils.SeleniumDriver;

public class LoginPage_Actions {

	LoginPage_Locators loginPage_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;

	public LoginPage_Actions() {
		// SeleniumDriver.setUpDriver();
		this.loginPage_Locators = new LoginPage_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), loginPage_Locators);
	}

	public void EnterUserid(String userid) {

		loginPage_Locators.txtbox_UserID.sendKeys(userid);

	}

	public void Enterpassword(String pwd) throws InterruptedException {
		Thread.sleep(3000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", loginPage_Locators.txtbox_Password);
		loginPage_Locators.txtbox_Password.sendKeys(pwd);

	}

	public void submitbuttonclick() {

		// loginpage.btn_Submit.click();
		javaScriptExecutor.executeScript("arguments[0].click();", loginPage_Locators.btn_Submit);

	}

	public void clickuserlink() {

	}

}
