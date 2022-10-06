package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoContactDetails {
	WebDriver driver;
	Actions A;

	public MyInfoContactDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		A=new Actions(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	WebElement click_1;

	public void click1()
	{
		click_1.click();
	}

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	WebElement click_2;

	public void click2()
	{
		click_2.click();
	}

	@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-horizontal-padding.orangehrm-vertical-padding form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active")
	WebElement street1;

	public void street1(String s1)
	{
		street1.sendKeys(s1);
	}
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement street2;

	public void street2(String s2)
	{
		street2.sendKeys(s2);
	}
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement city;

	public void city(String ci)
	{
		city.sendKeys(ci);	
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[4]/div[1]/div[2]/input[1]")
	WebElement state;

	public void state(String st)
	{
		state.sendKeys(st);
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[5]/div[1]/div[2]/input[1]")
	WebElement zip;

	public void zip(String zi)
	{
		zip.sendKeys(zi);
	}
	
	 

	@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-horizontal-padding.orangehrm-vertical-padding form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(6) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper div.oxd-select-text.oxd-select-text--active > div.oxd-select-text-input")
	WebElement country;

	public void country()
	{
		  country.click();
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ENTER).build().perform();  

	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement home;

	public void home(String ho)
	{
		home.sendKeys(ho);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement mobile;

	public void mobile(String mo)
	{
		mobile.sendKeys(mo);
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement work;

	public void work(String wo)
	{
		work.sendKeys(wo);
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement email;

	public void email(String e)
	{
		email.sendKeys(e);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement o_email;

	public void o_email(String oe)
	{
		o_email.sendKeys(oe);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_last;

	public void clickLast()
	{
		click_last.click();
	}




	
}