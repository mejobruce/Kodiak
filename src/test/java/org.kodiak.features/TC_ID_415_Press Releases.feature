Feature: Press Releases Test case  ID:415
  
  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |

@regression
  Scenario: To Validate click action on any of the Press Releases Web Part  in Home Page ID:415
    Given Home page is loaded
    When User scrolls to Press Releases
    And User clicks on any of the Press Release
    #Expected:
    Then It should open in new tab or window of the default browser
    And close browser
