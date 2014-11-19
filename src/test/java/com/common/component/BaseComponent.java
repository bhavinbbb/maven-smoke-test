package com.common.component;

import com.common.base.SeleniumBase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.common.base.SeleniumBase.getDriver;
import static com.common.base.SeleniumBase.getBaseUrl;
import static com.common.base.SeleniumBase.getExtendedBaseUrl;



public class BaseComponent {

	
	protected WebDriver driver = getDriver();
	protected String baseUrl = getBaseUrl();
	protected String extendedBaseUrl = getExtendedBaseUrl();
	
	public void waitUntilLocatorIsPresent(By locator, long timeOutInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	  public boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  public boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }
		 
	
}
