package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ViewProfilePageComponent extends BaseComponent{

	 public void navigateToViewProfilePage()
	 {
		 driver.get(baseUrl);
	 }
	 
	   public void clickOnViewProfile() {
		    Assert.assertEquals("User Profile link is not present.",isElementPresent(By.id("viewUserProfile")),true);     
		    driver.findElement(By.id("viewUserProfile")).click();
		    Assert.assertEquals("View Profile Link is not Available.",isElementPresent(By.id("myProfileSettings")),true);
			driver.findElement(By.id("myProfileSettings")).click();
			}
	   
	   public void clickOnPersonalProfileTab() {
		    Assert.assertEquals("Discussion Style Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'personal-profile-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'personal-profile-link')]")).click();
			Assert.assertEquals("Personal Profile Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'PersonalProfile')]")),true);
			}
	   
	   public void clickOnPreferences() {
		    Assert.assertEquals("Preferences Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-preferences-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-preferences-link')]")).click();
			Assert.assertEquals("User Preferences Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserPreferences')]")),true);
			}
	   public void clickOnAvatar() {
		    Assert.assertEquals("Avatar Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-icons-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-icons-link')]")).click();
			Assert.assertEquals("Avatar Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserIcons')]")),true);
			}
	   public void clickOnTaggging() {
		    Assert.assertEquals("Tagging Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-tagging-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-tagging-link')]")).click();
			Assert.assertEquals("Tagging Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserTagging')]")),true);
			}
	   
	   public void clickOnMacros() {
		    Assert.assertEquals("Macros Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-macros-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-macros-link')]")).click();
			Assert.assertEquals("Macros Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserMacros')]")),true);
			}
	   
	   public void clickOnSubscriptionAndNotifications() {
		    Assert.assertEquals("Subscriptions And Notifications Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-subscriptions-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-subscriptions-link')]")).click();
			Assert.assertEquals("Subscriptions and Notification Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserSubscriptions')]")),true);
			}
	   
	   public void clickOnChat() {
		    Assert.assertEquals("Chat Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-chat-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-chat-link')]")).click();
			Assert.assertEquals("Chat Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserChat')]")),true);
			}
	   public void clickOnSocialConnect() {
		    Assert.assertEquals("Social Connect Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-social-connect-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-social-connect-link')]")).click();
			Assert.assertEquals("Social Connect Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'UserPreferences')]")),true);
			}

	   
	   public void clickOnMobile() {
		    Assert.assertEquals("Mobile Tab is not Available on View Profile Page",isElementPresent(By.xpath("//a[contains(@class,'user-mobile-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'user-mobile-link')]")).click();
			Assert.assertEquals("Mobile Tab is not Loding correctly on View Profile Page",isElementPresent(By.xpath("//div[contains(@class,'lia-form-fieldset-wrapper')]")),true);
			}
}
