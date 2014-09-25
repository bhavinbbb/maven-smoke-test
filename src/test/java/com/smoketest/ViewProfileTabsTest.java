package com.smoketest;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.common.actions.LoginActions;
import com.common.base.SeleniumBase;
import com.common.component.ViewProfilePageComponent;

public class ViewProfileTabsTest extends SeleniumBase{
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUpMethod() throws Exception {
	setUp();
	}
	
  @Test
  public void testLogin() throws Exception {
	  LoginActions loginActions = new LoginActions();
	  ViewProfilePageComponent viewProfilePageComponent = new ViewProfilePageComponent();
	  
	  
	  loginActions.loginUser("admin","arfarf");
	  viewProfilePageComponent.clickOnViewProfile();
	  viewProfilePageComponent.clickOnPersonalProfileTab();
	  viewProfilePageComponent.clickOnPreferences();
	  viewProfilePageComponent.clickOnAvatar();
	  viewProfilePageComponent.clickOnTaggging();
	  viewProfilePageComponent.clickOnMacros();
	  viewProfilePageComponent.clickOnSubscriptionAndNotifications();
	  viewProfilePageComponent.clickOnChat();
	//  viewProfilePageComponent.clickOnSocialConnect();
	  viewProfilePageComponent.clickOnMobile();
	  loginActions.logoutUser("admin");

  }

  @After
  public void endMethod() throws Exception {
    tearDown();

  }

 
}
