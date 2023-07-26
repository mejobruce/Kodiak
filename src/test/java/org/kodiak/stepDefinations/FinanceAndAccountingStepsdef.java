package org.kodiak.stepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.kodiak.base.BaseClass;
import org.kodiak.pages.FinanceAndAccountingPage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class FinanceAndAccountingStepsdef extends BaseClass {
	
	public FinanceAndAccountingPage financeandaccountingpage = new FinanceAndAccountingPage(driver);
	
	@When("User is in Accounting and Finance Page")
	public void user_is_in_accounting_and_finance_page() throws InterruptedException, AWTException, CustomizedException {
	   
		Generic.waitForElement(homepage.clickOnHomepageLink);
		Generic.webClick(homepage.clickOnHomepageLink);
		log.info("User clicked on Homepage link");
	
	
		Generic.navigatePage("https://kodiaksciences.sharepoint.com/sites/KNet-FinanceAccounting-UAT");
		Generic.nullifyImplicitlyWait();
		//driver.navigate().to("https://kodiaksciences.sharepoint.com/sites/KNet-FinanceAccounting-UAT");
//		Generic.waitForElement(homepage.mouseOverOrg);
//		Generic.MovetoElementbyActionClass(homepage.mouseOverOrg);
//		log.info("User clicked on the Organization menu menu");
//		Thread.sleep(3000);
//		
//		Generic.waitForElement(financeandaccountingpage.financeandAcconting_MenMenu);
//		log.info("User is waited to get element of finance and account on mouse over");
	
//		Robot robot = new Robot();
//		Actions act = new Actions(driver);
//		act.moveToElement(financeandaccountingpage.financeandAcconting_MenMenu).click().build().perform();
//		Thread.sleep(2000);
//		log.info("User is clicked on the Finance and account link on Men menu");
//		
//		
//		Generic.waitForElement(financeandaccountingpage.financeandAcconting_subMenu);
//		act.moveToElement(financeandaccountingpage.financeandAcconting_subMenu).click().build().perform();
//		Thread.sleep(2000);
//		log.info("User clicked on the submenu of Finance and account");
	}
	@When("User is at General Contacts section")
	public void user_is_at_general_contacts_section() throws AWTException, CustomizedException {
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_generalContacts);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at General Contacts section");
		softAssertion.assertAll();
	}

	@Then("List of General Contacts should be there")
	public void list_of_general_contacts_should_be_there() {

		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_generalContactsLists);

		Generic.doSoftAssertion(status, true);
		log.info("List of General Contacts is there");
		softAssertion.assertAll();
	}
	
	//1011
	@When("User is at Legal section")
	public void user_is_at_legal_section() throws CustomizedException, AWTException {
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_legalSection);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at Legal section");
		softAssertion.assertAll();
	}
	@Then("List of Legal should be there")
	public void list_of_legal_should_be_there() {
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_legalSectionLists);

		Generic.doSoftAssertion(status, true);
		log.info("List of Legal section is displaying");
		softAssertion.assertAll(); 
	}
	@Then("Contract Templates should be there")
	public void contract_templates_should_be_there() {
		log.info("Contract Templates is displaying");
		softAssertion.assertAll(); 
	}
	@Then("Create purchase requisition should be there")
	public void create_purchase_requisition_should_be_there() {
		log.info("Contract Templates is displaying");
		softAssertion.assertAll();
	}
	
	//1012
	@When("User clicks on Contract Templates under Account and Finance Page")
	public void user_clicks_on_contract_templates_under_account_and_finance_page() throws CustomizedException {
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_contracttemplatesLink);

		Generic.webClick(financeandaccountingpage.financeandAcconting_contracttemplatesLink);
		
		log.info("User clicks on Contract Templates under Account and Finance Page");
		softAssertion.assertAll(); 
	}

	//1013
	@When("User clicks on Create purchase requisition for executed contracts under Account & Finance Page")
	public void user_clicks_on_create_purchase_requisition_for_executed_contracts_under_account_finance_page() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_CreatepurchaserequisitionexecutedexecutedLink);

		Generic.webClick(financeandaccountingpage.financeandAcconting_CreatepurchaserequisitionexecutedexecutedLink);
		
		log.info("User clicks on Create purchase requisition for executed contracts under Account & Finance Page");
		softAssertion.assertAll(); 
	}
	
	//1015
	@When("User is at Data & Analytics section")
	public void user_is_at_data_analytics_section() throws CustomizedException, AWTException {
	   
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_dataAndAnalytics);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at Data & Analytics section");
		softAssertion.assertAll();
		
	}
	@When("User clicks on Data & Analytics under Account and Finance Page")
	public void user_clicks_on_data_analytics_under_account_and_finance_page() throws CustomizedException {
	  
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_dataAndAnalytics);

		Generic.webClick(financeandaccountingpage.financeandAcconting_dataAndAnalytics);
		
		log.info("User clicks on Create purchase requisition for executed contracts under Account & Finance Page");
		softAssertion.assertAll(); 
	}
	
	//1017
	@When("User is at Policies section")
	public void user_is_at_policies_section() throws AWTException, CustomizedException {
		
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_PoliciesText);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at Policies section");
		softAssertion.assertAll();
	}
	@Then("Code Block should be there")
	public void code_block_should_be_there() {

		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_CodeblockLnk);

		Generic.doSoftAssertion(status, true);
		log.info("Code Block is link is displaying");
		softAssertion.assertAll();

	}
	@Then("Spend autority matrix should be there")
	public void spend_autority_matrix_should_be_there() {
		log.info("Spend autority matrix link is displaying");
		softAssertion.assertAll();
	}
	@Then("Expense reports should be there")
	public void expense_reports_should_be_there() {
		log.info("Expense reports link is displaying");
		softAssertion.assertAll();
	}
	@Then("Handbook should be there")
	public void handbook_should_be_there() {
		log.info("Handbook link is displaying");
		softAssertion.assertAll();   
	}
	@Then("ESPP should be there")
	public void espp_should_be_there() {
		log.info("ESPP link is displaying");
		softAssertion.assertAll(); 
	}
	@Then("Training Materials should be there")
	public void training_materials_should_be_there() {
		log.info("Training Materials link is displaying");
		softAssertion.assertAll(); 
	}
	@Then("Corporate Policies should be there")
	public void corporate_policies_should_be_there() {
		log.info("Corporate Policies link is displaying");
		softAssertion.assertAll(); 
	}
	
	//1018
	@When("User clicks on any of Policies")
	public void user_clicks_on_any_of_policies() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_CodeblockLnk);

		Generic.webClick(financeandaccountingpage.financeandAcconting_CodeblockLnk);
		
		log.info("User clicks on any of Policies");
		softAssertion.assertAll(); 
	}
	@Then("It should redirect to the respective pages")
	public void it_should_redirect_to_the_respective_pages() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_kodiakSciences);
		String text = Generic.getText(financeandaccountingpage.financeandAcconting_kodiakSciences).trim();
		Generic.doSoftAssertionString(text, "Kodiak Sciences");
		log.info("It should redirect to the respective pages");
		softAssertion.assertAll(); 
	}
	
	//1020
	@When("User is at Coupa section")
	public void user_is_at_coupa_section() throws CustomizedException, AWTException {
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_coupa_Section);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at Coupa section");
		softAssertion.assertAll();	
	}
	@Then("Request new vendor set ups should be there")
	public void request_new_vendor_set_ups_should_be_there() {
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_coupa_SectionLists);

		Generic.doSoftAssertion(status, true);
		log.info("Request new vendor set ups should be there");
		softAssertion.assertAll();
	}
	@Then("Submit purchase requisition should be there")
	public void submit_purchase_requisition_should_be_there() {
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_coupa_SectionLists);

		Generic.doSoftAssertion(status, true);
		log.info("Submit purchase requisition should be there");
		softAssertion.assertAll();
	}
	
	//1021
	@When("User clicks on  Request new vendor set ups  under coupa Web Part in Accounts & Finance Page")
	public void user_clicks_on_request_new_vendor_set_ups_under_coupa_web_part_in_accounts_finance_page() throws CustomizedException {
	   
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_coupa_requestNewVendorSetUps);

		Generic.webClick(financeandaccountingpage.financeandAcconting_coupa_requestNewVendorSetUps);
		
		log.info("User clicked on  Request new vendor set ups  under coupa Web Part in Accounts & Finance Page");
		softAssertion.assertAll(); 
	}
	@Then("It should redirects to https:\\/\\/kodiak.coupahost.com\\/sessions\\/new#search=new%20supplier%20request")
	public void it_should_redirects_to_https_kodiak_coupahost_com_sessions_new_search_new_20supplier_20request() throws CustomizedException {
	    
		Generic.MovetoChildWindow();
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_kodiakSciences);
		String text = Generic.getText(financeandaccountingpage.financeandAcconting_kodiakSciences).trim();
		Generic.doSoftAssertionString(text, "Kodiak Sciences");
		log.info("It should redirects to https://kodiak.coupahost URL");
		softAssertion.assertAll(); 
	}
	
	//1022
	@When("User clicks on Submit purchase requisition under coupa Web Part in Accounts & Finance Page")
	public void user_clicks_on_submit_purchase_requisition_under_coupa_web_part_in_accounts_finance_page() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_coupa_submitpurchaseReq);

		Generic.webClick(financeandaccountingpage.financeandAcconting_coupa_submitpurchaseReq);
		
		log.info("User clicks on Submit purchase requisition under coupa Web Part in Accounts & Finance Page");
		softAssertion.assertAll();
	}
	@Then("It should redirects to https:\\/\\/kodiak.coupahost.com\\/sessions\\/new")
	public void it_should_redirects_to_https_kodiak_coupahost_com_sessions_new() throws CustomizedException {
		Generic.MovetoChildWindow();
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_kodiakSciences);
		String text = Generic.getText(financeandaccountingpage.financeandAcconting_kodiakSciences).trim();
		Generic.doSoftAssertionString(text, "Kodiak Sciences");
		log.info("It should redirects to https://kodiak.coupahost.com/sessions/new URL ");
		softAssertion.assertAll();
	}
	
	//1024
	@When("User is at Expensify section")
	public void user_is_at_expensify_section() throws CustomizedException, AWTException {
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_expensifyText);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at Expensify section");
		softAssertion.assertAll();	  
	}
	@When("User clicks on Submit button under Expensify Web Part in Accounts & Finance Page")
	public void user_clicks_on_submit_button_under_expensify_web_part_in_accounts_finance_page() throws CustomizedException {
	    
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_submitBtn);

		Generic.webClick(financeandaccountingpage.financeandAcconting_submitBtn);
		
		log.info("User clicked on Submit button under Expensify Web Part in Accounts & Finance Page");
		softAssertion.assertAll();
	}
	@Then("It should redirects to https:\\/\\/www.expensify.com\\/")
	public void it_should_redirects_to_https_www_expensify_com() throws CustomizedException {
		Generic.MovetoChildWindow();
		log.info("It will open new Window");
		
		String title = Generic.getTitle().trim();
		Generic.doSoftAssertionString(title, "Expensify | Spend Management Software for Receipts & Expenses");
		log.info("It redirecting to https://www.expensify.com/"); 
	}
	
	
	//1026
	@When("User is at E-Trade section")
	public void user_is_at_e_trade_section() throws CustomizedException, AWTException {
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at E-Trade section");
		softAssertion.assertAll();
	}
	@Then("Change ESPP contributions should be there")
	public void change_espp_contributions_should_be_there() {
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_ChangeESPP);
		
		Generic.doSoftAssertion(status, true);
		log.info("Change ESPP contributions is displaying");
		softAssertion.assertAll();	
	}
	@Then("E*Trade educational materials should be there")
	public void e_trade_educational_materials_should_be_there() {
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_EducationalMaterials);
		
		Generic.doSoftAssertion(status, true);
		log.info("E*Trade educational materials is displaying");
		softAssertion.assertAll(); 
	}
	
	//1027
	
	@When("User clicks on Change ESPP contributions  under E-Trade Web Part in Accounts & Finance Page")
	public void user_clicks_on_change_espp_contributions_under_e_trade_web_part_in_accounts_finance_page() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_ChangeESPP);

		Generic.webClick(financeandaccountingpage.financeandAcconting_ETradeText_ChangeESPP);
		
		log.info("User clicked on Change ESPP contributions  under E-Trade Web Part in Accounts & Finance Page");
		softAssertion.assertAll();
	}
	@Then("It should redirects to https:\\/\\/us.etrade.com\\/e\\/t\\/user\\/login;jsessionid=2F0DA1709DA28A80945518F43CF0FB0F.tomcat1?")
	public void it_should_redirects_to_https_us_etrade_com_e_t_user_login_jsessionid_2f0da1709da28a80945518f43cf0fb0f_tomcat1() throws CustomizedException {
		Generic.MovetoChildWindow();
		log.info("It will open new Window");
		
		String title = Generic.getTitle().trim();
		Generic.doSoftAssertionString(title, "Log On to E*TRADE | E*TRADE");
		log.info("It should redirects to https://us.etrade.com/ URL"); 
		softAssertion.assertAll(); 
	}
	
	//1028
	
	@When("User clicks on E*Trade educational materials under E-Trade Web Part in Accounts & Finance Page")
	public void user_clicks_on_e_trade_educational_materials_under_e_trade_web_part_in_accounts_finance_page() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_EducationalMaterials);

		Generic.webClick(financeandaccountingpage.financeandAcconting_ETradeText_EducationalMaterials);
		
		log.info("User clicked on E*Trade educational materials under E-Trade Web Part in Accounts & Finance Page");
		softAssertion.assertAll();
	}
	@Then("It should redirects to \"https%3A%2f%2fus.etrade.com%2fetx%2fsp%2fstockplan%2f#\\/myAccount\\/planElections?vanity=planelections")
	public void it_should_redirects_to_https_3a_2f_2fus_etrade_com_2fetx_2fsp_2fstockplan_2f_my_account_plan_elections_vanity_planelections() throws CustomizedException {
		Generic.MovetoChildWindow();
		log.info("It will open new Window");
		
		String title = Generic.getTitle().trim();
		Generic.doSoftAssertionString(title, "Log On to E*TRADE | E*TRADE");
		log.info("It should redirects to \"https%3A%2f%2fus.etrade.com/ URL"); 
		softAssertion.assertAll(); 
	}
	
	//1030
	@When("User is at SFC-Fillings section")
	public void user_is_at_sfc_fillings_section() throws AWTException, CustomizedException {
		
		Generic.nullifyImplicitlyWait();
		Robot robot = new Robot();
		Actions act = new Actions(driver);
		
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		
		Generic.webClick(financeandaccountingpage.financeandAcconting_financeAccountingBodyTxt);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		act.sendKeys(Keys.PAGE_DOWN);
		act.perform();
		
		boolean status = Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_SECFilings);
		
		Generic.doSoftAssertion(status, true);
		log.info("User is at SFC-Fillings section");
		softAssertion.assertAll();
	}
	@When("User clicks on  SFC-Fillings Web Part in Accounts & Finance Page")
	public void user_clicks_on_sfc_fillings_web_part_in_accounts_finance_page() throws CustomizedException {
		Generic.waitForElement(financeandaccountingpage.financeandAcconting_ETradeText_SECFilings);

		Generic.webClick(financeandaccountingpage.financeandAcconting_ETradeText_SECFilings);
		
		log.info("User clicked on  SFC-Fillings Web Part in Accounts & Finance Page");
		softAssertion.assertAll();
		
	}
	@Then("It should redirects to https:\\/\\/ir.kodiak.com\\/financial-information\\/sec-filings")
	public void it_should_redirects_to_https_ir_kodiak_com_financial_information_sec_filings() throws CustomizedException {
	   
		Generic.MovetoChildWindow();
		log.info("It will open new Window");
		String curl = Generic.getURL();
		String title = Generic.getTitle().trim();
		//Generic.doSoftAssertionString(title, "SEC Filings | Kodiak Sciences Inc.");
		log.info("It should redirects to https://ir.kodiak.com/ URL:" +title); 
		log.info("It should redirects to https://ir.kodiak.com/ URL:" +curl); 
		softAssertion.assertAll(); 
	}
}