Feature: Facilities  Functionality

   Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login



@regression
Scenario: To validate location Web part in Facilities page TC: 728
And User in Facilities page
And User select Location
When User is at Location web part
#Expected
Then Location section should be displayed



@regression
Scenario: To validate lists of location Web part in Facilities page TC 729
And User in Facilities page
#And User select Location
#When User is at Location web part
#Expected
Then Location Palo Alto California USA location should be displayed
#And Right now it should be displayed only one

@regression
Scenario: To validate location Web part Text in Facilities page TC 730
And User in Facilities page
And User select Location
When User is at Location web part
#Expected
Then Location: Palo Alto, California, USA location text should be displayed 

@regression
Scenario: To validate secondary page web part tile for each service TC: 732
And User in Facilities page
When User click on the Service Requests tile web part
Then User redirected to secondary page for each service custodial page


