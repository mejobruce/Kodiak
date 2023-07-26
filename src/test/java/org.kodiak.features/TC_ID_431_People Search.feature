Feature: People Search  TC 431

	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
    
Scenario: To Validate Search by providing blank input in search box for People Search Web Part TC: 431
And User scrolls to People Search
And User provided blank input
#And User clicks on Search icon
#Expected
#Then System should return all the users record #Need to update it
Then User should get Search icon
And close browser 