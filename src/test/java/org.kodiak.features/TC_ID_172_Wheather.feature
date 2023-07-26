Feature: Weather 172

 Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |


 @regression
Scenario: To Validate Weather Web Part information in Home Page ID:172
Given Home page is loaded
When User is at Weather section
#Expected: 
Then It should show the current weather based on Location
And Unit of measurment should be in F
And Data should be part of Out of the box feature
And close browser
