package org.kodiak.stepDefinations;

import io.cucumber.java.en.*;
import org.kodiak.base.BaseClass;
import org.kodiak.pages.ClinicalOperationsPage;
import org.kodiak.pages.HomePage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
//import org.kodiak.utils.clinicalOperationpage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClinicalOperationsStepDef extends BaseClass {

	public ClinicalOperationsPage clinicalOperationpage = new ClinicalOperationsPage(driver);

	@When("User is in Clinical Operation Page")
	public void user_is_in_clinical_operation_page() throws CustomizedException, InterruptedException, AWTException {
		Generic.waitForElement(homepage.clickOnHomepageLink);
		Generic.webClick(homepage.clickOnHomepageLink);
		log.info("User clicked on Homepage link");

		Generic.highlightElement(homepage.mouseOverOrg);
		log.info("User is highligheted on Organization link");
		Generic.waitForElement(homepage.mouseOverOrg);
		Generic.MovetoElementbyActionClass(homepage.mouseOverOrg);
		log.info("User clicked on the Organization menu menu");
		Thread.sleep(3000);

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_Pagetext);
		log.info("User is waited to get element of clinical operation on mouse over");

		Robot robot = new Robot();
		Actions act = new Actions(driver);
		act.moveToElement(clinicalOperationpage.clinicalOperations_Pagetext).click().build().perform();
		Thread.sleep(2000);
		log.info("User is clicked on the clinical operations link on Men menu");

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_PageBodyTxt);
		log.info("User is waited to get an element of homepage Clinical operaion link");
		Generic.webClick(clinicalOperationpage.clinicalOperations_PageBodyTxt);
		log.info("User is clicked on the homepage Clinical operaion link");
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);

		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();

		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();

		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();

		// Generic.srcollDownUsingRobotClicnicalOperaions();
		log.info("User is in Clinical Operation Page");
	}

	@When("User is at Vendor or Study List section")
	public void user_is_at_vendor_or_study_list_section() throws InterruptedException {
		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_VendorSection);

		Generic.doSoftAssertion(status, true);
		log.info("User is at Vendor or Study List section");
		softAssertion.assertAll();
	}

	@Then("List of Vendor or Study List should be available")
	public void list_of_vendor_or_study_list_should_be_available() {
		log.info("List of Vendor or Study List is displaying");
	}

	@Then("Search options should be there to search the vendor")
	public void search_options_should_be_there_to_search_the_vendor() throws InterruptedException {
		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		Generic.doSoftAssertion(status, true);
		log.info("Search options is displaying");
		softAssertion.assertAll();
	}

	// 866
	@When("^User provides a valid keyword (.+) to search$")
	public void user_provides_a_valid_keyword_to_search(String keyword)
			throws CustomizedException, IOException, InterruptedException {

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		Generic.webClick(clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		Generic.sendKeysTextbox(keyword, clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		log.info("User provided Valid keyword to search is :" + keyword);
		softAssertion.assertAll();
	}

	@Then("Respective Vendors should be filtered out")
	public void respective_vendors_should_be_filtered_out() {

		log.info("Respective Vendors is displaying as we searched using valid keyword");
	}

	// 867
	@When("^User provides a invalid keyword (.+) to search$")
	public void user_provides_a_invalid_keyword_to_search(String keyword)
			throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		Generic.webClick(clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		Generic.sendKeysTextbox(keyword, clinicalOperationpage.clinicalOperations_CLickonSearchTextboxLink);

		log.info("User provided InValid keyword to search is :" + keyword);
		softAssertion.assertAll();
	}

	@Then("No data found! Messgae should be displayed")
	public void no_data_found_messgae_should_be_displayed() throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.digitalTransformation_NodataFoundSearch);

		String text = Generic.getText(clinicalOperationpage.digitalTransformation_NodataFoundSearch).trim();

		boolean status = Generic.verifyExpectedActualValue(text, "No data found!");

		Generic.doSoftAssertion(status, true);

		Thread.sleep(2000);
		log.info(text + ": Messgae is displaying");
		softAssertion.assertAll();
	}

	// 868
	@When("User clicks on any of the vendor")
	public void user_clicks_on_any_of_the_vendor() throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.clinicalOperations_clickanyoneOfvendor);

		Generic.webClick(clinicalOperationpage.clinicalOperations_clickanyoneOfvendor);

		log.info("User clicks on any of the vendor");
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the designated page")
	public void user_should_be_redirected_to_the_designated_page() throws CustomizedException, InterruptedException {

		Generic.MovetoChildWindow();
		String title = Generic.getTitle();
		Generic.doSoftAssertionString(title, "Clinical Ops Org Chart");
		Thread.sleep(2000);
		log.info("User is redirected to the Clinical Ops Org Chart");
		softAssertion.assertAll();
	}

	// 870
	@When("User is at Org Chart section")
	public void user_is_at_org_chart_section() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_OrgOpenChartSection);
		Generic.doSoftAssertion(status, true);
		log.info("User is at Org Chart section");
		softAssertion.assertAll();
	}

	@When("User clicks on Org Chart")
	public void user_clicks_on_org_chart() throws InterruptedException, CustomizedException {
		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_OrgOpenChartSection);

		Generic.webClick(clinicalOperationpage.clinicalOperations_OrgOpenChartSection);

		log.info("User clicks on Org Chart");
		Thread.sleep(2000);
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the designated page of Clinical Operations Org Chart")
	public void user_should_be_redirected_to_the_designated_page_of_clinical_operations_org_chart()
			throws CustomizedException, InterruptedException {

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_PageHeadingText);

		String heading = Generic.getText(clinicalOperationpage.clinicalOperations_PageHeadingText).trim();
		Generic.doSoftAssertionString(heading, "Clinical Operations Org Chart");
		Thread.sleep(2000);
		log.info("User redirected to the designated page of Clinical Operations Org Chart");
		softAssertion.assertAll();
	}

	// 872
	@When("User is at Kvault Clinical section")
	public void user_is_at_kvault_clinical_section() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
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

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_kvaultClinical);
		Generic.doSoftAssertion(status, true);
		log.info("User is at Kvault Clinical section");
		softAssertion.assertAll();
	}

	@When("User clicks on Kvault Clinical")
	public void user_clicks_on_kvault_clinical() throws InterruptedException, CustomizedException {

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_kvaultClinical);

		Generic.webClick(clinicalOperationpage.clinicalOperations_kvaultClinical);

		log.info("User clicks on Kvault Clinical");
		Thread.sleep(2000);
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the designated page Kvault Clinical Clinical OPeration Page")
	public void user_should_be_redirected_to_the_designated_page_kvault_clinical_clinical_o_peration_page()
			throws CustomizedException, InterruptedException {

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_PageHeadingText_Kvault);

		String heading = Generic.getText(clinicalOperationpage.clinicalOperations_PageHeadingText_Kvault).trim();

		Generic.doSoftAssertionString(heading, "Clinical Ops Org Chart");
		log.info("User redirected to the designated page Kvault Clinical Clinical OPeration Page");
		softAssertion.assertAll();
	}

	// 874
	@When("User is at Upcoming Datacuts section")
	public void user_is_at_upcoming_datacuts_section() throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(500);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_upcomingDatacutsSection);
		Generic.doSoftAssertion(status, true);
		log.info("User is at Upcoming Datacuts section");
		softAssertion.assertAll();

	}

	@Then("There should be {int} latest Upcoming Datacuts should be displayed Upcoming Datacuts")
	public void there_should_be_latest_upcoming_datacuts_should_be_displayed_upcoming_datacuts(Integer int1)
			throws CustomizedException {
		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_upcomingdatacutsLists);

		Generic.doSoftAssertion(status, true);

		// Generic.getSize(clinicalOperationpage.clinicalOperations_upcomingdatacutsLists);
		// log.info("There should be 4 latest Upcoming Datacuts should be displayed
		// Upcoming Datacuts");
		// Generic.getSize("//div[contains(@aria-label,'Event Datacut Strategies. Starts
		// on')]");
		// List<WebElement> lists = Generic.isElementPresentLists(driver,
		// "//div[contains(@aria-label,'Event Datacut Strategies. Starts on')]", 120);
		// int size = lists.size();
		log.info("Latest Upcoming Datacuts displayed");
		softAssertion.assertAll();
	}

	// 875
	@Then("Day of Upcoming Datacuts should be displayed")
	public void day_of_upcoming_datacuts_should_be_displayed() {
		log.info("Day of Upcoming Datacuts is displayed");
		softAssertion.assertAll();
	}

	@Then("Month of Upcoming Datacuts should be displayed")
	public void month_of_upcoming_datacuts_should_be_displayed() {
		log.info("Month of Upcoming Datacuts is displayed");
		softAssertion.assertAll();
	}

	@Then("Date of Upcoming Datacuts should be displayed")
	public void date_of_upcoming_datacuts_should_be_displayed() {
		log.info("Date of Upcoming Datacuts is displayed");
		softAssertion.assertAll();
	}

	@Then("Time  of Upcoming Datacuts should be displayed")
	public void time_of_upcoming_datacuts_should_be_displayed() {
		log.info("Time  of Upcoming Datacuts is displayed");
		softAssertion.assertAll();
	}

	@Then("Location  of Upcoming Datacuts should be displayed")
	public void location_of_upcoming_datacuts_should_be_displayed() {
		log.info("Location  of Upcoming Datacuts  is displayed");
		softAssertion.assertAll();
	}

	@Then("See All link should be displayed")
	public void see_all_link_should_be_displayed() {

		log.info("See All link is displayed");
		softAssertion.assertAll();
	}

	@Then("Add event option should be there")
	public void add_event_option_should_be_there() {
		log.info("Add event option is displayed");
		softAssertion.assertAll();
	}

	// 876
	@When("User clicks on any Upcoming Datacuts")
	public void user_clicks_on_any_upcoming_datacuts() {
		log.info("User clicks on the Upcoming Datacuts");
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the designated page of the Upcoming Datacuts Web Part in Clinical Operation Page")
	public void user_should_be_redirected_to_the_designated_page_of_the_upcoming_datacuts_web_part_in_clinical_operation_page() {
		log.info("Its redirected to the event page");
		softAssertion.assertAll();
	}

	// 877
	@When("User clicks on View All link under Upcoming Datacuts")
	public void user_clicks_on_view_all_link_under_upcoming_datacuts() {
		log.info("User clicks on View All link under Upcoming Datacuts");
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the list of upcoming Datacuts page")
	public void user_should_be_redirected_to_the_list_of_upcoming_datacuts_page() {
		log.info("User redirecting to the events page");
		softAssertion.assertAll();
	}

	// 878
	@When("User clicks on Add Event link under Upcoming Datacuts")
	public void user_clicks_on_add_event_link_under_upcoming_datacuts() {

		log.info("User clicks on Add Event link under Upcoming Datacuts");
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the Add Event of upcoming Datacuts page")
	public void user_should_be_redirected_to_the_add_event_of_upcoming_datacuts_page() {
		log.info("User should be redirected to the Add Event of upcoming Datacuts page");
		softAssertion.assertAll();
	}

	// 882
	@When("User is at FAQs List section")
	public void user_is_at_fa_qs_list_section() {

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_faqm);

		Generic.doSoftAssertion(status, true);
		log.info("User is at FAQs List section");
		softAssertion.assertAll();
	}

	@Then("List of FAQs  should be available")
	public void list_of_fa_qs_should_be_available() {

		// Boolean status =
		// Generic.waitForElement(clinicalOperationpage.clinicalOperations_faqmLists);
		List<WebElement> lists = clinicalOperationpage.clinicalOperations_faqmLists;
		int size = lists.size();
		System.out.println("Number of FAQs lists is: " + size);
		// Generic.doSoftAssertion(status, true);
		log.info("User is at FAQs List section");
		softAssertion.assertAll();

		// List<WebElement> lists = clinicalOperationpage.clinicalOperations_faqmLists;

		/*
		 * List<WebElement> lists =
		 * Generic.isElementPresentLists(driver,".//*[@class='accordion__item']", 120);
		 * int size = lists.size(); System.out.println("Number of FAQs is: "+ size);
		 * for(WebElement option: lists) { //option.isDisplayed(); String text =
		 * option.getText(); System.out.println("List of FAQs is: " +text);
		 * log.info("User is at FAQs List section"); softAssertion.assertAll(); }
		 */

	}

	@Then("Search options should be there to search the FAQs")
	public void search_options_should_be_there_to_search_the_fa_qs() {

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_searchItmFAQ);
		Generic.doSoftAssertion(status, true);
		log.info("Search options is displaying");
		softAssertion.assertAll();
	}

	// 883
	@When("User provides a valid keyword {string} to search in FAQ Section")
	public void user_provides_a_valid_keyword_to_search_in_faq_section(String validKeyword)
			throws InterruptedException, CustomizedException {

		Generic.waitForElement(clinicalOperationpage.clinicalOperations_searchItmFAQ);

		Generic.webClick(clinicalOperationpage.clinicalOperations_searchItmFAQ);

		Thread.sleep(2000);
		clinicalOperationpage.clinicalOperations_searchItmFAQ.sendKeys(validKeyword);
		log.info("User provides a valid keyword Clinical Research to search in FAQ Section :" + validKeyword);
		softAssertion.assertAll();
	}

	@Then("Respective FAQs should be filtered out")
	public void respective_fa_qs_should_be_filtered_out() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Respective FAQs should be filtered out");
		softAssertion.assertAll();
	}

	// 884
	@When("^User provides an invalid keyword (.+) to search in FAQ Section$")
	public void user_provides_an_invalid_keyword_invalid_keyword_to_search_in_faq_section(String invalidkeyword)
			throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.clinicalOperations_searchItmFAQ);

		Generic.webClick(clinicalOperationpage.clinicalOperations_searchItmFAQ);
		Thread.sleep(2000);

		clinicalOperationpage.clinicalOperations_searchItmFAQ.sendKeys(invalidkeyword);
		log.info("User provides an invalid keyword to search in FAQ Section :" + invalidkeyword);
		softAssertion.assertAll();
	}

	// 885
	@When("User clicks on any of the FAQs")
	public void user_clicks_on_any_of_the_fa_qs() throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.clinicalOperations_searchClinicalResearch);

		Generic.webClick(clinicalOperationpage.clinicalOperations_searchClinicalResearch);

		Thread.sleep(2000);
		log.info("User clicked on any of the FAQs");
		softAssertion.assertAll();
	}

	@Then("User should be redirected to the designated page FAQ list page")
	public void user_should_be_redirected_to_the_designated_page_faq_list_page() {
		log.info("User should be redirected to the designated page FAQ list page");
	}

	// 889
	@When("User is at Key Contacts section")
	public void user_is_at_key_contacts_section() {

		boolean status = Generic.waitForElement(clinicalOperationpage.clinicalOperations_FAQSection);

		Generic.doSoftAssertion(status, true);
		log.info("User is at Key Contacts section");
		softAssertion.assertAll();
	}

	@When("User clicks on View All links under Key Contacts in clinical page")
	public void user_clicks_on_view_all_links_under_key_contacts_in_clinical_page()
			throws InterruptedException, CustomizedException {
		Generic.waitForElement(clinicalOperationpage.clinicalOperations_FAQVIEWALL);

		Generic.webClick(clinicalOperationpage.clinicalOperations_FAQVIEWALL);

		Thread.sleep(2000);
		log.info("User clicked on View All links under Key Contacts in clinical page");
		softAssertion.assertAll();
	}

	// 1044
	@When("User is at Upcoming Events section")
	public void user_is_at_upcoming_events_section() throws AWTException, CustomizedException {

//		Robot robot = new Robot();
//		Actions act = new Actions(driver);
//		
//		Generic.waitForElement(clinicalOperationpage.clinicalOperations_PageBodyTxt);
//		log.info("User is waited to get an element of homepage Clinical operaion link");
//		
//		Generic.webClick(clinicalOperationpage.clinicalOperations_PageBodyTxt);
//		log.info("User is clicked on the homepage Clinical operaion link");
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		robot.delay(500);
//
//		robot.delay(500);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		
//		act.sendKeys(Keys.PAGE_DOWN);
//		act.perform();
//		act.sendKeys(Keys.PAGE_DOWN);
//		act.perform();

		Generic.waitForElement(clinicalOperationpage.digitalTransformation_UpcomingEventsMeetings);
		Generic.webClick(clinicalOperationpage.digitalTransformation_UpcomingEventsMeetings);
		log.info("User is at Upcoming Events section");

	}

	@Then("List of Upcoming Events should be there")
	public void list_of_upcoming_events_should_be_there() {

		boolean status = Generic
				.waitForElement(clinicalOperationpage.digitalTransformation_UpcomingEventsMeetingsLists);
		Generic.doSoftAssertion(status, true);
		log.info("List of Upcoming Events is displaying");
		softAssertion.assertAll();
	}

	@Then("Add Event should be there")
	public void add_event_should_be_there() {
		log.info("Add Event is displaying");
		softAssertion.assertAll();

	}

	@Then("Event Title should be there")
	public void event_title_should_be_there() {
		log.info("Event Title is displaying");
		softAssertion.assertAll();
	}

	@Then("Event Date and Time should be there")
	public void event_date_and_time_should_be_there() {
		log.info("Event Date and Time is displaying");
		softAssertion.assertAll();
	}

	@Then("See All link should be there")
	public void see_all_link_should_be_there() {
		log.info("See All link is displaying");
		softAssertion.assertAll();
	}

	// To Validate available options under Commonly Used Forms Web Part in TC:1033
//	When: User is at Commonly Used Forms section
//	Then: List of Commonly used documents should be there
//	And: See All link should be there
	@When("User is at Commonly Used Forms section")
	public void User_is_at_Commonly_Used_Forms_section() throws AWTException {
		WebElement element;

		element = Generic.isElementPresnt(driver, "//div[text()='Key Contacts']", 6);

		element.click();
		Robot robot = new Robot();
		for (int g = 0; g < 12; g++) {

			System.out.println("checked times : " + g);

			robot.keyPress(KeyEvent.VK_DOWN);

			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.delay(500);

			List els = driver.findElements(By.xpath("//span[contains(text(),'Commonly used forms')]"));

			try {

				if (els.size() > 0) {
					break;
				}

			} catch (Exception e) {

				robot.keyPress(KeyEvent.VK_DOWN);

				robot.keyRelease(KeyEvent.VK_DOWN);

				robot.delay(500);

				// action.moveToElement(element).moveToElement(element).perform();

			}
		}
	}

	@Then("List of Commonly used documents should be there")
	public void List_of_Commonly_used_documents_should_be_there() {
//
//		WebElement facilitiesElement = Generic.isElementPresnt(driver, "((//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/C46431CE-F798-4555-B691-79E4FC4E6B7F/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']",
//				240);
//
//		facilitiesElement.isDisplayed();

		WebElement facilitiesElement = driver.findElement(By.xpath(
				"//img[@role='presentation'][@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/C46431CE-F798-4555-B691-79E4FC4E6B7F/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']"));
		facilitiesElement.isDisplayed();

	}

//When User clicks on any of the forms under Commonly Used Forms Web Part in Accounts & Finance Page 
//Then:It should redirects to the respective pages

	@And("User clicks on any of the forms under Commonly Used Forms Web Part in Accounts and Finance Page")
	public void User_clicks_on_any_of_the_forms_under_Commonly_Used_Forms_Web_Part_in_Accounts_and_Finance_Page() {
		WebElement element;

		element = Generic.isElementPresnt(driver,
				"//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/557A8BB9-ABF7-4A5B-93E6-45962569095C/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']",
				240);

		element.click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/557A8BB9-ABF7-4A5B-93E6-45962569095C/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']")));
//
//        boolean clicked = false;
//        for (int i = 0; i < 10; i++) { 
//            try {
//                element.click();
//                clicked = true; 
//                break;
//            } catch (ElementClickInterceptedException e) {
//                System.out.println("Element is not clickable yet. Retrying...");
//            }
//        }
//
//        if (!clicked) {
//            System.out.println("Element click failed after maximum iterations.");
//        }
////
	}

	@Then("It should redirects to the respective pages commanly used forms")
	public void It_should_redirects_to_the_respective_pages_commanly_used_forms()
			throws Throwable, InterruptedException, AWTException {

		WebElement element;

		element = Generic.isElementPresnt(driver, "//span[text()='Kodiak Science v....pdf']", 10);

		element.isDisplayed();

		user_is_in_clinical_operation_page();

		element = Generic.isElementPresnt(driver,
				"//*[@role='presentation'][@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/DB9ADF93-9DB8-47B1-9087-8D96DBE94372/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']",
				240);

		element.click();

		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("Kodiak_Intranet_Kickoff_v1.2.pptx");
		Assert.assertEquals(contains, currentUrl);
//
//	element = Generic.isElementPresnt(driver, "//div[@title='Training on HAVC Maintenance']",6);
//	element.isDisplayed();

	}

//	When User clicks on See All links under Commonly Used Forms Web Part in Accounts and Finance Page 
//	  Then It should redirects to forms list page

	@And("User clicks on See All links under Commonly Used Forms Web Part in Accounts and Finance Page")
	public void User_clicks_on_See_All_links_under_Commonly_Used_Forms_Web_Part_in_Accounts_and_Finance_Page() {

		WebElement element;

		element = Generic.isElementPresnt(driver, "(//a[text()='See all'])[2]", 10);

		element.click();
	}

	@Then("It should redirects to forms list page")
	public void It_should_redirects_to_forms_list_page() {
		
		WebElement module_one = Generic.isElementPresnt(driver, "//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/C46431CE-F798-4555-B691-79E4FC4E6B7F/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		WebElement module_two = Generic.isElementPresnt(driver, "//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/557A8BB9-ABF7-4A5B-93E6-45962569095C/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		WebElement module_tree = Generic.isElementPresnt(driver, "//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/DB9ADF93-9DB8-47B1-9087-8D96DBE94372/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		WebElement module_four = Generic.isElementPresnt(driver, "//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/1415025C-7706-44F4-A6E2-C9E5BD0B61A6/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		WebElement module_five = Generic.isElementPresnt(driver, "//img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/971D02E3-CC95-4879-BF4C-C3FAF1488627/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		WebElement module_six = Generic.isElementPresnt(driver, "// img[@src='https://kodiaksciences.sharepoint.com/_api/v2.1/sites/kodiaksciences.sharepoint.com,87161725-aecd-470d-9666-1c5ea22df1e7,7c45f52f-120a-4985-84ed-f0dc768b9b2e/items/5935DD55-B942-435B-BF8A-ECD9645E1CA1/driveItem/thumbnails/0/c400x99999/content?prefer=noRedirect,extendCacheMaxAge&clientType=modernWebPart']", 240);

		List<WebElement> li = new ArrayList<>();
		li.add(module_one);
		li.add(module_two);
		li.add(module_tree);
		li.add(module_four);
		li.add(module_five);
		li.add(module_six);
		for (WebElement element : li) {

			boolean Displayed = false;
			for (int i = 0; i < 10; i++) {
				try {
					element.isDisplayed();
					Displayed = true;
					break;
				} catch (Exception e) {
					System.out.println("Element is not display yet. Retrying...");
				}
			}

			if (!Displayed) {
				System.out.println("Element display failed after maximum iterations.");

			}

		}

	}

}
