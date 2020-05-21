package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.page.base.Base;

public class Tc_FlipkartAutomation_Wishlist_pom extends Base {

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

	public Tc_FlipkartAutomation_Wishlist_pom(WebDriver driver) {
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

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/span")
	private WebElement hoverElement;

	@FindBy(xpath = "//a[@title='Nuts & Dry Fruits']")
	private WebElement typeAppiance;

	@FindBy(xpath = "//a[@title='Happilo 100% Natural California Almonds']")
	private WebElement selectedBrand;

	@FindBy(className = "_3wU53n")
	private WebElement selectBrand;

	public void getTypeAppliance() {

		typeAppiance.click();
	}

	public void getSelectBrand() {

		selectBrand.click();
	}

	public void getSelectedBrand() {

		selectedBrand.click();
	}

	public void getMousehover(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		Actions action = new Actions(driver1);

		action.moveToElement(hoverElement).perform();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		hoverElement.click();

	}

	// _2AkmmA _2Npkh4 _2kuvG8 _7UHT_c
	// _2AkmmA _2Npkh4 _2MWPVK
	// //*[@id="container"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button
	// @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	// @FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	@FindBy(className = "_35Y7Yo")
	private WebElement Wishlist;

	public void getWishlist() {

		Wishlist.click();

	}

}
