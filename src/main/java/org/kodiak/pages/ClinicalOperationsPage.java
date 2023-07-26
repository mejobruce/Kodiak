package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.*;

public class ClinicalOperationsPage extends BaseClass {

	/*******************************************************************************************************************************************************************************************************************
   'Created By	    : Nagraj Reballi						
   'Created On		: June-2023				
   'Last Updated By	: June-2023	
   'Last Updated On	: June-2023	
   'Purpose			: For Object repository and initialize of an objects
   '**********************************************************************************************************************************************************/
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Clinical Operations']")
	public static WebElement clinicalOperations_Pagetext;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Clinical Operations']")
	public static WebElement clinicalOperations_PageBodyTxt;
	

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Vendor/study list']")
	public static WebElement clinicalOperations_VendorSection;
	
	@FindBy(how = How.XPATH, using = ".//*[@placeholder='Search study/vendors']")
	public static WebElement clinicalOperations_CLickonSearchTextboxLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'COVID-19')]")
	public static WebElement clinicalOperations_clickanyoneOfvendor;

	//OpenChart
	@FindBy(how = How.XPATH, using ="//a[@href='/sites/KNet-ClinicalOperations-UAT/SitePages/Org-Chart.aspx']//div[@role='presentation']")
	public static WebElement clinicalOperations_OrgOpenChartSection;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Clinical Operations Org Chart']")
	public static WebElement clinicalOperations_PageHeadingText;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Clinical Ops Org Chart']")
	public static WebElement clinicalOperations_PageHeadingText_Kvault;
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@role='presentation']//img[@src='blob:https://kodiaksciences.sharepoint.com/29d27899-90eb-4c92-8e2a-f84a5ec4d079']")
	public static WebElement clinicalOperations_OrgOpenChart;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/sites/KNet-ClinicalOperations-UAT/SitePages/Coming-Soon.aspx']//div[@role='presentation']")
	public static WebElement clinicalOperations_kvaultClinical;
	
	//Upcoming Datacuts
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Upcoming Datacuts']")
	public static WebElement clinicalOperations_upcomingDatacutsSection;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@aria-label,'Event Datacut Strategies. Starts on')]")
	//public static List<WebElement> clinicalOperations_upcomingdatacutsLists;
	public static WebElement clinicalOperations_upcomingdatacutsLists;
	
	//FAQ
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='FAQs']")
	public static WebElement clinicalOperations_faqm;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='accordion__item']//h3")
	public static List<WebElement> clinicalOperations_faqmLists;
	//public static WebElement clinicalOperations_faqmLists;
	
	@FindBy(how = How.XPATH, using = ".//*[text()='']//input[contains(@id,'SearchBox')]")
	public static WebElement clinicalOperations_searchItmFAQ;
	
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='What Is Clinical Research?']")
	public static WebElement clinicalOperations_searchClinicalResearch;
	
	
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Key Contacts']")
	public static WebElement clinicalOperations_FAQSection;
	
	@FindBy(how = How.XPATH, using = "//*[@href='https://kodiaksciences.sharepoint.com/sites/KNet-ClinicalOperations-UAT/Lists/Key%20Contacts/AllItems.aspx']")
	public static WebElement clinicalOperations_FAQVIEWALL;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Important Announcement']")
	public static WebElement digitalTransformation_ImportantAnnouncement;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='header_303765f8']//h3")
	public static WebElement digitalTransformation_text;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='content_303765f8']")
	public static WebElement digitalTransformation_Descritpion;
	
	
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='Security Updates']")
	public static WebElement digitalTransformation_securityUpdate;
	
	@FindBy(how = How.XPATH, using = ".//*[text()='Key Contacts']")
	public static WebElement digitalTransformation_keyCOntacts;
	
	@FindBy(how = How.XPATH, using = "//a[@href='cressi@kodiak.com']")
	public static WebElement digitalTransformation_keyCOntactsViewAll;
	
	@FindBy(xpath = "//span[contains(text(),'No data found!')]")
	public static WebElement digitalTransformation_NodataFoundSearch;
	
	
	//Upcoming Events/Meetings
	@FindBy(xpath = "//span[normalize-space()='Upcoming Events/Meetings']")
	public static WebElement digitalTransformation_UpcomingEventsMeetings;
	
	@FindBy(xpath = ".//*[@role='User is in Clinical Operation Page']//div[@class='ms-List-page']")
	public static WebElement digitalTransformation_UpcomingEventsMeetingsLists;
	
	
	
	public ClinicalOperationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		// PageFactory.initElements(driver, this);
	}
}
