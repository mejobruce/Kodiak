Feature:  Homepage Functionality

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
  
@sanity1 @regression
Scenario: To Validate Latest news page load Test Case ID : 149
Given Home page is loaded
When User is in Latest News Section
#Expected
Then There should be 5 Latest News Displayed
#And close browser
#Then User logout to the application



@sanity1 @regression
Scenario: To Validate the click action on News Title and News Image of latest News Web Part Test Case ID : 154
Given Home page is loaded
When User scrolls to Latest News section
And User clicks on News Title
#Expected
Then News details should open in new default Tab or Browser
#And close browser



    
 @smoke @regression 
Scenario: To Validate Our Journey Web Part in Home Page Test Case ID: 165
Given Home page is loaded
When User is at Our Journey section
#Expcted
Then Our Journey Background Image should be there
And Our Journey title should be there
And View button should be there
#Then User logout to the application


@regression 
Scenario: To Validate click action on View button under Our Journey Web Part in Home Page Test Case ID:166
Given Home page is loaded
When User is at Our Journey section 
And User clicks on View button
#Expected
Then User should be taken to the Our Journey page



@regression 
Scenario: To Validate Weather Web Part information in Home Page ID:172
Given Home page is loaded
When User is at Weather section
#Expected: 
Then It should show the current weather based on Location
And Unit of measurment should be in F
And Data should be part of Out of the box feature


@regression 
Scenario: To Validate Press Releases Web Part  in Home Page Test case ID:414
Given Home page is loaded
When User scrolls to Press Releases
#Expected
Then View All link should be displayed
And Total 3 Press Release shoud be displayed
#And Image of Press Release should be there
And Title of Press release should be there
#And Author name should be there
#And Number of Views of Press Release should be there
#And Duration of Press Release should be There
And close browser


@regression 
  Scenario: To Validate click action on any of the Press Releases Web Part  in Home Page ID:415
    Given Home page is loaded
    When User scrolls to Press Releases
    And User clicks on any of the Press Release
    #Expected:
    Then It should open in new tab or window of the default browser
    


@regression 
Scenario: To Validate click action on View All link of Press Releases Web Part in Home Page ID:416
Given Home page is loaded
When User scrolls to Press Releases
And User clicks on View All link of the Press Release
#Expected 
Then It should open the list of all Press Releases



@regression 
Scenario: To Validate the click action on any of the Application under My Application Web Part Test Case ID: 418
When User scrolls to My Application
And User clicks on any of the Application
#Expcted
#Then System should authenticate the user with SSO
And It should open in new tab or window of default browser of the my Application 
#need to discuss
#And User should be able to view the respective contents
And close browser


@regression
Scenario: To Validate available components under Submit Service Request Web Part in Home Page TC:427
When User scrolls to Submit Service Request
#Expected
#Then Digital Transformation link should be there
#And Human Resources Link should be there
And IT Support link should be there
And Facilities link should be there


@regression
Scenario: To Validate click action on any of the component under Submit Service Request Web Part in Home Page TC: 428
Given Home page is loaded
When User scrolls to Submit Service Request
And User clicks on any of the component available under Submit service request Web Part
#Expected
#Then User should get redirected to respective page of submit request



@regression
Scenario: To Validate Search by providing blank input in search box for People Search Web Part TC: 431
Given Home page is loaded
And User scrolls to People Search
And User provided blank input
#And User clicks on Search icon
#Expected
#Then System should return all the users record #Need to update it
Then User should get Search icon
And close browser 


#@regression
#Scenario: To Validate Search by providing blank space before or after the keywords in search box for People Search Web Part ==> Test Case ID: 432 
#And User scrolls to People Search
#And User provided blank spaces befor or after the keywords 
#And User clicks on Search icon
#Expected
#Then System should return the matching keyword records
#And close browser 


@sanity  @regression
Scenario Outline: To Validate Search by providing  keywords  in search box for People Search Web Part ==> Test Case ID: 433
And User scrolls to People Search
And User provided valid keywords <Valid keyword> in search box 
And User clicks on Search icon
#Expected
Then System should return the matching keyword records

Examples:
| Valid keyword |
| Nagraj Reballi 			 |
 






