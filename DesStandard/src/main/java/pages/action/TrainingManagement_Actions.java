package pages.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumDriver;

public class TrainingManagement_Actions {

	TrainingManagement_Actions trainingManagement_Actions = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 60);

	public TrainingManagement_Actions() {
		// SeleniumDriver.setUpDriver();
		// this.contentManagement_Locators = new ContentManagement_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		// PageFactory.initElements(SeleniumDriver.getdriver(),
		// trainingManagement_Actions);

	}

	public void validatecurriculumcreateassigncourseuser(String curriculumID, String curriculumName, String courseID,
			String userid) throws InterruptedException {
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@name='DISPLAYSUITEID']")).sendKeys("test014");
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@name='SUITENAME']")).sendKeys("test014");

		WebElement savebtn = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
		String currcreatemsg = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Curriculum has been created successfully.')]")).getText();
		System.out.println(currcreatemsg);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("//a[@class='inactive'][contains(text(),'Courses')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(5000);
		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys("Food Safety:");
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();

		WebElement savebtn1 = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn1);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn1);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Course')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		String courseassign = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Course(s) assignment for Curriculum updated succes')]"))
				.getText();
		System.out.println(courseassign);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

		WebElement assignments = SeleniumDriver.getdriver()
				.findElement(By.xpath("//a[contains(text(),'Assignments')]"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", assignments);
		javaScriptExecutor.executeScript("arguments[0].click();", assignments);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID'])[1]")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys("3333");
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();

		WebElement savebtn2 = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn2);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn2);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		String courseassign1 = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Curriculum assignment updated successfully.')]")).getText();
		System.out.println(courseassign1);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();
	}

	public void provideCurriculumName(String curriculumname) {
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@name='SUITENAME']")).sendKeys(curriculumname);
	}

	public void provideCurriculumID(String curriculumID) {
		SeleniumDriver.getdriver().findElement(By.xpath("//input[@name='DISPLAYSUITEID']")).sendKeys(curriculumID);
	}

	public void CurriculumsaveandClickcourseTab() throws InterruptedException {
		WebElement savebtn = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
		String currcreatemsg = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Curriculum has been created successfully.')]")).getText();
		System.out.println(currcreatemsg);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("//a[@class='inactive'][contains(text(),'Courses')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

	}

	public void searchcourseandSaveandClickAssignTab(String coursename) throws InterruptedException {
		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(coursename);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();

		WebElement savebtn1 = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn1);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn1);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Course')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		String courseassign = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Course(s) assignment for Curriculum updated succes')]"))
				.getText();
		System.out.println(courseassign);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

		WebElement assignments = SeleniumDriver.getdriver()
				.findElement(By.xpath("//a[contains(text(),'Assignments')]"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", assignments);
		javaScriptExecutor.executeScript("arguments[0].click();", assignments);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void searchuseidandsaveandvalidate(String userid) throws InterruptedException {
		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID'])[1]")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(userid);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();

		WebElement savebtn2 = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn2);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn2);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		String courseassign1 = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Curriculum assignment updated successfully.')]")).getText();
		System.out.println(courseassign1);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();
	}

	public void searchimageByCourseandClickAssignTab(String coursename) throws InterruptedException {

		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(coursename);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();

		WebElement Edit = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Edit')]"));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", Edit);
		javaScriptExecutor.executeScript("arguments[0].click();", Edit);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		SeleniumDriver.getdriver().findElement(By.xpath("//a[contains(text(),'Assignments')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);
	}

	public void searchimageByuseridandValidateuserassign(String UserID) throws InterruptedException {

		// WebElement searchimg =
		// SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='col-sm-4
		// col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"));
		// javaScriptExecutor.executeScript("arguments[0].scrollIntoView();",
		// searchimg);
		// javaScriptExecutor.executeScript("arguments[0].click();", searchimg);
		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='col-sm-4 col-md-4 hidden-xs']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID'])[1]")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(UserID);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();
		WebElement save = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", save);
		javaScriptExecutor.executeScript("arguments[0].click();", save);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		String courseassign1 = SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='modal-body']/p")).getText();
		System.out.println(courseassign1);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

	}

	public void searchcoursetemplateandupdateandvalidate(String CourseTemplate) throws InterruptedException {
		SeleniumDriver.getdriver()
				.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']"))
				.sendKeys(CourseTemplate);
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='control-indicator']")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Edit')]")).click();

		WebElement masteryoptions = SeleniumDriver.getdriver()
				.findElement(By.xpath("//a[contains(text(),'Mastery Options')]"));

		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", masteryoptions);
		javaScriptExecutor.executeScript("arguments[0].click();", masteryoptions);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		SeleniumDriver.getdriver().findElement(By.xpath(
				"//body/app-container/div[@id='Container']/div[@id='main-view']/div/training/section/div[@class='col-xs-12 col-sm-12 col-md-10 content-height']/div/tm-course-option/div[@class='tab-content content-height']/tm-course-option-add/div[@class='cot-page']/div[@class='row content m-content pdt0']/section[@class='clearfix global-options course_general clearfix']/div[@class='dropdown clearfix open-accordion']/div[@class='pd0']/div[@class='row accordian-content small-label']/div[1]/div[1]/label[1]/div[1]"))
				.click();
		SeleniumDriver.getdriver().findElement(By.xpath("//div[@class='inputDiv small_label_color']//label[1]//div[1]"))
				.click();

		WebElement savebtn = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn);

		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath(
				"//div[contains(@class,'modal fade in')]//button[contains(@class,'btn-lms fixed active')][contains(text(),'Ok')]"))
				.click();
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(@class,'btn-lms fixed active')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		String templateupdate = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Course Options Template updated successfully.')]"))
				.getText();
		System.out.println(templateupdate);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();
	}

	public void searchcoursehandson(String course) throws InterruptedException {
		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='hidden-xs col-sm-4 col-md-4']//img[@class='img-default non-selected_image']"))
				.click();

		// driver.findElement(By.xpath("//img[@class='img-default
		// non-selected_image']")).click();

		SeleniumDriver.getdriver().findElement(By.xpath("((//span[text()='Course ID']/following::div[1]))")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys("Food Safety:");
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='Course ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(2000);

		SeleniumDriver.getdriver().findElement(By.xpath("//div[@id='customTable']//div[1]//div[1]//label[1]//div[1]"))
				.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void searchUserhandson(String user) throws InterruptedException {
		WebElement usersearchimage = SeleniumDriver.getdriver().findElement(
				By.xpath("//div[@class='hidden-xs col-sm-5 col-md-4']//img[@class='img-default non-selected_image']"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", usersearchimage);
		javaScriptExecutor.executeScript("arguments[0].click();", usersearchimage);

		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]")).click();
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys("coastal");
		Thread.sleep(2000);
		SeleniumDriver.getdriver().findElement(By.xpath("(//span[text()='User ID']/following::div[1])[1]/input"))
				.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		SeleniumDriver.getdriver()
				.findElement(By.xpath("//div[@class='col-xs-5 col-md-5']//div[@class='control-indicator']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		SeleniumDriver.getdriver()
				.findElement(By.xpath("//div[@class='row field-row clearfix space cour_hands']//label[2]//div[1]"))
				.click();

		WebElement calender = SeleniumDriver.getdriver()
				.findElement(By.xpath("//button[@class='btn btn-default']//img"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", calender);
		javaScriptExecutor.executeScript("arguments[0].click();", calender);

		SeleniumDriver.getdriver()
				.findElement(By.xpath("//button[@class='btn btn-sm btn-info uib-datepicker-current']")).click();
		Thread.sleep(3000);
	}

	public void searchCourseStatusandValidate(String coursestatus) throws InterruptedException {
		WebElement savebtn = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn);

		SeleniumDriver.getdriver()
				.findElement(By.xpath("//div[text()='Course Status']/following::div[1]/div/div[1]/div")).click();

		SeleniumDriver.getdriver()
				.findElement(
						By.xpath("//div[text()='Course Status']/following::div[1]/div/div[1]/div/following::input[1]"))
				.sendKeys(coursestatus);
		SeleniumDriver.getdriver()
				.findElement(
						By.xpath("//div[text()='Course Status']/following::div[1]/div/div[1]/div/following::input[1]"))
				.sendKeys(Keys.ENTER);

		WebElement savebtn1 = SeleniumDriver.getdriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", savebtn1);
		javaScriptExecutor.executeScript("arguments[0].click();", savebtn1);

		Thread.sleep(2000);

		SeleniumDriver.getdriver()
				.findElement(By.xpath(
						"//div[@class='modal-footer']//button[@class='btn-lms fixed active'][contains(text(),'Save')]"))
				.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));

		String classroomsave = SeleniumDriver.getdriver()
				.findElement(By.xpath("//p[contains(text(),'Classroom scores updated successfully.')]")).getText();
		System.out.println(classroomsave);

		SeleniumDriver.getdriver().findElement(By.xpath("//button[@class='btn-lms fixed active']")).click();

	}

}
