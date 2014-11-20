package com.common.base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
/*
 * 
 * Maven Command: 
 * 
 * 
 * 
 */

public class SeleniumBase {
  static WebDriver driver;
  static String baseUrl;
  static String extendedBaseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static String testEnv = "distributed.lithium.com/admin/welcome";//System.getProperty("env");
  private static String type= "saucelab"; //System.getProperty("browser");
  private static String key= "t5";

  
  
  public static void setUp() throws Exception {

	  System.out.println(type);
	  System.out.println(testEnv);
	  System.out.println(System.getProperty("os"));
	  if(type.equals("chrome"))
	  {
	       driver = new ChromeDriver();
	  }
	  else if (type.equals("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  else if (type.equals("saucelab"))
	  { 
		  if(System.getProperty("os").equals("android")) {
			  DesiredCapabilities capabilities;
			  capabilities = DesiredCapabilities.android();
	       capabilities.setCapability("platform", Platform.ANDROID);
	       capabilities.setCapability("version",System.getProperty("version"));
	 	  driver = new RemoteWebDriver(
	                new URL("http://Widgets:bb892133-3338-4261-ba48-830d5bfb277e@ondemand.saucelabs.com:80/wd/hub"),
	                capabilities);
		  }
		  else  if(System.getProperty("os").equals("win8") && System.getProperty("browser").equals("chrome")) {
			  DesiredCapabilities capabilities; 
			  capabilities = DesiredCapabilities.chrome();
		       capabilities.setCapability("platform", Platform.WIN8);
		       capabilities.setCapability("version",System.getProperty("version"));
		 	  driver = new RemoteWebDriver(
		                new URL("http://Widgets:bb892133-3338-4261-ba48-830d5bfb277e@ondemand.saucelabs.com:80/wd/hub"),
		                capabilities);
			  } 
		  else  if(System.getProperty("os").equals("win8") && System.getProperty("browser").equals("firefox")) {
			  DesiredCapabilities capabilities; 
			  capabilities = DesiredCapabilities.firefox();
		       capabilities.setCapability("platform", Platform.WIN8);
		       capabilities.setCapability("version",System.getProperty("version"));
		 	  driver = new RemoteWebDriver(
		                new URL("http://Widgets:bb892133-3338-4261-ba48-830d5bfb277e@ondemand.saucelabs.com:80/wd/hub"),
		                capabilities);
			  } 	        	        
	        
	
	  }
	  else
	  {
		  driver = new FirefoxDriver();
	  }
    baseUrl = "http://"+testEnv;
    extendedBaseUrl = baseUrl + "/"+ key;
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

	public static String getExtendedBaseUrl(){
		return extendedBaseUrl;
	}

	  public void tearDown() throws Exception {
		    driver.quit();
		  }
  
}
