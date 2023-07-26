package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.*;

public class FinanceAndAccountingPage extends BaseClass {


	//@FindBy(how = How.XPATH, using = "//i[@class='ms-ContextualMenu-submenuIcon subMenuIcon-337']")
	@FindBy(how = How.XPATH, using = ".//*[contians(@class,'ms-ContextualMenu-submenuIcon subMenuIcon-')]")
	public static WebElement financeandAcconting_MenMenu;
	
	@FindBy(how = How.XPATH, using = ".//*[normalize-space()='Finance & Accounting']")
	public static WebElement financeandAcconting_subMenu;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Finance & Accounting']")
	public static WebElement financeandAcconting_BodypageText;
	
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='General Contacts']")
	public static WebElement financeandAcconting_generalContacts;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Finance & Accounting']")
	public static WebElement financeandAcconting_financeAccountingBodyTxt;
	
	@FindBy(how = How.XPATH, using = "//div[@class='widgetItemContent_e480ff1f']//p//a")
	public static WebElement financeandAcconting_generalContactsLists;
	
	//Legal
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Legal']")
	public static WebElement financeandAcconting_legalSection;
	
	@FindBy(how = How.XPATH, using = ".//div[@class='ms-List-page']")
	public static WebElement financeandAcconting_legalSectionLists;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Contract templates']")
	public static WebElement financeandAcconting_contracttemplatesLink;
	

	@FindBy(how = How.XPATH, using = "//div[@title='Create purchase requisition for executed contracts']")
	public static WebElement financeandAcconting_CreatepurchaserequisitionexecutedexecutedLink;
	
	//Data and Analytics
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Data & Analytics']")
	public static WebElement financeandAcconting_dataAndAnalytics;
	
	//Policies
	@FindBy(how = How.XPATH, using = "//span[text()='Policies']")
	public static WebElement financeandAcconting_PoliciesText;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Code block')]")
	public static WebElement financeandAcconting_CodeblockLnk;

	@FindBy(how = How.XPATH, using = "//div[@class='company_name company_name_border']")
	public static WebElement financeandAcconting_kodiakSciences;
	
	//Coupa
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Coupa']")
	public static WebElement financeandAcconting_coupa_Section;
	
	@FindBy(how = How.XPATH, using = ".//div[@data-automationid='ListCell']")
	public static WebElement financeandAcconting_coupa_SectionLists;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Request new vendor set ups']")
	public static WebElement financeandAcconting_coupa_requestNewVendorSetUps;
	
	
	@FindBy(how = How.XPATH, using = "//div[@title='Submit purchase requisition']")
	public static WebElement financeandAcconting_coupa_submitpurchaseReq;
	
	//Expensify
	@FindBy(how = How.XPATH, using = ".//span[text()='Expensify']")
	public static WebElement financeandAcconting_expensifyText;
	
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Submit expense reports']/following::span[text()='Submit']")
	public static WebElement financeandAcconting_submitBtn;
	
	//E*Trade
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='E*Trade']")
	public static WebElement financeandAcconting_ETradeText;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Change ESPP contributions']")
	public static WebElement financeandAcconting_ETradeText_ChangeESPP;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='E*Trade educational materials']")
	public static WebElement financeandAcconting_ETradeText_EducationalMaterials;
	
	
	//SEC Filings
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='SEC Filings']")
	public static WebElement financeandAcconting_ETradeText_SECFilings;
	
		
	public FinanceAndAccountingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		// PageFactory.initElements(driver, this);
	}
}
