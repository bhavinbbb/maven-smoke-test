package com.common.component;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PostComponent extends BaseComponent{

	   public void clickOnNewMessage() {
		    Assert.assertEquals("Community Admin Link is not Available on Community Page.",isElementPresent(By.xpath("//a[contains(@href,'postpage')]")),true);
			driver.findElement(By.xpath("//a[contains(@href,'postpage')]")).click();
	   }
		
       public void typeSubject(String subject){
    	   driver.findElement(By.id("lia-subject")).sendKeys(subject);; 
       }
       
       public void typeBody(String body){
   		driver.switchTo().frame(driver.findElement(By.id("tinyMceEditor_ifr")));
   		driver.findElement(By.id("tinymce")).sendKeys(body);
   		driver.switchTo().defaultContent();    	   
       }
       public void clickOnPost(){

      		driver.findElement(
      				By.xpath("//input[contains(@class,'lia-button-Submit-action')]")).click();
    	   
       }
}
