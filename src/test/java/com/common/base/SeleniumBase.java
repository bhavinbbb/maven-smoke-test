package com.common.base;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class SeleniumBase {
  static WebDriver driver;
  static String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String testEnv = "enduser1.qa.lithium.com";//System.getProperty("env");
  private static String browser= "firefox"; //System.getProperty("browser");

  
  
  public static void setUp() throws Exception {

	  System.out.println(browser);
	  System.out.println(testEnv);
	  if(browser.equals("chrome"))
	  {
	       driver = new ChromeDriver();
	  }
	  else if (browser.equals("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  else
	  {
		  driver = new FirefoxDriver();
	  }
    baseUrl = "http://"+testEnv;
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

	public static WebDriver getDriver() {
		if (driver == null) {
			try{
			setUp();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		return driver;
	}

	public static String getBaseUrl(){
		return baseUrl;
	}


	  public void tearDown() throws Exception {
		    driver.quit();
		  }
  
}
