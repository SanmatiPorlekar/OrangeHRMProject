package com.orangeHRM;
//---------------------------------
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.LoginPage;
import com.orangeHRM.MyInfoPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ShipmentTest;
import utils.TakeScreenShot;

public class MyInfoPageTest {
		WebDriver driver;
		MyInfoPage myInfoSection;
		LoginPage loginSection;
		ShipmentTest ship;
		String[][] loginData;
		public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

@BeforeTest
public void SetUp() throws Exception{	

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	myInfoSection = new MyInfoPage(driver);  
	driver.manage().window().maximize();	
	loginSection=new LoginPage(driver);
	ship=new ShipmentTest();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	loginData=ship.getData();
	//System.out.println(Arrays.deepToString(loginData));
	loginSection.setLoginPageUsrName(loginData[0][0]);
	loginSection.setLoginPagePassword(loginData[0][1]);
	loginSection.clickLoginPageLoginBtn();

}	
@Test
public void setMethod() throws InterruptedException{
	//methods called for personal details module
	myInfoSection.clickmyInfoTab();
	myInfoSection.clickpersonalDetailsTab();
	myInfoSection.Fname("Sai Surya Teja");
	myInfoSection.middlename("Surya");
	myInfoSection.lastname("Chavatapalli");
//	myInfoSection.nickname("VICKY");
//	myInfoSection.employee_id("1234");
//	myInfoSection.other_id("123458");
//	myInfoSection.lisence("987654");
//	myInfoSection.ssn_no("20001122");
//	myInfoSection.sin_no("9049934874");
//	myInfoSection.nationality();
//	myInfoSection.mar_status();
//	myInfoSection.malli_status("EWC");
//	myInfoSection.click3();
//	myInfoSection.click4();
//	myInfoSection.custom_field();
//	myInfoSection.click5();
       
	//methods called for contact details module
//	myInfoSection.click1();
//	myInfoSection.click2();
//	myInfoSection.street1("Narayan Nagar");
//	myInfoSection.street2("Rajiv Gandhi IT Park");
//	myInfoSection.city("Pune");
//	myInfoSection.state("Maharashtra");
//	myInfoSection.zip("412345");
//	myInfoSection.country();
//	myInfoSection.home("02302481412");
//	myInfoSection.mobile("9876452321");
//	myInfoSection.work("1234-998876");
//	myInfoSection.email("sad@gmail.com");
//	myInfoSection.o_email("rais@gmail.com");
//	myInfoSection.clickLast();
}

@AfterTest
public void tearDown()
{
	//driver.quit();
}
}