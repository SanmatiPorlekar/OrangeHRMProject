package combinedTests;
import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import pages.MyInfoContactDetails;
import pages.MyInfoPersonalDetails;
import pages.PIMPage;
import pages.LeavePage;
import pages.TimePage;
import pages.PerformancePage;
import pages.DirectoryPage;

//-----------------------
import utils.ShipmentTest;
import utils.TakeScreenShot;


import io.github.bonigarcia.wdm.WebDriverManager;

//---------------------------
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//------------------------------------
public class CombinedTests {
	WebDriver driver;
	AdminPage adminSection;
	LoginPage loginSection;
	LeavePage leaveSection;
	TimePage timeSection;
	PerformancePage performanceSection;
	PIMPage pimSection;
	DirectoryPage directorySection;
	ShipmentTest ship;
	String[][] loginData;
	TakeScreenShot scsht;
	MyInfoContactDetails T;
	MyInfoPersonalDetails P;
	Logger logger = LogManager.getLogger(CombinedTests.class.getName());
	@BeforeTest
	public void setUp() throws InvalidFormatException, IOException {
		logger.info("SetUp Started");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		adminSection=new AdminPage(driver);
		loginSection=new LoginPage(driver);
		leaveSection=new LeavePage(driver);
		timeSection=new TimePage(driver);
		
		T = new MyInfoContactDetails(driver);
		P = new MyInfoPersonalDetails(driver); 
		directorySection=new DirectoryPage(driver);
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
	
	//Admin Page
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
	//PIM Tests Page
	//----------------------------------------------------
	@Test(priority=8)
	public void pimAddEmployee() throws Exception {
		pimSection.clickPimTab();
		pimSection.clickPimAddEmpTab();
		pimSection.setPimFstName(loginData[6][0]);
		pimSection.setPimLstName(loginData[6][1]);
		pimSection.setPimEmpId(loginData[6][2]);
		pimSection.clickSaveButton();
		Thread.sleep(5000);
		scsht.takeSnapShot(driver, "pimAddEmployee.png");
		logger.info("PIM-Employee Added");
	}
	@Test(priority=9)
	public void pimSearchEmployee() throws Exception {
		pimSection.clickPimTab();
		pimSection.clickPimEmpListTab();
		pimSection.setpimEmpListEmpId(loginData[7][0]);
		pimSection.clickSearchButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		scsht.takeSnapShot(driver, "pimSearchEmployee.png");
		logger.info("PIM-Seach Employee is Searched");
	}
	@Test(priority=10)
	public void pimReportAdd() throws InterruptedException {
		pimSection.clickPimTab();
		pimSection.clickPimReportsTab();
		pimSection.clickAddButton();
		pimSection.setPimRprtName(loginData[8][0]);
		pimSection.clickPimRprtSelCriteriaDrpDn();
		//Service period
		pimSection.clickPimRprtSelServicePeriodOption();
		pimSection.clickPimRprtSelDisFieldGrpDrpDn();
		//Supervisor
		pimSection.clickPimRprtSelDispGrpSupervisorOption();
		pimSection.clickPimRprtSelDispFieldDrpDn();
		//Reporting Method
		pimSection.clickPimRprtSelDispFieldRprtMethOption();
		pimSection.clickPimRprtPlusBtn();
		pimSection.clickSaveButton();
		logger.info("PIM Report is added");
		
	}

	@Test(priority=11)
	public void pimReportSearch() throws Exception {
		pimSection.clickPimTab();
		pimSection.clickPimReportsTab();
		pimSection.setPimRprtNameSearch(loginData[9][0]);
		Thread.sleep(3000);
		pimSection.clickTejasReportOption();
		pimSection.clickSearchButton();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		scsht.takeSnapShot(driver, "pimReportSearch.png");
		logger.info("PIM Report is serached");

	}
	//--Leave Section
	//-------------------------
	@Test(priority=12)
	public void leaveSec() throws Exception {
		leaveSection.loginToApply("2022-10-20");
		//obj.loginToMyLeave();
		leaveSection.Entitlementfun("20");
		Thread.sleep(2000);
		leaveSection.LeaveList();
	}
	
	
	//----------------------------------------------------
	//---Time Section
	
	@Test(priority = 13)
	public void timeSec() throws Exception {
		Thread.sleep(2000);
//	obj1.clickTime();
		timeSection.Attendance("Punch In", "Punch Out");
		Thread.sleep(2000);

		timeSection.report("2022-10-06	", "2022-10-12");
		Thread.sleep(2000);

		timeSection.projectInfo("Orange", "OrangeHrm automation", "Internal", "General HR Tasks", "Paul Collings");
	}

	@Test(priority = 14)
	public void TimeSheet() throws InterruptedException {
		timeSection.TimeSheet("12");
		Thread.sleep(2000);

	}
	
	@Test(priority = 15)
	public void performanceSec() throws Exception {
		
		performanceSection.performanceClick();
		Thread.sleep(2000);	
		performanceSection.eName();
		Thread.sleep(2000);
		performanceSection.myTrackers("This is log	","My Tracker");
		
	}
	//-------------Directory Page
	@Test(priority=16)
	public void directoryPage() throws InterruptedException, IOException {
		directorySection.filter_click();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sai_chavatapalli\\eclipse-workspace\\com.orangeHRMMiniProject\\Resources\\data.properties");

		try {
			prop.load(fis);

			String val1 = prop.getProperty("Employee_Name");
			directorySection.Employee_Name(val1);
			directorySection.Employee_name(Keys.ARROW_DOWN);
			directorySection.Employee_name(Keys.ENTER);
			Thread.sleep(300);
			logger.info("Employee_Name is given");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		directorySection.Job_Title();
		directorySection.Title_Selection();
		Thread.sleep(500);
		logger.info("Job_Title is Selected");
		directorySection.Location();
		directorySection.Location_Selection();
		Thread.sleep(500);
		logger.info("Location is Selected");
		directorySection.Search();
		Thread.sleep(300);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1500);

		driver.findElement(By.cssSelector(".oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.orangehrm-directory-card"))
				.click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1500);
		//------------------------
		TakesScreenshot ss = ((TakesScreenshot) driver);

		File SrcFile = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(SrcFile, new File(
				"C:\\Users\\sai_chavatapalli\\eclipse-workspace\\com.orangeHRMMiniProject\\src\\test\\outputFiles\\screenshots\\Directory.png"));
		logger.info("employee details are displayed");

	}
	
	//-------------------------
	//--My Info PAge
	@Test(priority=17)
	public void myInfoSec() throws InterruptedException{
		//methods called for personal details module
		P.empName("Admin");
		P.empPass("admin123");
		P.click();
		P.click1();
		P.click2();
		P.Fname("SAM");
		P.middlename("JOSEPH");
		P.lastname("KENE");
		P.nickname("VICKY");
		P.employee_id("1234");
		P.other_id("123458");
		P.lisence("987654");
		P.ssn_no("20001122");
		P.sin_no("9049934874");
		P.nationality();
		P.mar_status();
		P.malli_status("EWC");
		P.click3();
		P.click4();
		P.custom_field();
		P.click5();
	       
		//methods called for contact details module
		//T.empName("Admin");
		//T.empPass("admin123");
		//T.click();
		T.click1();
		T.click2();
		T.street1("Narayan Nagar");
		T.street2("Rajiv Gandhi IT Park");
		T.city("Pune");
		T.state("Maharashtra");
		T.zip("412345");
		T.country();
		T.home("02302481412");
		T.mobile("9876452321");
		T.work("1234-998876");
		T.email("sad@gmail.com");
		T.o_email("rais@gmail.com");
		T.clickLast();


	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	}
}

