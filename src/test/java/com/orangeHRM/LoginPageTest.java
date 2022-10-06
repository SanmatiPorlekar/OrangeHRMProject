package com.orangeHRM;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.AdminPage;
import com.orangeHRM.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ShipmentTest;
public class LoginPageTest {
	WebDriver driver;
	LoginPage loginSection;
	ShipmentTest ship;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginSection=new LoginPage(driver);
		
		ship=new ShipmentTest();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginOrangeHRM() throws InvalidFormatException, IOException {
		System.out.println(Arrays.deepToString(ship.getData()));
		String[][] loginData=ship.getData();
	
		loginSection.setLoginPageUsrName(loginData[0][0]);
		loginSection.setLoginPagePassword(loginData[0][1]);
		loginSection.clickLoginPageLoginBtn();
}
	
//	@AfterTest
//	public void quit() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
//	}
}
