package tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PIMPage;
import utils.ShipmentTest;
import utils.TakeScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;
public class PIMPageTest {
	WebDriver driver;
	PIMPage pimSection;
	LoginPage loginSection;
	ShipmentTest ship;
	TakeScreenShot scsht;
	String[][] loginData;
	Logger logger = LogManager.getLogger(PIMPageTest.class.getName());
@BeforeTest
public void setUp() throws InvalidFormatException, IOException{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	pimSection=new PIMPage(driver);
	loginSection=new LoginPage(driver);
	ship=new ShipmentTest();
	scsht=new TakeScreenShot();
	loginData=ship.getData();
	//System.out.println(Arrays.deepToString(loginData));
	loginSection.setLoginPageUsrName(loginData[0][0]);
	loginSection.setLoginPagePassword(loginData[0][1]);
	loginSection.clickLoginPageLoginBtn();
	logger.info("Login Completed");
	
}

@Test(priority=1)
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
@Test(priority=2)
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
@Test(priority=3)
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

@Test(priority=4)
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
}
