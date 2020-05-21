package com.capgemini.page.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	//public static WebDriver driver;
	
	static{
	System.setProperty("webdriver.chrome.driver", "c://drivers/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();

	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().window().maximize();

	}
	/*
	public static void browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	*/
}
