package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.*;

public class DigitalTransformationPage extends BaseClass {

	/*******************************************************************************************************************************************************************************************************************
	   'Created By	    : Nagraj Reballi						
	   'Created On		: June-2023				
	   'Last Updated By	: June-2023	
	   'Last Updated On	: June-2023	
	   'Purpose			: For Object repository and initialize of an objects
'**********************************************************************************************************************************************************/
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Important Announcement']")
	public static WebElement digitalTransformation_ImportantAnnouncement;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='header_303765f8']//h3")
	public static WebElement digitalTransformation_text;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='content_303765f8']")
	public static WebElement digitalTransformation_Descritpion;
	
	
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='Security Updates']")
	public static WebElement digitalTransformation_securityUpdate;
	
	@FindBy(how = How.XPATH, using = ".//*[text()='Key Contacts']")
	public static WebElement digitalTransformation_keyCOntacts;
	
	@FindBy(how = How.XPATH, using = "//a[@href='cressi@kodiak.com']")
	public static WebElement digitalTransformation_keyCOntactsViewAll;
	
	@FindBy(how = How.XPATH, using = ".//*[text()='Knowledge Base']")
	public static WebElement digitalTransformation_KnowledgeBase;
	
	//Quick Links
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='Quick Links']")
	public static WebElement digitalTransformation_QuickLinksTxt;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Submit an IT Support Request']")
	public static WebElement digitalTransformation_SubmitITSupportRequest;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Submit a Training Request']")
	public static WebElement digitalTransformation_SubmitTrainingRequest;
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Edit Requests']")
	public static WebElement digitalTransformation_EditRequests;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Assets']")
	public static WebElement digitalTransformation_Assets;
	
	
	public DigitalTransformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		// PageFactory.initElements(driver, this);
	}
}
