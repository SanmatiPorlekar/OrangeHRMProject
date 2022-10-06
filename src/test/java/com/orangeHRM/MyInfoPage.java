package com.orangeHRM;

//pom structure for personal details
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {
	WebDriver driver;
	Actions act;
	Actions A;
	//My info personal details web elements
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-navigation']/aside[@class='oxd-sidepanel']/nav[@class='oxd-navbar-nav']/div[@class='oxd-sidepanel-body']/ul[@class='oxd-main-menu']/li[6]/a[1]")
	WebElement myInfoTab;
	@FindBy(xpath = "//a[contains(text(),'Personal Details')]")
	WebElement personalDetailsTab;
	@FindBy(name="firstName") WebElement Fname;
	// MIDDLE NAME
	@FindBy(name="middleName")
	WebElement Mname;
	// LAST NAME
	@FindBy(name="lastName")
	WebElement Lname;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement nick;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement emp_id;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement oth_id;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement lis;

	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[3]/div[1]/div[1]/div[2]/input[1]")
	WebElement ssn;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[3]/div[2]/div[1]/div[2]/input[1]")
	WebElement sin;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement nat;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement ms;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement mls;

	@FindBy(xpath = "//label[text()='Yes']")
	WebElement click_3;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_4;
	@FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//div[@class='oxd-select-wrapper']//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text--after']//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement cf;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-custom-fields']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_5;
//----------------------------------------------------------------------------------------------
	//--My info-contact details web elements
	

	@FindBy(css = "div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form:nth-child(2) div.oxd-form-actions.orangehrm-login-action:nth-child(4) > button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	WebElement click;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement street2;

	@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-horizontal-padding.orangehrm-vertical-padding form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active") WebElement street1;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement city;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[4]/div[1]/div[2]/input[1]")
	WebElement state;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[5]/div[1]/div[2]/input[1]")
	WebElement zip;
	@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-horizontal-padding.orangehrm-vertical-padding form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(6) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper div.oxd-select-text.oxd-select-text--active > div.oxd-select-text-input")
	WebElement country;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement mobile;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement work;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement email;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement o_email;
	@FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-actions']/button[1]")
	WebElement click_last;

	//----------------------------------------------------------------------------------------------
	//---Myinfo personal details methods
	public MyInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		A=new Actions(driver);
	}

	public void clickmyInfoTab() {
		myInfoTab.click();
	}

	public void clickpersonalDetailsTab() {
		personalDetailsTab.click();
	}

	public void Fname(String f_name) {
		act.doubleClick(Fname).build().perform();
		Fname.sendKeys(f_name);
	}

	public void middlename(String mid_name) {
		act.doubleClick(Mname).build().perform();
		Mname.sendKeys(mid_name);
	}

	public void lastname(String l_name) {
		act.doubleClick(Lname).build().perform();
		Lname.sendKeys(l_name);
	}

	public void nickname(String n_name) {
		act.doubleClick(nick).perform();
		nick.sendKeys(n_name);
	}

	public void employee_id(String e_id) {
		act.doubleClick(emp_id).perform();
		emp_id.sendKeys(e_id);
	}

	public void other_id(String o_id) {
		act.doubleClick(oth_id).perform();
		oth_id.sendKeys(o_id);
	}

	public void lisence(String li_no) {
		act.doubleClick(lis).perform();
		lis.sendKeys(li_no);
	}

	public void ssn_no(String ssn_n) {
		ssn.click();
		act.doubleClick(ssn).perform();
		ssn.sendKeys(ssn_n);
	}

	public void sin_no(String sin_n) {
		sin.click();
		act.doubleClick(sin).perform();
		sin.sendKeys(sin_n);
	}

	public void nationality() {
		nat.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();
	}

	public void mar_status() {
		ms.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();
	}

	public void malli_status(String ml_no) {
		mls.click();
		act.doubleClick(mls).perform();
		mls.sendKeys(ml_no);
	}

	public void click3() {
		click_3.click();
	}

	public void click4() {
		click_4.click();
	}

	public void custom_field() {
		cf.click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();
	}

	public void click5() {
		click_5.click();

	}
	//--------------------------------------------------------------------
	//---My info contact details methods
	public void street1(String s1)
	{
		street1.sendKeys(s1);
	}


	public void street2(String s2)
	{
		street2.sendKeys(s2);
	}
	

	public void city(String ci)
	{
		city.sendKeys(ci);	
	}
	


	public void state(String st)
	{
		state.sendKeys(st);
	}
	


	public void zip(String zi)
	{
		zip.sendKeys(zi);
	}
	
	 

	

	public void country()
	{
		  country.click();
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ENTER).build().perform();  

	}
	


	public void home(String ho)
	{
		home.sendKeys(ho);
	}



	public void mobile(String mo)
	{
		mobile.sendKeys(mo);
	}
	


	public void work(String wo)
	{
		work.sendKeys(wo);
	}
	
	

	public void email(String e)
	{
		email.sendKeys(e);
	}

	

	public void o_email(String oe)
	{
		o_email.sendKeys(oe);
	}

	

	public void clickLast()
	{
		click_last.click();
	}
	

}
