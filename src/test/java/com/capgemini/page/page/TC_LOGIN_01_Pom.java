package com.capgemini.page.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.page.base.Base;

public class TC_LOGIN_01_Pom extends Base {
	
	public TC_LOGIN_01_Pom(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	@FindBy(xpath="//a[@class=\"_3Ep39l\"]")
	private WebElement login;
	
	public void Login() {
		login.click();
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement email;
	
	public void getEmail(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		Set<String> s = driver1.getWindowHandles();
		int count=0;
		for(String str:s) {
			if(count==2) {
				driver1.switchTo().window(str);
			}
		}
		email.click();
	}
	public WebElement Email() {
		return email;
	}

	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement signin;
	
	public void getSignin() {
		signin.click();
	}
	public void getSwitch(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		String str=driver1.getWindowHandle();
		driver1.switchTo().window(str);
		
	}
	
	
	@FindBy(name="q")
	private WebElement search;
	
	public void getSearch1() {
		search.click();
	}
	
	public WebElement getSearch() {
		
		return search;
	}
	
	////*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[4]/div/a[2]
	
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement searchclick;
	
	
	public void getSearchClick() {
		searchclick.click();
	}
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")
	//@FindBy(xpath="//img[@alt='TEJ Multipurpose Surface (Anti Bacterial Waterless Liquid) Hand Sanitizer Bottle']")
	private WebElement img;
	
	
	public void getImage() {
		
		img.click();
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addtocart;
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
	private WebElement placeorder;
	
	@FindBy(xpath="//button[@class='_2AkmmA _I6-pD _7UHT_c']")
	private WebElement deliveryhere;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Q4i61 _7UHT_c']")
	private WebElement contin;
	
	
	@FindBy(name="cvv")
	private WebElement cvv;
	public void getImageWindow(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		Set<String> s = driver1.getWindowHandles();
		int count=0;
		for(String str:s) {
			count++;
			if(count==2) {
				driver1.switchTo().window(str);
			}
		}
		placeorder.click();
		deliveryhere.click();
		contin.click();
		//addtocart.click();
		
		
	}
	public WebElement Cvv() {
		return cvv;
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA Hy6dyh _7UHT_c']")
	private WebElement contin1;
	
	public void getConti() {
		contin1.click();
	}
	
	@FindBy(xpath="(//div[@class='_2aUbKa'])[1]")
	private WebElement flipkart;
	
	@FindBy(xpath="//div[@class='_1Q5BxB']")
	private WebElement myprofile;
	
	public void  getFlipkart(WebDriver driver1) throws InterruptedException {
		PageFactory.initElements(driver1, this);
		Actions action = new Actions(driver1);
		Thread.sleep(1000);
		action.moveToElement(flipkart).perform();
		myprofile.click();
	
	}
	
	@FindBy(xpath="//span[@class='_2ZZi8V']")
	private WebElement logout;
	
	public void getLogout() {
		logout.click();
	}


	/*
	// loginlink
	@FindBy(className = "_3Ep39l")
	WebElement loginlink;

	// login button
	@FindBy(className = "_2zrpKA")
	WebElement loginbutton;

	// username
	@FindBy(className = "_2zrpKA")
	WebElement username;

	// password
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement password;

	// login
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement login;
	
	// mousehover on accounts
	@FindBy(xpath = "//div[@class='_2aUbKa']")
	WebElement myAccount;

	// my profile
	@FindBy(xpath = "//div[contains(text(),'My Profile')]")
	WebElement myprofile;

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement logout;

	public TC_LOGIN_01_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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

	public void getMyAccount() {
		Actions action = new Actions(driver);
		action.moveToElement(myAccount).perform();

	}

	public void getMyProfile() {
		myprofile.click();
	}

	public void getLogout() {
		logout.click();
	}
	*/
}