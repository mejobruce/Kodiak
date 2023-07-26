package org.kodiak.stepDefinations;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.kodiak.base.BaseClass;
import org.kodiak.pages.HomePage;
import org.kodiak.pages.LoginPage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepsDef extends BaseClass {

	// ********************Background: Common steps for each scenario ******************************
		@Given("^User is logged in into application$")
		public void user_is_logged_in_into_application(DataTable credTable) throws Throwable {

			List<Map<String, String>> credList = credTable.asMaps();
			String email = credList.get(0).get("username");
			String password = credList.get(0).get("password");

			driver.get("https://kodiaksciences.sharepoint.com/sites/Intranet-UAT");
			homepage = loginpage.doLogin(email, password);
			Generic.waitForPageLoad(driver);
		}
		
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		log.info("Browser is launched");
		softAssertion.assertAll();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) throws AWTException, InterruptedException {
		//driver.get(url);
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		Thread.sleep(2000);
		/*driver.get("chrome://settings/clearBrowserData");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);*/

		//driver.get(url);
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(160L));
		//driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60L));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(160L));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
		log.info("Url is opened");
		
	}

	
	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) throws CustomizedException {
		
		Generic.waitForElement(loginpage.email);
		loginpage.email.sendKeys(Keys.ENTER);
		loginpage.enterEmail(emailadd);
		log.info("Email address is entered");
		
		Generic.waitForElement(loginpage.nextBtn);
		loginpage.nextBtn.click();
		
		
		loginpage.enterPassword(password);
		log.info("Password is entered");
	}

	@When("Click on Login")
	public void click_on_login() throws CustomizedException, InterruptedException {

		Generic.waitForElement(loginpage.LoginBtn);
		loginpage.clickOnLoginButton();
		// loginpage.LoginBtn.sendKeys(Keys.ENTER);
		log.info("User clicked on login button");

//		Generic.waitForElement(loginpage.LoginAfterCredNext);
//		loginpage.clickOnLoginButtonNext();
//		log.info("User clicked on Next button");
//
//		Generic.waitForElement(loginpage.skipsetup);
//		loginpage.clickOnLoginSkipSetup();
//		log.info(" User clicked on skiped setup");

		Generic.waitForElement(loginpage.StaySignedInyes);
		loginpage.staySignInyes();
		log.info("User clicked on stay Signed");
		
	}
	
	
}
