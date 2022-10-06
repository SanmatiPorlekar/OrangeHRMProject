package tests;



import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MyInfoPersonalDetails;
import pages.MyInfoContactDetails;

//import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class MyInfoPageTest {
		WebDriver driver;
		MyInfoContactDetails T;
		MyInfoPersonalDetails P;
		public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Logger logger = LogManager.getLogger(AdminPageTest.class.getName());
@BeforeTest
public void driverSetUp()throws InvalidFormatException, IOException{	
	logger.info("SetUp Started");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	T = new MyInfoContactDetails(driver);
	P = new MyInfoPersonalDetails(driver);  
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

}	

public void myInfoSec() throws InterruptedException{
	//methods called for personal details module
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
public void tearDown()
{
	driver.quit();
}
}
