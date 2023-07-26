Feature: Traning and Career  TC : 649

   Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login

@smoke
Scenario: To Validate available tiles underTraning and Career Web Part in HR Page TC:648
And User is in HR Page
When User is at HR Traning and Career Web part
Then Organization Chart should be there
And Open Positions should be there
And Refer someone  should be there
And Fitnes  should be there
And View All link should be there of HR Traning and Career
And close browser


Scenario: To Validate click action on Organization Chart  tiles under Traning and Career Web Part in HR Page TC: 649
And User is in HR Page
When User is at HR Traning and Career Web part
When User clicks on Organization chart tile
Then User should get redirected to Organization Chart page
And close browser








