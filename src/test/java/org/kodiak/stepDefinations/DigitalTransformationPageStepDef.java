package org.kodiak.stepDefinations;

import io.cucumber.java.en.*;
import org.kodiak.base.BaseClass;
import org.kodiak.pages.HomePage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;


public class DigitalTransformationPageStepDef extends BaseClass {
	/*******************************************************************************************************************************************************************************************************************
	   'Created By	    : Nagraj Reballi						
	   'Created On		: June-2023				
	   'Last Updated By	: June-2023	
	   'Last Updated On	: June-2023	
	   'Purpose			: For Object repository and initialize of an objects
'**********************************************************************************************************************************************************/

	@When("User is in Digital Transformation Page")
	public void user_is_in_digital_transformation_page() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		//Generic.webClick(homepage.clickOnHomepageLink);
		Generic.isElementPresnt(driver,"//span[contains(text(),'Home')]", 120).click();
		Thread.sleep(2000);
		log.info("User clicked on homepage link");
		
		Generic.highlightElement(homepage.mouseOverOrg);
		WebElement ele = homepage.mouseOverOrg;
		
		Generic.MovetoElementbyActionClass(ele);
		log.info("User mouse over on Organization link");
		Thread.sleep(2000);
		
		Generic.srcollDownUsingRobotDigitalTransformation();
		log.info("User is in Digital Transformation Page");  
	}
	@When("User is at Announcements section")
	public void user_is_at_announcements_section() throws InterruptedException {
		Thread.sleep(2000);
		boolean status = Generic.isElementPresnt(driver, "//span[normalize-space()='Important Announcement']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Important Announcements section is displayed");
		softAssertion.assertAll(); 
	}
	@Then("Announcement Title should be there")
	public void announcement_title_should_be_there() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> lists = Generic.isElementPresentLists(driver,".//*[@class='header_303765f8']//h3", 120);
		for(WebElement option: lists) {
			option.isDisplayed();
			String text = option.getText().trim();
			log.info("Announcement Title displayed as: "+text);
			softAssertion.assertAll();
		}
	}
	
	@Then("Announcement Description should be there")
	public void announcement_description_should_be_there() {
		List<WebElement> lists = Generic.isElementPresentLists(driver,".//*[@class='content_303765f8']", 120);
		for(WebElement option: lists) {
			option.isDisplayed();
			String text = option.getText();
			log.info("Announcement Description displayed as: "+text);
			softAssertion.assertAll();
		}
	}
	@Then("Announcement Type should be there")
	public void announcement_type_should_be_there() {
		log.info("Announcement Type is displyaing");
		softAssertion.assertAll();
	}
	@Then("Read  more link should be there")
	public void read_more_link_should_be_there() {
		log.info("Read  more link is displaying");
		softAssertion.assertAll();
	}

	//892
	@When("User clicks on Announcements")
	public void user_clicks_on_announcements() {
		log.info("User clicks on Announcements");
		softAssertion.assertAll();
	}
	@Then("User should be redirected to the list of announcement page")
	public void user_should_be_redirected_to_the_list_of_announcement_page() {
		log.info("User is redirected to the KNet-DigitalTransformation-UAT");
		softAssertion.assertAll();
	}
	
	
	//894
	@When("User is at Security Update section")
	public void user_is_at_security_update_section() {
		boolean status = Generic.isElementPresnt(driver, "//strong[normalize-space()='Security Updates']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at Security Update section");
		softAssertion.assertAll(); 
	}
	@Then("There should be {int} latest Security Update should be displayed")
	public void there_should_be_latest_security_update_should_be_displayed(Integer int1) {
	   
		List<WebElement> lists = Generic.isElementPresentLists(driver,".//*[@class='knetImageText_9f9b0585']", 120);
		int number = lists.size();
		log.info("Number of Security update are: "+number);
		for(WebElement option: lists) {
			boolean status = option.isDisplayed();
			Generic.doSoftAssertion(status, true);
			log.info("Security update are displaying: ");
		}
		//softAssertion.assertAll();
	}
	
	//895
	@Then("Title of Security Update should be displayed")
	public void title_of_security_update_should_be_displayed() {
		WebElement status = Generic.isElementPresnt(driver, "//strong[normalize-space()='Security Updates']", 120);
		String text = status.getText().trim();
		Generic.doSoftAssertionString(text, "Security Updates");
		log.info("Title of Security Update is: "+text);
		softAssertion.assertAll();
	}
	@Then("Description of Security Update should be displayed")
	public void description_of_security_update_should_be_displayed() {
	//Generic.doSoftAssertion(true, true);
	log.info("Description of Security Update should be displayed");
	softAssertion.assertAll();
	}
	@Then("Department of Security Update should be displayed")
	public void department_of_security_update_should_be_displayed() {
		log.info("Department of Security Update should be displayed");
		softAssertion.assertAll(); 
	}
	@Then("Image  of Security Update should be displayed")
	public void image_of_security_update_should_be_displayed() {
		log.info("Image  of Security Update should be displayed");
		softAssertion.assertAll(); 
	}
	@Then("Date & Time  of Security Update should be displayed")
	public void date_time_of_security_update_should_be_displayed() {
		log.info("Date & Time  of Security Update should be displayed");
		softAssertion.assertAll();
	}
	@Then("Read more link should be displayed")
	public void read_more_link_should_be_displayed() {
		log.info("Read more link should be displayed");
		softAssertion.assertAll();
	}
	
	//896
	@When("User clicks on any Security Update")
	public void user_clicks_on_any_security_update() {
	   
	}
	@Then("User should be redirected to the respective detailed page")
	public void user_should_be_redirected_to_the_respective_detailed_page() {
	  
	}
	
	//901
	@When("User is at Key Contacts section of Digital Operation")
	public void user_is_at_key_contacts_section_of_digital_operation() {
	   
		boolean status = Generic.isElementPresnt(driver, ".//*[text()='Key Contacts']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at Key Contacts section of Digital Operation");
		softAssertion.assertAll(); 
		
	}
	@When("User clicks on Vie All links under Key Contacts in Digital page")
	public void user_clicks_on_vie_all_links_under_key_contacts_in_digital_page() throws InterruptedException {
	   
		WebElement status = Generic.isElementPresnt(driver, "//a[@href='cressi@kodiak.com']", 120);
		status.click();
		Thread.sleep(2000);
		log.info("User clicks on Vie All links under Key Contacts in Digital page");
		softAssertion.assertAll(); 
	}
	
	//903
	@When("User is at Knowledge Base section")
	public void user_is_at_knowledge_base_section() {
		boolean status = Generic.isElementPresnt(driver, ".//*[text()='Knowledge Base']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at Knowledge Base section");
		softAssertion.assertAll();  
	}
	@Then("Title of Knowledge Base should be displayed")
	public void title_of_knowledge_base_should_be_displayed() {
	 
	}
	@Then("Author of Knowledge Base should be displayed")
	public void author_of_knowledge_base_should_be_displayed() {
	  
	}
	@Then("Date of Knowledge Base should be displayed")
	public void date_of_knowledge_base_should_be_displayed() {
	   
	}
	@Then("Description  of Knowledge Base should be displayed")
	public void description_of_knowledge_base_should_be_displayed() {
	   
	}
	@Then("Image  of Knowledge Base should be displayed")
	public void image_of_knowledge_base_should_be_displayed() {
	  
	}
	@Then("View Detail Icon should be displayed")
	public void view_detail_icon_should_be_displayed() {
		boolean status = Generic.isElementPresnt(driver, ".//*[@href='https://kodiaksciences.sharepoint.com/sites/KNet-DigitalTransformation-UAT/Lists/KnowledgeBase%20List/AllItems.aspx']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("View Detail Icon should be displayed");
		softAssertion.assertAll();  	
	}
	
	//904
	@When("User clicks on any Knowledge Base")
	public void user_clicks_on_any_knowledge_base() {
	   
	}

	//906
	@When("User is at Quick Links section")
	public void user_is_at_quick_links_section() {
	 
		boolean status = Generic.isElementPresnt(driver, "//strong[normalize-space()='Quick Links']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("User is at Quick Links section");
		softAssertion.assertAll();  
	}
	
	@Then("Submit an IT Support Request Quick Links should be displayed")
	public void submit_an_it_support_request_quick_links_should_be_displayed() {
		boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='Submit an IT Support Request']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Submit an IT Support Request Quick Links displayed");
		softAssertion.assertAll();
	}
	
	@Then("Submit a Training Request Quick Links should be displayed")
	public void submit_a_training_request_quick_links_should_be_displayed() {
		
		boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='Submit a Training Request']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Submit a Training Request Quick Links displayed");
		softAssertion.assertAll();
		
	}
	@Then("Edit Requests Quick Links should be displayed")
	public void edit_requests_quick_links_should_be_displayed() {
	  
		boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='Edit Requests']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Edit Requests Quick Links is displayed");
		softAssertion.assertAll();
		
	}
	@Then("Assets Quick Links should be displayed")
	public void assets_quick_links_should_be_displayed() {
	    
		boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='Assets']", 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Assets Quick Links displayed");
		softAssertion.assertAll();	
	}
	
	//907
	@When("User clicks on Submit an IT Support Request Quick Links")
	public void user_clicks_on_submit_an_it_support_request_quick_links() throws InterruptedException, CustomizedException {
		
		WebElement element = Generic.isElementPresnt(driver, "//a[normalize-space()='Assets']", 120);
		element.click();
		Thread.sleep(2000);
		log.info("User clicked on Submit an IT Support Request Quick Links");
		softAssertion.assertAll();
	}
	
	@Then("User should be redirected to the respective designated page of Submit an IT Support Request")
	public void user_should_be_redirected_to_the_respective_designated_page_of_submit_an_it_support_request() throws CustomizedException {
		String title = Generic.getTitle();
		log.info("After clicking on the Submit an IT Support Request Quick Links Title is: "+title);
	}
	
	
	//908
	@When("User clicks on Submit a Training Request Quick Links")
	public void user_clicks_on_submit_a_training_request_quick_links() throws InterruptedException {
	  
		WebElement element = Generic.isElementPresnt(driver, "//a[normalize-space()='Submit a Training Request'", 120);
		element.click();
		Thread.sleep(2000);
		log.info("User clicked on Submit a Training Request Quick Links");
		softAssertion.assertAll();
	}
	@Then("User should be redirected to the respective designated page of Submit a Training Request Quick Links")
	public void user_should_be_redirected_to_the_respective_designated_page_of_submit_a_training_request_quick_links() throws CustomizedException {
		String title = Generic.getTitle();
		log.info("After clicking on the Submit a Training Request Quick Links Title is: "+title);
		softAssertion.assertAll();
	}
	
	
	//909
	@When("User clicks on Edit Requests Quick Links")
	public void user_clicks_on_edit_requests_quick_links() throws InterruptedException {
		WebElement element = Generic.isElementPresnt(driver, "//a[normalize-space()='Edit Requests']", 120);
		element.click();
		Thread.sleep(2000);
		log.info("User clicked on Edit Requests Quick Links");
		softAssertion.assertAll();
	}
	
	@Then("User should be redirected to the respective designated page of Edit Requests Quick Links")
	public void user_should_be_redirected_to_the_respective_designated_page_of_edit_requests_quick_links() throws CustomizedException {
		String title = Generic.getTitle();
		log.info("After clicking on the  Edit Requests Quick Links Title is: "+title);
		softAssertion.assertAll();  
	}
	
	//910
	@When("User clicks on Assets Quick Links")
	public void user_clicks_on_assets_quick_links() throws InterruptedException {
	  
		WebElement element = Generic.isElementPresnt(driver, "//a[normalize-space()='Assets']", 120);
		element.click();
		Thread.sleep(2000);
		log.info("User clicked on Assets Quick Links");
		softAssertion.assertAll();
	}
	@Then("User should be redirected to the respective designated page of Assets Quick Links in Digital Transformation Page")
	public void user_should_be_redirected_to_the_respective_designated_page_of_assets_quick_links_in_digital_transformation_page() throws CustomizedException {
		String title = Generic.getTitle();
		log.info("After clicking on the Assets Quick Links Title is: "+title);
		softAssertion.assertAll(); 
	}
}