package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//------------------------------------------

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import tests.AdminPageTest;

public class LeavePage {
	
	 Logger logger = LogManager.getLogger(LeavePage.class.getName());
	
	WebDriver driver;
	@FindBy(name ="username")
	WebElement Username;
	
	@FindBy(name ="password")
	WebElement Password;
	
	@FindBy(tagName ="button")
	WebElement Login;
	
	
	@FindBy(linkText="Leave")
	WebElement Leave;
	
	
	@FindBy(linkText="Apply")
	WebElement Apply;
	
	
	@FindBy(css ="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-2.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper > div.oxd-select-text.oxd-select-text--active")
	WebElement LeaveTypeApply;
	
	//  from date
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
	WebElement FromDate;
	
	//to date
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
	WebElement ToDate;
	
	//Duration
	@FindBy(xpath="//div[contains(text(),'Full Day')]")
	WebElement Duration;
	
	//LastApplyButton

	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-actions:nth-child(6) > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement LastApply;
	
	@FindBy(xpath="//span[contains(text(),'CAN - Bereavement')]")
	WebElement name;
	
	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	public void loginToApply(String From) throws InterruptedException {
		Leave.click();
	//	Thread.sleep(5000);
		Apply.click();
		//Thread.sleep(5000);
		
		
		LeaveTypeApply.click();
	//	Thread.sleep(5000);
		name.click();
		
		FromDate.sendKeys(From);
		Thread.sleep(1000);
		ToDate.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-2.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group div:nth-child(2) > p.oxd-text.oxd-text--p.orangehrm-leave-balance-text")).click();
		logger.info("Leave Type is Applied");
		
		
		Duration.click();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		LastApply.click();
		logger.info("Duration is set");
		
		
		
	}


	
	/*--not working
	//My Leave
	@FindBy(linkText="My Leave")
	WebElement MyLeave;


	//From Date
	@FindBy(css ="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
	WebElement FromDate2;

	//TO Date
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
	WebElement ToDate2;
			
			
	//Reject DeSelect,cancled, pending approval
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-multiselect-chips-area span.oxd-chip.oxd-chip--default.oxd-multiselect-chips-selected:nth-child(1) > i.oxd-icon.bi-x.--clear")
	WebElement cancle1;
	
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-multiselect-chips-area span.oxd-chip.oxd-chip--default.oxd-multiselect-chips-selected:nth-child(2) > i.oxd-icon.bi-x.--clear")
	WebElement cancle2;
	
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-multiselect-chips-area span.oxd-chip.oxd-chip--default.oxd-multiselect-chips-selected:nth-child(3) > i.oxd-icon.bi-x.--clear")
	WebElement cancle3;
	
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-multiselect-chips-area span.oxd-chip.oxd-chip--default.oxd-multiselect-chips-selected:nth-child(4) > i.oxd-icon.bi-x.--clear")
	WebElement cancle4;
	
	
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-multiselect-chips-area span.oxd-chip.oxd-chip--default.oxd-multiselect-chips-selected:nth-child(5) > i.oxd-icon.bi-x.--clear")
	WebElement cancle5;
	

	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-select-text.oxd-select-text--active.oxd-select-text--error > div.oxd-select-text-input")
	WebElement LeaveWithStatus;		
	//Select the deselected one
	
	@FindBy(xpath="//div[contains(text(),'-- Select --')]")
	WebElement LeaveTypeFromMyLeave;
	
	
//	//Search Button
//	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space:nth-child(3)")
//	WebElement Search2;
//	
	
	public void loginToMyLeave() throws InterruptedException{
		Leave.click();
		Thread.sleep(5000);
		MyLeave.click();
		Thread.sleep(5000);
		FromDate2.click();
		FromDate2.sendKeys(" ");
		FromDate2.sendKeys("2022-10-05");
		Thread.sleep(3000);
		ToDate2.click();
		ToDate2.sendKeys(" ");
		ToDate2.sendKeys("2022-10-06");
		
		
		cancle1.click();
		
		cancle2.click();
	
		cancle3.click();
		
		cancle4.click();
		
		cancle5.click();
		
		Thread.sleep(5000);
		LeaveWithStatus.click();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		LeaveTypeFromMyLeave.click();
		Actions b=new Actions(driver);
		b.sendKeys(Keys.ARROW_DOWN);
		b.sendKeys(Keys.ARROW_DOWN);
		b.sendKeys(Keys.ENTER).build().perform();
		System.out.println("My leave");
		
	}
	
	*/
	
	//---Working
	
	//Entitlement
	@FindBy(xpath="//header/div[2]/nav[1]/ul[1]/li[3]/span[1]")
	WebElement Entitlement;
	
	@FindBy(partialLinkText ="Add Entitlemen")
	WebElement AddEntitlement;
	
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active > input:nth-child(2)")
	WebElement EmpName1;
	
	@FindBy(xpath="//div[contains(text(),'-- Select --')]")
	WebElement LeaveTypeFromEnt;
	
	//Entitlement Field
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active")
	WebElement EntitlementField;

	//Save Button
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-actions:nth-child(5) > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space:nth-child(3)")
	WebElement Save;
	
	//Alert
	@FindBy(xpath="//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")
	WebElement Alert;
	
	//Search
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement Search1;
	//Full Screen
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	WebElement FullScreen;
	
	
	public void Entitlementfun(String Entitle) throws InterruptedException {
		Leave.click();
		Thread.sleep(1000);
		Entitlement.click();
		AddEntitlement.click();
		EmpName1.sendKeys("a");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();
		
		LeaveTypeFromEnt.click();
		Thread.sleep(1000);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ENTER).build().perform();
		
		EntitlementField.sendKeys(Entitle);
	//	Thread.sleep(5000);
		Save.click();
	//	Thread.sleep(5000);
		Alert.click();
	//	Thread.sleep(5000);
		Search1.click();
	//	Thread.sleep(5000);
		FullScreen.click();
	//	Thread.sleep(5000);
		logger.info("Entitlement is set");
		
	}
		
		
	@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
	WebElement dataStart;
	
	//select the end date
		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-date-wrapper div.oxd-date-input > input.oxd-input.oxd-input--active")
		WebElement dateEnd;
		//click on arrow of leave with status
		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-multiselect-wrapper div.oxd-select-text.oxd-select-text--active div.oxd-select-text--after > i.oxd-icon.bi-caret-down-fill.oxd-select-text--arrow")
		WebElement Arrow;
		//leave type
		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(4) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper div.oxd-select-text.oxd-select-text--active > div.oxd-select-text-input")
		WebElement LeaveType;
		//Employee name
		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active > input:nth-child(2)")
		WebElement EmpName;
		//SubUnit
		@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row:nth-child(2) div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper > div.oxd-select-text.oxd-select-text--active")
		WebElement SubUnit;
		//search button
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/button[2]")
		WebElement Search;
		
	public void LeaveList() throws InterruptedException {
		Leave.click();
//		Thread.sleep(5000);
//		dataStart.sendKeys("2022-10-05");
//		Thread.sleep(2000);
//		dateEnd.sendKeys("2022-10-05");
//		
		
		Arrow.click();
	//	Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
	
		LeaveType.click();
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ENTER).build().perform();
	
		EmpName.sendKeys("a");
		Thread.sleep(4000);
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ENTER).build().perform();
		
		SubUnit.click();
	//	Thread.sleep(4000);
		Actions act3=new Actions(driver);
		act3.sendKeys(Keys.ARROW_DOWN);
		act3.sendKeys(Keys.ARROW_DOWN);
		act3.sendKeys(Keys.ARROW_DOWN);
		act3.sendKeys(Keys.ENTER).build().perform();
	
		
		Search.click();
		logger.info("Leave List is set");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

