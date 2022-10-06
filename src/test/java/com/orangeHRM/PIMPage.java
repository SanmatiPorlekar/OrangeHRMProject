package com.orangeHRM;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PIMPage {
	WebDriver driver;
	Actions act;
	@FindBy(how = How.XPATH, using = "//span[text()='PIM']") WebElement pimTab;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add Employee']") WebElement pimAddEmployee;
	@FindBy(how = How.NAME, using = "firstName") WebElement pimEmpFstname;
	@FindBy(how = How.NAME, using = "lastName") WebElement pimEmpLstname;
	@FindBy(how = How.CSS, using = "div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']") WebElement pimEmpId;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']") WebElement saveButton;
//------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Employee List']") WebElement pimEmpList;
	@FindBy(how = How.CSS, using = "div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']") WebElement pimEmpListEmpId;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']") WebElement searchButton;
	
//-------------------------------------------------------------------------------------------------
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Reports']") WebElement pimReports;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']") WebElement addButton;
	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...']") WebElement pimRprtName;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") WebElement pimRprtSelCriteriaDrpDn;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Service Period']") WebElement pimRprtSelServicePerOption;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") WebElement pimRprtSelDisFieldGrpDrpDn;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Supervisors')]") WebElement pimRprtSelDispGrpSupervisorOption;
	
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") WebElement pimRprtSelDispFieldDrpDn;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Reporting Method']") WebElement pimRprtSelDispFieldRprtMethOption;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > i:nth-child(1)") WebElement pimRprtPlusBtn;
//---------------------------------------------------------------
	@FindBy(how = How.CSS, using = "input[placeholder='Type for hints...']") WebElement pimRprtNameSearch;
	@FindBy(how = How.XPATH, using = "//span[contains(.,\"Teja's Report\")]") WebElement pimRprtTejOption;
	
	
	
	public PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}

	public void clickPimTab() {
		pimTab.click();
	}
	public void clickPimAddEmpTab() {
		pimAddEmployee.click();
	}
	public void setPimFstName(String pimFname) {
		pimEmpFstname.sendKeys(pimFname);
	}
	public void setPimLstName(String pimLname) {
		pimEmpLstname.sendKeys(pimLname);
	}
	public void setPimEmpId(String pimEId) {
		act.doubleClick(pimEmpId).build().perform();
		pimEmpId.sendKeys(pimEId);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	//---------------
	public void clickPimEmpListTab() {
		pimEmpList.click();
	}
	public void setpimEmpListEmpId(String pimEmpListEmpIdParam) {
		pimEmpListEmpId.sendKeys(pimEmpListEmpIdParam);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickPimReportsTab() {
		pimReports.click();
	}
	public void clickAddButton() {
		addButton.click();
	}
	public void setPimRprtName(String pimRprtNameParam) {
		pimRprtName.sendKeys(pimRprtNameParam);
	}
	
	public void clickPimRprtSelCriteriaDrpDn() {
		pimRprtSelCriteriaDrpDn.click();
	}
	public void clickPimRprtSelServicePeriodOption() {
		pimRprtSelServicePerOption.click();
	}
	public void clickPimRprtSelDisFieldGrpDrpDn() {
		pimRprtSelDisFieldGrpDrpDn.click();
	}
	public void clickPimRprtSelDispGrpSupervisorOption() {
		pimRprtSelDispGrpSupervisorOption.click();
	}
	
	public void clickPimRprtSelDispFieldDrpDn() {
		pimRprtSelDispFieldDrpDn.click();
	}
	public void clickPimRprtSelDispFieldRprtMethOption() {
		pimRprtSelDispFieldRprtMethOption.click();
	}
	public void clickPimRprtPlusBtn() {
		pimRprtPlusBtn.click();
	}
	
	//---------------
	public void setPimRprtNameSearch(String pimRprtNameSearchParam) {
		pimRprtNameSearch.sendKeys(pimRprtNameSearchParam);
	}
	 public void clickTejasReportOption() {
		 pimRprtTejOption.click();
	 }
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	}
}
//----------------------


//@Test
//public void testWeb() throws InterruptedException {
//	//PIM
//	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
//	//Add Employee
//	driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
//	//first name
//	driver.findElement(By.name("firstName")).sendKeys("Sai Surya Teja");
//	//last name
//	driver.findElement(By.name("lastName")).sendKeys("Chavatapalli");
//	
//	Actions act=new Actions(driver);
//	act.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"))).build().perform();
//	//Enter Employee ID
//	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("554271");
//	//Upload photo
//	JavascriptExecutor js = (JavascriptExecutor) driver; 
//	js.executeScript("arguments[0].setAttribute('style', arguments[1])",driver.findElement(By.xpath("//input[@type='file']")), "0");
//	js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\sai_chavatapalli\\Desktop\\Sai Surya Teja\\anime.jpg");
//	
//	Thread.sleep(4000);
//	//Save
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[normalize-space()='Personal Details']")))); 
//
//	driver.findElement(By.xpath("//a[normalize-space()='Personal Details']")).click();
//	
//	//nickname
//	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys("sai");
//	//driving license
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("56738392");
//	//Gender
//	driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
//	//Job
//	driver.findElement(By.xpath("//a[normalize-space()='Job']")).click();
//	//Job Title
//	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//	driver.findElement(By.xpath("//div[contains(text(),'Software Engineer')]")).click();
//	
//	//job category
//	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//	driver.findElement(By.xpath("//div[contains(text(),'Professionals')]")).click();
//	//subunit
//	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//	driver.findElement(By.xpath("//div[contains(text(),'Engineering')]")).click();
//	//save
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(10000);
//}
//@Test
//public void testWeb2() throws InterruptedException {
//	driver.navigate().refresh();
//	driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
//	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("554271");
//	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
//}