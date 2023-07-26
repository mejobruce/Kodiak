Feature: Number of events Display


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  

Scenario: To Validate maximum number of events displayed in HR Page TC:626
And User is in HR Page
When User is at Events web part
#Expected
Then Maximum 4 events should be displayed in HR page
And close browser 



Scenario:  Validate expired events displayed in HR Page TC:629
And User is in HR Page 
When User is at Events web part
#Expected
Then Events before current date should not display
And close browser 



Scenario: Validate expired events displayed in HR Page TC:630
And User is in HR Page 
When User is at Events web part
#Expected
Then Event background image should be there 
And Event Name Should be there 
And Event Date should be there 
And Event Location should be there 
And View All link should be there



Scenario: To Validate click action on any of events displayed in HR Page TC: 631
And User is in HR Page 
When User is at Events web part
When User clicks on any of the events
#Expected
Then It should redirect user to respective event details page



Scenario: To Validate click action on view all links under events in HR Page  TC: 632
And User is in HR Page 
And User is at Events web part 
When User clicks on view all links under events in HR page
#Expected
Then It should redirect user to all events list page





