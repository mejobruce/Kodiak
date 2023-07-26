Feature: Press Releases  Test case ID:414

Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |

@regression
Scenario: To Validate Press Releases Web Part  in Home Page Test case ID:414
Given Home page is loaded
When User scrolls to Press Releases
#Expected
Then View All link should be displayed
And Total 3 Press Release shoud be displayed
And Image of Press Release should be there
And Title of Press release should be there
#And Author name should be there
#And Number of Views of Press Release should be there
#And Duration of Press Release should be There
And close browser
