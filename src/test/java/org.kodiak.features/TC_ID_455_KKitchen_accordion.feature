Feature: KKitchen accordion TC 455


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
  @smoke1
Scenario: To Validate the click action on accordion TC 455
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at FAQ Section
When User clicks on any of the accordion
#Expcted
Then On click accordion should open or close
And close browser

