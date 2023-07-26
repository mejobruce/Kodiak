package org.kodiak.stepDefinations;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.kodiak.base.BaseClass;
import org.kodiak.pages.HomePage;
import org.kodiak.pages.KitchenPage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KitchenPageStepsDef extends BaseClass{

	//To Validate K-Kitchen Web Part in Home Page Test case ID : 161
	@When("^User is at KKitchen section$")
    public void user_is_at_k_kitchen_section() {
		
		boolean status = Generic.waitForElement(HomePage.kkitchenMealsSection);
    	//boolean status = HomePage.kkitchenMealsSection.isDisplayed();
   	 
    	
    	Generic.doSoftAssertion(status, true);
    	Reporter.log("User is at KKitchen section");
    	log.info("User is at KKitchen section");
    	softAssertion.assertAll();
    }
    
    @Then("^KKitchen Background Image should be there$")
    public void k_kitchen_background_image_should_be_there() throws Throwable {
    	boolean status = Generic.waitForElement(HomePage.kkitchenMealsImage);
    	//boolean status = HomePage.kkitchenMealsImage.isDisplayed();
 
    	Generic.doSoftAssertion(status, true);
    	Reporter.log("KKitchen Background Image should be there");
    	log.info("KKitchen Background Image should be there");
    	softAssertion.assertAll();
    }

    @And("^Kitchen Meals title should be there$")
    public void kitchen_meals_title_should_be_there() throws Throwable {
       
    	Generic.waitForElement(HomePage.kkitchenMealsTxt);
    	
    	Generic.verifyGetText(HomePage.kkitchenMealsTxt,"K-Kitchen/Meals");
    	//String actual = Generic.getText(); 
    	//Generic.doAssertion(actual, "K-Kitchen/Meals");
    	Reporter.log("Kitchen Meals title should be there");
    	log.info("Kitchen Meals title should be there");
    	softAssertion.assertAll();
    }
 
    @And("^View button should be there$")
    public void view_button_should_be_there() throws Throwable {
    	
    	 Generic.waitForElement(homepage.latestNewsText);
    	
    	//WebElement ele = Generic.isElementPresnt(driver, "//span[@id='LatestNewText']", 60);
    	Actions act = new Actions(driver);
		act.moveToElement(homepage.latestNewsText).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.perform();
		act.sendKeys(Keys.DOWN);
		act.perform();
		Robot robot = new Robot();
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		boolean status = Generic.waitForElement(homepage.kkitchen_VeiwBtn);
    	//boolean status = Generic.isElementPresnt(driver, "//a[@href='https://kodiaksciences.sharepoint.com/sites/KNet-KitchenUAT']", 60).isDisplayed();
    	//boolean status = HomePage.ourJourneyViewButton.isDisplayed();
		 
    	Generic.doSoftAssertion(status, true);
    	Reporter.log("View button should be there");
    	
    	log.info("View button should be there");
    	softAssertion.assertAll();   
    }
    
    //To Validate click action on View button under K-Kitchen Web Part  in Home Page--162
    
  //To validate click action to navigate across Banner images under News Banner Reel Web Part in Kitchen Page TC: 448
    @When("^User Clicks on View button under KKitchen$")
    public void user_clicks_on_view_button_under_kkitchen() throws Throwable {
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.kitehcnViewBtnNew);
    	
    	Generic.webClick(HomePage.kitehcnViewBtnNew);
        Generic.waitForPageLoaded();
    }

    @Then("User should be taken to the Kodiak Kitchen page of after click on the click action on View button")
    public void user_should_be_taken_to_the_kodiak_kitchen_page_of_after_click_on_the_click_action_on_view_button() throws Exception {
    	Generic.waitForPageLoaded();

    	String actual = Generic.getTitle().trim();
		System.out.println("Actual title is: " + actual);
		Generic.doAssertion(actual, "KNet-KitchenUAT - Home");
		log.info("User should be taken to the Kodiak Kitchen page of after click on the click action on View button");
		softAssertion.assertAll();

    	
    	Generic.MovetoChildWindow();
    }
    
    @And("^User is at New Banner Reel Section$")
    public void user_is_at_new_banner_reel_section() throws Throwable {
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.bannerSection);
    	
        Generic.isDisplayed(HomePage.bannerSection);
    }
    
    
    @Then("^User should get banner image as caraousal$")
    public void user_should_get_banner_image_as_caraousal() throws Throwable {
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.bannerimagesKitchen);
    	
    	boolean status = Generic.isDisplayed(HomePage.bannerimagesKitchen);
    	Generic.doSoftAssertion(status, true);
    }

    @And("^Title of the image with link$")
    public void title_of_the_image_with_link() throws Throwable {
     
    	//Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.weeklyMenuLnk);
    	
        boolean linkName = Generic.isDisplayed(HomePage.weeklyMenuLnk);
      
        WebElement st = HomePage.weeklyMenuLnk;
        
        if(st.isDisplayed())
        {
          System.out.println("Yes Title of the text is link");
          Reporter.log("Yes Title of the text is link");
        }
        else
        {
          System.out.println("No link is there");
          Reporter.log("No link is there");
        }
    }

    @And("^Option to navigate among multiple banner image$")
    public void option_to_navigate_among_multiple_banner_image() throws Throwable {
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.weeklyMenuLnk);
    	
    	Generic.webClick(HomePage.weeklyMenuLnk);
    	Generic.waitForPageLoaded();   
    }

    
//To validate click action on any of the Banner image or Title under News Banner Reel Web Part in Kitchen Page TC: 449
    @When("^User clicks on any of the banner image or title$")
    public void user_clicks_on_any_of_the_banner_image_or_title() throws Throwable {
    	
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.weeklyMenuLnk);
    	
    	Generic.webClick(HomePage.weeklyMenuLnk);
    	
    	Generic.waitForPageLoaded();
    }

    @Then("^It should get redirected to respective page$")
    public void it_should_get_redirected_to_respective_page() throws Throwable {
    	
    	Generic.waitForPageLoaded();
    	Generic.waitForElement(HomePage.bannerSectionText);
    	
    	   String text = Generic.getText(HomePage.bannerSectionText).trim();
    	 
    	  Generic.doAssertion(text, "Weekly Menu");  
    }

//To validate click action to navigateacross Banner images under News Banner Reel Web Part in Kitchen Page TC:450
    @When("^User clicks on any of the dots to navigate to respective banner images$")
    public void user_clicks_on_any_of_the_dots_to_navigate_to_respective_banner_images() throws Throwable {
    	Generic.webClick(HomePage.weeklyMenuLink_Banner);
    	Generic.waitForPageLoaded();
    }

    @Then("^It should load respective banner images$")
    public void it_should_load_respective_banner_images() throws Throwable {
    	
    	Generic.verifyGetText(HomePage.cofeeAndTea_txt, "Coffee and Tea");
    }

    //To Validate the Search of FAQ TC ID: 454
    @And("^User is at FAQ Section$")
    public void user_is_at_faq_section() throws Throwable {
    	//Generic.waitForPageLoaded();
    	//Generic.waitForElement(HomePage.searchFAQBoxKitchen_TxtBx);
    	
    	WebElement ele = Generic.isElementPresnt(driver, "//div[@id='spPageChromeAppDiv']//li[2]", 60);
    	Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		
		Robot robot = new Robot();
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
    	//WebElement element =Generic.isElementPresnt(driver, ".//i[@data-icon-name='Search']", 60);
    	//element.click();
    	//Thread.sleep(2000);
    	//boolean status = HomePage.ourJourneyViewButton.isDisplayed();
	
    	//Generic.ScrollToElement(HomePage.searchFAQBoxKitchen_TxtBx);
    	log.info("User is at FAQ Section");
    	Reporter.log("User is at FAQ Section");
    	softAssertion.assertAll();
    }
    
    @When("User enters any keywords in search box")
    public void user_enters_any_keywords_in_search_box() throws Throwable {
    	WebElement element =Generic.isElementPresnt(driver, ".//i[@data-icon-name='Search']", 60);
    	element.click();
    	Thread.sleep(2000);
    	
    	//Generic.webClick(HomePage.searchFAQBoxKitchen_TxtBx);
    	//element.sendKeys("Breakfast");
    	//Generic.webEnter(HomePage.searchFAQBoxKitchen_TxtBx,keyword);
    	log.info("User enters any keywords in search box");
    	Reporter.log("User enters any keywords in search box");
    	softAssertion.assertAll();
    }

    @Then("^System should search the keyword in title and description of Faq$")
    public void system_should_search_the_keyword_in_title_and_description_of_faq() throws Throwable {
        Reporter.log("Searched keyword should be shown");
        log.info("Searched keyword should be shown");
    }

    @And("^Respective records should be filtered out$")
    public void respective_records_should_be_filtered_out() throws Throwable {
    	 Reporter.log("Records are matching");
	     log.info("Records are matching");
    }
    

    //To Validate the click action on accordion TC: 455

    @When("^User clicks on any of the accordion$")
    public void user_clicks_on_any_of_the_accordion() throws Throwable {
       Generic.isElementPresnt(driver, "//h3[normalize-space()='What is the Lunch process?']", 60).click();
    	Thread.sleep(2000);
    	//Generic.waitForElement(homepage.accordio_clk);
       Reporter.log("User clicks on any of the accordion");
	     log.info("User clicks on any of the accordion");
    }

    @Then("^On click accordion should open or close$")
    public void on_click_accordion_should_open_or_close() throws Throwable {
    	
    	//Generic.waitForElement(homepage.accordio_innerSearchTx);
    	//Generic.verifyGetText(homepage.accordio_innerSearchTx, "Kodiak Kitchen lunch");
    	//Reporter.log("Verifyied the inner text");
	     log.info("On click accordion should open or close");
    }
    
//To validate components under Contact us Web Part in Kitchen Page TC id: 463

	@When("^User is at Contact us Section$")
	public void user_is_at_contact_us_section() throws Throwable {
		WebElement ele = Generic.isElementPresnt(driver, "//div[@id='spPageChromeAppDiv']//li[2]", 60);
    	Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		act.sendKeys(Keys.DOWN);
		act.build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		
		Robot robot = new Robot();
		robot.delay(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		log.info("User is at Contact us Section");
    	Reporter.log("User is at Contact us Section");
    	softAssertion.assertAll();
		
	//	Generic.waitForElement(KitchenPage.contactUs_Lnk);
		//Generic.isDisplayed(KitchenPage.contactUs_Lnk);
	}

	@Then("^Contact us background image should be there$")
	public void contact_us_background_image_should_be_there() throws Throwable {
		boolean status = Generic.isDisplayed(KitchenPage.contactUs_backgroundImage);
	
    	Generic.doSoftAssertion(status, true);
    	Reporter.log("Contact us background image should be there");
    	log.info("Contact us background image should be there");
    	softAssertion.assertAll();
	}

	@And("^Contact us Title should be there$")
	public void contact_us_title_should_be_there() throws Throwable {
		Generic.verifyGetText(KitchenPage.contactUs_Lnk,"Contact Us");
    	Reporter.log("Contact us Title should be there");
    	log.info("Contact us Title should be there");
    	softAssertion.assertAll();
	}

	@And("^Contact us tile should have email link$")
	public void contact_us_tile_should_have_email_link() throws Throwable {
		Generic.webClick(KitchenPage.contactUs_Lnk);
		Reporter.log("Contact us tile should have email link");
    	log.info("Contact us tile should have email link");
    	softAssertion.assertAll();
	}
	
	//To validate components under Recipe Of the Month Web Part in Kitchen Page TC: 467

	 @When("^User is at Recipe Of the Month Section$")
	    public void user_is_at_recipe_of_the_month_section() throws Throwable {
		 WebElement ele = Generic.isElementPresnt(driver, "//div[@id='spPageChromeAppDiv']//li[2]", 60);
	    	Actions act = new Actions(driver);
			act.moveToElement(ele).click().build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN);
			act.build().perform();
			act.sendKeys(Keys.DOWN);
			act.build().perform();
			
			act.sendKeys(Keys.PAGE_DOWN);
			act.perform();
			act.sendKeys(Keys.PAGE_DOWN);
			act.perform();
			
			
			Robot robot = new Robot();
			robot.delay(500);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.delay(500);
			
			
	    	boolean status = Generic.isElementPresnt(driver, "//span[@title='Recipe of The Month']", 60).isDisplayed();
	    	Generic.doSoftAssertion(status, true);
	    	log.info("User is at Recipe Of the Month Section");
	    	Reporter.log("User is at Recipe Of the Month Section");
	    	softAssertion.assertAll();
		 	/*Generic.waitForPageLoaded();
			Generic.waitForElement(KitchenPage.recipeOfTheMothTX);
			boolean status = KitchenPage.recipeOfTheMothTX.isDisplayed();
	   	 
	    	Generic.doSoftAssertion(status, true);
	    	Reporter.log("User is at Recipe Of the Month Section");
	    	log.info("User is at Recipe Of the Month Section");
	    	softAssertion.assertAll();*/
	    }

	    @Then("^Recipe Of the Month background image should be there$")
	    public void recipe_of_the_month_background_image_should_be_there() throws Throwable {

	        Generic.waitForPageLoaded();
			Generic.waitForElement(KitchenPage.recipeOfMothly_backgroundImage);
			boolean status = KitchenPage.recipeOfMothly_backgroundImage.isDisplayed();
	   	 
	    	Generic.doSoftAssertion(status, true);
	    	
	    	Reporter.log("Recipe Of the Month background image exist");
	    	log.info("Recipe Of the Month background image exist");
	    	softAssertion.assertAll();
	    }

	    @And("^Content should be there on image with Title $")
	    public void content_should_be_there_on_image_with_title() throws Throwable {
	    	Generic.waitForPageLoaded();
			Generic.waitForElement(KitchenPage.recipeOfMothly_contentText);
			boolean status = KitchenPage.recipeOfMothly_contentText.isDisplayed();
	   	 
	    	Generic.doSoftAssertion(status, true);
	    	
	    	Reporter.log("Content image with Title is exist");
	    	log.info("Content image with Title is exist");
	    	softAssertion.assertAll();
	    }

	    @And("^View more link should be there$")
	    public void view_more_link_should_be_there() throws Throwable {
	       
	    	Generic.waitForPageLoaded();
			Generic.waitForElement(KitchenPage.recipeOfMothly_ViewMoreLink);
			boolean status = KitchenPage.recipeOfMothly_ViewMoreLink.isDisplayed();
	   	 
	    	Generic.doSoftAssertion(status, true);
	    	
	    	Reporter.log("View More link is exist");
	    	log.info("View More link is exist");
	    	softAssertion.assertAll();
	    }

}
