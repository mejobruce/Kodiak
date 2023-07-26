Feature: Human Resources Page Functionality

  	Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
  
@sanity   @regression
Scenario: To Validate click action on Zenefits Web Part UI in HR Page TC:624
And User is in HR Page
And User is at Zenefits Web part
When User clicks on Zenefits web part
#Expected
Then It should get redirected to Zenefits login page
#Then User logout to the application


@sanity  @regression
Scenario: To Validate maximum number of events displayed in HR Page TC:626
And User is in HR Page
When User is at Events web part
#Expected
Then Maximum 4 events should be displayed in HR page
#Then User logout to the application


@regression
Scenario:  Validate expired events displayed in HR Page TC:629
And User is in HR Page 
When User is at Events web part
#Expected
Then Events before current date should not display



@regression
Scenario: Validate expired events displayed in HR Page TC:630
And User is in HR Page 
When User is at Events web part
#Expected
#Then Event background image should be there 
#And Event Name Should be there 
#And Event Date should be there 
#And Event Location should be there 
And View All link should be there


@regression
Scenario: To Validate click action on any of events displayed in HR Page TC: 631
And User is in HR Page 
When User is at Events web part
When User clicks on any of the events
#Expected
Then It should redirect user to respective event details page


@regression
Scenario: To Validate click action on view all links under events in HR Page  TC: 632
And User is in HR Page 
And User is at Events web part 
When User clicks on view all links under events in HR page
#Expected
Then It should redirect user to all events list page



@regression
Scenario: To Validate available tiles underHR Web Part in HR Page TC: 634
And User is in HR Page 
When User is at HR Web part
#Expected
Then Company Holidays should be there
And Change personal Info should be there
And Should be there 401 k
And Update Tax Forms  should be there
And Submit PTO Request should be there
And Employee Stock Plan Questions should be there


@regression
Scenario: To Validate click action on Company Holidays  tiles under HR Web Part in HR Page TC:635
And  User is in HR Page
And User is at HR Web part
When User clicks on Company Holidays tile
#Expected
#Then User should get redirected to Holiday page
And There should be list of US Holidays
And There should be list of Switzerland Holidays



@regression
Scenario: To Validate click action on Change Personal Info  tiles under HR Web Part in HR Page TC:636
And  User is in HR Page
And User is at HR Web part
When User clicks on Change Personal Info tile
#Expected
#Then User should get redirected to Zenefits Login page



@regression
Scenario: To Validate click action on 401k  tiles under HR Web Part in HR Page TC: 637
And  User is in HR Page
And User is at HR Web part
When User clicks on 401k tile
#Expected
#Then User should get redirected to child window of 401k


@regression
Scenario: To Validate click action on Update Tax Forms tiles under HR Web Part in HR Page TC:638
And  User is in HR Page
And User is at HR Web part
When User clicks on Update Tax Forms tile
#Expceted
#Then User should get redirected to Zenefits Login page



@regression
Scenario: To Validate click action on Submit PTO Request  tiles under HR Web Part in HR Page TC: 639
And  User is in HR Page
And User is at HR Web part
When User clicks on Submit PTO Request tile 
#Then User should get redirected to Zenefits Login page


@regression
Scenario: To Validate click action on Employees Stock Plan Questions  tiles under HR Web Part in HR Page TC:640
And  User is in HR Page
And User is at HR Web part
When User clicks on Employees Stock Plan Questions tile
#Then User should get redirected to designated page

@regression
Scenario: To Validate available tiles under Benefits Web Part in HR Page TC:642
And  User is in HR Page
When User is at Benefits Web part
Then Medical or Vision or Dental should be there
And HSA should be there
And FSA should be there
And Life Insurance or Disability should be there
And Life Event Change  should be there




@regression
Scenario: To Validate click action on Medical/Vision/Dental tiles under Benefits Web Part in HR Page TC: 643
And User is in HR Page
And User is at Benefits Web part
When User clicks on Medical or Vision or Dental tile
#Then User should get redirected to Ease Site Login page



@regression
Scenario: To Validate available tiles underTraning and Career Web Part in HR Page TC:648
And User is in HR Page
When User is at HR Traning and Career Web part
Then Organization Chart should be there
And Open Positions should be there
And Refer someone  should be there
And Fitnes  should be there
And View All link should be there of HR Traning and Career


@regression
Scenario: To Validate click action on Organization Chart  tiles under Traning and Career Web Part in HR Page TC: 649
And User is in HR Page
When User is at HR Traning and Career Web part
When User clicks on Organization chart tile
#Then User should get redirected to Organization Chart page

@regression
Scenario: To Validate click action on Zenefits Web Part UI in HR Page TC:659
And User is in HR Page 
When User is at Quick Links Web part
#Expected
Then Life Insurance Disability quick link should be there 
And Cigna Website Quick link should be there 
And Download the Cigna App, Apple App Store should be there 
And Download the Cigna App, Google Play Store quick link should be there 
And MetLife Website quick link should be there 
And Optum Website quick link should be there 
#And Igoe Website quick link should be there



@regression
Scenario Outline: To Validate click action on Life Insurance/ Disability quick link under Quick Links Web Part in HR Page TC: 660
And User is in HR Page 
When User is at Quick Links Web part
When User clicks on Life Insurance or Disability quick link
#Expected
#Then User should get redirected to Life Insurance Disability quick link "https://www.metlife.com/#"

#Examples:
#|				url								|
#|https://www.metlife.com/# |



@regression
Scenario Outline: To Validate click action on Cigna Website quick link under Quick Links Web Part in HR Page TC:661
And User is in HR Page 
When User is at Quick Links Web part
When User clicks on Cigna Website quick link
#Expected
#Then User should get redirected to Cigna Website <url>

#Examples:
#|				url														|
#|https://my.cigna.com/web/public/guest |


@regression
Scenario Outline: To Validate click action on Download the Cigna App, Apple App Store quick link under Quick Links Web Part in HR Page TC:662
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Download the Cigna App Apple App Store quick links
#Expected
#Then User should get redirected to Download the Cigna App Apple App Store <url>

#Examples:
#|				url																					|
#| https://apps.apple.com/us/app/mycigna/id569266174 |


@regression
Scenario: To Validate click action on Download the Cigna App, Google Play Store quick link under Quick Links Web Part in HR Page TC:663
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Download the Cigna App, Google Play Store quick link
#Expected
#Then User should get redirected to "https://play.google.com/store/apps/details?id=com.cigna.mobile.mycigna&hl=en_US&gl=US"


@regression
Scenario: To Validate click action on MetLife Website quick link under Quick Links Web Part in HR Page TC:664
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on MetLife Website quick link
#Expected
#Then User should get redirected to "https://www.metlife.com/#"


@regression
Scenario Outline: To Validate click action on Optum Website quick link under Quick Links Web Part in HR Page TC: 665
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Optum Website quick link
#Expected
#Then User should get redirected to <url> Optum

#Examples:
#|				url																																				|
#| https://www.optumbank.com/?j3mc2h6gpak36kmzc6vxbnqc3u=nlwbxhlelc5xz5pr2n7kv2ln2i |


@regression
Scenario Outline: To Validate click action on Igoe Website Website quick link under Quick Links Web Part in HR Page TC:666
And User is in HR Page 
And User is at Quick Links Web part 
When User clicks on Igoe Website Website quick link
#Expected
#Then User should get redirected to <url> Igoe

#Examples:
#|				url																																				|
#| https://www.optumbank.com/?j3mc2h6gpak36kmzc6vxbnqc3u=nlwbxhlelc5xz5pr2n7kv2ln2i |



@regression
Scenario: To Validate available tiles under Onboarding Web Part in HR Page TC : 668
And User is in HR Page
When User is at  Onboarding Web part
#Expected
Then Onboarding FAQ link should be there
And Charitable Giving link should be there
And Benefits snapshot link should be there
And Carrier contact sheet link should be there
#And View All link should be there


@regression
Scenario: To Validate click action on Onboarding FAQ link under Onboarding Web Part in HR Page TC: 669
And User is in HR Page
And User is at  Onboarding Web part
When User clicks on Onboarding FAQ link
#Expected
#Then User should get redirected to Zenefits site


@regression
Scenario: To Validate click action on Charitable Giving link under Onboarding Web Part in HR Page TC:670
And User is in HR Page
And User is at  Onboarding Web part
When User clicks on Charitable Giving link
#Expected
#Then User should get redirected to https://kodiaksciences.sharepoint.com/:b:/s/TeamsRollout-KodiakIntranet-KNET/EZyoKk_ksm1CnwMW3rG8zV8Bk-tDsPk7q4109nYcSIHPmQ?e=DAf32d


@regression
Scenario: To Validate click action on Benefits snapshot link under Onboarding Web Part in HR Page TC: 671
And User is in HR Page
And User is at  Onboarding Web part
When User clicks on Benefits snapshot link
#Expected
#Then User should get redirected to Zenefits site


@regression
Scenario: To Validate click action on Carrier contact sheet link under Onboarding Web Part in HR Page TC:672
And User is in HR Page
And User is at  Onboarding Web part
When User clicks onCarrier contact sheet link
#Expected
#Then User should get redirected to Zenefits site


@regression
Scenario:To Validate click action on View All link under Onboarding Web Part in HR Page TC:673
And User is in HR Page
And User is at  Onboarding Web part
When User clicks on View All link
#Expected
#Then User should get redirected to list page of Onboarding page of View All link




