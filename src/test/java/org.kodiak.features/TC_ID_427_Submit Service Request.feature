Feature: Submit Service Request TC 427


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
#@sanity
Scenario: To Validate available components under Submit Service Request Web Part in Home Page TC:427
Given Home page is loaded
When User scrolls to Submit Service Request
#Expected
Then Digital Transformation link should be there
And Human Resources Link should be there
And Facilities should be there
And close browser

@sanity
Scenario: To Validate click action on any of the component under Submit Service Request Web Part in Home Page TC: 428
Given Home page is loaded
When User scrolls to Submit Service Request
And User clicks on any of the component available under Submit service request Web Part
#Expected
#Then User should get redirected to respective page of submit request
And close browser





 





