Feature: My Application TC 418

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
    
@regression
Scenario: To Validate the click action on any of the Application under My Application Web Part Test Case ID: 418
When User scrolls to My Application
And User clicks on any of the Application
#Expcted
#Then System should authenticate the user with SSO
And It should open in new tab or window of default browser #need to discuss
#And User should be able to view the respective contents
And close browser