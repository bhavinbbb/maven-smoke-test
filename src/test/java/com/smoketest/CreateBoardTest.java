package com.smoketest;
import java.util.UUID;



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

public class CreateBoardTest extends SeleniumBase{


	

	@Before
	public void setUpMethod() throws Exception {
	setUp();
	}
	
  @Test
  public void testCreateNewBoard() throws Exception {
	  LoginActions loginActions = new LoginActions();
	  CommunityPageComponent communityPageComponent= new CommunityPageComponent();
	  CommunityAdminComponent communityAdminComponent = new CommunityAdminComponent();	  
	  loginActions.loginUser("admin","arfarf");
	  communityPageComponent.clickOnCommunityAdmin();
	  communityAdminComponent.clickOnCommunityStructure();

	  for(int i=0;i<10;i++){
	  String boardName = "board"+UUID.randomUUID().toString();
	  String boardId = "id"+UUID.randomUUID().toString();
	  com.common.actions.createCategoryActions.createNewBoard(boardId, boardName);
	  }
	  loginActions.logoutFromAdminUser("admin");      
  }

  @After
  public void endMethod() throws Exception {
    tearDown();

  }

 
}
