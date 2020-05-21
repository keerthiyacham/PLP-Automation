package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capgemini.page.base.Base;

public class Tc_FlipkartAutomation_ExplorePlus_pom extends Base {

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

	public Tc_FlipkartAutomation_ExplorePlus_pom(WebDriver driver) {
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

	@FindBy(className = "_33x-Wq")
	private WebElement exploreplus;

	public void getExplorePlus() {
		exploreplus.click();
	}

	@FindBy(xpath = "//img[@src='https://rukminim1.flixcart.com/lockin/100/11/images/Non-Member_02_DT_post_upgrade.jpg?q=50']")
	private WebElement mycoinbalc;

	public void getMyCoinBalc() {

		mycoinbalc.click();
	}

	@FindBy(xpath = "//img[@src='https://rukminim1.flixcart.com/lockin/100/11/images/Non-MemberV2_02_5thCutover_DT_postUpgrade.jpg?q=50']")
	private WebElement myRewardstore;

	public void getMyRewardStore() {

		myRewardstore.click();
	}

	public  void titleChecking() {

		String actualTitle = driver.getTitle();
		String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actualTitle, expectedtitle,"Unexpected Title");
	}

}
