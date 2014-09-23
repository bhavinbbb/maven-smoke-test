package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommunityPageComponent extends BaseComponent{

   public void clickOnCommunityAdmin() {
	    Assert.assertEquals("Community Admin Link is not Available on Community Page.",isElementPresent(By.id("communityAdmin")),true);
		driver.findElement(By.id("communityAdmin")).click();
		}
		
   
}
