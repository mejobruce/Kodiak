Feature: KKitchen Under Contact us  TC 471


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: To validate click action on Monthly Seasonal Ingredients title in Kitchen Page TC 472
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at Monthly Seasonal Ingredients Section
When User clicks on Monthly Seasonal Ingredients tile
#Expected
Then It should open respective page 


 





