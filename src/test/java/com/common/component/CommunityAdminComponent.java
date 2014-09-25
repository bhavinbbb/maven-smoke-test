package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CommunityAdminComponent extends BaseComponent{

	 public void navigateToCommunityStructure()
	 {
		 driver.get(baseUrl);
	 }
	 
	   public void clickOnCommunityStructure() {
		    Assert.assertEquals("Community Structure Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'manage-community-structure-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'manage-community-structure-link')]")).click();
			Assert.assertEquals("Community Structure is not correctly loaded on Community Admin",isElementPresent(By.xpath("//div[contains(@class,'lia-component-admin-widget-node-editor-tree')]")),true);
			}
	   
	   public void clickOnDiscussionStyle() {
		    Assert.assertEquals("Discussion Style Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'interactions-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'interactions-link')]")).click();
			Assert.assertEquals("Discussion Style is not correctly loaded on Community Admin",isElementPresent(By.xpath("//form[contains(@class,'lia-settings-form')]")),true);
			}
	   
	   public void clickOnFeatures() {
		    Assert.assertEquals("FEATURES Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'features-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'features-link')]")).click();
			Assert.assertEquals("FEATURES Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//div[contains(@class,'lia-admin-settings-content')]")),true);
			
			}
	   public void clickOnSystem() {
		    Assert.assertEquals("SYSTEM Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'system-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'system-link')]")).click();
			Assert.assertEquals("System Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//div[contains(@class,'lia-admin-settings-content')]")),true);
						}
	   public void clickOnDisplay() {
		    Assert.assertEquals("DISPLAY Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'display-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'display-link')]")).click();
			Assert.assertEquals("Display Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//form[contains(@class,'lia-settings-form')]")),true);
			}
	   
	   public void clickOnContent() {
		    Assert.assertEquals("CONTENT Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'content-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'content-link')]")).click();
			Assert.assertEquals("Content Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//label[contains(@for,'layoutannouncements')]")),true);
						}
	   
	   public void clickOnUsers() {
		    Assert.assertEquals("USERS Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'users-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'users-link')]")).click();
			Assert.assertEquals("Users Tab is not correctly loaded on Community Admin",isElementPresent(By.id("adminSubTabGroup")),true);
					}
	   
	   public void clickOnModeratorTools() {
		    Assert.assertEquals("MOD TOOLS Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'moderatortools-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'moderatortools-link')]")).click();
			Assert.assertEquals("MOD TOOLS Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'moderation-link')]")),true);
						}
	   public void clickOnMetrics() {
		    Assert.assertEquals("METRICS Tab is not Available on Community Admin",isElementPresent(By.xpath("//a[contains(@class,'analytics-main-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'analytics-main-link')]")).click();
			Assert.assertEquals("METRICS Tab is not correctly loaded on Community Admin",isElementPresent(By.xpath("//li[contains(@class,'metrics-tab')]")),true);
						}
 
}
