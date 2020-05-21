package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.page.base.Base;

public class Tc_FlipkartAutomation_Orders_pom extends Base {

	// loginlink
	@FindBy(className = "_3Ep39l")
	private WebElement loginlink;

	// login button
	@FindBy(className = "_2zrpKA")
	private WebElement loginbutton;

	// username
	@FindBy(className = "_2zrpKA")
	private WebElement username;

	// password
	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement password;

	// login
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	private WebElement login;

	public Tc_FlipkartAutomation_Orders_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void getloginlink() {
		loginlink.click();
	}

	public void getloginbutton() {
		loginbutton.click();
	}

	public WebElement getusername() {

		return username;
	}

	public WebElement getpassword() {
		return password;

	}

	public void getlogin() {

		login.click();
	}

	@FindBy(xpath = "(//div[@class='_2aUbKa'])[1]")
	private WebElement flipkart;

	@FindBy(xpath = "//div[@class='_1Q5BxB']")
	private WebElement myprofile;

	public void getFlipkart(WebDriver driver1) throws InterruptedException {
		PageFactory.initElements(driver1, this);
		Actions action = new Actions(driver1);
		Thread.sleep(1000);
		action.moveToElement(flipkart).perform();
		myprofile.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[3]/div[10]/div/a/div/div[1]/div/div[2]/div/span")
	private WebElement myProduct;

	@FindBy(className = "_2ZZi8V")
	private WebElement myOrders;

	public void getMyOrders() {
		myOrders.click();
	}

	public void getmyProduct() {
		myProduct.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Need Help?')]")
	private WebElement needHelp;

	public void getNeedHelp() {
		needHelp.click();
	}

	@FindBy(xpath = "//span[@class='_2ZZi8V']")
	private WebElement logout;

	public void getLogout() {
		logout.click();
	}
}
