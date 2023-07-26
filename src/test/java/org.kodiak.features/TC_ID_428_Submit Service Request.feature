Feature: Submit Service Request TC 428


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
  @regression
Scenario: To Validate click action on any of the component under Submit Service Request Web Part in Home Page TC:428
Given Home page is loaded
When User scrolls to Submit Service Request
And User clicks on any of the component available under Sybmit service request Web Part
#Expected
Then User should get redirected to respective page
And close browser 


