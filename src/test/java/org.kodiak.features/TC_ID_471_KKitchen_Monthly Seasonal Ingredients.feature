Feature: KKitchen Under Contact us  TC 471


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: Validate click action on View more Link under Recipe Of the Month in Kitchen Page TC 471
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at Recipe Of the Month Section
When User clicks on View more link under Recipe Of the Month tile
#Expceted
Then It should open respective page 

 





