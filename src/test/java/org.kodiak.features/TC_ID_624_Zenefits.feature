Feature: Zenefits Web Part TC 624

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  

@sanity
Scenario: To Validate click action on Zenefits Web Part UI in HR Page TC:624
And User is in HR Page
And User is at Zenefits Web part
When User clicks on Zenefits web part
#Expected
Then It should get redirected to Zenefits login page
And close browser 
