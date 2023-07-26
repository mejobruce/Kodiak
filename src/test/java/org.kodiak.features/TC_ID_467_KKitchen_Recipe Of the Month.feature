Feature: KKitchen Under Contact us  TC 467


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: To validate components under Recipe Of the Month Web Part in Kitchen Page TC 467
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Recipe Of the Month Section
#Expected
Then Recipe Of the Month background image should be there
And Content should be there on image with Title 
And View more link should be there



