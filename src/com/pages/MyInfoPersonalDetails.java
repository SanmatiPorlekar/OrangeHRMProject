package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MyInfoPersonalDetails {
	WebDriver driver;
	Actions act ;
	@FindBy(name = "username")
	WebElement Name1;

	@FindBy(name = "password")
	WebElement Pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickk;
	public MyInfoPersonalDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 act = new Actions(driver);
	}

	public void empName(String name_emp)
	{
		Name1.sendKeys(name_emp);
	}

	public void empPass(String name_pass)
	{
		Pass.sendKeys(name_pass);
	}

	public void click()
	{
		clickk.click();
	}

	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-navigation']/aside[@class='oxd-sidepanel']/nav[@class='oxd-navbar-nav']/div[@class='oxd-sidepanel-body']/ul[@class='oxd-main-menu']/li[6]/a[1]")
	WebElement click_1;

	public void click1()
	{
		click_1.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Personal Details')]")
	WebElement click_2;

	public void click2()
	{
		click_2.click();
	}

	

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	WebElement Fname;

	public void Fname(String f_name)
	{
		act.doubleClick(Fname).perform();
		Fname.sendKeys(f_name);
	}
	//MIDDLE NAME
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
	WebElement Mname;
	
	public void middlename(String mid_name)
	{
		act.doubleClick(Mname).perform();
		Mname.sendKeys(mid_name);
	}

	//LAST NAME
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	WebElement Lname;
	
	public void lastname(String l_name)
	{
		act.doubleClick(Lname).perform();
		Lname.sendKeys(l_name);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement nick;
	
	public void nickname(String n_name)
	{
		act.doubleClick(nick).perform();
		nick.sendKeys(n_name);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement emp_id;
	
	public void employee_id(String e_id)
	{
		act.doubleClick(emp_id).perform();
		emp_id.sendKeys(e_id);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement oth_id;
	
	public void other_id(String o_id)
	{
		act.doubleClick(oth_id).perform();
		oth_id.sendKeys(o_id);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement lis;
	
	public void lisence(String li_no)
	{
		act.doubleClick(lis).perform();
		lis.sendKeys(li_no);
	}
	 
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[3]/div[1]/div[1]/div[2]/input[1]")
	WebElement ssn;
	
	public void ssn_no(String ssn_n)
	{
		ssn.click();
		act.doubleClick(ssn).perform();
		ssn.sendKeys(ssn_n);
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[3]/div[2]/div[1]/div[2]/input[1]")
	WebElement sin;
	
	public void sin_no(String sin_n)
	{
		sin.click();
		act.doubleClick(sin).perform();
		sin.sendKeys(sin_n);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement nat;
	

	public void nationality()
	{
		nat.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();  
	}


	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement ms;
	
	public void mar_status()
	{
		ms.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();  
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement mls;
	
	public void malli_status(String ml_no)
	{
		mls.click();
		act.doubleClick(mls).perform();
		mls.sendKeys(ml_no);
	}

	@FindBy(xpath = "//label[text()='Yes']")
	WebElement click_3;

	public void click3()
	{
		click_3.click();
	}

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_4;

	public void click4()
	{
		click_4.click();
	}

	@FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//div[@class='oxd-select-wrapper']//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text--after']//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement cf;
	
	public void custom_field()
	{
		cf.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();  
	}


	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-custom-fields']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_5;

	public void click5()
	{
		click_5.click();

	}


}