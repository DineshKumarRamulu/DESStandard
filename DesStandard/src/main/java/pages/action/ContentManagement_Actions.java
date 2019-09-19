package pages.action;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.ContentManagement_Locators;
import pages.locators.Learnings_Locators;
import utils.SeleniumDriver;

public class ContentManagement_Actions {
	ContentManagement_Locators contentManagement_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public ContentManagement_Actions() {
		// SeleniumDriver.setUpDriver();
		this.contentManagement_Locators = new ContentManagement_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), contentManagement_Locators);

	}

	public void ClickFilterandCurriculumlink() throws InterruptedException {
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(3000);
		WebElement filterbtn = SeleniumDriver.getdriver()
				.findElement(By.xpath("//img[@class='img-filter non-selected_image']"));
		filterbtn.click();
		WebElement curriculumlink = SeleniumDriver.getdriver()
				.findElement(By.xpath("//a[contains(text(),'Curriculum')]"));
		curriculumlink.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void serachCurriculumandSlectandDone(String CurriculumName) throws InterruptedException {

		SeleniumDriver.getdriver().findElement(By.xpath("//div[text()='Search']/following::div[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("//div[text()='Search']/following::div[1]/input"))
				.sendKeys("automation");

		SeleniumDriver.getdriver()
				.findElement(By.xpath("//label[@class='control control-checkbox']//div[@class='control-indicator']"))
				.click();
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void searchbuttonSearchByCourseName(String CourseName) throws InterruptedException {
		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("//img[@class='img-default non-selected_image']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(CourseName);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void selectcoursefromlist() {
		SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='col-xs-2']//div[@class='control-indicator']"))
				.click();
	}

	public void clickopenbutton() throws InterruptedException {
		WebElement open = SeleniumDriver.getdriver()
				.findElement(By.xpath("//button[@class='btn-lms fixed fright active']"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", open);
		open.click();
		Thread.sleep(8000);
	}

	public void takeCourseandValidate() throws InterruptedException {
		String parentwindow = SeleniumDriver.getdriver().getWindowHandle();

		Set<String> allwindows = SeleniumDriver.getdriver().getWindowHandles();

		String Title = "CustomEase Courses";
		for (String childwindow : allwindows) {
			String title = SeleniumDriver.getdriver().switchTo().window(childwindow).getTitle();
			System.out.println(title);
			if (title.equals(Title)) {
				System.out.println("pass");
				// Thread.sleep(10000);
				List<WebElement> coursemenu = SeleniumDriver.getdriver()
						.findElements(By.xpath("//button[contains(text(),'COURSE MENU')]"));

				if (coursemenu.size() > 0) {
					SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'COURSE MENU')]"))
							.click();
				}

				WebElement start = SeleniumDriver.getdriver()
						.findElement(By.xpath("//button[@class='eng_global_button eng_menu_start_button']"));
				// js.executeScript("arguments[0].scrollIntoView();", start);
				start.click();

				// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("eng_loader")));
				// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("skn_loaderContainer")));
				Thread.sleep(30000);

				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_customease']")).click();
				Thread.sleep(10000);
				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_PreviewSB']")).click();
				Thread.sleep(5000);
				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_ReturnSB']")).click();
				SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_exit']")).click();
				SeleniumDriver.getdriver().findElement(By.xpath("//button[text()='YES']")).click();

			}
		}
	}

	public void clickHTML5MLCourseType() throws InterruptedException {
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'HTML5 / MICROLEARNING')]")).click();
		Thread.sleep(10000);
	}

	public void validateCoursePublishSuccess(String CourseName) throws InterruptedException {
		Set<String> allwindows = SeleniumDriver.getdriver().getWindowHandles();

		String Title = "Authoring Tool";
		for (String childwindow : allwindows) {
			String title = SeleniumDriver.getdriver().switchTo().window(childwindow).getTitle();
			System.out.println(title);
			if (title.equals(Title)) {
				SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='st-selexistcrs-icon']")).click();
				SeleniumDriver.getdriver().findElement(By.xpath("//input[@id='crslist_search_val']"))
						.sendKeys(CourseName);
				SeleniumDriver.getdriver().findElement(By.xpath("//div[text()='Go']")).click();
				Thread.sleep(2000);
				WebElement row = SeleniumDriver.getdriver()
						.findElement(By.xpath("//div[@id='eng_crslistcontent']/table/tbody/tr"));
				// js.executeScript("arguments[0].scrollIntoView();", row);
				javaScriptExecutor.executeScript("arguments[0].click();", row);
				// row.click();
				SeleniumDriver.getdriver().findElement(By.xpath("//span[text()='Open']")).click();
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("eng_loader")));
				SeleniumDriver.getdriver().findElement(By.xpath("//button[@id='eng_btn_CrsPreviewSB']")).click();
				Thread.sleep(25000);
				WebElement start = SeleniumDriver.getdriver()
						.findElement(By.xpath("//button[@class='eng_global_button eng_menu_start_button']"));
				// js.executeScript("arguments[0].scrollIntoView();", start);
				// js.executeScript("arguments[0].click();", start);
				start.click();
				Thread.sleep(30000);

				SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_btn_user']")).click();

				SeleniumDriver.getdriver().findElement(By.xpath("//span[contains(text(),'Course Exit')]")).click();

				Thread.sleep(5000);
				WebElement Publish = SeleniumDriver.getdriver().findElement(By.xpath("//button[@title='Finish']"));
				javaScriptExecutor.executeScript("arguments[0].click();", Publish);
				// driver.findElement(By.xpath("//button[@title='Finish']")).click();
				Thread.sleep(2000);
				SeleniumDriver.getdriver().findElement(By.xpath("//button[text()='NO']")).click();

				String alertmsg = SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_alert_message']"))
						.getText();
				Assert.assertEquals(alertmsg, "Course has been published successfully.");
				SeleniumDriver.getdriver().findElement(By.xpath("//button[text()='OK']")).click();
				System.out.println(alertmsg);
			}
		}

	}

	public void validateImportCourseSuccess(String CourseName) throws InterruptedException {
		Set<String> allwindows = SeleniumDriver.getdriver().getWindowHandles();

		String Title = "Authoring Tool";
		for (String childwindow : allwindows) {
			String title = SeleniumDriver.getdriver().switchTo().window(childwindow).getTitle();
			System.out.println(title);
			if (title.equals(Title)) {
				SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='st-importCrs-icon']")).click();
				SeleniumDriver.getdriver().findElement(By.xpath("//input[@id='crslist_search_val']"))
						.sendKeys(CourseName);
				SeleniumDriver.getdriver().findElement(By.xpath("//div[text()='Go']")).click();
				Thread.sleep(2000);
				WebElement row = SeleniumDriver.getdriver()
						.findElement(By.xpath("//div[@id='eng_crslistcontent']/table/tbody/tr"));
				// js.executeScript("arguments[0].scrollIntoView();", row);
				javaScriptExecutor.executeScript("arguments[0].click();", row);
				SeleniumDriver.getdriver().findElement(By.xpath("//span[contains(text(),'Import to Authoring Tool')]"))
						.click();
				Thread.sleep(5000);
				SeleniumDriver.getdriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
				String alertmsg = SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_alert_message']"))
						.getText();
				if (alertmsg.equals(
						"Importing the course with the same Course ID will result in loss of changes made using Authoring Tool. Do you want to continue?")) {
					SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'OK')]")).click();
				}

				String realalertmsg = SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='eng_alert_message']"))
						.getText();
				SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'OK')]")).click();

				Assert.assertEquals(realalertmsg, "The course has been imported successfully.");
				// driver.findElement(By.xpath("//button[@class='eng_global_button
				// skn_btn_container']")).click();

				System.out.println(realalertmsg);

			}

		}
	}

}
