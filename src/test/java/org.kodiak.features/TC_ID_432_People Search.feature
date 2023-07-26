Feature: People Search TC 432

 	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
   
Scenario: To Validate Search by providing blank space before or after the keywords in search box for People Search Web Part ==> Test Case ID: 432 
And User scrolls to People Search
And User provided blank spaces befor or after the keywords 
And User clicks on Search icon
#Expected
Then System should return the matching keyword records
And close browser 