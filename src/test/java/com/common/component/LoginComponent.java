package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginComponent extends BaseComponent{

	public void clickSignIn(){
    Assert.assertEquals("Sign In Link is not Available.",isElementPresent(By.id("loginPageV2")),true);
	driver.findElement(By.id("loginPageV2")).click();
	}
	
	public void typeLogin(String login) {
	    Assert.assertEquals("Login Textbox is not available",isElementPresent(By.name("login")),true);
		driver.findElement(By.name("login")).sendKeys(login);
	}
	
	public void typePassword(String password){
	    Assert.assertEquals("Password Textbox is not available",isElementPresent(By.name("password")),true);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clickOnLoginButton(){
		 Assert.assertEquals("Login Button is not available",isElementPresent(By.xpath("//div[contains(@class,'ui-dialog')]//input[contains(@class,'lia-button-Submit-action')]")),true);
	    driver.findElement(By.xpath("//div[contains(@class,'ui-dialog')]//input[contains(@class,'lia-button-Submit-action')]")).click();
	    Assert.assertEquals("User is not Successfully logged in.",isElementPresent(By.id("viewUserProfile")),true); 
	}
	
	public void logoutFromProfile(){
	    Assert.assertEquals("User Profile link is not present.",isElementPresent(By.id("viewUserProfile")),true);     
	    driver.findElement(By.id("viewUserProfile")).click();
	    Assert.assertEquals("Logout Link is not Present.",isElementPresent(By.id("logoutPage")),true);
	    driver.findElement(By.id("logoutPage")).click();
	    Assert.assertEquals("Logout is not successful.",isElementPresent(By.id("loginPageV2")),true);
	}
	
	public void logoutFromAdmin(){
		
	    Assert.assertEquals("LogOut Link is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'logout-link')]")),true);
		driver.findElement(By.xpath("//a[contains(@class,'logout-link')]")).click();
	}
	
}

