package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.page.base.Base;

public class Tc_FlipkartAutomation_Footer_pom extends Base {

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

	public Tc_FlipkartAutomation_Footer_pom(WebDriver driver) {
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

	@FindBy(xpath="//a[text()='Shipping']")
	private WebElement shippinlink ;
	
	public void getShippinlink() {

		shippinlink.click();
	}

	@FindBy(xpath="//a[text()='Flipkart Stories']")
	private WebElement flipkartStories ;
	
	public void getFlipkartsSories() {

		flipkartStories.click();
	}


	
	@FindBy(xpath="//a[text()='Return Policy']")
	private WebElement returnPolicy ;
	
	public void getReturnPolicy() {

		returnPolicy.click();
	}

	

	

	
	//c1.findElement(By.xpath("//a[text()='Shipping']")).click();
}
