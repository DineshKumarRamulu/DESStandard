package pages.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.LMSHomePage_Locators;
import pages.locators.LoginPage_Locators;
import utils.SeleniumDriver;

public class LMSHomePage_Actions {
	LMSHomePage_Locators lMSHomePage_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public LMSHomePage_Actions() {
		// SeleniumDriver.setUpDriver();
		this.lMSHomePage_Locators = new LMSHomePage_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), lMSHomePage_Locators);

	}

	public void clickUserLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("spinner")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Users);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Users);
		// lMSHomePage_Locators.link_Users.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

	}

	public void clickGroupLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Groups);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Groups);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void adduserbtn() {
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.btn_AddUser);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickRolesLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Roles);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Roles);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCustomTabsLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_CustomTabs);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_CustomTabs);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickReportsLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Reports);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Reports);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCustomizeCourseLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_CustomEaseCourses);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_CustomEaseCourses);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickAuthoringToolLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_AuthoringTool);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_AuthoringTool);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCurriculumLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Curriculum);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Curriculum);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCourseLink() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_Courses);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Courses);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCourseOptionTemplate() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
				lMSHomePage_Locators.link_CourseOptionTemplate);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_CourseOptionTemplate);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void classroomhandsonscore() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
				lMSHomePage_Locators.link_Classroomandhandsonscore);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_Classroomandhandsonscore);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickGlobalOptions() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(5000);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", lMSHomePage_Locators.link_GlobalOptions);
		javaScriptExecutor.executeScript("arguments[0].click();", lMSHomePage_Locators.link_GlobalOptions);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}
}
