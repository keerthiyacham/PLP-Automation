package com.capgemini.page.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "C:\\Users\\KandurRaghu\\eclipse-workspace\\com.capgemini.cucumber.flipkart\\src\\test\\java\\com\\capgemini\\page\\feature\\Tc_FlipkartAutomation_01.feature", glue = {
		"com/capgemini/page/step" }, plugin = { "pretty", "html:target/cucumber" }, monochrome = true, dryRun = false)

public class Tc_FlipkartAutomation_01_Test extends AbstractTestNGCucumberTests {

}
