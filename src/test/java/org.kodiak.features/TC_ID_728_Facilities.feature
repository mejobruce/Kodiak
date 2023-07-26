Feature: Onboarding  TC : 728

   Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login

@sanity
Scenario: To validate location Web part in Facilities page TC: 728
And User in Facilities page
And User select Location
When User is at Location web part
#Expected
Then Location section should be displayed
And close browser



Scenario: To validate lists of location Web part in Facilities page TC 729
And User in Facilities page
#And User select Location
#When User is at Location web part
#Expected
Then Location Palo Alto California USA location should be displayed
#And Right now it should be displayed only one


Scenario: To validate location Web part Text in Facilities page TC 730
And User in Facilities page
And User select Location
When User is at Location web part
#Expected
Then Location: Palo Alto, California, USA location text should be displayed 

