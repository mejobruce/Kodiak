Feature: Benefits  TC : 642

   Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login

@smoke
Scenario: To Validate available tiles under Benefits Web Part in HR Page TC:642
And  User is in HR Page
When User is at Benefits Web part
Then Medical or Vision or Dental should be there
And HSA should be there
And FSA should be there
And Life Insurance or Disability should be there
And Life Event Change  should be there
And close browser



Scenario:To Validate click action on Medical/Vision/Dental tiles under Benefits Web Part in HR Page TC: 643
And User is in HR Page
And User is at Benefits Web part
When User clicks on Medical or Vision or Dental tile
Then User should get redirected to Ease Site Login page
And close browser







