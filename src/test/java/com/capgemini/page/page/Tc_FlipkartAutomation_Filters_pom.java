package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.page.base.Base;

public class Tc_FlipkartAutomation_Filters_pom extends Base {

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

	public Tc_FlipkartAutomation_Filters_pom(WebDriver driver) {
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

	@FindBy(name = "q")
	private WebElement search;

	public void getSearch1() {
		search.click();
	}

	public WebElement getSearch() {

		return search;
	}

	@FindBy(xpath = "//button[@class='vh79eN']")
	private WebElement searchclick;

	public void getSearchClick() {
		searchclick.click();
	}

	// @FindBy(xpath="//img[@alt='TEJ Multipurpose Surface (Anti Bacterial Waterless
	// Liquid) Hand Sanitizer Bottle']")

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")
	private WebElement img;

	public void getImage() {

		img.click();
	}

	@FindBy(xpath = "//div[@class='_1p7h2j _2irnD_']")
	private WebElement filters;

	public void getFlilters() {

		filters.click();
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[5]/div[2]/div/div[1]/div/div/label/div[1]")
	private WebElement filters1;

	public void getFlilters1() {

		filters1.click();
	}

	@FindBy(xpath = "//div[@class='_1p7h2j'[2]]")
	private WebElement filters2;

	public void getFlilters2() {

		filters2.click();
	}

}
