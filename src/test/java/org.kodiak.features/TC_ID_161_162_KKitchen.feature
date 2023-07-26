Feature: K-Kitchen Web Part Homepage Test

 Background: Below are the common steps for each scenario of login to the application
	Given User Launch Chrome browser 
	When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT" 
	And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t" 
	And Click on Login 
	
@smoke @regression 
Scenario: To Validate K-Kitchen Web Part in Home Page Test case ID : 161
Given Home page is loaded
When User is at KKitchen section 
#Expected
Then KKitchen Background Image should be there
And Kitchen Meals title should be there
#Copy Text should be there
And View button should be there
And close browser

@smoke @regression
Scenario: To Validate click action on View button under K-Kitchen Web Part in Home Page Test case ID : 162
Given Home page is loaded
When User is at KKitchen section 
Then User Clicks on View button under KKitchen
#Expected
Then User should be taken to the Kodiak Kitchen page
And close browser
