/*
package com.capgemini.page.step;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.capgemini.page.base.Base;
import com.capgemini.page.page.Tc_FlipkartAutomation_Orders_pom;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;

public class Tc_FlipkartAutomation_Orders_Step extends Base {

	WebDriver driver = new ChromeDriver();
	Tc_FlipkartAutomation_Orders_pom p1 = new Tc_FlipkartAutomation_Orders_pom(driver);

	@Given("^I am not home page$")
	public void i_am_not_home_page() {
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() {

		// cancel the default login popup

		Actions a1 = new Actions(driver);
		Action s1 = a1.sendKeys(Keys.ESCAPE).build();
		s1.perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p1.getloginlink();
	}

	@When("^I enter my username and my password$")
	public void i_enter_my_username_and_my_password(DataTable credentials) {
		List<List<String>> ele = credentials.raw();
		p1.getusername();
		p1.getusername().sendKeys(ele.get(0).get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.getpassword();
		p1.getpassword().sendKeys(ele.get(0).get(1));
	}

	@When("^click on loginbutton$")
	public void click_on_loginbutton() {
		p1.getlogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@When("^click on orders and rate the ordered product$")
	public void click_on_orders_and_rate_the_ordered_product() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p1.getFlipkart(driver);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		p1.getMyOrders();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.getmyProduct();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
*/