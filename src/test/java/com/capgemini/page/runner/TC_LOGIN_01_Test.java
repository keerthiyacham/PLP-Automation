package com.capgemini.page.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "C:\\Users\\KandurRaghu\\eclipse-workspace\\com.capgemini.cucumber.flipkart\\src\\test\\java\\com\\capgemini\\page\\feature\\TC_LOGIN_01.feature", glue = {
		"com/capgemini/page/step" }, plugin = { "pretty", "html:target/cucumber" }, monochrome = true, dryRun = false)

public class TC_LOGIN_01_Test extends AbstractTestNGCucumberTests {

}
