package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DirectoryPage;
import pages.LoginPage;
import utils.ShipmentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectoryPageTest {
	WebDriver driver;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	DirectoryPage directoryPage;
	LoginPage loginSection;
	ShipmentTest ship;
	Logger logger = LogManager.getLogger(DirectoryPageTest.class.getName());
	@BeforeMethod
	public void driverSetUp() throws InvalidFormatException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		ship = new ShipmentTest();
		loginSection = new LoginPage(driver);
		directoryPage = new DirectoryPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String[][] loginData = ship.getData();
		loginSection.setLoginPageUsrName(loginData[0][0]);
		loginSection.setLoginPagePassword(loginData[0][1]);
		loginSection.clickLoginPageLoginBtn();
		logger.info("logined into OrangeHRM");
	}

	@Test
	public void testWeb() throws InterruptedException, IOException {
		directoryPage.filter_click();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sai_chavatapalli\\eclipse-workspace\\com.orangeHRMMiniProject\\Resources\\data.properties");

		try {
			prop.load(fis);

			String val1 = prop.getProperty("Employee_Name");
			directoryPage.Employee_Name(val1);
			directoryPage.Employee_name(Keys.ARROW_DOWN);
			directoryPage.Employee_name(Keys.ENTER);
			Thread.sleep(300);
			logger.info("Employee_Name is given");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		directoryPage.Job_Title();
		directoryPage.Title_Selection();
		Thread.sleep(500);
		logger.info("Job_Title is Selected");
		directoryPage.Location();
		directoryPage.Location_Selection();
		Thread.sleep(500);
		logger.info("Location is Selected");
		directoryPage.Search();
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

	@AfterMethod
		public void tearDown() {
		driver.quit();
	}

}