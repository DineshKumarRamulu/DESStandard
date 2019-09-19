package pages.action;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.Learnings_Locators;
import pages.locators.Reports_Locators;
import utils.SeleniumDriver;

public class Learnings_Actions {

	Learnings_Locators learnings_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public Learnings_Actions() {
		// SeleniumDriver.setUpDriver();
		this.learnings_Locators = new Learnings_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), learnings_Locators);

	}

	public void expandTreeIcon() throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(10000);

		List<WebElement> expandtree = SeleniumDriver.getdriver().findElements(
				By.xpath("//img[@class='img-selected hidden-xs common_mousetip' and @title='Expand Tree']"));

		if (expandtree.size() > 0) {
			expandtree.get(0).click();

		}

	}

	public void clickCourseLink(String CourseName) throws InterruptedException {
		WebElement course = SeleniumDriver.getdriver()
				.findElement(By.xpath("//div[@class='header-list']//a[contains(text(),'" + CourseName + "')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", course);
		course.click();
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void clickCourseLaunch() throws InterruptedException {
		Thread.sleep(2000);
		learnings_Locators.btn_LaunchCourse.click();
		Thread.sleep(10000);
	}

	public void clickRemoteLaunchCourse() throws InterruptedException {
		SeleniumDriver.getdriver().switchTo().frame("Frame1");
		learnings_Locators.link_Remorelaunchcourse.click();
		Thread.sleep(8000);
	}

	public void switchwindow(String CourseTitle) throws InterruptedException {
		String parentwindow = SeleniumDriver.getdriver().getWindowHandle();

		Set<String> allwindows = SeleniumDriver.getdriver().getWindowHandles();
		System.out.println(allwindows.size());
		String Title = CourseTitle;
		for (String childwindow : allwindows) {
			String title = SeleniumDriver.getdriver().switchTo().window(childwindow).getTitle();
			System.out.println(title);
			System.out.println(Title);
			// if(title.equals(Title))
			if (title.contains(Title)) {
				System.out.println("pass");
				Thread.sleep(30000);
				WebElement start = SeleniumDriver.getdriver()
						.findElement(By.xpath("//button[@class='eng_global_button eng_menu_start_button']"));
				// javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", start);
				start.click();
				// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("eng_loader")));
				Thread.sleep(20000);

				SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_btn_user']")).click();

				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_exit']")).click();

				SeleniumDriver.getdriver()
						.findElement(By.xpath("(//button[@class='eng_global_button skn_btn_container'])[1]")).click();

			}
		}
		// Thread.sleep(8000);
		SeleniumDriver.getdriver().switchTo().window(parentwindow);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(5000);
	}

	public void switchwindowforRemoteCourse(String CourseTitle) throws InterruptedException {
		String parentwindow = SeleniumDriver.getdriver().getWindowHandle();

		Set<String> allwindows = SeleniumDriver.getdriver().getWindowHandles();
		System.out.println(allwindows.size());
		String Title = CourseTitle;
		for (String childwindow : allwindows) {
			String title = SeleniumDriver.getdriver().switchTo().window(childwindow).getTitle();
			System.out.println(title);
			System.out.println(Title);
			// if(title.equals(Title))
			if (title.contains(Title)) {
				System.out.println("pass");
				Thread.sleep(30000);
				WebElement start = SeleniumDriver.getdriver()
						.findElement(By.xpath("//button[@class='eng_global_button eng_menu_start_button']"));
				// javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", start);
				start.click();
				// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("eng_loader")));
				Thread.sleep(20000);

				SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_btn_user']")).click();

				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_exit']")).click();

				// SeleniumDriver.getdriver().findElement(By.xpath("(//button[@class='eng_global_button
				// skn_btn_container'])[1]")).click();

			}
		}
		// Thread.sleep(8000);
		SeleniumDriver.getdriver().switchTo().window(parentwindow);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void ValidateCourseStatus(String CourseName) throws InterruptedException {

		WebElement coursestatus = SeleniumDriver.getdriver().findElement(
				By.xpath("//div[@class='header-list']//a[contains(text(),'" + CourseName + "')]/following::div[7]"));
		WebElement coursestatus1 = SeleniumDriver.getdriver().findElement(
				By.xpath("//div[@class='header-list']//a[contains(text(),'" + CourseName + "')]/following::div[7]"));
		// div[@class='header-list']//a[contains(text(),'BBP044HMLENG0000')]/following::div[6]
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", coursestatus);
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", coursestatus1);
		// String status =
		// driver.findElement(By.xpath("//div[@class='header-list']//a[contains(text(),'Bloodborne
		// Pathogens: Don’t Take the Risk! (BBP044')]/following::div[7]")).getText();
		String status = coursestatus1.getText();
		System.out.println(status);
		Assert.assertEquals(status, "Started");
	}

	public void CourseSearchListing(String CourseName) {
		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='emp-content']//input[1]")).sendKeys(CourseName);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

}
