package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//-----------------
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TimePage {
	Logger logger = LogManager.getLogger(TimePage.class.getName());
		WebDriver driver;
		public TimePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			}
			

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
		WebElement Time;



		@FindBy(xpath="//header/div[2]/nav[1]/ul[1]/li[2]/span[1]")
		WebElement Attendance;

		@FindBy(xpath ="//a[contains(text(),'My Records')]")
		WebElement myRecord;

		@FindBy(xpath ="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/button[1]")
		WebElement viewRecord;

		@FindBy(xpath="//a[contains(text(),'Punch In/Out')]")
		WebElement punchInOut;


		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement DateIn;

		@FindBy(tagName="textarea")
		WebElement note;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
		WebElement clickIn;

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement Dateout;

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement TimeAttendance;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
		WebElement clickOut;

		@FindBy(xpath = "//a[contains(text(),'Employee Records')]")
		WebElement empRecord;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement empRecordName;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/button[1]")
		WebElement clickView;


		public void Attendance(String Pin,String Pout) throws InterruptedException
		{
			Time.click();
			Attendance.click();
			//Thread.sleep(2000);

			myRecord.click();
			//Thread.sleep(2000);

			viewRecord.click();Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,3000)");

			Attendance.click();
			//Thread.sleep(2000);

			punchInOut.click();
			//Thread.sleep(2000);

			//				DateIn.sendKeys(" ");
			//				Thread.sleep(2000);
			//				DateIn.sendKeys("2022-10-05");
			//				Thread.sleep(2000);

			note.sendKeys(Pin);
			Thread.sleep(2000);		

			clickIn.click();
			Thread.sleep(2000);
			logger.info("Punch In");


			//				Dateout.sendKeys(" ");
			//				Thread.sleep(2000);
			//				Dateout.sendKeys("2022-10-05");
			//				Thread.sleep(2000);
			//				TimeAttendance.sendKeys(" ");
			
			
			
//			Thread.sleep(2000);
//			TimeAttendance.sendKeys(date);
			note.sendKeys(Pout);
			logger.info("Punch Out");
			Thread.sleep(2000);

			clickOut.click();
			//Thread.sleep(2000);

			Attendance.click();
		//	Thread.sleep(2000);

			empRecord.click();
			//Thread.sleep(2000);

			empRecordName.sendKeys("c");
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.ENTER).build().perform();

			//Thread.sleep(2000);

			clickView.click();
			Thread.sleep(2000);
			logger.info("Attendance is set");
		}


		@FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[3]")
		WebElement reportClick;

		@FindBy(css = "div.oxd-layout div.oxd-layout-navigation header.oxd-topbar div.oxd-topbar-body nav.oxd-topbar-body-nav ul:nth-child(1) li.--active.oxd-topbar-body-nav-tab.--parent:nth-child(3) ul.oxd-dropdown-menu > li:nth-child(1)")
		WebElement projectReport;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement projectName1;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement fromDate;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement toDate;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
		WebElement viewButton;




							
		public void report(String from, String To) throws InterruptedException
		{
			//Time.click();
			reportClick.click();
			projectReport.click();
			projectName1.sendKeys("g");
			Thread.sleep(5000);
			Actions action = new Actions(driver); 
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.ENTER).build().perform();

			fromDate.sendKeys(from);
			//Thread.sleep(2000);
			toDate.sendKeys(To);
			//Thread.sleep(2000);
			viewButton.click();
			//Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,4000)");
			logger.info("Scroll Worked");
			logger.info("Report is set");

		}


		@FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[4]/span[1]")
		WebElement projectInfo;

		@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]")
		WebElement customer;

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
		WebElement viewReport;

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
		WebElement customerName;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/textarea[1]")
		WebElement discription;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
		WebElement saveCustomer;

		@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]")
		WebElement projects;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement cName;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement pName;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement adminName;

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
		WebElement search;




		 									

		public void projectInfo(String name, String dis, String CustomerN,String Pname,String AdminN) throws InterruptedException
		{
			projectInfo.click();
			Thread.sleep(2000);
			customer.click();
			Thread.sleep(2000);
			viewReport.click();
			Thread.sleep(2000);
			customerName.sendKeys(name);
			Thread.sleep(2000);
			discription.sendKeys(dis);
			Thread.sleep(2000);
			saveCustomer.click();

			projectInfo.click();
		//	Thread.sleep(2000);
			projects.click();
			//Thread.sleep(2000);
			cName.sendKeys(CustomerN);
			//Thread.sleep(2000);
			pName.sendKeys(Pname);
			//Thread.sleep(2000);
			adminName.sendKeys(AdminN);
		//	Thread.sleep(2000);
			search.click();
			logger.info("Project Info is set");
		}



		@FindBy(xpath="//header/div[2]/nav[1]/ul[1]/li[1]/span[1]")
		WebElement TimeSheet;

		@FindBy(xpath = "//a[contains(text(),'My Timesheets')]")
		WebElement myTimeSheet;

		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container form.oxd-form.orangehrm-paper-container:nth-child(1) div.orangehrm-timesheet-footer div.orangehrm-timesheet-footer--options > button.oxd-button.oxd-button--medium.oxd-button--ghost:nth-child(1)")
		WebElement Edit;

		@FindBy(xpath="//tbody/tr[1]/td[10]/button[1]/i[1]")
		WebElement delete;

		@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement projectName;

		@FindBy(xpath="//th[contains(text(),'Project')]")
		WebElement project;
		@FindBy(xpath="//div[contains(text(),'-- Select --')]")
		WebElement Activity;

		@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/div[2]/input[1]")
		WebElement mon;

		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[3]")
		WebElement save;

		@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/div[2]/input[1]")
		WebElement secDate ;

		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container form.oxd-form.orangehrm-paper-container:nth-child(1) div.orangehrm-timesheet-footer div.orangehrm-timesheet-footer--options > button.oxd-button.oxd-button--medium.oxd-button--secondary:nth-child(2)")
		WebElement Submit;


		@FindBy(xpath = "//a[contains(text(),'Employee Timesheets')]")
		WebElement employeeTimeSheet;

		@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container:nth-child(1) form.oxd-form div.oxd-form-row div.oxd-grid-2.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active > input:nth-child(2)")
		WebElement empName;    

		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
		WebElement view;

		public void clickTime() {
			Time.click();
		}
		public void TimeSheet(String date) throws InterruptedException {
			Time.click();
			//Thread.sleep(5000);
			TimeSheet.click();
		//	Thread.sleep(5000);
			myTimeSheet.click();
		//	Thread.sleep(5000);
			Edit.click();
			delete.click();

			//projectName.clear();
			projectName.sendKeys("a");
			Thread.sleep(5000);
			Actions a1=new Actions(driver);
			a1.sendKeys(Keys.ARROW_DOWN);
			a1.sendKeys(Keys.ARROW_DOWN);
			a1.sendKeys(Keys.ENTER).build().perform();
			//project.click();
		//	Thread.sleep(5000);
			Activity.click();
			//Thread.sleep(5000);
			Actions a2=new Actions(driver);
			a2.sendKeys(Keys.ARROW_DOWN);
			a2.sendKeys(Keys.ARROW_DOWN);
			a2.sendKeys(Keys.ENTER).build().perform();

			//mon.sendKeys(" ");
			mon.sendKeys(date);


			//					secDate.click();
			Thread.sleep(2000);
			save.click();
			//Thread.sleep(5000);
			Submit.click();


		//	Thread.sleep(5000);
			TimeSheet.click();

			employeeTimeSheet.click();

			//Thread.sleep(5000);


			empName.sendKeys("a");
			Thread.sleep(5000);
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ARROW_DOWN);
			a.sendKeys(Keys.ARROW_DOWN);
			a.sendKeys(Keys.ENTER).build().perform();

		//	Thread.sleep(5000);
			view.click();
			logger.info("TimeSheet is set");


		}




}









































