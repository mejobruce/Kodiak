Feature: Search of FAQ TC 454

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: To Validate the Search of FAQ TC 454
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at FAQ Section
When User enters any keywords in search box
#Expected
Then System should search the keyword in title and description of Faq
And Respective records should be filtered out
And close browser

