package org.kodiak.pages;

import java.util.List;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends BaseClass {

	// private WebDriver driver;

	@FindBy(how = How.XPATH, using = "//span[@id='LatestNewText']")
	public static WebElement latestNewsText;

	@FindBy(how = How.XPATH, using = "//*[@role='list']")
	public static List<WebElement> numberOfLatestNews;

	// @FindBy(xpath = "//*[text()='Kodiak Sciences(KOD) reports']")

	@FindBy(xpath = "//img[@alt='People in a casual meeting']")
	public static WebElement clickOnFirstNews;

	// K - kitchenMeals
	//@FindBy(how = How.XPATH, using = "//*[contains(@src,'https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/SiteAssets/Kitchen')]//parent::div")
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='K-Kitchen/Meals']")
	public static WebElement kkitchenMealsSection;

	@FindBy(how = How.XPATH, using = "//*[contains(@src,'https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/SiteAssets/Kitchen')]")
	public static WebElement kkitchenMealsImage;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='K-Kitchen/Meals']")
	public static WebElement kkitchenMealsTxt;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://kodiaksciences.sharepoint.com/sites/KNet-KitchenUAT']")
	public static WebElement kkitchen_VeiwBtn;
	

	// OURS Journey
	@FindBy(how = How.XPATH, using = "//*[contains(@src,'https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/KodiakAssets')]//parent::div")
	public static WebElement oursJoureySection;

	@FindBy(how = How.XPATH, using = "//*[contains(@src,'https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/KodiakAssets')]")
	public static WebElement ourJourneyBackgroundImage;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='OUR JOURNEY']")
	public static WebElement ourJourneyTxt;

	//@FindBy(how = How.XPATH, using = "//a[@href='https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/SitePages/Our-Journey.aspx']")
	@FindBy(how = How.XPATH, using = "//a[@href='https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/SitePages/Our-Journey.aspx']")
	public static WebElement ourJourneyViewButton;

	// Wheather Section
	// @FindBy(xpath = "//div[@data-automation-id='weather-card-wrapper']")
	// public static WebElement wheatherSection;

	// div[text()='Palo Alto, CA']
	@FindBy(xpath = "//div[@data-automation-id='weather-card-wrapper']")
	public static WebElement wheatherSection;

	@FindBy(xpath = "//*[text()='Palo Alto, CA']")
	public static WebElement currentWheatherLocation;

	@FindBy(xpath = "//button[normalize-space()='°F']")
	public static WebElement UnitMeasurmentF;

	@FindBy(xpath = "//div[@class='c_a_98d8a262']")
	public static WebElement AllDataOutbox;

	// Press Releases
	@FindBy(xpath = "//span[@id='PressReleaseText']")
	public static WebElement pressReleaseText;

	@FindBy(xpath = "//a[@id='PressReleaseviewall']")
	public static WebElement viewAllText;

	@FindBy(xpath = "//div[@id='spPageChromeAppDiv']//li")
	public static List<WebElement> numberOfPressReleases;

	@FindBy(xpath = "//div[contains(@class,'slideWrapper_85e5d6e4 slideFromLeft_85e5d6e4')]//img")
	public static List<WebElement> numberOfImages;

	@FindBy(xpath = "//img[@class='ms-Image-image is-loaded ms-Image-image--cover ms-Image-image--portrait is-fadeIn image-498']")
	public static WebElement imagesLists;

	@FindBy(xpath = "//div[@id='spPageChromeAppDiv']//li")
	public static WebElement titleOfImagesOfPressRelease;

	@FindBy(xpath = "//div[class='slideWrapper_85e5d6e4 slideFromLeft_85e5d6e4'] span[class='title_85e5d6e4']")
	public static WebElement pressReleaseTextLink;

	@FindBy(xpath = "//*[@class='customFieldTiles_e80e508a']//img")
	public static List<WebElement> numberOfPressReleaseVIewAllOnPages;

	@FindBy(xpath = "//span[@class='title_85e5d6e4']")
	public static WebElement clickOnPressReleaseLink;

	@FindBy(xpath = "//*[@class='sp-card-imageContainer']//img")
	public static List<WebElement> pressRleaseListOfImages;

	// My Applications
	@FindBy(xpath = "//div[@class='applications_e16e4337']//a")
	public static List<WebElement> myApplicationsLists;

	@FindBy(xpath = "//div[@class='//div[@id='MyApplicationTextHeading']//span[@id='UpcomingEventsText']")
	public static WebElement myApplicationsHeadingText;

	// Peaople search

	@FindBy(xpath = "//input[@placeholder='Find Colleague']")
	public static WebElement peopleSearchTextBox;

	@FindBy(xpath = "//div[@class='template--header']")
	public static WebElement peopleSearchTextBox_OutSideClick;

	@FindBy(xpath = "//i[contains(text(),'')]")
	public static WebElement searchIconBtn;

	@FindBy(xpath = "//div[@class='template']//ul//li")
	public static List<WebElement> listsOfUsers;

	@FindBy(xpath = "//div[@class='template']//ul//li")
	public static WebElement validUser;

	// News Banner Reel
	@FindBy(xpath = "//a[@href='https://kodiaksciences.sharepoint.com/sites/Intranet-UAT/SitePages/Our-Journey.aspx']")
	public static WebElement kitehcnViewBtn;

	@FindBy(xpath = "//a[@href='https://kodiaksciences.sharepoint.com/sites/KNet-KitchenUAT']")
	public static WebElement kitehcnViewBtnNew;

	@FindBy(xpath = ".//*[@class='carouselImage_85e5d6e4 staticDetails_85e5d6e4']//div//img")
	public static WebElement bannerimagesKitchen;

	@FindBy(xpath = ".//*[@class='details_85e5d6e4']//span")
	public static WebElement weeklyMenuLnk;

	@FindBy(xpath = ".//*[@class='details_85e5d6e4']//span")
	public static WebElement bannerSection;

	@FindBy(xpath = "//div[@title='Weekly Menu']")
	public static WebElement bannerSectionText;

	@FindBy(xpath = ".//*[@class='indicators_85e5d6e4 circle_85e5d6e4']//li[2]")
	public static WebElement weeklyMenuLink_Banner;

	@FindBy(xpath = ".//*[@class='details_85e5d6e4']//span[text()='Coffee and Tea']")
	public static WebElement cofeeAndTea_txt;

	// FAQ
	//@FindBy(xpath = ".//*[@class='ms-SearchBox-iconContainer iconContainer-248']//i[@data-icon-name='Search']")
	
	@FindBy(xpath = ".//i[@data-icon-name='Search']")
	public static WebElement searchFAQBoxKitchen_TxtBx;

	@FindBy(xpath = "//h3[normalize-space()='What is the Lunch process?']")
	public static WebElement accordio_clk;

	@FindBy(xpath = "//div[contains(text(),'The Kodiak Kitchen lunch service goes from 11:30am')]")
	public static WebElement accordio_innerSearchTx;

	// Submit Service Request
	@FindBy(xpath = "//*[@class='headerDiv_e72c069a']//*[text()='Submit Service Request']")
	public static WebElement submitServiceRequest;

	@FindBy(linkText = "//*[@class='linkItemContainer_e72c069a']//a[text()='Facilities Support']")
	public static WebElement facilitiesSupportText;

	//
	@FindBy(xpath = ".//*[@aria-label='Organization submenu']//i")
	public static WebElement mouseOverOrg;

	@FindBy(xpath = "//span[normalize-space()='Human Resources']")
	public static WebElement mouseOverOrgHR;

	@FindBy(linkText = "//*[@class='Supportcontainer']//a//img")
	public static WebElement zenefitPage;

	@FindBy(how = How.XPATH, using = "//span[@id='LatestNewviewall']")
	public WebElement latestNewsViewAll;

	@FindBy(how = How.XPATH, using = "//span[@id='id__60']")
	public WebElement latestNewsAllData;

	@FindBy(how = How.XPATH, using = "//div[@id='UpcomingEventsTextHeading']//*[@id='UpcomingEventsText']")
	public WebElement myApplications;

	@FindBy(how = How.XPATH, using = "//span[@id='MyApplicationviewall']//a")
	public WebElement myApplicationsViewAll;

	@FindBy(how = How.XPATH, using = "//*[@class='applications_e16e4337']//a")
	public List<WebElement> myApplicationsData1;

	@FindBy(how = How.XPATH, using = "//span[@id='id__16']")
	public WebElement editlink;

	@FindBy(how = How.XPATH, using = "//button[@name='Republish']")
	public WebElement republishLink;

	@FindBy(how = How.XPATH, using = "//button[@name='Republish']")
	public WebElement headerNavigationButton;

	@FindBy(how = How.XPATH, using = "//button[@name='New']")
	public WebElement newMenuItemLink;

	@FindBy(how = How.XPATH, using = "//*[@class=\"ms-ContextualMenu-list is-open list-280\"]//li")
	public List<WebElement> contextualMenulists;

	@FindBy(how = How.XPATH, using = "//span[@id='id__7']")
	public WebElement pageDetailsLink;

	@FindBy(how = How.XPATH, using = "//span[@id='id__10']")
	public WebElement analyticsLink;

	@FindBy(how = How.XPATH, using = "//div[@class='carouselItemWrapper']")
	public List<WebElement> upcomingEventsItemLists;

	@FindBy(how = How.XPATH, using = "//i[@title='Next']")
	public WebElement nextLink;

	@FindBy(how = How.XPATH, using = "//i[@title='Previous']")
	public WebElement previousLink;

	@FindBy(xpath = "//div[@id='mectrl_headerPicture']")
	public static WebElement logout;
	

	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public static WebElement clickOnHomepageLink;
	
	@FindBy(xpath = "//a[normalize-space()='Facilities Support']")
	public static WebElement clickOnFacilitesSupportLink;
	
	@FindBy(xpath = "//div[@class='nvEhuDKzSmREBsqaIaOhu']")
	public static WebElement clickOn_STTOlogout;

	@FindBy(xpath = "//a[@id='mectrl_body_signOut']")
	public static WebElement clickOn_logoutLink;
	
	// *[contains(@for,'ChoiceGroup52-)]

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		PageFactory.initElements(driver, this);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnLogOutButton() {
		logout.click();
	}

	public static void clickOnHomepageLink() {
		clickOnHomepageLink.click();

	}

}
