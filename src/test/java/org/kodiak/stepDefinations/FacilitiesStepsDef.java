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
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class FacilitiesStepsDef extends BaseClass {
	
	//private WebDriver driver;
	@Given("User in Facilities page")
	public void user_in_facilities_page() throws InterruptedException, CustomizedException, AWTException {
	
		Generic.isElementPresnt(driver, "//span[contains(text(),'Home')]", 120);
		//Generic.webClick(homepage.clickOnHomepageLink);
		Thread.sleep(2000);
		
		Generic.highlightElement(homepage.mouseOverOrg);
		WebElement ele = homepage.mouseOverOrg;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
	
		Robot robot = new Robot();		
		action.sendKeys(Keys.DOWN);
		action.perform();
		
		action.sendKeys(Keys.ENTER);
		action.perform();
	    Generic.isElementPresnt(driver,"//div[@title='Facilities']", 160).click();
	
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.PAGE_DOWN);
	    act.perform();
	    act.sendKeys(Keys.PAGE_DOWN);
	    act.perform();
	    Thread.sleep(2000);
	}
	@Given("User select Location")
	public void user_select_location() {
	  
	}
	@When("User is at Location web part")
	public void user_is_at_location_web_part() {
	   
	}
	@Then("Location section should be displayed")
	public void location_section_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
			//boolean status = facilities.locations_Lnk.isDisplayed();
		boolean status= Generic.isElementPresnt(driver, "//span[@id='Locationspan']", 120).isDisplayed();
//boolean status= Generic.isElementPresntWait(driver,  facilities.locations_Lnk, 120).isDisplayed();
		Generic.doSoftAssertion(status, true);
		log.info("Location section should be displayed");
	    	softAssertion.assertAll();
	}
	
	
	//To validate lists of location Web part in Facilities page TC: 729
	@Then("Location Palo Alto California USA location should be displayed")
	public void location_palo_alto_california_usa_location_should_be_displayed() {
		try {
			WebElement element = Generic.isElementPresnt(driver, "//span[@id='Locationspan']", 120);
			// element.getText();
			Generic.verifyGetText(element, "Location: Palo Alto, California, USA");
			log.info("Location Palo Alto California USA location should be displayed");
		} catch (CustomizedException e) {
			e.printStackTrace();
		}
		finally{
			
		}
		
	}
	@Then("Right now it should be displayed only one")
	public void right_now_it_should_be_displayed_only_one() {
	   
	}
	
	//To validate location Web part 'Text' in Facilities page TC: 730
	@Then("Location: Palo Alto, California, USA location text should be displayed")
	public void location_palo_alto_california_usa_location_text_should_be_displayed() {
		try {
			WebElement element = Generic.isElementPresnt(driver, "//span[@id='Locationspan']", 120);
			Generic.verifyGetText(element, "Location: Palo Alto, California, USA");
			log.info("Location: Palo Alto, California, USA location text should be displayed");
		} catch (CustomizedException e) {
			e.printStackTrace();
		}

		finally {

		}
	}
	
	@When("User click on the Service Requests tile web part")
	public void user_click_on_the_service_requests_tile_web_part() throws InterruptedException {
		Thread.sleep(5000);
		//WebElement element = Generic.isElementPresnt(driver, "//div[contains(text(),'Custodial')]",240);
		WebElement element = Generic.isElementPresnt(driver, "//div[contains(text(),'Repairs')]",240);
		element.click();
		Thread.sleep(2000);
		log.info("User click on the Service Requests tile web part");
		softAssertion.assertAll();
		Thread.sleep(5000);
	}

	@Then("User redirected to secondary page for each service custodial page")
	public void user_redirected_to_secondary_page_for_each_service_custodial_page() throws CustomizedException {
	   Generic.MovetoChildWindow();
	   String actual = Generic.getTitle().trim();
		System.out.println("Actual is: " + actual);
		Generic.doAssertion(actual, "Facilities Support - Jira Service Management");

		softAssertion.assertAll();
	   
	}


}
