package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Reports_Locators {

	@FindBy(how = How.XPATH, using = "//div[@class='ui-select-match']//span[contains(text(),'All')]")
	public WebElement txtbox_ReportType;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Basic Reports')]")
	public WebElement txtbox_BasicReportSelect;

	@FindBy(how = How.XPATH, using = "//div[text()='Search']/following::div[1]")
	public WebElement txtbox_Search;

	@FindBy(how = How.XPATH, using = "//div[text()='Search']/following::div[1]/input")
	public WebElement txtbox_SearchText;

	@FindBy(how = How.XPATH, using = "//div[@class='control-indicator']")
	public WebElement radio_ReportName;

	@FindBy(how = How.XPATH, using = "//button[text()='Run Report']")
	public WebElement btn_RunReport;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Process Report')]")
	public WebElement btn_ProcessReport;

	@FindBy(how = How.XPATH, using = "(//div[@class='wrapword'])[1]")
	public WebElement txt_ReportName;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed btn-user active'][contains(text(),'Edit')]")
	public WebElement btn_Edit;

	@FindBy(how = How.XPATH, using = "//div[@id='general']//button[@class='btn-lms auto active'][contains(text(),'Save As')]")
	public WebElement btn_SaveAs;

	@FindBy(how = How.XPATH, using = "//input[@name='reportTitle']")
	public WebElement txtbox_ReportTitle;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Template saved successfully.')]")
	public WebElement txt_TemplateSavedSuccessAlert;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	public WebElement btn_TemplateSavedSuccessAlertOk;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-lms fixed active'][contains(text(),'Save')]")
	public WebElement btn_Save;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Custom Reports')]")
	public WebElement txtbox_CustomReportSelect;

	@FindBy(how = How.XPATH, using = "//span[(text()=' Report Management')]")
	public WebElement link_Reports;

	@FindBy(how = How.XPATH, using = "//div[@class='pb-70']//div[2]//label[1]//div[1]")
	public WebElement radioBtn_Yes;

	@FindBy(how = How.XPATH, using = "//table[@class='tablesorter']/thead/tr")
	public List<WebElement> reportTableHeader;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]")
	public WebElement txt_ExportTo;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[1]/a")
	public WebElement txt_FormattedXLS;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[2]/a")
	public WebElement txt_FormattedXLSX;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[3]/a")
	public WebElement txt_PDF;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[4]/a")
	public WebElement txt_UnFormattedXLS;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[5]/a")
	public WebElement txt_UnFormattedXLSX;

	@FindBy(how = How.XPATH, using = "(//span[text()='Export To :'])[1]/following::dd[1]/ul/li[6]/a")
	public WebElement txt_CSV;

}
