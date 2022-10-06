package com.orangeHRM;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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

public class LoginPage {
	
	WebDriver driver;
	@FindBy(how = How.NAME, using = "username") WebElement loginPageUsrName;
	@FindBy(how = How.NAME, using = "password") WebElement loginPagePassword;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']") WebElement loginPageLgnBtn;

	
//	------------------------------------------------------------------------------------------
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-----------------------
	
	public void setLoginPageUsrName(String loginUsrName) {
		loginPageUsrName.sendKeys(loginUsrName);
	}
	public void setLoginPagePassword(String loginPassword) {
		loginPagePassword.sendKeys(loginPassword);
	}
	public void clickLoginPageLoginBtn() {
		loginPageLgnBtn.click();
	}

}
