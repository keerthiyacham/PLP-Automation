
package com.capgemini.page.step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.capgemini.page.base.Base;
import com.capgemini.page.page.TC_LOGIN_01_Pom;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class TC_LOGIN_01_STEP extends Base {

	WebDriver driver = new ChromeDriver();
	TC_LOGIN_01_Pom f = new TC_LOGIN_01_Pom(driver);

	@Given("^User enter web site link$")
	public void user_enter_web_site_link() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");

		// f.Login();
		f.getEmail(driver);
	}

	@When("^user enters credentials$")
	public void user_enters_credentials(DataTable credentials) throws Throwable {

		List<List<String>> ele = credentials.raw();
		f.getEmail(driver);
		f.Email().sendKeys(ele.get(0).get(0));

		f.getPwd().sendKeys(ele.get(0).get(1));
		Thread.sleep(3000);
		f.getSignin();

	}

	@Then("^user name can be seen on the page$")
	public void user_name_can_be_seen_on_the_page() throws Throwable {
		f.getSwitch(driver);
	}

	@Then("^user searches \"([^\"]*)\"$")
	public void user_searches(String search) throws Throwable {
		Thread.sleep(3000);
		f.getSearch1();
		f.getSearch().sendKeys(search);
		f.getSearchClick();
		Thread.sleep(3000);
	}

	@Then("^user clicks on  sanitizer$")
	public void user_clicks_on_lifeboy_sanitizer() throws Throwable {
		Thread.sleep(3000);
		f.getImage();
		Thread.sleep(3000);
		
	}

	@Then("^user clicks on buynow$")
	public void user_clicks_on_add_to_cart() throws Throwable {
		Thread.sleep(3000);
		f.getImageWindow(driver);

	}

	@Then("^click on enter cvv \"([^\"]*)\"$")
	public void click_on_enter_cvv(String cvv) throws Throwable {
		f.Cvv().sendKeys(cvv);
		Thread.sleep(3000);
		f.getConti();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		f.getFlipkart(driver);
		Thread.sleep(3000);
		f.getLogout();
	}

}
