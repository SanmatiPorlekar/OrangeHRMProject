package pages;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminPage {
	
	WebDriver driver;
	//------Admin Job Tab
	@FindBy(how = How.XPATH, using = "//span[text()='Admin']") WebElement admin;
	@FindBy(how = How.XPATH, using = "//span[text()='Job ']") WebElement job;
	@FindBy(how = How.XPATH, using = "//a[text()='Job Titles']") WebElement jobTitles;
	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']") WebElement addButton;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") WebElement jobTitleInput;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Type description here']") WebElement jobDescription;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']") WebElement saveButton;
	
	
	//-------Admin Organization Location Search
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Organization']") WebElement adminOrganization;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Locations']") WebElement organizationLocations;
	@FindBy(how = How.CSS, using = "div[class='oxd-grid-3 orangehrm-full-width-grid'] div:nth-child(1) div:nth-child(1) div:nth-child(2) input:nth-child(1)") WebElement organizationlocationName;
	
	@FindBy(how = How.CSS, using = "div[class='oxd-table-filter-area'] div:nth-child(2) div:nth-child(1) div:nth-child(2) input:nth-child(1)") WebElement organizationlocationNameCity;
	@FindBy(how = How.CSS, using = ".oxd-select-text-input") WebElement locationCountryDropDown;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='United States']") WebElement locationCountryName;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']") WebElement searchButton;
	
	
	//-----Admin User Management
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='User Management']") WebElement adminUserManagement;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Users']") WebElement adminUsers;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") WebElement userManagementUserRoleDropDown;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='ESS']") WebElement ESSButton;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']") WebElement userMngEmpName;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") WebElement userMngStatusDropDown;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Enabled']") WebElement enabledOption;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Joe')]") WebElement joeRootOption;
	//--------------------------------------------------------------------------------
	//-------Admin Organization Location details
	@FindBy(how = How.CSS, using = "div[class='orangehrm-card-container'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) input:nth-child(1)")
	WebElement addOrgLocationName;
	@FindBy(how = How.CSS, using = "div[class='oxd-layout-context'] div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) input:nth-child(1)")
	WebElement addOrgCityName;
	@FindBy(how = How.CSS, using = "div[class='oxd-form-row'] div:nth-child(2) div:nth-child(1) div:nth-child(2) input:nth-child(1)")
	WebElement addOrgStateName;
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement addOrgZipCode;
	@FindBy(how = How.XPATH, using = "//input[@modelmodifiers='[object Object]']")
	WebElement addOrgPhoneNo;
	@FindBy(how = How.CSS, using = "div:nth-child(6) div:nth-child(1) div:nth-child(2) input:nth-child(1)")
	WebElement addOrgFaxNo;
	@FindBy(how = How.CSS, using = "div:nth-child(7) div:nth-child(1) div:nth-child(2) textarea:nth-child(1)")
	WebElement addOrgAddress;
	@FindBy(how = How.CSS, using = "div:nth-child(8) div:nth-child(1) div:nth-child(2) textarea:nth-child(1)")
	WebElement addOrgNotes;
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-select-text-input']")
	WebElement orgCountryDropDown;
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='India']")
	WebElement orgIndiaOption;
	
//	------------------------------------------------------------------------------------------
	//Admin Qualification->Skill
	@FindBy(xpath="//li[contains(.,'Qualifications ')]") WebElement qualification;
	@FindBy(xpath="//a[contains(.,'Skills')]") WebElement skill;
	@FindBy(xpath="//button[contains(.,'Add')]") WebElement skillAdd;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") WebElement skillName;             
	@FindBy(xpath="(//textarea[@placeholder='Type description here'])[1]")WebElement skillDescription;
	@FindBy(xpath="//button[contains(.,'Save')]") WebElement skillSave;
	@FindBy(xpath="//button[contains(.,'Cancel')]") WebElement skillCancel;
	@FindBy(xpath="//div[@role='table']//div[1]//div[1]//div[4]//div[1]//button[1]//i[1]") WebElement skillDel;
	@FindBy(xpath="//button[contains(.,'Yes, Delete')]")WebElement skillDelYes;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]") WebElement skillMul1;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]") WebElement skillMul2;
	@FindBy(xpath="//button[.=' Delete Selected ']") WebElement skillMul;
	@FindBy(xpath="//button[.=' Yes, Delete ']") WebElement skillMulYes;
	@FindBy(xpath="(//button[@type='button'])[4]") WebElement skillEdit;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement skillEditName;
	@FindBy(xpath="//textarea[contains(@placeholder,'Type description here')]") WebElement skillEditDescription;
	@FindBy(xpath="//button[contains(.,'Save')]") WebElement skillEditSave;
	
	//----------------------------------------------------------------------------------
	//Admin->Qualification-->Education WebElements
	@FindBy(xpath="//a[contains(.,'Education')]") WebElement education;
	@FindBy(xpath="//button[contains(.,'Add')]") WebElement educationAdd;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") WebElement educationName;             
	@FindBy(xpath="//button[contains(.,'Save')]") WebElement educationSave;
	@FindBy(xpath="//button[contains(.,'Cancel')]") WebElement educationCancel;
	@FindBy(xpath="(//i[@class='oxd-icon bi-trash'])[1]") WebElement educationDel;
	@FindBy(xpath="//button[contains(.,'Yes, Delete')]")WebElement educationDelYes;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]") WebElement educationMul1;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]") WebElement educationMul2;
	@FindBy(xpath="//button[.=' Delete Selected ']") WebElement educationMul;
	@FindBy(xpath="//button[contains(.,'Yes, Delete')]") WebElement educationMulYes;
	@FindBy(xpath="//div[@role='table']//div[1]//div[1]//div[3]//div[1]//button[2]//i[1]") WebElement educationEdit;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement educationEditName;
	@FindBy(xpath="//button[contains(.,'Save')]") WebElement educationEditSave;
	//------------------------------------------------------------------------------------
	//Admin-->National-->Web Elements
	@FindBy(xpath="//a[contains(.,'Nationalities')]") WebElement national;
	@FindBy(xpath="//button[contains(.,'Add')]") WebElement nationalAdd;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") WebElement nationalName;             
	@FindBy(xpath="//button[contains(@type,'submit')]") WebElement nationalSave;
	@FindBy(xpath="//button[contains(.,'Cancel')]") WebElement nationalCancel;
	@FindBy(xpath="(//i[@class='oxd-icon bi-trash'])[1]") WebElement nationalDel;
	@FindBy(xpath="//button[contains(.,'Yes, Delete')]")WebElement nationalDelYes;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]") WebElement nationalMul1;
	@FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]") WebElement nationalMul2;
	@FindBy(xpath="//button[.=' Delete Selected ']") WebElement nationalMul;
	@FindBy(xpath="//button[contains(.,'Yes, Delete')]") WebElement nationalMulYes;
	@FindBy(xpath="//div[@role='table']//div[1]//div[1]//div[3]//div[1]//button[2]//i[1]") WebElement nationalEdit;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input") WebElement nationalEditName;
	@FindBy(xpath="//button[contains(.,'Save')]") WebElement nationalEditSave;
	
	
	
	//--------------------------------------------------------------------------------------------
	//Constructor
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-----------------------
	//Admin Job
	
	public void clickAdmin() {
		//Admin
		admin.click();
	}
	public void clickJob() {
		//Job
		job.click();
	}
	public void clickJobTitles() {
		//Job Titles
		jobTitles.click();
	}
	public void clickAddButton() {
		//Add Button
		addButton.click();
	}
	public void setJobTitle(String jobTit) {
		//Job Title
		jobTitleInput.sendKeys(jobTit);
	}
	public void setJobDescription(String jobDescr) {
		//Job Description
		jobDescription.sendKeys(jobDescr);
	}
	public void clickSaveButton() {
		//submit
		saveButton.click();
	}
	
	//------------------------------
	//Admin Organization
	public void clickOrganization() {
		//Admin Organization
		adminOrganization.click();
	}
	public void clickOrganizationLocation() {
		//Organization Location
		organizationLocations.click();
	}
	public void setLocationName(String locName) {
		//Set Location Name
		organizationlocationName.sendKeys(locName);
	}
	public void setLocationCity(String locCity) {
		//Set Location City
		organizationlocationNameCity.sendKeys(locCity);
	}
	public void clickLocationCountryDropDown() {
		//LocationCountryDropDown
		locationCountryDropDown.click();
	}
	public void clicklocationCountryName() {
		//locationCountryName
		locationCountryName.click();
	}
	public void clickSearchButton() {
		//locationCountryName
		searchButton.click();
	}
	//-------------------------------------------------
	public void clickAdminUserManagement() {
		//clickAdminUserManagement
		adminUserManagement.click();
	}
	public void clickAdminUsers() {
		//clickAdminUsers
		adminUsers.click();
	}
	public void clickUserRoleDropDown() {
		//clickUserRoleDropDown
		userManagementUserRoleDropDown.click();
	}
	public void clickESSButton() {
		//clickUserRoleDropDown
		ESSButton.click();
	}
	public void setUserMngEmpName (String usrMngEmpName){
		//setUserMngEmpName
		userMngEmpName.sendKeys(usrMngEmpName);
	}
	
	public void clickJoeRootOption() {
		joeRootOption.click();
	}
	public void clickUserMngStatusDropDown (){
		userMngStatusDropDown.click();
	}
	 public void clickEnabledOption() {
		 enabledOption.click();
	 }
	//------------------------------------------------------
	//Organization Add Location
	 public void setAddOrgLocationName(String orgLocName) {
		 addOrgLocationName.sendKeys(orgLocName);
	 }
	 public void setAddOrgCityName(String orgCityName) {
		 addOrgCityName.sendKeys(orgCityName);
	 }
	 public void setAddOrgStateName(String orgStateName) {
		 addOrgStateName.sendKeys(orgStateName);
	 }
	 public void setAddOrgZipCode(String orgZipCode) {
		 addOrgZipCode.sendKeys(orgZipCode);
	 }
	 public void setAddOrgFaxNo(String orgFaxNo) {
		 addOrgFaxNo.sendKeys(orgFaxNo);
	 }
	 public void setAddOrgPhoneNo(String orgPhoneNo) {
		 addOrgPhoneNo.sendKeys(orgPhoneNo);
	 }
	 public void setAddOrgAddress(String orgAddress) {
		 addOrgAddress.sendKeys(orgAddress);
	 }
	 public void setAddOrgNotes(String orgNotes) {
		 addOrgNotes.sendKeys(orgNotes);
	 }
	 public void clickOrgCountryDropDown() {
		 orgCountryDropDown.click();
	 }
	 public void clickOrgIndiaOption() {
		 orgIndiaOption.click();
	 }
	 //---------------------
	//Admin Qualification->Skill Methods
	 
	 public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
		
		public void setAdmin() {
			admin.click();
		}
		public void setQualification() {
			qualification.click();
		}
		
		public void setSkill() {
			skill.click();
		}
		
		public void setSkillAdd() {
			skillAdd.click();
		}
		public void setSkillName(String name) {
			skillName.sendKeys(name);
		}
		public void setSkillDescription(String description) {
			skillDescription.sendKeys(description);
		}
		public void setSkillSave() {
			skillSave.click();
		}
		public void setSkillCancel() {
			skillCancel.click();
		}
		public void setSkillDel() {
			skillDel.click();
		}
		public void setSkillDelYes() {
			skillDelYes.click();
		}
		public void setSkillMul1() {
			skillMul1.click();
		}
		public void setSkillMul2() {
			skillMul2.click();
		}
		public void setSkillMul() {
			skillMul.click();
		}
		public void setSkillMulYes() {
			skillMulYes.click();
		}
		public void setSkillEdit() {
			skillEdit.click();
		}
		public void setSkillEditName(String name) throws Exception{
		
			Actions a=new Actions(driver);
			//a.doubleClick(skillEditName).build().perform();
	
			
			a.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))).build().perform();
			a.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).sendKeys(Keys.BACK_SPACE).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			skillEditName.sendKeys(name);
	      
	
		}
		public void setSkillEditDescription(String description) throws Exception {
			Actions a=new Actions(driver);
			//a.doubleClick(skillEditDescription).build().perform();
			
			//a.doubleClick(skillEditDescription).build().perform();
			a.doubleClick(driver.findElement(By.xpath("//textarea[contains(@placeholder,'Type description here')]"))).build().perform();
			a.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).sendKeys(Keys.BACK_SPACE).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			skillEditDescription.sendKeys(description);
		}
		
		public void setSkillEditSave() {
			skillEditSave.click();
		}
	 //--------------------------------------------------------------
		//Admin->Qualification->Education Methods
		public void setEducation() {
			education.click();
		}
		
		public void setEducationAdd() {
			educationAdd.click();
		}
		public void setEducationName(String name) {
			educationName.sendKeys(name);
		}
		
		public void setEducationSave() {
			educationSave.click();
		}
		public void setEducationCancel() {
			educationCancel.click();
		}
		public void setEducationDel() {
			educationDel.click();
		}
		public void setEducationDelYes() {
			educationDelYes.click();
		}
		public void setEducationMul1() {
			educationMul1.click();
		}
		public void setEducationMul2() {
			educationMul2.click();
		}
		public void setEducationMul() {
			educationMul.click();
		}
		public void setEducationMulYes() {
			educationMulYes.click();
		}
		public void setEducationEdit() {
			educationEdit.click();
		}
		public void setEducationEditName(String name) throws Exception {
		
			Actions a=new Actions(driver);
			//a.doubleClick(educationEditName).build().perform();
			//a.doubleClick(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))).build().perform();
			
			a.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))).build().perform();
			a.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).sendKeys(Keys.BACK_SPACE).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			educationEditName.sendKeys(name);
			
			
		}
		
		
		public void setEducationEditSave() {
			educationEditSave.click();
		}
		//------------------------------------------------------------------
		//Admin-->National-Methods
		
		public void setNational() {
			national.click();
		}
		
		public void setNationalAdd() {
			nationalAdd.click();
		}
		public void setNationalName(String name) {
			nationalName.sendKeys(name);
		}
		
		public void setNationalSave() {
			nationalSave.click();
		}
		public void setNationalCancel() {
			nationalCancel.click();
		}
		public void setNationalDel() {
			nationalDel.click();
		}
		public void setNationalDelYes() {
			nationalDelYes.click();
		}
		public void setNationalMul1() {
			nationalMul1.click();
		}
		public void setNationalMul2() {
			nationalMul2.click();
		}
		public void setNationalMul() {
			nationalMul.click();
		}
		public void setNationalMulYes() {
			nationalMulYes.click();
		}
		public void setNationalEdit() {
			nationalEdit.click();
		}
		public void setNationalEditName(String name) throws Exception {
		
			Actions a=new Actions(driver);
			//a.doubleClick(nationalEditName).build().perform();
			a.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))).build().perform();
			
			//a.doubleClick(driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))).build().perform();
			a.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).sendKeys(Keys.BACK_SPACE).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			nationalEditName.sendKeys(name);
			
			
		}
		
		
		public void setNationalEditSave() {
			nationalEditSave.click();
		}
		
		
		
	//---------------------------------------------------------------------------	
		
}
