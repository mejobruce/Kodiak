Feature: News Banner Reel View button under K-Kitchen TC 450

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
Scenario: To validate click action to navigateacross Banner images under News Banner Reel Web Part in Kitchen Page TC 450
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at New Banner Reel Section
When User clicks on any of the dots to navigate to respective banner images
#Expcted
Then It should load respective banner images
And close browser