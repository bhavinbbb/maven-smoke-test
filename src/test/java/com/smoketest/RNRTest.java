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
import com.common.actions.RNRLoginActions;
import com.common.base.SeleniumBase;
import com.common.component.CommunityAdminComponent;
import com.common.component.CommunityPageComponent;

public class RNRTest extends SeleniumBase{
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

  Thread.sleep(3000);
  }

  @After
  public void endMethod() throws Exception {
    tearDown();

  }

 
}
