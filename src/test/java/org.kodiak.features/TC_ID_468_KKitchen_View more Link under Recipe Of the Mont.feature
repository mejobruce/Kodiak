Feature: KKitchen Under Monthly Seasonal Ingredients  TC 468


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: To validate components under Monthly Seasonal Ingredients Web Part in Kitchen Page TC 468
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Monthly Seasonal Ingredients Section
#Expected
Then Monthly Seasonal Ingredients  background image should be there
And Monthly Seasonal Ingredients Title with content should be there 
And Monthly Seasonal Ingredients tile should have the link



 





