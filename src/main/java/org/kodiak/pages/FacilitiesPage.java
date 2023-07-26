package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacilitiesPage extends BaseClass {
	@FindBy(xpath = "//div[@title='Facilities']")
	public static WebElement facilities_lnk;
	
	@FindBy(xpath = "//span[@id='Locationspan']")
	public static WebElement locations_Lnk;
	
	
	public FacilitiesPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		PageFactory.initElements(driver, this);
	}

}
