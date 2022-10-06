package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//------------------
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {
	 Logger logger = LogManager.getLogger(PerformancePage.class.getName());
		WebDriver driver;
		//testDisplayPage obj;

		    
		  //manage reviews
			//employee name
			@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
			WebElement empName;
		    
		  //performnace
			//@FindBy(css = "div.oxd-layout div.oxd-layout-navigation aside.oxd-sidepanel nav.oxd-navbar-nav div.oxd-sidepanel-body ul.oxd-main-menu:nth-child(2) li.oxd-main-menu-item-wrapper:nth-child(7) > a.oxd-main-menu-item.active")
			@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]")
			WebElement performance;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper div.oxd-select-text.oxd-select-text--active > div.oxd-select-text-input")
			WebElement jobTitle;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper > div.oxd-select-text.oxd-select-text--active")
			WebElement subUnit;
			
			//review status
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-grid-4.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters.--offset-row-2:nth-child(5) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-select-wrapper > div.oxd-select-text.oxd-select-text--active")
			WebElement statusReview;
			
			@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
			WebElement search;
			

			@FindBy(xpath = "//a[contains(text(),'My Trackers')]")
			WebElement myTrackers;
			
			@FindBy(css="div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container div.orangehrm-container:nth-child(3) div.oxd-table div.oxd-table-body div.oxd-table-card div.oxd-table-row.oxd-table-row--with-border.oxd-table-row--clickable div.oxd-table-cell.oxd-padding-cell:nth-child(4) div.oxd-table-cell-actions > button.oxd-button.oxd-button--medium.oxd-button--text.oxd-table-cell-action-space")
			WebElement view;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-header-container > button.oxd-button.oxd-button--medium.oxd-button--secondary")
			WebElement addLogs;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active")
			WebElement setLog;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-row:nth-child(2) div.orangehrm-add-tracker-log-ratings-container > button.oxd-button.oxd-button--medium.oxd-button--text.orangehrm-tracker-rating-button:nth-child(2)")
			WebElement button;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > textarea.oxd-textarea.oxd-textarea--active.oxd-textarea--resize-vertical")
			WebElement comment;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-actions.orangehrm-form-action:nth-child(5) > button.oxd-button.oxd-button--medium.oxd-button--secondary:nth-child(3)")
			WebElement save;
			
			//@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-container div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gray-lighten-2.orangehrm-scroll-card div.orangehrm-employee-tracker-log div.orangehrm-employee-tracker-log-content-section div.orangehrm-employee-tracker-log-content-container div.orangehrm-employee-tracker-log-header li.oxd-table-dropdown button.oxd-icon-button > i.oxd-icon.bi-three-dots-vertical")
			@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/li[1]/button[1]/i[1]")
			WebElement select;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-container div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gray-lighten-2.orangehrm-scroll-card div.orangehrm-employee-tracker-log div.orangehrm-employee-tracker-log-content-section div.orangehrm-employee-tracker-log-content-container div.orangehrm-employee-tracker-log-header li.--active.oxd-table-dropdown ul.oxd-dropdown-menu li.oxd-table-dropdown-item:nth-child(1) > p.oxd-text.oxd-text--p")
			WebElement clickEdit;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-row:nth-child(2) div.orangehrm-add-tracker-log-ratings-container > button.oxd-button.oxd-button--medium.oxd-button--text.orangehrm-tracker-rating-button:nth-child(1)")
			WebElement edit;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered:nth-child(4) div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters form.oxd-form div.oxd-form-actions.orangehrm-form-action:nth-child(5) > button.oxd-button.oxd-button--medium.oxd-button--secondary:nth-child(3)")
			WebElement editSave1;
			
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-container div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gray-lighten-2.orangehrm-scroll-card div.orangehrm-employee-tracker-log div.orangehrm-employee-tracker-log-content-section div.orangehrm-employee-tracker-log-content-container div.orangehrm-employee-tracker-log-header li.oxd-table-dropdown button.oxd-icon-button > i.oxd-icon.bi-three-dots-vertical")
			WebElement select1;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-container div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gray-lighten-2.orangehrm-scroll-card div.orangehrm-employee-tracker-log div.orangehrm-employee-tracker-log-content-section div.orangehrm-employee-tracker-log-content-container div.orangehrm-employee-tracker-log-header li.--active.oxd-table-dropdown ul.oxd-dropdown-menu li.oxd-table-dropdown-item:nth-child(2) > p.oxd-text.oxd-text--p")
			WebElement delete;
			
			@FindBy(css = "div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered div.oxd-dialog-container-default div.oxd-dialog-container-default--inner div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.oxd-dialog-sheet.oxd-dialog-sheet--shadow.oxd-dialog-sheet--gutters.orangehrm-dialog-popup div.orangehrm-modal-footer > button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin:nth-child(2)")
			WebElement accept;
			
			//employee performance trackers
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-navigation header.oxd-topbar div.oxd-topbar-body nav.oxd-topbar-body-nav li.--active.oxd-topbar-body-nav-tab:nth-child(3) ul.oxd-dropdown-menu div:nth-child(2) li:nth-child(1) > a.oxd-topbar-body-nav-tab-link.--more")
			WebElement performanceTrack;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-row div.oxd-grid-3.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active > input:nth-child(2)")
			WebElement eName;
			
			@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.oxd-table-filter:nth-child(1) div.oxd-table-filter-area form.oxd-form div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space:nth-child(2)")
			WebElement performaceSearch;
			
			
			 public PerformancePage(WebDriver driver)
				{
					this.driver=driver;
					PageFactory.initElements(driver,this);
				}
		
		
		public void performanceClick() throws InterruptedException
		{
			performance.click();
			
			
			//setEmplyoeeName
			
			empName.sendKeys("c");
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.ENTER).build().perform();
			
			//setJobTitle
			jobTitle.click();
		//	Thread.sleep(5000);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.DOWN);
			act.sendKeys(Keys.DOWN);
			act.sendKeys(Keys.DOWN);
			act.sendKeys(Keys.ENTER).build().perform();
			
			//setSubUnit
			subUnit.click();
		//	Thread.sleep(5000);
			Actions a = new Actions(driver);
			a.sendKeys(Keys.DOWN);
			a.sendKeys(Keys.DOWN);
			a.sendKeys(Keys.ENTER).build().perform();
			
			//statusReview
			statusReview.click();
			Actions b = new Actions(driver);
		//	Thread.sleep(5000);
			b.sendKeys(Keys.DOWN);
			b.sendKeys(Keys.DOWN);
			b.sendKeys(Keys.DOWN);
			b.sendKeys(Keys.ENTER).build().perform();
			
			//search
			search.click();
			//myTrackers
		//	Thread.sleep(5000);
			logger.info("Performance is set");
		}
		
		
		
		@FindBy(xpath="//a[contains(text(),'Employee Trackers')]")
		WebElement EmpTracker;
		
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
		WebElement full;
		
		public void eName() throws InterruptedException
		{
			EmpTracker.click();
			Actions action = new Actions(driver);
			eName.sendKeys("c");
			Thread.sleep(5000);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.DOWN);
			action.sendKeys(Keys.ENTER).build().perform();
			
			//performaceSearch
			performaceSearch.click();
		//	Thread.sleep(5000);
			full.click();
		//	Thread.sleep(5000);
			logger.info("Employee name is set");
			
		}
		
		//@FindBy(css = "div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-paper-container:nth-child(3) div.orangehrm-container div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gray-lighten-2.orangehrm-scroll-card div.orangehrm-employee-tracker-log div.orangehrm-employee-tracker-log-content-section div.orangehrm-employee-tracker-log-content-container div.orangehrm-employee-tracker-log-header li.oxd-table-dropdown button.oxd-icon-button > i.oxd-icon.bi-three-dots-vertical")
		//WebElement dots;
		
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/li[1]/ul[1]/li[1]")
		WebElement editClick;
		
	    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]")
	    WebElement positiveButton;
	    
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/li[1]/ul[1]/li[2]/p[1]")
		WebElement deleteButton;
		
		@FindBy(xpath = "//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")
		WebElement yesButton;
		
			
		public void myTrackers(String Log, String Comment) throws InterruptedException
		{
			myTrackers.click();
		//	Thread.sleep(5000);
			view.click();
		//	Thread.sleep(5000);
			//addLog
			addLogs.click();
		//	Thread.sleep(5000);
			//setLog
			setLog.sendKeys(Log);
		//	Thread.sleep(5000);
			//setBotton
			button.click();
		//	Thread.sleep(5000);
			//setComment
			comment.sendKeys(Comment);
		//	Thread.sleep(5000);
			//clickSave
			save.click();
		//	Thread.sleep(5000);
			logger.info("My Tracker is set");
		/*	//select
			select.click();
			Thread.sleep(5000);
			//clickEdit
			clickEdit.click();
			Thread.sleep(5000);
			//edit
			edit.click();
			//editSave
			editSave1.click();
			
			//select1
			select1.click();
			Thread.sleep(5000);
			//clickDelete
			delete.click();
			Thread.sleep(5000);
			//clickAccept
			accept.click();
			Thread.sleep(5000);
			//empTrackers
			performanceTrack.click();
			Thread.sleep(5000); 
			eName.sendKeys("c"); 
			Actions action=new Actions(driver);
	        action.sendKeys(Keys.DOWN);
	        action.sendKeys(Keys.DOWN);
	        action.sendKeys(Keys.DOWN);
	        action.sendKeys(Keys.ENTER).build().perform(); 
	        performaceSearch.click();
	        
	       
	       */ 
	        
		}
		
		
		
		
	}

	


	

