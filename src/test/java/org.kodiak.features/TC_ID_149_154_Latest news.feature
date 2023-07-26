Feature: Latest news Web Part Homepage Test

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
  
   @smoke @sanity @regression 
  Scenario: To Validate Latest news page load Test Case ID : 149
    Given Home page is loaded
    When User is in Latest News Section
    #Expected
    Then There should be 5 Latest News Displayed
   	And close browser 

  @sanity @regression
  Scenario: To Validate the click action on News Title and News Image of latest News Web Part Test Case ID : 154
    Given Home page is loaded
    When User scrolls to Latest News section
    And User clicks on News Title
    #Expected
    Then News details should open in new default Tab or Browser
    And close browser
