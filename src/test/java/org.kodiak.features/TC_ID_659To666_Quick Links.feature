Feature: Zenefits TC 624


  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login

@Sanity
Scenario: To Validate click action on Zenefits Web Part UI in HR Page TC:659
And User is in HR Page 
When User is at Quick Links Web part
#Expected
Then Life Insurance/ Disability quick link should be there 
And Cigna Website Quick link should be there 
And Download the Cigna App, Apple App Store should be there 
And Download the Cigna App, Google Play Store quick link should be there 
And MetLife Website quick link should be there 
And Optum Website quick link should be there 
And Igoe Website quick link should be there
And close browser



Scenario Outline: To Validate click action on Life Insurance/ Disability quick link under Quick Links Web Part in HR Page TC: 660
Given User is logged in into application 
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Life Insurance or Disability quick link
#Expected
Then User should get redirected to Life Insurance <url>
And close browser
Examples:
|				url								|
|https://www.metlife.com/# |




Scenario Outline: To Validate click action on Cigna Website quick link under Quick Links Web Part in HR Page TC:661
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Cigna Website quick link
#Expected
Then User should get redirected to Cigna Website <url>
And close browser
Examples:
|				url														|
|https://my.cigna.com/web/public/guest |



Scenario Outline: To Validate click action on Download the Cigna App, Apple App Store quick link under Quick Links Web Part in HR Page TC:662
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Download the Cigna App Apple App Store quick links
#Expected
Then User should get redirected to Download the Cigna App Apple App Store <url>
And close browser
Examples:
|				url																					|
| https://apps.apple.com/us/app/mycigna/id569266174 |



Scenario: To Validate click action on Download the Cigna App, Google Play Store quick link under Quick Links Web Part in HR Page TC:663
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Download the Cigna App, Google Play Store quick link
#Expected
Then User should get redirected to "https://play.google.com/store/apps/details?id=com.cigna.mobile.mycigna&hl=en_US&gl=US"
And close browser


Scenario: To Validate click action on MetLife Website quick link under Quick Links Web Part in HR Page TC:664
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on MetLife Website quick link
#Expected
Then User should get redirected to "https://www.metlife.com/#"
And close browser


Scenario Outline: To Validate click action on Optum Website quick link under Quick Links Web Part in HR Page TC: 665
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Optum Website quick link
#Expected
Then User should get redirected to <url> Optum
And close browser
Examples:
|				url																																				|
| https://www.optumbank.com/?j3mc2h6gpak36kmzc6vxbnqc3u=nlwbxhlelc5xz5pr2n7kv2ln2i |


Scenario Outline: To Validate click action on Igoe Website Website quick link under Quick Links Web Part in HR Page TC:666
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Igoe Website Website quick link
#Expected
Then User should get redirected to <url> Igoe
And close browser
Examples:
|				url																																				|
| https://www.optumbank.com/?j3mc2h6gpak36kmzc6vxbnqc3u=nlwbxhlelc5xz5pr2n7kv2ln2i |






