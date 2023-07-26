package org.kodiak.runners;
//import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/java/org.kodiak.featuresFile"},
		features = {"src/test/java/org.kodiak.featuresFile/ClinicalOperationsPage.feature"},
		//features = {"src/test/java/org.kodiak.features/TC_ID_728_Facilities.feature"},
		//features = {"src/test/java/org.kodiak.featuresFile"},
		glue="org.kodiak.stepDefinations",
		//dryRun = true,
		dryRun = false,
		//monochrome = true,
		//tags = "@tree",
		//tags = "@smoke",
		 tags = "@sanity-m",
		//tags = "@regression",
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html",
		
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  
				  "pretty","json:target/cucumber-reports/report_json.json",
				  
				  "pretty", "junit:target/cucumber-reports/report_xml.xml"}
		)
public class Run extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
}
   