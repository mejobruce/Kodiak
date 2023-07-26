package org.kodiak.stepDefinations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.kodiak.base.BaseClass;
import org.kodiak.pages.HomePage;
import org.kodiak.pages.KitchenPage;
import org.kodiak.pages.LoginPage;
import org.kodiak.utils.CustomizedException;
import org.kodiak.utils.Generic;
import org.kodiak.utils.ReadConfig;
//import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

//import ch.qos.logback.classic.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
/*Child class of Baseclass*/
public class StepDef extends BaseClass {
	@Before
	public void setup1() {
		readConfig = new ReadConfig();

		// Initialize logger
		log = LogManager.getLogger("StepDef");

		
		System.out.println("Setup-Sanity method executed..");

		String browser = readConfig.getBrowser();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		//headless argument
	//	option.addArguments("--headless");

		option.addArguments("--lang=en_US");
		
		//option.addArguments("--start-maximized");
		option.addArguments("--disable-gpu");
		option.addArguments("--window-size=1920,1080");
		option.addArguments("--start-maximized");
		option.addArguments("--disable-extensions");
		option.addArguments("--disable-gpu");
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-cache");
		option.addArguments("browser.cache.disk.enable");
		option.addArguments("browser.cache.memory.enable");
		option.addArguments("browser.cache.offline.enable");
		option.addArguments("network.http.use-cache");
		//option.setHeadless(true);
		
	

//	option.chrome_options.add_argument("--proxy-server='direct://'")
//	self.chrome_options.add_argument("--proxy-bypass-list=*")

//	self.chrome_options.add_argument('--ignore-certificate-errors')
//	self.browser = webdriver.Chrome(options=self.chrome_options)
		
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		// log.info("");
		log.fatal("Setup1 executed...");
	}

//********************************Login feature//****************************************************
	
	@After
	public void teardown(Scenario sc)
	{
		System.out.println("Tear Down method executed..");
		if(sc.isFailed()==true)
		{
			//Convert web driver object to TakeScreenshot
			String fileWithPath = "/kodiak.automation/test-output/../Screenshots/failedScreenshot.png";
			TakesScreenshot scrShot =((TakesScreenshot)driver);

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination
			File DestFile=new File(fileWithPath);

			//Copy file at destination

			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

		driver.quit();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario){

		if(scenario.isFailed())
		{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		//attach image file report(data, media type, name of the attachment)
		scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}

