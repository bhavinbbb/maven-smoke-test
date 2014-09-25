package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;

public class StudioPageComponent extends BaseComponent{

	 public void navigateToViewProfilePage()
	 {
		 driver.get(baseUrl);
	 }
	 
	   public void clickOnStudioLink() {
		    Assert.assertEquals("Studio link is not present.",isElementPresent(By.id("lithiumStudio")),true);     
		    driver.findElement(By.id("lithiumStudio")).click();
			}
	   
	   public void clickOnPage() {
		    Assert.assertEquals("Page Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'page-editor-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'page-editor-link')]")).click();
			Assert.assertEquals("Page Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'QuiltEditorTab')]")),true);
			}
	   
	   public void clickOnCommunityStyle() {
		    Assert.assertEquals("Community Style Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'community-style-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'community-style-link')]")).click();
			Assert.assertEquals("Community Style Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'CommunityStyle')]")),true);
			}
	   
	   public void clickOnComponents() {
		    Assert.assertEquals("Components Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'custom-content-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'custom-content-link')]")).click();
			Assert.assertEquals("Components Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'CustomContentTab')]")),true);
			}
	   
	   
	   public void clickOnLayout() {
		    Assert.assertEquals("Layout Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'layout-editor-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'layout-editor-link')]")).click();
			Assert.assertEquals("Layout Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'LayoutEditorTab')]")),true);
			}
	   public void clickOnTextEditor() {
		    Assert.assertEquals("Text Editor Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'text-editor-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'text-editor-link')]")).click();
			Assert.assertEquals("Text Editor Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'TextEditor')]")),true);
			}
	   
	   public void clickOnFeatures() {
		    Assert.assertEquals("Features Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'feature-version-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'feature-version-link')]")).click();
			Assert.assertEquals("Features Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//form[contains(@class,'lia-studio-feature-version-form')]")),true);
			}
	   
	   public void clickOnEndPoints() {
		    Assert.assertEquals("EndPoints Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'endpoints-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'endpoints-link')]")).click();
			Assert.assertEquals("End Points Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'EndpointsEditorTab')]")),true);
			}
	   
	   public void clickOnVersions() {
		    Assert.assertEquals("Versions Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'revision-manager-link')]")),true);
			driver.findElement(By.xpath("//a[contains(@class,'revision-manager-link')]")).click();
			Assert.assertEquals("Versions Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'RevisionManagerTab')]")),true);
			}
	   
	   
	   public void clickOnAPIBrowser() {
		   Assert.assertEquals("API Browser Tab is not Available on Studio Page",isElementPresent(By.xpath("//a[contains(@class,'api-browser-link')]")),true);
		   driver.findElement(By.xpath("//a[contains(@class,'api-browser-link')]")).click();
		   Assert.assertEquals("API Browser Tab is not Loding correctly on Studio Page",isElementPresent(By.xpath("//div[contains(@class,'ApiBrowser')]")),true);
	   	   }
	   
}
