package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RNRLoginComponent extends BaseComponent{


	
	public void typeLogin(String login) {
	    Assert.assertEquals("Login Textbox is not available",isElementPresent(By.name("username")),true);
		driver.findElement(By.name("username")).sendKeys(login);
	}
	
	public void typePassword(String password){
	    Assert.assertEquals("Password Textbox is not available",isElementPresent(By.name("password")),true);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	

	
	public void submitLogin(){
		
	    Assert.assertEquals("LogOut Link is not Available on Community Admin",isElementPresent(By.xpath("//form[contains(@class,'li-admin-login-form’)]//button[contains(@class,'btn-success')]")),true);
		driver.findElement(By.xpath("//form[contains(@class,'li-admin-login-form’)]//button[contains(@class,'btn-success')]")).click();
	}
	
}

