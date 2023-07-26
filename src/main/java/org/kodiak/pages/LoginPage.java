package org.kodiak.pages;

import org.kodiak.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BaseClass {

	// WebDriver driver;

	public LoginPage(WebDriver rDriver) {
		// ldriver=rDriver;

		// PageFactory.initElements(Driver, this);
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}

	@FindBy(xpath = ".//*[@type='email']")
	@CacheLookup
	public static WebElement email;

	@FindBy(xpath = ".//*[@type='submit']")
	@CacheLookup
	public static WebElement nextBtn;

	@FindBy(xpath = ".//*[@name='passwd']")
	@CacheLookup
	public static WebElement password;

	@FindBy(xpath = ".//input[@value='Sign in']")
	@CacheLookup
	public static WebElement LoginBtn;

	@FindBy(xpath = ".//input[@value='Next']")
	@CacheLookup
	public static WebElement LoginAfterCredNext;

	@FindBy(xpath = ".//*[text()='Skip setup']")
	@CacheLookup
	public static WebElement skipsetup;

	@FindBy(xpath = ".//*[@value='Yes']")
	@CacheLookup
	public static WebElement StaySignedInyes;

	public void enterEmail(String emailAdd) {
		// email.clear();
		email.sendKeys(emailAdd);
	}

	public void enterPassword(String pwd) {
		// password.clear();
		password.sendKeys(pwd);
	}

	public void clickOnLoginButton() {
		LoginBtn.click();
	}

	public void clickOnLoginButtonNext() {
		LoginAfterCredNext.click();
	}

	public void clickOnLoginSkipSetup() {
		skipsetup.click();
	}

	public void staySignInyes() {
		StaySignedInyes.click();
	}

	public HomePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		email.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		// return new HomePage(ldriver);
		return new HomePage(driver);
	}
}
