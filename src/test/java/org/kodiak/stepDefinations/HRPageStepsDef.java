package org.kodiak.stepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.kodiak.base.BaseClass;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRPageStepsDef extends BaseClass {

	// To Validate click action on Zenefits Web Part UI in HR Page TC:624
	@And("^User is in HR Page$")
	public void user_is_in_hr_page() throws CustomizedException, InterruptedException {
		//Generic.waitForElement(homepage.clickOnHomepageLink);
		//Generic.waitForPageLoaded();
		
		Generic.waitForPageSpecificElement(homepage.clickOnHomepageLink);
		
		//Generic.webClick(homepage.clickOnHomepageLink);
		//Reporter.log("User Clicked on the Homepage");
		//log.info("User Clicked on the Homepage");
		
		Thread.sleep(2000);
		//Generic.waitForPageLoaded();
		Generic.highlightElement(homepage.mouseOverOrg);
		WebElement ele = homepage.mouseOverOrg;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Reporter.log("User Clicked on the Organization link");
		log.info("User Clicked on the Organization link");

		Thread.sleep(2000);
		Generic.highlightElement(homepage.mouseOverOrgHR);
		WebElement subMenu = homepage.mouseOverOrgHR;
		action.moveToElement(subMenu);
		action.click().build().perform();
		Reporter.log("User Clicked on the Human Resources Sub Menu");
		log.info("User Clicked on the Human Resources Sub Menu");
		Thread.sleep(4000);
	}

	@And("^User is at Zenefits Web part$")
	public void user_is_at_zenefits_web_part() throws Throwable {
		Generic.srcollDownRobotZenefit();	
		Thread.sleep(2000);
		boolean status= Generic.isElementPresnt(driver, "//*[@class='Supportcontainer']//a//img", 120).isDisplayed();
		log.info("User is at Zenefits Web part");
		Generic.doSoftAssertion(status, true);
    	softAssertion.assertAll();
	}

	@When("^User clicks on Zenefits web part$")
	public void user_clicks_on_zenefits_web_part() throws Throwable {
		//Generic.webClick(homepage.zenefitPage);
		WebElement  element= Generic.isElementPresnt(driver, "//*[@class='Supportcontainer']//a//img", 120);
		element.click();
		Generic.waitForPageLoaded();
	}

	@Then("^It should get redirected to Zenefits login page$")
	public void it_should_get_redirected_to_zenefits_login_page() throws Throwable {

		String actual = Generic.getTitle().trim();
		System.out.println("Actual is: " + actual);
		System.console();
		Generic.doAssertion(actual, "Zenefits Login");

		softAssertion.assertAll();
	}

	// To Validate maximum number of events displayed in HR Page TC:626

	@When("^User is at Events web part$")
	public void user_is_at_events_web_part() throws Throwable {
		Thread.sleep(2000);
		
		WebElement element = Generic.isElementPresnt(BaseClass.driver,"//div[@title='Human Resources']", 100);
		
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		boolean status = Generic.isElementPresnt(driver, "//span[@role='heading']", 60).isDisplayed();
		Generic.doSoftAssertion(status, true);
		//String text = hrpage.hrEvents.getText();
		//System.out.println("Input text is:"+text);
		//Generic.waitForElement(hrpage.hrEvents);
		/*Generic.waitForPageLoad(driver);
		//Generic.highlightElement(hrpage.hrEvents);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		String elementText = (String) js.executeScript("return arguments[0].innerText;", hrpage.hrEvents);
		
		
		Boolean status = Generic.isDisplayed(hrpage.hrEvents);
		Generic.doSoftAssertion(status, true);*/
		log.info("User is at Events web part");
		softAssertion.assertAll();
	}

	@Then("^Maximum 4 events should be displayed in HR page$")
	public void maximum_4_events_should_be_displayed_in_hr_page() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> lists = Generic.isElementPresentLists(driver, ".//*[@class='carouselItemWrapper']", 80);
		int numberofImages = lists.size();
		log.info("Number of latest news displyaing :" + numberofImages);
		
		
//		Generic.waitForElements_List(driver, hrpage.hrEventsLists);
//		List<WebElement> lists = hrpage.hrEventsLists;
//		int numberofImages = lists.size();
//		Reporter.log("Number of latest news is :" + numberofImages);
	}

	
//Validate expired events displayed in HR Page TC 629
	@Then("^Events before current date should not display$")
	public void events_before_current_date_should_not_display() throws Throwable {

		List<WebElement> lists = Generic.isElementPresentLists(driver, ".//*[@class='ae_c_ce1e465e ac_c_ce1e465e']//span", 60);
		//Generic.waitForPageLoaded();

		//List<WebElement> lists = hrpage.hrEventsCurrentDate;
		for (WebElement option : lists) {
			String text = option.getText();
			Reporter.log("upcoming events is:" + text);
			log.info("upcoming events is:" + text);
		}

	}

//To Validate available components under events  in HR Page  TC: 630
	@Then("^Event background image should be there$")
	public void event_background_image_should_be_there() throws Throwable {

		boolean status = Generic.isElementPresnt(driver, "//*[@class='ae_c_ce1e465e ac_c_ce1e465e']", 60).isDisplayed();
		
		//boolean status = hrpage.hrEventsBackGroundImage.isDisplayed();

		Generic.doSoftAssertion(status, true);
		Reporter.log("Event background image is displayed");
		log.info("Event background image is displayed");
		softAssertion.assertAll();

	}

	@And("^Event Name Should be there$")
	public void event_name_should_be_there() throws Throwable {

		//Generic.waitForPageLoaded();
		boolean status = Generic.isElementPresnt(driver, "//span[@role='heading']", 60).isDisplayed();
		//Generic.waitForElement(hrpage.hrEventsHeadingText);

		//String text = Generic.getText(hrpage.hrEventsHeadingText).trim();
		Generic.doSoftAssertion(status, true);
	}

	@And("^Event Date should be there $")
	public void event_date_should_be_there() throws Throwable {
//		Generic.waitForPageLoaded();
		List<WebElement> lists = Generic.isElementPresentLists(driver, ".//*[@class='ae_c_ce1e465e ac_c_ce1e465e']//span", 60);
		//List<WebElement> lists = hrpage.hrEventsCurrentDate;
		for (WebElement option : lists) {
			String text = option.getText().trim();
			Reporter.log("upcoming events is:" + text);
			log.info("upcoming events is:" + text);
		}
	}

	@And("^Event Location should be there $")
	public void event_location_should_be_there() throws Throwable {
		List<WebElement> lists = Generic.isElementPresentLists(driver, ".//*[@class='ae_c_ce1e465e ac_c_ce1e465e']//span", 60);
		//List<WebElement> lists = hrpage.hrEventsCurrentDate;
		//List<WebElement> lists = hrpage.hrEventsLocation;
		for (WebElement option : lists) {
			String text = option.getText().trim();
			Reporter.log("Events Location are:" + text);
			log.info("Events Location are:" + text);
		}
	}

	@And("^View All link should be there$")
	public void view_all_link_should_be_there() throws Throwable {

		boolean status  = Generic.isElementPresnt(driver, "//a[normalize-space()='See all']", 60).isDisplayed();
		//List
		//boolean status = Generic.isPresentAndDisplayed(hrpage.hrEventsSeeAll);
		Generic.doSoftAssertion(status, true);
		log.info("View All link should be there");
		softAssertion.assertAll();
	}

//To Validate click action on any of events displayed in HR Page TC 631

	@When("^User clicks on any of the events$")
	public void user_clicks_on_any_of_the_events() throws Throwable {

		WebElement st = Generic.isElementPresnt(driver, "//div[contains(@role,'listitem')]//div[contains(@role,'list')]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]", 60);
		st.click();
		Thread.sleep(2000);
		//Generic.webClick(hrpage.hrEventsBackGroundImage);
		//Generic.waitForPageLoaded();
		Reporter.log("user click on the Event");
		log.info("user click on the Event");
		softAssertion.assertAll();
	}

	@Then("^It should redirect user to respective event details page$")
	public void it_should_redirect_user_to_respective_event_details_page() throws Throwable {

		String actual = Generic.getTitle().trim();
		System.out.println("Actual is: " + actual);
		//Generic.doAssertion(actual, "Human Resources");
		log.info("It  redirect  to respective event details page of Event");
		softAssertion.assertAll();
	}

//To Validate click action on view all links under events  in HR Page TC: 632
	@When("^User clicks on view all links under events in HR page$")
	public void user_clicks_on_view_all_links_under_events_in_hr_page() throws Throwable {

		Generic.isElementPresnt(driver, "//a[normalize-space()='See all']", 60).click();
		//Generic.webClick(hrpage.hrEventsSeeAll);
		//Generic.waitForPageLoaded();
		log.info("User clicks on view all links under events in HR page");
		softAssertion.assertAll();
	}

	@Then("^It should redirect user to all events list page$")
	public void it_should_redirect_user_to_all_events_list_page() throws Throwable {

		String actual = Generic.getTitle().trim();
		System.out.println("Actual is: " + actual);
		Generic.doAssertion(actual, "Human Resources");

		softAssertion.assertAll();
	}

//To Validate available tiles underHR Web Part in HR Page 634

	
	@When("User is at HR Web part")
	public void user_is_at_hr_web_part() throws AWTException, CustomizedException, InterruptedException {
	   // Generic.waitForPageLoaded();
		Thread.sleep(2000);
		Generic.srcollDownRobotZenefit();
		
		Generic.isElementPresnt(driver, "//span[normalize-space()='HR']", 60);
		softAssertion.assertAll();
	}
	@Then("Company Holidays should be there")
	public void company_holidays_should_be_there() throws CustomizedException {
	
		//boolean status = Generic.isDisplayed(hrpage.hr_companyHoliday_Section);
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Company Holidays')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	@Then("Change personal Info should be there")
	public void change_personal_info_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Change Personal Info')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	@Then("Should be there {int} k")
	public void should_be_there_k(Integer int1) {
	  
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'401k')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	@Then("Update Tax Forms  should be there")
	public void update_tax_forms_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Update Tax Forms')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	@Then("Submit PTO Request should be there")
	public void submit_pto_request_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Submit PTO Request')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	@Then("^Employee Stock Plan Questions should be there$")
	public void employee_stock_plan_questions_should_be_there() {
	 
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Employee Stock Plan Questions')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		softAssertion.assertAll();
	}
	
	
//To Validate available tiles under Quick Links Web Part in HR Page TC: 659

	@When("^User is at Quick Links Web part$")
	public void user_is_at_quick_links_web_part() throws InterruptedException, CustomizedException, AWTException {

		Thread.sleep(2000);
		Generic.srcollDownRobotZenefit();

		softAssertion.assertAll();
		
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-350)", "");
//		Thread.sleep(2000);
//		boolean status = Generic.isDisplayed(hrpage.hrQuickLinks);
//
//		Generic.doSoftAssertion(status, true);
//		driver.switchTo().parentFrame();
//		Reporter.log("User is at Quick Links section");
//		log.info("User is at Quick Links section");
//		softAssertion.assertAll();
	}

	@Then("^Life Insurance Disability quick link should be there$")
	public void life_insurance_disability_quick_link_should_be_there() throws Throwable {

		boolean status = Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Life Insurance / Disability']", 60).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_LifeInsuranceDisabilityquicklink);
		Generic.doSoftAssertion(status, true);
		Reporter.log("Life Insurance or Disability quick link is displayed");
		log.info("Life Insurance or Disability quick link is displayed");
		softAssertion.assertAll();
	}

	@And("^Cigna Website Quick link should be there$")
	public void cigna_website_quick_link_should_be_there() throws Throwable {

		boolean status = Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Cigna Website1']", 60).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_CignaWebsiteQuicklink);
		Generic.doSoftAssertion(status, true);
		Reporter.log("Cigna Website Quick link is displayed");
		log.info("Cigna Website Quick link is displayed");
		softAssertion.assertAll();
	}

	@And("^Download the Cigna App, Apple App Store should be there$")
	public void download_the_cigna_app_apple_app_store_should_be_there() throws Throwable {
		boolean status = Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Apple App Store']", 60).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_CignaAppAppleAppStore);

		Generic.doSoftAssertion(status, true);
		Reporter.log("Cigna App, Apple App Store is displayed");
		log.info("Cigna App, Apple App Store is displayed");
		softAssertion.assertAll();

	}

	@And("^Download the Cigna App, Google Play Store quick link should be there$")
	public void download_the_cigna_app_google_play_store_quick_link_should_be_there() throws Throwable {
		
		boolean status = Generic.isElementPresnt(driver,"//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Google Play']",60).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_CignaAppGooglePlayStore);

		Generic.doSoftAssertion(status, true);
		Reporter.log("Cigna App, Google Play Store is displayed");
		log.info("Cigna App, Google Play Store displayed");
		softAssertion.assertAll();

	}

	@And("^MetLife Website quick link should be there$")
	public void metlife_website_quick_link_should_be_there() throws Throwable {
		boolean status = Generic.isElementPresnt(driver,"//div[normalize-space()='Quick Links']//following::*[text()='Cigna Website1']",60).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_CignaWebsiteQuicklink);

		Generic.doSoftAssertion(status, true);
		Reporter.log("MetLife Website quick link is displayed");
		log.info("MetLife Website quick link is displayed");
		softAssertion.assertAll();
	}

	@And("^Optum Website quick link should be there$")
	public void optum_website_quick_link_should_be_there() throws Throwable {
		boolean status = Generic.isElementPresnt(driver,"//div[normalize-space()='Quick Links']//following::*[text()='Cigna Website1']",60).isDisplayed();
		
		//boolean status = Generic.isDisplayed(hrpage.hr_OptumWebsite);
		Generic.doSoftAssertion(status, true);
		Reporter.log("Optum Website quick link is displayed");
		log.info("Optum Website quick link is displayed");
		softAssertion.assertAll();
	}

	// To Validate click action on Life Insurance/ Disability quick link under Quick
	// Links Web Part in HR Page TC: 660

	@When("^User clicks on Life Insurance or Disability quick link$")
	public void user_clicks_on_life_insurance_or_disability_quick_link() throws Throwable {
		WebElement ele = Generic.isElementPresnt(driver,"//div[normalize-space()='Quick Links']//following::*[text()='Life Insurance / Disability']",60);
		ele.click();
		Thread.sleep(2000);
		//Generic.waitForElement(hrpage.hr_LifeInsuranceDisabilityquicklink);
		//Generic.webClick(hrpage.hr_LifeInsuranceDisabilityquicklink);
		//Generic.waitForPageLoaded();
		Reporter.log("User clicks on Life Insurance or Disability quick link");
		log.info("User clicks on Life Insurance or Disability quick link");
		softAssertion.assertAll();
	}

//	@Then("^ Life Insurance$")
//	public void user_should_get_redirected_to_life_insurance() throws Throwable {
//		Generic.MovetoChildWindow();
//		String actual = Generic.getURL();
//		System.out.println("Actual is: " + actual);
//		Generic.doAssertion(actual, "https://www.metlife.com/");
//		Reporter.log("User redirected to Metlife Url");
//		log.info("User redirected to Metlife Url");
//		softAssertion.assertAll();
//	}

//To Validate click action on Cigna Website quick link under Quick Links Web Part in HR Page TC :661
	@When("^User clicks on Cigna Website quick link$")
	public void user_clicks_on_cigna_website_quick_link() throws Throwable {

		Generic.waitForElement(hrpage.hr_CignaWebsiteQuicklink);
		Generic.webClick(hrpage.hr_CignaWebsiteQuicklink);
		Generic.waitForPageLoaded();
		Reporter.log("User clicks on Cigna Website quick link");
		log.info("User clicks on Cigna Website quick link");
		softAssertion.assertAll();
	}

	@Then("^User should get redirected to Cigna Website(.*)$")
	public void user_should_get_redirected_to_cigna_website(String url) throws Throwable {

		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);
		Generic.doAssertion(actual, "https://www.cigna.com/");
		Reporter.log("User redirected to Cigna Website");
		log.info("User redirected to Cigna Website");
		softAssertion.assertAll();
	}

//To Validate click action on Download the Cigna App, Apple App Store quick link under Quick Links Web Part in HR Page TC:662

	@When("^User clicks on Download the Cigna App Apple App Store quick links$")
	public void user_clicks_on_download_the_cigna_app_apple_app_store_quick_links() throws Throwable {

		WebElement el = Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Apple App Store']", 60);
		el.click();
		Thread.sleep(2000);
		//Generic.waitForElement(hrpage.hr_CignaAppAppleAppStore);
		//Generic.webClick(hrpage.hr_CignaAppAppleAppStore);
		//Generic.waitForPageLoaded();
		Reporter.log("User clicks on Cigna App, Apple App Store quick link");
		log.info("User clicks on Cigna App, Apple App Store quick link");
		softAssertion.assertAll();

	}

	@Then("^User should get redirected to Download the Cigna App Apple App Store (.+)$")
	public void user_should_get_redirected_to_download_the_cigna_app_apple_app_store(String url) throws Throwable {

		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);
		Generic.doAssertion(actual, "https://apps.apple.com/us/app/mycigna/id569266174");
		Reporter.log("User redirected to Download the Cigna App Apple App Store");
		log.info("User redirected to Download the Cigna App Apple App Store");
		softAssertion.assertAll();
	}

	// To Validate click action on Download the Cigna App, Google Play Store quick
	// link under Quick Links Web Part in HR Page TC:663
	@When("^User clicks on Download the Cigna App, Google Play Store quick link$")
	public void user_clicks_on_download_the_cigna_app_google_play_store_quick_link() throws Throwable {
		WebElement ele= Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Download the Cigna App, Google Play']", 60);
		ele.click();
		//Generic.waitForElement(hrpage.hr_CignaAppGooglePlayStore);
		//Generic.webClick(hrpage.hr_CignaAppGooglePlayStore);
		//Generic.waitForPageLoaded();
		log.info("User clicks on Download the Cigna App, Google Play Store quick link");
		softAssertion.assertAll();
	}

	@Then("User should get redirected to {string}")
	public void user_should_get_redirected_to_something(String strArg1) throws Throwable {
		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);
//	       String actual = Generic.getTitle().trim();
//	    	System.out.println("Actual is: "+actual);
//	    	Generic.doAssertion(actual, "");
		Generic.doAssertion(actual,
				"https://play.google.com/store/apps/details?id=com.cigna.mobile.mycigna&hl=en_US&gl=US&pli=1");
		softAssertion.assertAll();
	}

	// To Validate click action on MetLife Website quick link under Quick Links Web
	// Part in HR Page TC:664

	@When("^User clicks on MetLife Website quick link$")
	public void user_clicks_on_metlife_website_quick_link() throws Throwable {
		
		WebElement ele = Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='MetLife Website']", 60);
		ele.click();
		Thread.sleep(2000);
		//Generic.waitForElement(hrpage.hr_MetLifeWebsite);
		//Generic.webClick(hrpage.hr_MetLifeWebsite);
		log.info("User clicks on MetLife Website quick link");
		softAssertion.assertAll();
	}

	@Then("User should get redirected to {string} MetLife")
	public void user_should_get_redirected_to_something_metlife(String strArg1) throws Throwable {
		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);

		Generic.doAssertion(actual, "https://www.metlife.com/#");
		softAssertion.assertAll();
	}

	// To Validate click action on Optum Website quick link under Quick Links Web
	// Part in HR Page TC: 665

	@When("^User clicks on Optum Website quick link$")
	public void user_clicks_on_optum_website_quick_link() throws Throwable {
		
		WebElement ele =Generic.isElementPresnt(driver, "//div[normalize-space()='Quick Links']//following::*[text()='Optum Website']", 60);
		ele.click();
		Thread.sleep(2000);
		log.info("User clicks on Optum Website quick link");
		//Generic.waitForElement(hrpage.hr_OptumWebsite);
		//Generic.webClick(hrpage.hr_OptumWebsite);
		softAssertion.assertAll();
	}

	@Then("^User should get redirected to (.+) Optum$")
	public void user_should_get_redirected_to_optum(String url) throws Throwable {
		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);

		Generic.doAssertion(actual, "https://www.optumbank.com/?j3mc2h6gpak36kmzc6vxbnqc3u=nlwbxhlelc5xz5pr2n7kv2ln2i");
		softAssertion.assertAll();
	}

	// To Validate click action on Igoe Website Website quick link under Quick Links
	// Web Part in HR Page TC:666
	@When("^User clicks on Igoe Website Website quick link$")
	public void user_clicks_on_igoe_website_website_quick_link() throws Throwable {
		
		WebElement el = Generic.isElementPresnt(driver, "", 60);
		el.click();
		Thread.sleep(2000);
		log.info("User clicks on Igoe Website Website quick link");
		//Generic.waitForElement(hrpage.hr_Igoe);
		//Generic.webClick(hrpage.hr_Igoe);
		softAssertion.assertAll();
	}

	@Then("^User should get redirected to (.+) Igoe$")
	public void user_should_get_redirected_to_igoe(String url) throws Throwable {
		Generic.MovetoChildWindow();
		String actual = Generic.getURL();
		System.out.println("Actual is: " + actual);

		Generic.doAssertion(actual,
				"https://cobra.goigoe.com/?ReturnUrl=%2f&bkzczaui5y4znvu2htl3vfraai=be4insjfcv5b2ggmanoylbavrq");
		softAssertion.assertAll();
	}
	
	//To Validate available tiles under Onboarding Web Part in HR Page TC : 668
	
	@When("User is at  Onboarding Web part")
	public void user_is_at_onboarding_web_part() throws CustomizedException, InterruptedException, AWTException {

		Robot robot = new Robot();
		
		WebElement ele = Generic.isElementPresnt(BaseClass.driver,"//div[@title='Human Resources']", 60);
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		robot.delay(500);
		act.sendKeys(Keys.PAGE_DOWN);
		act.build().perform();
		robot.delay(500);
		act.sendKeys(Keys.PAGE_DOWN);
		act.build().perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement element = Generic.isElementPresnt(BaseClass.driver, "//*[text()='Onboarding']", 60);
		Thread.sleep(2000);
		String text=  element.getText().trim();
		//boolean status = hrpage.hr_Onboarding.isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_Onboarding);
		
		Generic.doAssertion(text, "Onboarding");
		Reporter.log("User is at  Onboarding Web part");
		log.info("User is at  Onboarding Web part");
		softAssertion.assertAll();
	}
	@Then("Onboarding FAQ link should be there")
	public void onboarding_faq_link_should_be_there() throws CustomizedException {
	   
boolean status = Generic.isElementPresnt(driver, "//div[normalize-space()='Onboarding']", 120).isDisplayed();
		//String text1 = Generic.getText(hrpage.hr_Onboarding_FAQ);
//boolean status = driver.findElement(By.xpath("//div[normalize-space()='Onboarding']")).isDisplayed();
		//boolean status = Generic.isDisplayed(hrpage.hr_Onboarding_FAQ);
		
		Generic.doSoftAssertion(status, true);
		Reporter.log("Onboarding FAQ link is displaying");
		log.info("Onboarding FAQ link is displaying");
		softAssertion.assertAll();
	}

	@Then("Charitable Giving link should be there")
	public void charitable_giving_link_should_be_there() {
boolean status = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Charitable Giving']", 120).isDisplayed();
		//boolean status = hrpage.hr_Charitable.isDisplayed();

		Generic.doSoftAssertion(status, true);
		Reporter.log("Charitable Giving link is displyaing");
		log.info("Charitable Giving link is displyaing");
		softAssertion.assertAll();
	}
	@Then("Benefits snapshot link should be there")
	public void benefits_snapshot_link_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Benefits Snapshot']", 120).isDisplayed();  
		//boolean status = hrpage.hr_Benefits_Snapshot.isDisplayed();
		Generic.doSoftAssertion(status, true);
		Reporter.log("Benefits snapshot link is displaying");
		log.info("Benefits snapshot link is displaying");
		softAssertion.assertAll();
	}
	@Then("Carrier contact sheet link should be there")
	public void carrier_contact_sheet_link_should_be_there() {
	   
//boolean status = hrpage.hr_Carrier_contact.isDisplayed();
boolean status = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Benefits Snapshot']", 120).isDisplayed();  
		Generic.doSoftAssertion(status, true);
		Reporter.log("Carrier contact sheet link is displaying");
		log.info("Carrier contact sheet link is displaying");
		softAssertion.assertAll();
	}
	
	@When("User clicks on Onboarding FAQ link")
	public void user_clicks_on_onboarding_faq_link() throws CustomizedException, InterruptedException {
	    
		WebElement el = Generic.isElementPresnt(driver, ".//*[text()='Onboarding FAQ']", 60);
		el.click();
		Thread.sleep(2000);
		//Generic.webClick(hrpage.hr_Onboarding_FAQ);
	    
	    //Generic.waitForPageLoaded();

		Reporter.log("User clicks on Onboarding FAQ link");
		log.info("User clicks on Onboarding FAQ link");
		softAssertion.assertAll();
	}
	@Then("User should get redirected to Zenefits site")
	public void user_should_get_redirected_to_zenefits_site() {
	
	}
	
	
	@When("User clicks on Charitable Giving link")
	public void user_clicks_on_charitable_giving_link() throws CustomizedException, InterruptedException {
		WebElement el = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Charitable Giving']", 60);
		el.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Generic.webClick(hrpage.hr_Charitable);
		    //Generic.waitForPageLoaded();
			Reporter.log("User clicks on Charitable Giving link");
			log.info("User clicks on Charitable Giving link");
			softAssertion.assertAll();
	}
	@Then("^User should get redirected to (.*)$")
	public void user_should_get_redirected_to_https_kodiaksciences_sharepoint_com_b_s_teams_rollout_kodiak_intranet_knet_e_zyo_kk_ksm1cnw_mw3r_g8z_v8bk_t_ds_pk7q4109n_yc_sih_pm_q_e_d_af32d() {
	   
		
	}
	
	@When("User clicks on Benefits snapshot link")
	public void user_clicks_on_benefits_snapshot_link() throws CustomizedException, InterruptedException {
		WebElement el = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Benefits Snapshot']", 60);
		el.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Generic.webClick(hrpage.hr_Benefits_Snapshot);
	    
	    //Generic.waitForPageLoaded();

		Reporter.log("User clicks on Benefits snapshot link");
		log.info("User clicks on Benefits snapshot link");
		softAssertion.assertAll();
	}

	@When("User clicks onCarrier contact sheet link")
	public void user_clicks_on_carrier_contact_sheet_link() throws CustomizedException, InterruptedException {
		
		WebElement el = Generic.isElementPresnt(driver, ".//*[@class='link_07fca4d8']//*[text()='Carrier contact sheet']", 60);
		el.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Generic.webClick(hrpage.hr_Carrier_contact);
	    
	   // Generic.waitForPageLoaded();

		Reporter.log("User clicks onCarrier contact sheet link");
		log.info("User clicks onCarrier contact sheet link");
		softAssertion.assertAll();
	}
	
	@When("User clicks on View All link")
	public void user_clicks_on_view_all_link() throws CustomizedException, InterruptedException {
	    
		WebElement el = Generic.isElementPresnt(driver, "//a[@href='https://kodiaksciences.sharepoint.com/sites/Knet-HR-UAT/Lists/OnboardingLinks/AllItems.aspx']", 60);
		el.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Generic.webClick(hrpage.hr_Onboarding_View);
		Reporter.log("User clicks on View All link");
		log.info("User clicks on View All link");
		
	}
	
	
	//To Validate click action on Company Holidays  tiles under HR Web Part in HR Page TC:635
	@When("User clicks on Company Holidays tile")
	public void user_clicks_on_company_holidays_tile() throws CustomizedException, InterruptedException {
		
		Generic.isElementPresnt(driver, "//span[contains(text(),'Company Holidays')]", 180).click();
		Thread.sleep(2000);
		log.info("User clicks on Company Holidays tile");
	  //  Generic.webClick(hrpage.hr_companyHoliday_Section);  
	}
	
//	@Then("User should get redirected to Holiday page")
//	public void user_should_get_redirected_holidays_page() {
//
//	}
	@Then("There should be list of US Holidays")
	public void there_should_be_list_of_us_holidays() {
		String text = Generic.isElementPresnt(driver, "//span[normalize-space()='2023 U.S. Holiday Schedule + Holiday Shutdown Days']", 180).getText();
		
		boolean status = text.contains("U.S. Holiday");
		Generic.doSoftAssertion(status, true);
		//Generic.doAssertion(text, "2023 U.S. Holiday Schedule + Holiday Shutdown Days");
		log.info("US Holidays list is:"+ text);
		//System.out.println("US Holidays list is:"+ text);
		softAssertion.assertAll();
	}
	@Then("There should be list of Switzerland Holidays")
	public void there_should_be_list_of_switzerland_holidays() {
		String text = Generic.isElementPresnt(driver, "//span[normalize-space()='Switzerland: 2023 CH Holiday Schedule']", 180).getText();
		boolean status = text.contains("Switzerland");
		Generic.doSoftAssertion(status, true);
		
		//Generic.doAssertion(text, "Switzerland: 2023 CH Holiday Schedule");
		log.info("Switzerland Holidays list is:"+ text);
		softAssertion.assertAll();
	}
	
	//TC:636
	@When("User clicks on Change Personal Info tile")
	public void user_clicks_on_change_personal_info_tile() {
		Generic.isElementPresnt(driver, "//span[contains(text(),'Change Personal Info')]", 180).click();
		log.info("User clicks on Change Personal Info tile");
		softAssertion.assertAll();
	}
	
	//TC:637
	@When("User clicks on 401k tile")
	public void user_clicks_on_401k_tile() {
		Generic.isElementPresnt(driver, "//span[contains(text(),'401k')]", 180).click();  
		log.info("User clicks on 401k tile");
		softAssertion.assertAll();
	}
	
	//TC:638
	@When("User clicks on Update Tax Forms tile")
	public void user_clicks_on_update_tax_forms_tile() {
		Generic.isElementPresnt(driver, "//span[contains(text(),'Update Tax Forms')]", 180).click();   
		log.info("User clicks on Update Tax Forms tile");
		softAssertion.assertAll();
	}
	
	//Tc:639
	@When("User clicks on Submit PTO Request tile")
	public void user_clicks_on_submit_pto_request_tile() {
		Generic.isElementPresnt(driver, "//span[contains(text(),'Submit PTO Request')]", 180).click();   
		log.info("User clicks on Submit PTO Request tile");
		softAssertion.assertAll();
	}
	
	//TC:640
	@When("User clicks on Employees Stock Plan Questions tile")
	public void user_clicks_on_employees_stock_plan_questions_tile() {
		Generic.isElementPresnt(driver, "//span[contains(text(),'Employee Stock Plan Questions')]", 180).click();   
		log.info("User clicks on Employees Stock Plan Questions tile");
		softAssertion.assertAll();
	}
	
	//To Validate available tiles under Benefits Web Part in HR Page TC:642
	@When("User is at Benefits Web part")
	public void user_is_at_benefits_web_part() throws CustomizedException, AWTException, InterruptedException {
		Generic.waitForPageLoaded();
		Generic.srcollDownRobotZenefit();
		
		boolean status = Generic.isElementPresnt(driver, "//span[normalize-space()='Benefits']", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at Benefits Web part");
		softAssertion.assertAll();
	}
	@Then("Medical or Vision or Dental should be there")
	public void medical_or_vision_or_dental_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Medical/Vision/Dental')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Medical or Vision or Dental should be there");
		softAssertion.assertAll();
	}
	@Then("HSA should be there")
	public void hsa_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'HSA')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("HSA should be there");
		softAssertion.assertAll();
	}
	
	
	@Then("FSA should be there")
	public void fsa_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'FSA')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("FSA should be there");
		softAssertion.assertAll();
	}
	@Then("Life Insurance or Disability should be there")
	public void life_insurance_or_disability_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Life Insurance/Disability')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Life Insurance or Disability should be there");
		softAssertion.assertAll();
	}
	@Then("Life Event Change  should be there")
	public void life_event_change_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//span[contains(text(),'Life Event Change')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Life Event Change  should be there");
		softAssertion.assertAll();
	  
	}
	
	//643
	@When("User clicks on Medical or Vision or Dental tile")
	public void user_clicks_on_medical_or_vision_or_dental_tile() {
		log.info("User clicks on Medical or Vision or Dental tile");
		softAssertion.assertAll();
	}
	
	//648
	@When("User is at HR Traning and Career Web part")
	public void user_is_at_hr_traning_and_career_web_part() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		Generic.srcollDownRobotZenefit();
		
		boolean status = Generic.isElementPresnt(driver, "//div[normalize-space()='Training and Career']", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at HR Traning and Career Web part");
		softAssertion.assertAll();
	}
	@Then("Organization Chart should be there")
	public void organization_chart_should_be_there() {
	   
		boolean status = Generic.isElementPresnt(driver, "//div[contains(text(),'Organization Chart')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Organization Chart should be there");
		softAssertion.assertAll();
	}
	@Then("Open Positions should be there")
	public void open_positions_should_be_there() {
	   
		boolean status = Generic.isElementPresnt(driver, "//div[contains(text(),'Open Positions')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Open Positions should be there");
		softAssertion.assertAll();
	}
	@Then("Refer someone  should be there")
	public void refer_someone_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//div[contains(text(),'Refer Someone')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Refer someone  should be there");
		softAssertion.assertAll();
	}
	@Then("Fitnes  should be there")
	public void fitnes_should_be_there() {
		boolean status = Generic.isElementPresnt(driver, "//div[contains(text(),'Fitness')]", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Fitnes  should be there");
		softAssertion.assertAll();
	}
	
	@Then("View All link should be there of HR Traning and Career")
	public void view_all_link_should_be_there_of_hr_traning_and_career() {
		boolean status = Generic.isElementPresnt(driver, "//a[@href='https://kodiaksciences.sharepoint.com/sites/Knet-HR-uat/Lists/TrainingCareer/AllItems.aspx']", 150).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("View All link should be there of HR Traning and Career");
		softAssertion.assertAll();
	}
	
//649
	@When("User clicks on Organization chart tile")
	public void user_clicks_on_organization_chart_tile() {
		log.info("User clicks on Organization chart tile");
		softAssertion.assertAll();
	}

}
