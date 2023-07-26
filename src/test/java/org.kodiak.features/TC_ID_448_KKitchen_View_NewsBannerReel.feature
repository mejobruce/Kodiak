
Feature:  K-Kitchen News Banner Reel 448

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
 @sanity
 Scenario: To validate News Banner Reel Web Part UI Component in Kitchen Page TC: 448  
Given Home page is loaded
When User Clicks on View button under KKitchen
And User is at New Banner Reel Section
#expected
Then User should get banner image as caraousal
And Title of the image with link
#And Sub-title of image
And Option to navigate among multiple banner image
#And News Banner Reel  UI should be aligned as per the Wireframe in Kitchen page
And close browser 








    