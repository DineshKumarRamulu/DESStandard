package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContentManagement_Locators {

	@FindBy(how = How.XPATH, using = "//span[text()='Launch Course']")
	public WebElement link_Remorelaunchcourse;

}
