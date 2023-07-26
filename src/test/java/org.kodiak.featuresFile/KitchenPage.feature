Feature: KKitchen page Functionality

 Background: Below are the common steps for each scenario of login to the application
	Given User Launch Chrome browser 
	When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT" 
	And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t" 
	And Click on Login 
	
@sanity  @regression
Scenario: To Validate K-Kitchen Web Part in Home Page Test case ID : 161
Given Home page is loaded
When User is at KKitchen section 
#Expected
Then KKitchen Background Image should be there
And Kitchen Meals title should be there
#Copy Text should be there
And View button should be there
#And close browser
#Then User logout to the application


@regression
Scenario: To Validate click action on View button under K-Kitchen Web Part in Home Page Test case ID : 162
Given Home page is loaded
When User is at KKitchen section 
Then User Clicks on View button under KKitchen
#Expected
Then User should be taken to the Kodiak Kitchen page of after click on the click action on View button


@regression
Scenario: To validate News Banner Reel Web Part UI Component in Kitchen Page TC: 448  
Given Home page is loaded
When User Clicks on View button under KKitchen
And User is at New Banner Reel Section
#expected
Then User should get banner image as caraousal
And Title of the image with link
#And Sub-title of image
And Option to navigate among multiple banner image
#And News Banner Reel  UI should be aligned as per the Wireframe in Kitchen page



@regression
Scenario: To validate click action on any of the Banner image or Title under News Banner Reel Web Part in Kitchen Page TC: 449  
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at New Banner Reel Section
When User clicks on any of the banner image or title
#Expected
Then It should get redirected to respective page


@regression
Scenario: To validate click action to navigateacross Banner images under News Banner Reel Web Part in Kitchen Page TC 450
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at New Banner Reel Section
When User clicks on any of the dots to navigate to respective banner images
#Expcted
Then It should load respective banner images


@regression
Scenario: To Validate the Search of FAQ TC 454
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at FAQ Section
When User enters any keywords in search box
#Expected
Then System should search the keyword in title and description of Faq
And Respective records should be filtered out



@regression
Scenario: To Validate the click action on accordion TC 455
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at FAQ Section
When User clicks on any of the accordion
#Expcted
Then On click accordion should open or close


@regression
Scenario: To validate components under Contact us Web Part in Kitchen Page TC 463
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Contact us Section
#Expected
Then Contact us background image should be there
And Contact us Title should be there 
And Contact us tile should have email link


@regression
Scenario: To validate components under Recipe Of the Month Web Part in Kitchen Page TC 467
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Recipe Of the Month Section
#Expected
Then Recipe Of the Month background image should be there
And Content should be there on image with Title 
And View more link should be there


@regression
Scenario: To validate components under Monthly Seasonal Ingredients Web Part in Kitchen Page TC 468
Given Home page is loaded
And User Clicks on View button under KKitchen
When User is at Monthly Seasonal Ingredients Section
#Expected
Then Monthly Seasonal Ingredients  background image should be there
And Monthly Seasonal Ingredients Title with content should be there 
And Monthly Seasonal Ingredients tile should have the link


@regression
Scenario: Validate click action on View more Link under Recipe Of the Month in Kitchen Page TC 471
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at Recipe Of the Month Section
When User clicks on View more link under Recipe Of the Month tile
#Expceted
#Then It should open respective page 


@regression
Scenario: To validate click action on Monthly Seasonal Ingredients title in Kitchen Page TC 472
Given Home page is loaded
And User Clicks on View button under KKitchen
And User is at Monthly Seasonal Ingredients Section
When User clicks on Monthly Seasonal Ingredients tile
#Expected
#Then It should open respective page 





