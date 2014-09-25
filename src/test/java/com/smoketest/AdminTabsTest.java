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
import com.common.component.CommunityAdminComponent;
import com.common.component.CommunityPageComponent;

public class AdminTabsTest extends SeleniumBase{
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUpMethod() throws Exception {
	setUp();
	}
	
  @Test
  public void testAdminTabs() throws Exception {
	  LoginActions loginActions = new LoginActions();
	  CommunityAdminComponent communityAdminComponent = new CommunityAdminComponent();
	  CommunityPageComponent communityPageComponent = new CommunityPageComponent();
	  
	  loginActions.loginUser("admin","arfarf");
	  communityPageComponent.clickOnCommunityAdmin();
	  communityAdminComponent.clickOnDiscussionStyle();
	  communityAdminComponent.clickOnFeatures();
	  communityAdminComponent.clickOnSystem();
	  communityAdminComponent.clickOnDisplay();
	  communityAdminComponent.clickOnContent();
	  communityAdminComponent.clickOnUsers();
	  communityAdminComponent.clickOnModeratorTools();
	  communityAdminComponent.clickOnMetrics();
	  communityAdminComponent.clickOnCommunityStructure();
	  loginActions.logoutFromAdminUser("admin");

  }

  @After
  public void endMethod() throws Exception {
    tearDown();

  }

 
}
