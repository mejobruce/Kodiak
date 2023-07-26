package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.*;

public class HRPage extends BaseClass {

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')]//following::*[text()='Events']")
	public static WebElement hrEvents;

	@FindBy(xpath = ".//*[@class='carouselItemWrapper']")
	public static List<WebElement> hrEventsLists;

	// .//*[@class='ae_c_ce1e465e ac_c_ce1e465e']//span["+"]
	@FindBy(xpath = ".//*[@class='ae_c_ce1e465e ac_c_ce1e465e']//span")
	public static List<WebElement> hrEventsCurrentDate;

	@FindBy(xpath = "//*[@class='ae_c_ce1e465e ac_c_ce1e465e']")
	public static WebElement hrEventsBackGroundImage;

	@FindBy(xpath = "//span[@role='heading']")
	public static WebElement hrEventsHeadingText;

	@FindBy(xpath = "//a[normalize-space()='See all']")
	public static WebElement hrEventsSeeAll;

	@FindBy(xpath = ".//*[@class='ms-Stack ms-CardSection css-200']//span[2]")
	public static List<WebElement> hrEventsLocation;

	// HR Quick Links
	@FindBy(xpath = ".//*[@class='headerDiv_7ab39e1e']//*[text()='Quick Links']")

	public static WebElement hrQuickLinks;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Life Insurance / Disability']")
	public static WebElement hr_LifeInsuranceDisabilityquicklink;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Cigna Website1']")
	public static WebElement hr_CignaWebsiteQuicklink;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Apple App Store']")
	public static WebElement hr_CignaAppAppleAppStore;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Google Play']")
	public static WebElement hr_CignaAppGooglePlayStore;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='MetLife Website']")
	public static WebElement hr_MetLifeWebsite;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Optum Website']")
	public static WebElement hr_OptumWebsite;

	@FindBy(xpath = "//div[normalize-space()='Quick Links']//following::*[text()='Igoe Website']")
	public static WebElement hr_Igoe;
	
	@FindBy(xpath = "//*[text()='Onboarding']")
	public static WebElement hr_Onboarding;
	
	
	@FindBy(linkText = "Onboarding FAQ")
	public static WebElement hr_Onboarding_FAQ;
	
	@FindBy(xpath = ".//*[@class='link_07fca4d8']//*[text()='Benefits Snapshot']")
	public static WebElement hr_Benefits_Snapshot;
	
	@FindBy(xpath = ".//*[@class='link_07fca4d8']//*[text()='Carrier contact sheet']")
	public static WebElement hr_Carrier_contact;
	
	@FindBy(xpath = ".//*[@class='link_07fca4d8']//*[text()='Charitable Giving']")
	public static WebElement hr_Charitable;
	
	@FindBy(xpath = "//a[@href='https://kodiaksciences.sharepoint.com/sites/Knet-HR-UAT/Lists/OnboardingLinks/AllItems.aspx']")
	public static WebElement hr_Onboarding_View;
	
	
	//HR
	@FindBy(xpath = "//span[normalize-space()='HR']")
	public static WebElement hr_sectionText;
	
	@FindBy(xpath = "//span[contains(text(),'Company Holidays')]")
	public static WebElement hr_companyHoliday_Section;
	
	@FindBy(xpath = "//span[contains(text(),'Change Personal Info')]")
	public static WebElement hr_changePersonalInfo_Section;
	
	@FindBy(xpath = "//span[contains(text(),'401k')]")
	public static WebElement hr_401k_Section;
	
	@FindBy(xpath = "//span[contains(text(),'Update Tax Forms')]")
	public static WebElement hr_updateTaxForms_Section;
	
	@FindBy(xpath = "//span[contains(text(),'Submit PTO Request')]")
	public static WebElement hr_submitPTORequest_Section;
	
	
	@FindBy(xpath = "//span[contains(text(),'Employee Stock Plan Questions')]")
	public static WebElement hr_EmployeestockPlan_Section;
	
	@FindBy(xpath = "//span[normalize-space()='2023 U.S. Holiday Schedule + Holiday Shutdown Days']")
	public static WebElement hr_USHolidayzlist;
	
	@FindBy(xpath = "//span[normalize-space()='Switzerland: 2023 CH Holiday Schedule']")
	public static WebElement hr_Switzerland;
	
	//Benefits
	@FindBy(xpath = "//span[normalize-space()='Benefits']")
	public static WebElement hr_benefits;
	
	@FindBy(xpath = "//span[contains(text(),'Medical/Vision/Dental')]")
	public static WebElement hr_MedicalVisionDental;
	
	@FindBy(xpath = "//span[contains(text(),'HSA')]")
	public static WebElement hr_HSA;
	
	@FindBy(xpath = "//span[contains(text(),'FSA')]")
	public static WebElement hr_FSA;
	
	@FindBy(xpath = "//span[contains(text(),'Life Insurance/Disability')]")
	public static WebElement hr_LifeInsurance;
	
	@FindBy(xpath = "//span[contains(text(),'Life Event Change')]")
	public static WebElement hr_LifeEvent;
	
	
	//HR Traning and Career 
	@FindBy(xpath = "//div[normalize-space()='Training and Career']")
	public static WebElement hr_trainingandCareer;
	
	@FindBy(xpath = "//div[contains(text(),'Organization Chart')]")
	public static WebElement hr_organizationChart;
	
	@FindBy(xpath = "//div[contains(text(),'Open Positions')]")
	public static WebElement hr_openPossitions;
	
	@FindBy(xpath = "//div[contains(text(),'Refer Someone')]")
	public static WebElement hr_ReferSomeone;
	
	@FindBy(xpath = "//div[contains(text(),'Fitness')]")
	public static WebElement hr_fitness;
	
	
	
	
	

	public HRPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		// PageFactory.initElements(driver, this);
	}
}
