Feature: Finance & Accounting Functionality

  Background: Below are the common steps for each scenario of login to the application
    Given User Launch Chrome browser
    When User opens URL "https://kodiaksciences.sharepoint.com/sites/Intranet-UAT"
    And User enters Email as "SVC_Knet_Test@kodiak.com" and Password as "Kox09668t"
    And Click on Login
    
	
  #| email | password |
  #| SVC_Knet_Test@kodiak.com | Kox09668t |
 

@regression
Scenario: To Validate available options under General Contacts Web Part in Account and Finance Page TC: 1008
And User is in Accounting and Finance Page
When User is at General Contacts section
Then List of General Contacts should be there

@regression
Scenario: To Validate available options under Legal Web Part in Account & Finance Page TC: 1011
And User is in Accounting and Finance Page
When User is at Legal section
Then List of Legal should be there
And Contract Templates should be there
And Create purchase requisition should be there


@regression
Scenario: To Validate the click action on Contract Templates Web Part in Accounts & Finance Page TC:1012
And User is in Accounting and Finance Page
When User is at Legal section
When User clicks on Contract Templates under Account and Finance Page
#Then User should get redirected to <url> of Kodiak Sciences under Contract Templates

#Examples:
#| url                                                                      |
#|https://kodiak.coupahost.com/sessions/new#search=new%20supplier%20request |


@regression
Scenario: To Validate the click action on Create purchase requisition for executed contracts Web Part in Accounts & Finance Page TC:1013
And User is in Accounting and Finance Page
When User is at Legal section
When User clicks on Create purchase requisition for executed contracts under Account & Finance Page
#Then User should get redirected to  https://kodiak.coupahost.com/sessions/new


@regression
Scenario: To Validate available options under Policies Web Part in Account & Finance Page TC: 1015
And User is in Accounting and Finance Page
And User is at Data & Analytics section
When User clicks on Data & Analytics under Account and Finance Page
#Then User should get redirected to https://kodiaksciences.sharepoint.com/sites/KNet-FinanceAccounting-UAT/SitePages/DataAnalytics.aspx



@regression
Scenario: To Validate available options under Policies Web Part in Account & Finance Page TC: 1017
And User is in Accounting and Finance Page
When User is at Policies section
Then Code Block should be there
And Spend autority matrix should be there
And Expense reports should be there
And Handbook should be there
And ESPP should be there
And Training Materials should be there
And Corporate Policies should be there
And Company Holidays should be there


@regression
Scenario: To Validate the click action on  any of the Policies Web Part in Accounts & Finance Page TC: 1018
And User is in Accounting and Finance Page
When User is at Policies section
When User clicks on any of Policies
Then It should redirect to the respective pages



Scenario: To Validate available options under Coupa Web Part in Account & Finance Page TC:1020
And User is in Accounting and Finance Page
When User is at Coupa section
Then Request new vendor set ups should be there
And Submit purchase requisition should be there


@regression
Scenario: To Validate the click action on  Request new vendor set ups  under coupa Web Part in Accounts & Finance Page  TC:1021
And User is in Accounting and Finance Page
And User is at Coupa section
When User clicks on  Request new vendor set ups  under coupa Web Part in Accounts & Finance Page
Then It should redirects to https://kodiak.coupahost.com/sessions/new#search=new%20supplier%20request



@regression
Scenario: To Validate the click action on  Submit purchase requisition  under coupa Web Part in Accounts & Finance Page TC: 1022
And User is in Accounting and Finance Page
And User is at Coupa section
When User clicks on Submit purchase requisition under coupa Web Part in Accounts & Finance Page
Then It should redirects to https://kodiak.coupahost.com/sessions/new



@regression
Scenario: To Validate the click action on Submit button under Expensify Web Part in Accounts & Finance Page TC: 1024
And User is in Accounting and Finance Page
And User is at Expensify section
When User clicks on Submit button under Expensify Web Part in Accounts & Finance Page
Then It should redirects to https://www.expensify.com/


@regression
Scenario: To Validate available options under E-Trade Web Part in Account & Finance Page TC: 1026
And User is in Accounting and Finance Page
When User is at E-Trade section
Then Change ESPP contributions should be there
And  E*Trade educational materials should be there


@regression
Scenario: To Validate the click action on Change ESPP contributions   under E-Trade Web Part in Accounts & Finance Page TC:1027
And User is in Accounting and Finance Page
And User is at E-Trade section
When User clicks on Change ESPP contributions  under E-Trade Web Part in Accounts & Finance Page
Then It should redirects to https://us.etrade.com/e/t/user/login;jsessionid=2F0DA1709DA28A80945518F43CF0FB0F.tomcat1?


@regression
Scenario: To Validate the click action on E*Trade educational materials under E-Trade Web Part in Accounts & Finance Page TC: 1028
And User is in Accounting and Finance Page
And User is at E-Trade section
When User clicks on E*Trade educational materials under E-Trade Web Part in Accounts & Finance Page
#Then It should redirects to "https%3A%2f%2fus.etrade.com%2fetx%2fsp%2fstockplan%2f#/myAccount/planElections?vanity=planelections


@sanity
Scenario: To Validate the click action on  SFC-Fillings Web Part in Accounts & Finance Page TC:1030
And User is in Accounting and Finance Page
And User is at SFC-Fillings section
When User clicks on  SFC-Fillings Web Part in Accounts & Finance Page
Then It should redirects to https://ir.kodiak.com/financial-information/sec-filings




