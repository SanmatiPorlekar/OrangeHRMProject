package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage {

	WebDriver driver;
	// fill your code
	@FindBy(name = "username")
	WebElement loginpage_username;

	@FindBy(name = "password")
	WebElement loginpage_password;

	@FindBy(tagName = "button")
	WebElement click_login;

	@FindBy(linkText = "Directory")
	WebElement filter;

	@FindBy(xpath = "//input[contains(@placeholder,'Type for hints..')]")
	WebElement employee_name;

	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
	WebElement job_title;

	@FindBy(xpath = "//span[text()='Chief Technical Officer']")
	WebElement title_selection;

	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
	WebElement location;

	@FindBy(xpath = "//span[text()='HQ - CA, USA']")
	WebElement location_selection;

	@FindBy(how = How.CSS, using = "button[type='submit']")
	WebElement search;

	public DirectoryPage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}

	public void setUsername(String string1) {
		loginpage_username.sendKeys(string1);

	}

	public void setPassword(String string2) {
		loginpage_password.sendKeys(string2);

	}

	public void clickButton() {
		click_login.click();

	}

	public void filter_click() {
		filter.click();
	}

	public void Employee_Name(String string3) {
		employee_name.sendKeys(string3);
	}

	public void Employee_name(Keys string4) {
		employee_name.sendKeys(string4);
	}

	public void Job_Title() {
		job_title.click();
	}

	public void Title_Selection() {
		title_selection.click();
	}

	public void Location() {
		location.click();
	}

	public void Location_Selection() {
		location_selection.click();
	}

	public void Search() {
		search.click();
	}

}