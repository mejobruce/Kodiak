Feature: Clinical Operations Functionality

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
    
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
 
@regression
Scenario: To Validate avilable components under Vendor or  Study List Web Part in Clinical Oeration Page TC: 865
And User is in Clinical Operation Page
When User is at Vendor or Study List section
Then List of Vendor or Study List should be available
And Search options should be there to search the vendor
#Then User logout to the application


@regression
Scenario Outline: To Validate the search featurs with valid keywords under Vendor or  Study List Web Part in Clinical Oeration Page TC:866
And User is in Clinical Operation Page
When User is at Vendor or Study List section
When User provides a valid keyword <Valid keyword> to search 
Then Respective Vendors should be filtered out
#Then User logout to the application

Examples:
| Valid keyword |
| covid-19 			 |


@regression
Scenario Outline: To Validate the search featurs with invalid keywords under Vendor or Study List Web Part in Clinical Oeration Page TC: 867
And User is in Clinical Operation Page
When User is at Vendor or Study List section
When User provides a valid keyword <Invalid keyword> to search 
Then No data found! Messgae should be displayed
#Then User logout to the application

Examples:
| Invalid keyword |
| testing 			 |


@regression
Scenario: To Validate the click action on any of the Vendor under Vendor or Study List Web Part in Clinical Oeration Page TC: 868
And User is in Clinical Operation Page
When User is at Vendor or Study List section
When User clicks on any of the vendor
Then User should be redirected to the designated page



@regression
Scenario: To Validate the click action on  Org Chart Web Part in Clinical OPeration Page TC:870
And User is in Clinical Operation Page
And User is at Org Chart section
When User clicks on Org Chart
Then User should be redirected to the designated page of Clinical Operations Org Chart


@regression
Scenario: To Validate the click action on Kvault Clinical Web Part in Clinical OPeration Page TC:872
And User is in Clinical Operation Page
And User is at Kvault Clinical section
When User clicks on Kvault Clinical
Then User should be redirected to the designated page Kvault Clinical Clinical OPeration Page


@regression
Scenario: To Validate number of Upcoming Datacuts displayed in Clinical OperationPage TC: 874
And User is in Clinical Operation Page
When User is at Upcoming Datacuts section
Then There should be 4 latest Upcoming Datacuts should be displayed Upcoming Datacuts
#Then User logout to the application #getting failed


@regression
Scenario: To Validate components avilable under Upcoming Datacuts displayed in Clinical OperationPage TC;875
And User is in Clinical Operation Page
When User is at Upcoming Datacuts section
Then Day of Upcoming Datacuts should be displayed
And Month of Upcoming Datacuts should be displayed
And Date of Upcoming Datacuts should be displayed
And Time  of Upcoming Datacuts should be displayed
And Location  of Upcoming Datacuts should be displayed
And See All link should be displayed
And Add event option should be there
#Then User logout to the application


@regression
Scenario: To Validate the click action on any of the Upcoming Datacuts Web Part in Clinical Oeration Page TC:876
And User is in Clinical Operation Page
And User is at Upcoming Datacuts section
When User clicks on any Upcoming Datacuts
Then User should be redirected to the designated page of the Upcoming Datacuts Web Part in Clinical Operation Page

@regression
Scenario: To Validate the click action on View all link under Upcoming Datacuts Web Part in Clinical Operation Page TC:877
And User is in Clinical Operation Page
And User is at Upcoming Datacuts section
When User clicks on View All link under Upcoming Datacuts
Then User should be redirected to the list of upcoming Datacuts page

@regression
Scenario: To Validate the click action on Add Event link under Upcoming Datacuts Web Part in Clinical Oeration Page TC:878
And User is in Clinical Operation Page
And User is at Upcoming Datacuts section
When User clicks on Add Event link under Upcoming Datacuts
Then User should be redirected to the Add Event of upcoming Datacuts page


@regression
Scenario: To Validate available components under FAQs List Web Part in Clinical Oeration Page TC: 882
And User is in Clinical Operation Page
When User is at FAQs List section
Then List of FAQs  should be available
And Search options should be there to search the FAQs
#Then User logout to the application



@regression
Scenario: To Validate the search features with valid keywords under FAQs List Web Part in Clinical Oeration Page TC: 883
And User is in Clinical Operation Page
And User is at FAQs List section
When User provides a valid keyword "Clinical Research" to search in FAQ Section
Then Respective FAQs should be filtered out

#Examples:
#| Valid keyword |
#| Clinical Research	|


@regression
Scenario: To Validate the search features with invalid keywords under FAQs List Web Part in Clinical Oeration Page TC:884
And User is in Clinical Operation Page
And User is at FAQs List section
When User provides an invalid keyword "testing" to search in FAQ Section
#Then No data found! Messgae should be displayed

#Examples:
#| Invalid keyword |
#| testing				|


@regression
Scenario: To Validate the click action on any of the FAQs under FAQs List Web Part in Clinical Oeration Page TC:885
And User is in Clinical Operation Page
And User is at FAQs List section
When User clicks on any of the FAQs
Then User should be redirected to the designated page FAQ list page

@regression
Scenario: To Validate the click action on  View All links under Key Contacts Web Part in Clinical Oeration Page TC:889
And User is in Clinical Operation Page
And User is at Key Contacts section
When User clicks on View All links under Key Contacts in clinical page 
#Then User should get redirected to list of key Contacts page after click on the view All links

@sanity
Scenario: To Validate available options under Upcoming Events Web Part in Clinical Operations Page TC: 1044
And User is in Clinical Operation Page
When User is at Upcoming Events section
Then List of Upcoming Events should be there
And Add Event should be there
And Event Title should be there
And Event Date and Time should be there
And See All link should be there

#mejo
@sanity
Scenario: To Validate available options under Commonly Used Forms Web Part in TC:1033
And User is in Clinical Operation Page
When User is at Commonly Used Forms section
Then List of Commonly used documents should be there
And See All link should be there

 @sanity
 Scenario: To Validate the click action on any of the documents under Commonly Used Forms Web Part in Accounts & Finance Page TC:1034
 And User is in Clinical Operation Page
 When User is at Commonly Used Forms section
 And User clicks on any of the forms under Commonly Used Forms Web Part in Accounts and Finance Page 
 Then It should redirects to the respective pages commanly used forms
 
 @sanity
  Scenario: To Validate the click action on See All link under Commonly Used Forms Web Part in Accounts & Finance Page   TC:1035
  When  User is in Clinical Operation Page
  And User is at Commonly Used Forms section
  When User clicks on See All links under Commonly Used Forms Web Part in Accounts and Finance Page 
  Then It should redirects to forms list page