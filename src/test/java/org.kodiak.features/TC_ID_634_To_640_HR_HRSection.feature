Feature: HR section

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  


Scenario: To Validate available tiles underHR Web Part in HR Page TC: 634
And User is in HR Page 
When User is at HR Web part
#Expected
Then Company Holidays should be there
And Change personal Info should be there
And Should be there 401 k
And Update Tax Forms  should be there
And Submit PTO Request should be there
And Employee Stock Plan Questions should be there
And close browser


Scenario: To Validate click action on Company Holidays  tiles under HR Web Part in HR Page TC:635
And  User is in HR Page
And User is at HR Web part
When User clicks on Company Holidays tile
#Expected
#Then User should get redirected to Holiday page
And There should be list of US Holidays
And There should be list of Switzerland Holidays
And close browser



Scenario: To Validate click action on Change Personal Info  tiles under HR Web Part in HR Page TC:636
And  User is in HR Page
And User is at HR Web part
When User clicks on Change Personal Info tile
#Expected
#Then User should get redirected to Zenefits Login page
And close browser


Scenario: To Validate click action on 401k  tiles under HR Web Part in HR Page TC: 637
And User is  in HR Page
And User is at HR Web part
When User clicks on 401k tile
#Expected
Then User should get redirected to Secondary benefit summary page
And close browser


Scenario: To Validate click action on Update Tax Forms tiles under HR Web Part in HR Page TC:638
And  User is  in HR Page
And User is at HR Web part
When User clicks on Update Tax Forms tile
#Expceted
#Then User should get redirected to Zenefits Login page
And close browser


@smoke
Scenario:To Validate click action on Submit PTO Request  tiles under HR Web Part in HR Page TC: 639
Given User is logged in into application
And  User is  in HR Page
And User is at HR Web part
When User clicks on Submit PTO Request tile 
#Then User should get redirected to Zenefits Login page



Scenario:To Validate click action on Employees Stock Plan Questions  tiles under HR Web Part in HR Page TC:640
And  User is in HR Page
And User is at HR Web part
When User clicks on Employees Stock Plan Questions tile
Then User should get redirected to designated page
And close browser









