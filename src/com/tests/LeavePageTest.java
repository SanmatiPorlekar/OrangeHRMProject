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
import pages.LeavePage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeavePageTest {
	WebDriver driver;
	PIMPage pimSection;
	LoginPage loginSection;
	LeavePage leaveSection;
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
	leaveSection=new LeavePage(driver);
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
public void leaveSec() throws Exception {
	leaveSection.loginToApply("2022-10-20");
	//obj.loginToMyLeave();
	leaveSection.Entitlementfun("20");
	Thread.sleep(2000);
	leaveSection.LeaveList();
}

}
