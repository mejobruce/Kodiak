package org.kodiak.base;

import java.util.Properties;

//import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.*;
import org.kodiak.pages.ClinicalOperationsPage;
import org.kodiak.pages.FacilitiesPage;
import org.kodiak.pages.FinanceAndAccountingPage;
import org.kodiak.pages.HRPage;
import org.kodiak.pages.HomePage;
import org.kodiak.pages.KitchenPage;
import org.kodiak.pages.LoginPage;
import org.kodiak.utils.ReadConfig;

/*Parent Class*/
public class BaseClass {
	/*******************************************************************************************************************************************************************************************************************
	   'Created By	    : Nagraj Reballi						
	   'Created On		: 20th May-2023				
	   'Last Updated By	: 20th May-2023		
	   'Last Updated On	: 20th May-2023		
	   'Purpose			: For driver init,classes, readConfig softAssertion object creation and others
	   '**********************************************************************************************************************************************************/
	public static  WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public KitchenPage kitchenpage;
	//public static WebElement element;
	public static SoftAssert softAssertion= new SoftAssert();
	//public static JavascriptExecutor js;
	public HRPage hrpage;
	public FacilitiesPage facilities;
	public FinanceAndAccountingPage financeandaccountingpage;
	//public  ClinicalOperationsPage clinicalOperationpage;
	//public static ClinicalOperationsPage clinicalOperationpage = new ClinicalOperationsPage(driver);
	
	
	
	   public static Logger log;        
	   public ReadConfig readConfig;
	
	
}
