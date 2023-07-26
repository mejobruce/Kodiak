package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class KitchenPage extends BaseClass {

	//// Contact Us
	@FindBy(xpath = "//*[name()='text' and contains(@x,'18')]")
	public static WebElement contactUs_Lnk;

	@FindBy(xpath = "//img[@alt='Notebook']")
	public static WebElement contactUs_backgroundImage;

	@FindBy(xpath = "//span[@title='Recipe of The Month']")
	public static WebElement recipeOfTheMothTX;

	@FindBy(xpath = ".//*[@class='RecipeMonthlycontainer_71f37a1a']")
	public static WebElement recipeOfMothly_backgroundImage;

	@FindBy(xpath = "")
	public static WebElement recipeOfMothly_contentText;

	@FindBy(xpath = "")
	public static WebElement recipeOfMothly_ViewMoreLink;

	public KitchenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}

}
