Feature: Our Journey 165

Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
    
@smoke @regression 
Scenario: To Validate Our Journey Web Part in Home Page Test Case ID: 165
Given Home page is loaded
When User is at Our Journey section
#Expcted
Then Our Journey Background Image should be there
And Our Journey title should be there
And View button should be there
And close browser


@sanity @regression
Scenario: To Validate click action on View button under Our Journey Web Part in Home Page Test Case ID:166
Given Home page is loaded
When User is at Our Journey section 
And User clicks on View button
#Expected
Then User should be taken to the Our Journey page
And close browser