Feature: Press Releases TC id: 416

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |


@regression
Scenario: To Validate click action on View All link of Press Releases Web Part in Home Page ID:416
Given Home page is loaded
When User scrolls to Press Releases
And User clicks on View All link of the Press Release
#Expected 
Then It should open the list of all Press Releases
And close browser
