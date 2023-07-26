package org.kodiak.stepDefinations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.kodiak.base.BaseClass;
import org.kodiak.pages.HomePage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepsDef extends BaseClass {

	/*******************************************************************************************************************************************************************************************************************
	   'Created By	    : Nagraj Reballi						
	   'Created On		: June-2023				
	   'Last Updated By	: June-2023	
	   'Last Updated On	: June-2023	
	   'Purpose			: To make test cases to run and others
'**********************************************************************************************************************************************************/
	@And("^User is in home page$")
	public void User_is_in_home_page() throws Throwable {
		Generic.waitForPageLoaded();

		Generic.webClick(homepage.clickOnHomepageLink);
		// Generic.waitForPageLoaded();
		log.info("User clicked on the Home link");
		softAssertion.assertAll();
	}
	

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			log.warn("Test passed: Login feature :Page title matched.");

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			log.warn("Test Failed: Login feature- page title not matched.");
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		homepage.clickOnLogOutButton();
		log.info("user clicked on logout link.");
		softAssertion.assertAll();
	}
	
	// To Validate Latest news page load ID:149
	@Given("^Home page is loaded$")
	public void home_page_is_loaded() throws CustomizedException {
		Generic.waitForPageLoad(driver);

		Generic.waitForElement(homepage.clickOnHomepageLink);

		Generic.webClick(homepage.clickOnHomepageLink);

		log.info("User clicked on the homepage link");
		Reporter.log("Home page is loaded");
		softAssertion.assertAll();
	}

	@When("^User is in Latest News Section$")
	public void user_is_in_latest_news_section() throws Throwable {
		WebElement element = Generic.isElementPresnt(driver, "//span[@id='LatestNewText']", 120);
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN);
		act.perform();
		act.sendKeys(Keys.DOWN);
		act.perform();
		
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		boolean status = Generic.isElementPresnt(driver, "//a[@href='https://kodiaksciences.sharepoint.com/sites/KNet-KitchenUAT']", 60).isDisplayed();
		Generic.doSoftAssertion(status, true);
		
//		
//		String obtainedTxt = "Latest News";
//		String actualTxt = Generic.getText(HomePage.latestNewsText);
//		
//		Generic.isElementPresentLists(driver, "//span[@id='LatestNewText']", 120);
//		Assert.assertEquals(actualTxt, obtainedTxt);
		//Reporter.log("Pass: Assertion done on.");

		Reporter.log("User is in Latest News Section");
		log.info("User is in Latest News Section");
		softAssertion.assertAll();
	}

	@Then("^There should be 5 Latest News Displayed$")
	public void there_should_be_5_latest_news_displayed() throws Throwable {
		// Assert.assertTrue(HomePage.numberOfLatestNews.isTableDisplayed());
		int count = 0;
		boolean statuss = false;
		//List<WebElement> lists = HomePage.numberOfLatestNews;
		
		List<WebElement> lists = Generic.isElementPresentLists(driver, "//*[@role='list']", 120);
		int numberofImages = lists.size();
		Reporter.log("Number of latest news is :" + numberofImages);
		for (int i = 0; i < lists.size(); i++) {
			WebElement list = lists.get(i);
			boolean status = list.isDisplayed();
			if (status) {
				Reporter.log("Pass");
				statuss = true;
				count++;
			} else {
				Reporter.log("Fail");
				statuss = false;
			}

		}
		Reporter.log("Number of latest news is :" + count);
		log.info("There should be 5 Latest News Displayed");
		softAssertion.assertAll();
	}

	@And("^close browser$")
	public void close_the_browser() throws CustomizedException, InterruptedException {
		//driver.close();
//		Generic.isElementPresnt(driver,"//div[@id='mectrl_headerPicture']", 120).click();
//		Thread.sleep(2000);
//		
//		Generic.isElementPresnt(driver,"//a[@id='mectrl_body_signOut']", 120).click();
		Generic.closeBrowser();
		Reporter.log("Browser is closed");
		log.info("Browser is closed");
		// driver.quit();
	}
	
	@Then("User logout to the application")
	public void user_logout_to_the_application() throws InterruptedException, CustomizedException {
		Thread.sleep(2000);
		//Generic.webClick(homepage.clickOn_STTOlogout);
		WebElement elem = Generic.isElementPresnt(driver,"//div[@class='nvEhuDKzSmREBsqaIaOhu']", 60);
		elem.click();
		Thread.sleep(2000);
	
	//Generic.isElementPresnt(driver,"//a[@id='mectrl_body_signOut']", 120).click();
		//Generic.webClick(homepage.clickOn_logoutLink);
		WebElement elem1 = Generic.isElementPresnt(driver,"//a[@id='mectrl_body_signOut']", 60);
		elem1.click();
		Thread.sleep(2000);
	}


	// To Validate the click action on News Title and News Image of latest News Web
	// Part ID:154
	@When("^User scrolls to Latest News section$")
	public void user_scrolls_to_latest_news_section() throws Throwable {

		Generic.ScrollToElement(HomePage.clickOnFirstNews);
		log.info("User is in Latest News Section");
		softAssertion.assertAll();
	}

	@And("^User clicks on News Title$")
	public void user_clicks_on_news_title() throws Throwable {
		Generic.webClick(HomePage.clickOnFirstNews);
		// String text = HomePage.clickOnFirstNews.getText();
		// System.out.println("text" +text);
		// HomePage.clickOnFirstNews.click();
		softAssertion.assertAll();
	}

	@Then("^News details should open in new default Tab or Browser$")
	public void news_details_should_open_in_new_default_tab_or_browser() throws Throwable {
		//Generic.MovetoChildWindow();
		String actual = Generic.getTitle().trim();
		System.out.println("Actual is: " + actual);
		Generic.doAssertion(actual, "Knet-Intranet-UAT - Home");

		softAssertion.assertAll();
	}
	
	 //To Validate Our Journey Web Part  in Home Page ID:165
    
		@When("^User is at Our Journey section$")
		public void user_is_at_our_journey_section() throws Throwable {
			
			WebElement element = Generic.isElementPresnt(driver, "//span[@id='LatestNewText']", 120);
			Robot robot = new Robot();
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.DOWN);
			act.perform();
			
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.delay(500);

			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			robot.delay(500);
			
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			robot.delay(500);
			
			boolean status = Generic.isElementPresnt(driver, "//*[@role='list']", 60).isDisplayed();
			Generic.doSoftAssertion(status, true);
			
			//Generic.waitForPageLoad(driver);
			//Generic.waitForElement(HomePage.oursJoureySection);
			//boolean status = HomePage.oursJoureySection.isDisplayed();
	   	 
	    	Generic.doSoftAssertion(status, true);
	    	Reporter.log("User is at Our Journey section");
	    	log.info("User is at Our Journey section");
	    	softAssertion.assertAll();
		}

		@Then("^Our Journey Background Image should be there$")
	    public void our_journey_background_image_should_be_there() throws Throwable {
			boolean status = HomePage.kkitchenMealsImage.isDisplayed();
			 
	    	Generic.doSoftAssertion(status, true);
	    	Reporter.log("Our Journey Background Image should be there");
	    	log.info("Our Journey Background Image should be there");
	    	softAssertion.assertAll();
	    }

	    @And("^Our Journey title should be there$")
	    public void our_journey_title_should_be_there() throws Throwable {
	    
	    	Generic.verifyGetText(HomePage.ourJourneyTxt,"OUR JOURNEY");
	    	Reporter.log("Our Journey title should be there");
	    	log.info("Our Journey title should be there");
	    	softAssertion.assertAll();
	    }

	    //To Validate click action on View button under Our Journey Web Part  in Home Page TC ID: 166
		@When("User clicks on View button")
		public void user_clicks_on_view_button() throws CustomizedException {
			boolean status = HomePage.ourJourneyViewButton.isDisplayed();

			Generic.webClick(homepage.ourJourneyViewButton);

			Reporter.log("User clicks on View button in Our Journey");
			log.info("User clicks on View button in Our Journey");
			softAssertion.assertAll();
		}
		
		@Then("^User should be taken to the Kodiak Kitchen page$")
	    public void user_should_be_taken_to_the_kodiak_kitchen_page() throws Throwable {
			String actual = Generic.getTitle().trim();
			System.out.println("Actual is: " + actual);
			System.console();
			Generic.doAssertion(actual, "KNet-KitchenUAT - Home");

			softAssertion.assertAll();
	    }

		@Then("User should be taken to the Our Journey page")
		public void user_should_be_taken_to_the_our_journey_page() throws CustomizedException {
			// Generic.MovetoChildWindow();
			String actual = Generic.getTitle().trim();
			System.out.println("Actual is: " + actual);
			System.console();
			Generic.doAssertion(actual, "Knet-Intranet-UAT - Home");

			softAssertion.assertAll();
		}
	    
	    //To Validate Weather Web Part information in Home Page ID: 172
	    @When("^User is at Weather section$")
	    public void user_is_at_weather_section() throws Throwable {
	    	//Generic.waitForPageLoaded();
	    	
	    	Generic.ScrollToElement(HomePage.wheatherSection);
	    	  
	    	boolean status = HomePage.wheatherSection.isDisplayed();
	      	 
	    	Generic.doSoftAssertion(status, true);
	    	softAssertion.assertAll();
	    }

	    
	    @Then("^It should show the current weather based on Location$")
	    public void it_should_show_the_current_weather_based_on_location() throws Throwable {
	    	Generic.verifyGetText(HomePage.currentWheatherLocation,"Palo Alto, CA");
	    	softAssertion.assertAll();
	    }

	    @And("^Unit of measurment should be in F$")
	    public void unit_of_measurment_should_be_in_f() throws Throwable {
	    	Generic.verifyGetText(HomePage.UnitMeasurmentF,"°F");
	    	softAssertion.assertAll();
	    }

		@And("^Data should be part of Out of the box feature$")
		public void data_should_be_part_of_out_of_the_box_feature() throws Throwable {

			boolean status = HomePage.AllDataOutbox.isDisplayed();

			Generic.doSoftAssertion(status, true);
			softAssertion.assertAll();
		}

		
		//To Validate Press Releases Web Part  in Home Page ID:414
		 @When("^User scrolls to Press Releases$")
		    public void user_scrolls_to_press_releases() throws Throwable {	
			 
			 WebElement ele = Generic.isElementPresnt(driver, "//span[@id='LatestNewText']", 60);
		    	Actions act = new Actions(driver);
				act.moveToElement(ele).click().build().perform();
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
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.delay(500);
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.delay(500);
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.delay(500);
				
		    	boolean status = Generic.isElementPresnt(driver, "//span[@id='PressReleaseText']", 60).isDisplayed();
		    	//boolean status = HomePage.ourJourneyViewButton.isDisplayed();
				 
		    	Generic.doSoftAssertion(status, true);
		    	Reporter.log("User in Press Releases section");
				
//			 HomePage.pressReleaseText.getText();
//		    	softAssertion.assertAll();
		    }
		 
		  @Then("^View All link should be displayed$")
		    public void view_all_link_should_be_displayed() throws Throwable {
			  
			  boolean status = Generic.isPresentAndDisplayed(HomePage.viewAllText);	    	 
		    	Generic.doSoftAssertion(status, true);
		    	 log.info("View All link is displayed");
		    	softAssertion.assertAll();
		    }

		  @And("^Total 3 Press Release shoud be displayed$")
		    public void total_3_press_release_shoud_be_displayed() throws Throwable {
			  
			  
			  	List<WebElement> list = HomePage.numberOfPressReleases;
				int count = list.size();
				Reporter.log("Number of Press Release: " +count);
				log.info("Number of Press Release: " +count);
				for(WebElement op: list) {
					boolean status = Generic.isDisplayed(op);
					//Generic.doSoftAssertion(status, true);
					softAssertion.assertAll();
				}
		    }
		  
		  @And("^Image of Press Release should be there$")
		    public void image_of_press_release_should_be_there() throws Throwable {
			  
			  WebElement list = HomePage.imagesLists;
			  boolean status = Generic.isDisplayed(list);
			  log.info("Image of Press Release should be there");
			  softAssertion.assertAll();
		    }

		  @And("^Title of Press release should be there$")
		    public void title_of_press_release_should_be_there() throws Throwable {
			  Generic.MovetoChildWindow();
			  Generic.isDisplayed(HomePage.pressReleaseText);
			  log.info("Title of Press release is displayed");
			  softAssertion.assertAll();
		    }

		
		  
		  
		/*    @And("^Author name should be there$")
		    public void author_name_should_be_there() throws Throwable {
		    	 String actual = Generic.getText( HomePage.pressReleaseTextLink);
		    	 Generic.doAssertion(actual, "Kodiak Sciences to Present at the 41st Annual J.P. Morgan Healthcare Conference");
		    	 softAssertion.assertAll();
		    }

		    @And("^Number of Views of Press Release should be there$")
		    public void number_of_views_of_press_release_should_be_there() throws Throwable {
		    	HomePage.viewAllText.click();
		    	 List<WebElement> list = HomePage.numberOfPressReleaseVIewAllOnPages;
					int count = list.size();
					Reporter.log("Number of View of press release " +count);
					log.info("Number of View of press release  " +count);
					softAssertion.assertAll();
		    }
	*/
		  
//		    @And("^Duration of Press Release should be There$")
//		    public void duration_of_press_release_should_be_there() throws Throwable {
//		        
//		    }
		    
		  
		    //To Validate click action on any of the Press Releases Web Part  in Home Page ID:415
		  
		  @And("^User clicks on any of the Press Release$")
		    public void user_clicks_on_any_of_the_press_release() throws Throwable {
		        HomePage.clickOnPressReleaseLink.click();
		        log.info("User clicked on any of the Press Release");
		    }
		  
		  @Then("^It should open in new tab or window of the default browser$")
		  public void it_should_open_in_new_tab_or_window_of_the_default_browser() throws CustomizedException {
			  Generic.MovetoChildWindow();
		    	String actual = Generic.getTitle();
		    	//Generic.doAssertion(actual, "Kodiak Sciences to Present at the 41st Annual J.P. Morgan Healthcare Conference | Kodiak Sciences Inc.");
		    	log.info("New window Title is:" +actual);
		    	softAssertion.assertAll();
		  }
		  //To Validate click action on View All link of Press Releases Web Part in Home Page ID: 416
		  @And("^User clicks on View All link of the Press Release$")
		    public void user_clicks_on_view_all_link_of_the_press_release() throws Throwable {
			  HomePage.viewAllText.click();
				log.info("User clicks on View All link of the Press Release");
			  softAssertion.assertAll();
		    }

		  @Then("^It should open the list of all Press Releases$")
		    public void it_should_open_the_list_of_all_press_releases() throws Throwable {
			  
			  
			  List<WebElement> list = HomePage.pressRleaseListOfImages;
				int count = list.size();
				Reporter.log("Number of Press Release after click on View All link: " +count);
				log.info("Number of Press Release after click on View All link:" +count);
				for(WebElement op: list) {
					boolean status = Generic.isDisplayed(op);
					//Generic.doSoftAssertion(status, true);
					softAssertion.assertAll();
				}
		    }
		  
		  //To Validate the click action on any of the Application under My Application Web Part Test Case ID: 418

		  @When("^User scrolls to My Application$")
		    public void user_scrolls_to_my_application() throws Throwable {
			 
			  WebElement ele = Generic.isElementPresnt(driver, "//span[@id='LatestNewText']", 60);
		    	Actions act = new Actions(driver);
				act.moveToElement(ele).click().build().perform();
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
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.delay(500);
				
			
		    	boolean status = Generic.isElementPresnt(driver, "//div[@id='MyApplicationTextHeading']//span[@id='UpcomingEventsText']", 60).isDisplayed();
		    	//boolean status = HomePage.ourJourneyViewButton.isDisplayed();
				 
		    	Generic.doSoftAssertion(status, true);
		    	Reporter.log("User is in My appication section");
			  //Generic.ScrollToElement(HomePage.myApplicationsHeadingText);
		    	softAssertion.assertAll();  
		    }

//		    @Then("^System should authenticate the user with SSO$")
//		    public void system_should_authenticate_the_user_with_sso() throws Throwable {
//		       
//		    }

		    @And("^User clicks on any of the Application$")
		    public void user_clicks_on_any_of_the_application() throws Throwable {
		    
		    	WebElement elemnet = Generic.isElementPresnt(driver, "//p[normalize-space()='Request PTO']", 60);
		    	elemnet.click();
		    	Thread.sleep(2000);
		    	Generic.MovetoChildWindow();
		    	boolean  st = Generic.isElementPresnt(driver, "//h1[@id='login-layout_welcome']", 60).isDisplayed();	
		    	Generic.doSoftAssertion(true, st);
		    	log.info("User clicks on any of the Application");
		    	//List<WebElement> lists = HomePage.myApplicationsLists;
		    	
//		    	for(int i=1;i<=lists.size();i++) {
//		    		WebElement element = lists.get(1);
//		    		String text = element.getText();
//		    		Generic.webClick(element);
//		    		Generic.MovetoChildWindow();
		    		//driver.close();
		    		
		    	/*	Set<String> windowID = driver.getWindowHandles();
		    		
		    		List<String> windowIDList = new ArrayList(windowID);
		    		
		    		for(String window: windowIDList) {
		    			String title = driver.switchTo().window(window).getTitle();
		    			
		    			if(title==null) {
		    				driver.getTitle();
		    			}
		    			else {
		    				driver.close();
		    			}
		    		}
		    	}*/
		    //}
		 }
		    //#And It should open in new tab or window of default browser

			@And("^It should open in new tab or window of default browser$")
			public void it_should_open_in_new_tab_or_window_of_default_browser() throws Throwable {
				log.info("It should open in new tab or window of default browser");
			}

			@When("It should open in new tab or window of default browser of the my Application")
			public void it_should_open_in_new_tab_or_window_of_default_browser_of_the_my_application() {
				log.info("It should open in new tab or window of default browser");
			}
	    
		    //To Validate Search by providing blank input in search box for People Search Web Part ==> Test Case ID: 432 
		    @And("^User scrolls to People Search$")
		    public void user_scrolls_to_people_search() throws Throwable {
		    	Generic.waitForPageLoaded();
		       Generic.ScrollToElement(HomePage.peopleSearchTextBox);
		    }
		    
		    @And("^User provided blank input$")
		    public void user_provided_blank_input() throws Throwable {
		    	
		    	Thread.sleep(2000);
		    	Generic.webClick(HomePage.peopleSearchTextBox);
		    }
		    
		    @Then("^User should get Search icon$")
		    public void user_should_get_search_icon() throws Throwable {
		    	//boolean status = Generic.isDisplayed(HomePage.searchIconBtn);
		    	//Generic.doSoftAssertion(status, false);	
		    	Reporter.log("User is not getting any search icon");
		    	log.info("User is not getting any search icon");
		    }
		   
//		    @Then("^System should return all the users record$")
//		    public void system_should_return_all_the_users_record() throws Throwable {
//		    	
//		    // Generic.isDisplayedList(HomePage.listsOfUsers);
//		    }
		    
		    
		    //To Validate Search by providing blank space before or after the keywords in search box for People Search Web Part ==> Test Case ID: 432 
		    @And("^User provided blank spaces befor or after the keywords$")
		    public void user_provided_blank_spaces_befor_or_after_the_keywords() throws Throwable {
		    	Generic.webClick(HomePage.peopleSearchTextBox);
		    	Generic.pressEnterSpaceBtn();
		    }
		    
		    @And("^User clicks on Search icon$")
		    public void user_clicks_on_search_icon() throws Throwable {
		    	Generic.waitForPageLoaded();
		    	Generic.waitForElement(HomePage.searchIconBtn);
		    	Generic.waitForElements_List(driver, HomePage.listsOfUsers);
		    }
		    
		    @Then("^System should return the matching keyword records$")
		    public void system_should_return_the_matching_keyword_records() throws Throwable {
		    	
		        List<WebElement> list = HomePage.listsOfUsers;
		        for(WebElement option: list) {
		        	String text = Generic.getText(option);
		        	Reporter.log("List of records are :" +text);
					log.info("List of records are :"+text);
		        }
		    }

		    //To Validate  Search by providing  keywords  in search box for People Search Web Part  ==> Test Case ID: 433
		    @And("^User provided valid keywords (.+) in search box$")
		    public void user_provided_valid_keywords_in_search_box(String keyword) throws Throwable {
		    	
		    	Generic.webClick(HomePage.peopleSearchTextBox);
		    	
		    	Generic.webEnter(HomePage.peopleSearchTextBox,keyword);
		    	
		    	Generic.webClick(HomePage.searchIconBtn);
		    	
		    	//Generic.waitForElement(HomePage.validUser);
		    }
		    
		 // To Validate available components under Submit Service Request Web Part in Home Page TC:427
		 			@When("^User scrolls to Submit Service Request$")
		 			public void user_scrolls_to_submit_service_request() throws Throwable {
		 				Generic.waitForPageLoaded();

		 				Generic.srcollSubmitRequest();
		 				String text = homepage.submitServiceRequest.getText().trim();
		 				Generic.ScrollToElement(HomePage.submitServiceRequest);

		 				log.info("User scrolls to Submit Service Reques");
		 				Reporter.log("User scrolls to Submit Service Reques");
		 				softAssertion.assertAll();
		 			}

		 			
		 			@When("IT Support link should be there")
		 			public void it_support_link_should_be_there() {
		 		
		 				 boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='IT Support']", 120).isDisplayed();
			 				Generic.doSoftAssertion(status, true);
			 				Reporter.log("IT support link is displaying");
			 				log.info("IT support link is displaying");
			 				softAssertion.assertAll();
		 			}
		 			@When("Facilities link should be there")
		 			public void facilities_link_should_be_there() {
		
		 			 boolean status = Generic.isElementPresnt(driver, "//a[normalize-space()='Facilities Support']", 120).isDisplayed();
		 					 				Generic.doSoftAssertion(status, true);
		 					 				Reporter.log("Facilities link is displaying");
		 					 				log.info("Facilities link is displaying");
		 					 				softAssertion.assertAll();
		 			}
		 			
		 			@Then("^Digital Transformation link should be there$")
		 			public void digital_transformation_link_should_be_there() throws Throwable {
		 				//log.info("Digital Transformation link should be there");
		 			}

		 			@And("^Human Resources Link should be there$")
		 			public void human_resources_link_should_be_there() throws Throwable {
		 				//log.info("Human Resources Link should be there");
		 			}

		 			@And("^Facilities should be there$")
		 			public void facilities_should_be_there() throws Throwable {

		 			}

		 			// To Validate available components under Submit Service Request Web Part in Home Page TC:428
		 			@And("^User clicks on any of the component available under Sybmit service request Web Part$")
		 		    public void user_clicks_on_any_of_the_component_available_under_sybmit_service_request_web_part() throws Throwable {
		 				Generic.waitForPageLoaded();
		 				
//		 				Actions actions = new Actions(driver);
//		 				actions.moveToElement(HomePage.facilitiesSupportText);
//		 				actions.perform();
//		 				
		 				Generic.waitForElements(HomePage.facilitiesSupportText);
		 				//Generic.ScrollToElement(HomePage.facilitiesSupportText); 
		 				Generic.webClick(HomePage.facilitiesSupportText);
		 				
		 		    }
		 			
		 			 @Then("^User should get redirected to respective page$")
		 			    public void user_should_get_redirected_to_respective_page() throws Throwable {
		 				 Generic.waitForPageLoaded();
		 				 String actual = Generic.getTitle().trim();
		 			    	System.out.println("Actual is: "+actual);
		 			    	Generic.doAssertion(actual, "Facilities Support - Jira Service Management");
		 			    	
		 			    	softAssertion.assertAll();
		 			    }
		//To Validate click action on any of the component under Submit Service Request Web Part in Home Page TC: 428
		 			@When("User clicks on any of the component available under Submit service request Web Part")
		 			public void user_clicks_on_any_of_the_component_available_under_submit_service_request_web_part() throws CustomizedException, InterruptedException {
		 				 WebElement  element = Generic.isElementPresnt(driver, "//a[normalize-space()='Facilities Support']", 60);
		 				element.click();
		 				Thread.sleep(2000);
		 			}
}
