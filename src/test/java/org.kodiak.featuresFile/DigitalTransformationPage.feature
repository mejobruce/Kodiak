Feature: Digital Transformation page Functionality

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login


@regression
Scenario: To Validate the available options under Announcements Web Part in Clinical Oeration Page TC: 891
And User is in Digital Transformation Page
When User is at Announcements section
Then Announcement Title should be there
And Announcement Description should be there
And Announcement Type should be there
And Read  more link should be there


@regression
Scenario: To Validate the click action on Read more under any  Announcements Web Part in Clinical Oeration Page TC: 892
And User is in Digital Transformation Page
When User is at Announcements section
When User clicks on Announcements
Then User should be redirected to the list of announcement page

@regression
Scenario: To Validate number of Security Update displayed inDigital Transformation Page TC:894
And User is in Digital Transformation Page
When User is at Security Update section
Then There should be 4 latest Security Update should be displayed

@regression
Scenario: To Validate components avilable under Security Update displayed inDigital Transformation Page TC:895
And User is in Digital Transformation Page
When User is at Security Update section
Then Title of Security Update should be displayed
And Description of Security Update should be displayed
And Department of Security Update should be displayed
And Image  of Security Update should be displayed
And Date & Time  of Security Update should be displayed
And Read more link should be displayed
And Add event option should be there
#Then User logout to the application


@regression
Scenario: To Validate the click action on any of the Security Update Web Part in Digital Transformation Page TC:896
And User is in Digital Transformation Page
And User is at Security Update section
When User clicks on any Security Update
Then User should be redirected to the respective detailed page


@regression
Scenario: To Validate the click action on  View All links under Key Contacts Web Part in Digital Operation Page TC:901
And User is in Digital Transformation Page
And User is at Key Contacts section of Digital Operation
When User clicks on Vie All links under Key Contacts in Digital page
Then User should get redirected to list of key Contacts page


@regression
Scenario: To Validate components avilable under Knowledge Base displayed in Digital Transformation Page TC:903
And User is in Digital Transformation Page
When User is at Knowledge Base section
Then Title of Knowledge Base should be displayed
And Author of Knowledge Base should be displayed
And Date of Knowledge Base should be displayed
And Description  of Knowledge Base should be displayed
And Image  of Knowledge Base should be displayed
And View Detail Icon should be displayed


@regression
Scenario: To Validate the click action on any of the Knowledge Base View Detail icon  in Digital Transformation Page TC:904
And User is in Digital Transformation Page
And User is at Knowledge Base section
When User clicks on any Knowledge Base
Then User should be redirected to the respective detailed page


@regression
Scenario: To Validate avilable under Quick Links displayed in Digital Transformation Page TC:906
And User is in Digital Transformation Page
When User is at Quick Links section
Then Submit an IT Support Request Quick Links should be displayed
And Submit a Training Request Quick Links should be displayed
And Edit Requests Quick Links should be displayed
And Assets Quick Links should be displayed



@regression
Scenario: To Validate the click action on Submit an IT Support Request Quick Links  in Digital Transformation Page TC:907
And User is in Digital Transformation Page
When User is at Quick Links section
When User clicks on Submit an IT Support Request Quick Links
Then User should be redirected to the respective designated page of Submit an IT Support Request


@regression
Scenario: To Validate the click action on Submit a Training Request Quick Links  in Digital Transformation Page TC:908
And User is in Digital Transformation Page
When User is at Quick Links section
When User clicks on Submit a Training Request Quick Links
Then User should be redirected to the respective designated page of Submit a Training Request Quick Links



@regression
Scenario: To Validate the click action on Edit Requests Quick Links in Digital Transformation Page TC: 909
And User is in Digital Transformation Page
When User is at Quick Links section
When User clicks on Edit Requests Quick Links
Then User should be redirected to the respective designated page of Edit Requests Quick Links

@regression
Scenario: To Validate the click action on Assets Quick Links in Digital Transformation Page TC:910
And User is in Digital Transformation Page
When User is at Quick Links section
When User clicks on Assets Quick Links
Then User should be redirected to the respective designated page of Assets Quick Links in Digital Transformation Page











