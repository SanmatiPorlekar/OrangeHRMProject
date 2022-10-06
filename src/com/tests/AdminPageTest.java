package tests;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LoginPage;
import utils.ShipmentTest;
import utils.TakeScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

//---------------------------
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//------------------------------------
public class AdminPageTest {
	WebDriver driver;
	AdminPage adminSection;
	LoginPage loginSection;
	ShipmentTest ship;
	String[][] loginData;
	TakeScreenShot scsht;
	 Logger logger = LogManager.getLogger(AdminPageTest.class.getName());
	
	@BeforeTest
	public void setUp() throws InvalidFormatException, IOException {
		logger.info("SetUp Started");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		adminSection=new AdminPage(driver);
		loginSection=new LoginPage(driver);
		ship=new ShipmentTest();
		scsht=new TakeScreenShot();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginData=ship.getData();
		loginSection.setLoginPageUsrName(loginData[0][0]);
		loginSection.setLoginPagePassword(loginData[0][1]);
		loginSection.clickLoginPageLoginBtn();
		logger.info("Login completed");
	}
	@Test(priority=1)
	public void adminJobTitle() throws Exception {
		adminSection.clickAdmin();
		adminSection.clickJob();
		adminSection.clickJobTitles();
		adminSection.clickAddButton();
		adminSection.setJobTitle(loginData[1][0]);
		adminSection.setJobDescription(loginData[1][1]);
		adminSection.clickSaveButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		scsht.takeSnapShot(driver, "adminJobTitle.png");
		logger.info("Job Title Added");

		
	}
	@Test(priority=2)
	public void adminOrganizationLocationSearch() throws Exception {
		adminSection.clickAdmin();
		adminSection.clickOrganization();
		adminSection.clickOrganizationLocation();
		adminSection.setLocationName(loginData[2][0]);
		adminSection.setLocationCity(loginData[2][1]);
		adminSection.clickLocationCountryDropDown();
		adminSection.clicklocationCountryName();
		adminSection.clickSearchButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		scsht.takeSnapShot(driver, "adminOrganizationSearch.png");
		logger.info("Organization search is completed");
	}
	
	@Test(priority=3)
	public void adminOrganizationLocationAdd() throws Exception {
		adminSection.clickAdmin();
		adminSection.clickOrganization();
		adminSection.clickOrganizationLocation();
		adminSection.clickAddButton();
		adminSection.setAddOrgLocationName(loginData[3][0]);
		adminSection.setAddOrgCityName(loginData[3][1]);
		adminSection.setAddOrgStateName(loginData[3][2]);
		adminSection.setAddOrgZipCode(loginData[3][3]);
		adminSection.setAddOrgPhoneNo(loginData[3][4]);
		adminSection.setAddOrgFaxNo(loginData[3][5]);
		adminSection.setAddOrgAddress(loginData[3][6]);
		adminSection.setAddOrgNotes(loginData[3][7]);
		adminSection.clickOrgCountryDropDown();
		adminSection.clickOrgIndiaOption();
		adminSection.clickSaveButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		scsht.takeSnapShot(driver, "adminOrganizationLocationAdd.png");
		logger.info("Adding location of organization is completed");
	}
	@Test(priority=4)
	public void adminUserManagement() throws Exception {
		adminSection.clickAdminUserManagement();
		adminSection.clickAdminUsers();
		adminSection.clickUserRoleDropDown();
		adminSection.clickESSButton();
		adminSection.setUserMngEmpName(loginData[4][0]);
		Thread.sleep(5000);
		adminSection.clickJoeRootOption();
		adminSection.clickUserMngStatusDropDown();
		adminSection.clickEnabledOption();
		adminSection.clickSearchButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		scsht.takeSnapShot(driver, "adminUserManagement.png");
		logger.info("admin User Management is completed");
		}
	
	@Test(priority=5)
	public void adminQualificationSkill() throws Exception {
		adminSection.setAdmin();
		adminSection.setQualification();
		//move to skill
		adminSection.setSkill();
		//adding of skill
		adminSection.setSkillAdd();
		adminSection.setSkillName(loginData[11][0]);
		adminSection.setSkillDescription(loginData[11][1]);
		adminSection.setSkillSave();
		//add existed Skil
		adminSection.setSkillAdd();
		adminSection.setSkillName(loginData[11][0]);
		adminSection.setSkillDescription(loginData[11][1]);
		adminSection.setSkillCancel();
		//deleting of skill
		adminSection.setSkillDel();
		adminSection.setSkillDelYes();
		//deleting multiple
		adminSection.setSkillMul1();
		adminSection.setSkillMul2();
		adminSection.setSkillMul();
		adminSection.setSkillMulYes();
		//edit Skill
		adminSection.setSkillEdit();
		adminSection.setSkillEditName(loginData[11][2]);
		adminSection.setSkillEditDescription(loginData[11][3]);
		adminSection.setSkillEditSave();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		scsht.takeSnapShot(driver, "adminQualificationSkill.png");
		logger.info("admin Qualification skill is added");
	}
	@Test(priority=6)
	public void adminQualificationEducation() throws Exception {
		adminSection.setQualification();
		//move to education
		adminSection.setEducation();
		//adding of education
		adminSection.setEducationAdd();
		adminSection.setEducationName(loginData[12][0]);
		
		adminSection.setEducationSave();
		//add existed education
		adminSection.setEducationAdd();
		adminSection.setEducationName(loginData[12][0]);
		
		adminSection.setEducationCancel();
		//deleting of education
		adminSection.setEducationDel();
		adminSection.setEducationDelYes();
		//deleting multiple
		adminSection.setEducationMul1();
		adminSection.setEducationMul2();
		adminSection.setEducationMul();
		adminSection.setEducationMulYes();
		//edit education
		adminSection.setEducationEdit();
		adminSection.setEducationEditName(loginData[12][1]);
		adminSection.setEducationEditSave();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		scsht.takeSnapShot(driver, "adminQualificationEducation.png");
		logger.info("Admin qualification education is added");
	}

	@Test(priority=7)
	public void adminNationalities() throws Exception {
		//move to national
		adminSection.setNational();
		//adding of national
		adminSection.setNationalAdd();
		adminSection.setNationalName(loginData[13][0]);
		
		adminSection.setNationalSave();
		//add existed National
		adminSection.setNationalAdd();
		adminSection.setNationalName(loginData[13][0]);
		
		adminSection.setNationalCancel();
		//deleting of national
		adminSection.setNationalDel();
		adminSection.setNationalDelYes();
		//deleting multiple
		adminSection.setNationalMul1();
		adminSection.setNationalMul2();
		adminSection.setNationalMul();
		adminSection.setNationalMulYes();
		//edit national
		adminSection.setNationalEdit();
		adminSection.setNationalEditName(loginData[13][1]);
		
		adminSection.setNationalEditSave();
		logger.info("Admin Nationalitied is Added &Edited & Deleted");
		
	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

