Feature: Onboarding  TC : 668

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
    
@sanity
Scenario: To Validate available tiles under Onboarding Web Part in HR Page TC : 668
And User is in HR Page
When User is at  Onboarding Web part
#Expected
Then Onboarding FAQ link should be there
And Charitable Giving link should be there
And Benefits snapshot link should be there
And Carrier contact sheet link should be there
#And View All link should be there
And close browser 


Scenario: To Validate click action on Onboarding FAQ link under Onboarding Web Part in HR Page TC: 669
And  User is  in HR Page
And User is at  Onboarding Web part
When User clicks on Onboarding FAQ link
#Expected
Then User should get redirected to Zenefits site



Scenario: To Validate click action on Charitable Giving link under Onboarding Web Part in HR Page TC:670
And  User is  in HR Page
And User is at  Onboarding Web part
When User clicks on Charitable Giving link
#Expected
Then User should get redirected to https://kodiaksciences.sharepoint.com/:b:/s/TeamsRollout-KodiakIntranet-KNET/EZyoKk_ksm1CnwMW3rG8zV8Bk-tDsPk7q4109nYcSIHPmQ?e=DAf32d


Scenario: To Validate click action on Benefits snapshot link under Onboarding Web Part in HR Page TC: 671
And  User is  in HR Page
And User is at  Onboarding Web part
When User clicks on Benefits snapshot link
#Expected
Then User should get redirected to Zenefits site


Scenario: To Validate click action on Carrier contact sheet link under Onboarding Web Part in HR Page TC:672
And User is  in HR Page
And User is at  Onboarding Web part
When User clicks onCarrier contact sheet link
#Expected
Then User should get redirected to Zenefits site


Scenario:To Validate click action on View All link under Onboarding Web Part in HR Page TC:673
And  User is  in HR Page
And User is at  Onboarding Web part
When User clicks on View All link
#Expected
Then User should get redirected to list page of Onboarding
