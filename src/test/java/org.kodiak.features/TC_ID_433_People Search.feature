
Feature: People Search 

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
    
Scenario: To Validate Search by providing  keywords  in search box for People Search Web Part ==> Test Case ID: 433
And User scrolls to People Search
And User provided valid keywords in search box
And User clicks on Search icon
#Expected
Then System should return the matching keyword records
And close browser 
