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
import pages.LeavePage;
import pages.TimePage;
import utils.ShipmentTest;
import utils.TakeScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TimePageTest {
	WebDriver driver;
	PIMPage pimSection;
	LoginPage loginSection;
	LeavePage leaveSection;
	TimePage timeSection;
	ShipmentTest ship;
	TakeScreenShot scsht;
	String[][] loginData;
	Logger logger = LogManager.getLogger(PIMPageTest.class.getName());

	@BeforeTest
	public void setUp() throws InvalidFormatException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pimSection = new PIMPage(driver);
		loginSection = new LoginPage(driver);
		leaveSection = new LeavePage(driver);
		timeSection = new TimePage(driver);
		ship = new ShipmentTest();
		scsht = new TakeScreenShot();
		loginData = ship.getData();
		// System.out.println(Arrays.deepToString(loginData));
		loginSection.setLoginPageUsrName(loginData[0][0]);
		loginSection.setLoginPagePassword(loginData[0][1]);
		loginSection.clickLoginPageLoginBtn();
		logger.info("Login Completed");

	}

	@Test(priority = 1)
	public void timeSec() throws Exception {
		Thread.sleep(2000);
//	obj1.clickTime();
		timeSection.Attendance("Punch In", "Punch Out");
		//Thread.sleep(2000);

		timeSection.report("2022-10-06	", "2022-10-12");
		//Thread.sleep(2000);

		timeSection.projectInfo("Orange", "OrangeHrm automation", "Internal", "General HR Tasks", "Paul Collings");
	}

	@Test(priority = 2)
	public void TimeSheet() throws InterruptedException {
		timeSection.TimeSheet("12");
		//Thread.sleep(2000);

	}

}
