Feature: KKitchen Under Contact us  TC 463


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
  
Scenario: To validate components under Contact us Web Part in Kitchen Page TC 463
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Contact us Section
#Expected
Then Contact us background image should be there
And Contact us Title should be there 
And Contact us tile should have email link
And close browser


