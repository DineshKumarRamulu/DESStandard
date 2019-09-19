package pages.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.Reports_Locators;
import pages.locators.RolesList_Locators;
import utils.SeleniumDriver;

public class Reports_Actions {

	Reports_Locators reports_Locators = null;
	JavascriptExecutor javaScriptExecutor = null;
	WebDriverWait wait = new WebDriverWait(SeleniumDriver.getdriver(), 30);

	public Reports_Actions() {
		// SeleniumDriver.setUpDriver();
		this.reports_Locators = new Reports_Locators();
		this.javaScriptExecutor = (JavascriptExecutor) SeleniumDriver.getdriver();
		PageFactory.initElements(SeleniumDriver.getdriver(), reports_Locators);

	}

	public void SelectReportType() {
		reports_Locators.txtbox_ReportType.click();
		reports_Locators.txtbox_BasicReportSelect.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void SelectCustomReportType() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.txtbox_ReportType);
		reports_Locators.txtbox_ReportType.click();
		// reports_Locators.txtbox_ReportType.click();
		reports_Locators.txtbox_CustomReportSelect.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void SearchReport(String ReportName) {
		reports_Locators.txtbox_Search.click();
		reports_Locators.txtbox_SearchText.sendKeys(ReportName);
	}

	public void SelectRadioReportName() {
		reports_Locators.radio_ReportName.click();
	}

	public void ClickRunReportButton() throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.btn_RunReport);
		reports_Locators.btn_RunReport.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		Thread.sleep(8000);

	}

	public void ClickEditButton() throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.btn_Edit);
		reports_Locators.btn_Edit.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(4000);

	}

	public void typeReportTitle(String ReportTitle) {
		reports_Locators.txtbox_ReportTitle.sendKeys(ReportTitle);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(4000);

	}

	public void ClickSaveButton() {

		reports_Locators.btn_Save.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void ClickCustomReportAlertOkButton() {

		reports_Locators.btn_TemplateSavedSuccessAlertOk.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
	}

	public void ClickSaveAsButton() throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.btn_SaveAs);
		reports_Locators.btn_SaveAs.click();
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(4000);

	}

	public void ClickReportLink() throws InterruptedException {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.link_Reports);
		reports_Locators.link_Reports.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(8000);

	}

	public void ClickUnformattedRadioBtn() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.radioBtn_Yes);
		reports_Locators.radioBtn_Yes.click();
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		// Thread.sleep(8000);

	}

	public void ClickProcessReportButton() {
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", reports_Locators.btn_ProcessReport);
		reports_Locators.btn_ProcessReport.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("splash-screen")));
		SeleniumDriver.getdriver().switchTo().frame(0);
	}

	public void ReportNamevalidation(String expected) {
		String actual = reports_Locators.txt_ReportName.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

	}

	public void ReportSavevalidation(String expected) {
		String actual = reports_Locators.txt_TemplateSavedSuccessAlert.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

	}

	public void ReportunformattedHeadervalidation() {
		int HeaderSize = reports_Locators.reportTableHeader.size();
		System.out.println(HeaderSize);
		Assert.assertEquals(HeaderSize, 1);

	}

	public void Click_ExportToAllFileFormats() throws InterruptedException {

		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_FormattedXLS.click();
		// Thread.sleep(2000);
		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_FormattedXLSX.click();
		// Thread.sleep(2000);
		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_PDF.click();
		// Thread.sleep(2000);
		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_UnFormattedXLS.click();
		// Thread.sleep(2000);
		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_UnFormattedXLSX.click();
		// Thread.sleep(2000);
		reports_Locators.txt_ExportTo.click();
		// Thread.sleep(2000);
		reports_Locators.txt_CSV.click();
		Thread.sleep(5000);
	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				return flag = true;
		}

		return flag;
	}

	public void ExportReportDownloadvalidation(String downloadPath) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(dateFormat.format(new Date()));
		String date = dateFormat.format(new Date());
		// String downloadPath = "C:\\Users\\cst065\\Downloads";
		// String downloadPath = FilePath;

		// boolean result = isFileDownloaded_Ext(C:\Users\cst065\Downloads, ".xls");
		// boolean result= isFileDownloaded_Ext(downloadPath,
		// "MyTrainingStatus20190620.xlsx");
		// boolean result= isFileDownloaded_Ext(downloadPath,
		// "MyTrainingStatus"+date+".xlsx");
		Assert.assertTrue(isFileDownloaded(downloadPath, "UserPlannedVsCompletedReport" + date + ".xlsx"),
				"Failed to download Expected documents");
		Assert.assertTrue(isFileDownloaded(downloadPath, "UserPlannedVsCompletedReport" + date + ".xls"),
				"Failed to download Expected documents");
		// Assert.assertTrue(isFileDownloaded(downloadPath,
		// "UserPlannedVsCompletedReport"+date+".csv"),"Failed to download Expected
		// documents");
		Assert.assertTrue(isFileDownloaded(downloadPath, "UserPlannedVsCompletedReport" + date + ".pdf"),
				"Failed to download Expected documents");

	}
}
