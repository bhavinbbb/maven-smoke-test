package com.common.component;

import org.openqa.selenium.By;

public class CommunityStructureComponent extends BaseComponent{
	
	 public void clickOnCreateNode(){
		 
			driver.findElement(By.xpath("//div[contains(@class,'lia-node-display-node-title')]//span[contains(@class,'lia-node-display-node-title')]")).click();
			driver.findElement(By.id("dropDownLink")).click();

			
	 }
	 
	 public void clickToCreateBoard(){
			driver.findElement(By.id("createNode_0")).click();
	 }
	 
	 
	 public void typeCreateForumForm(String boardId, String boardName){
		 driver.findElement(By.xpath("//input[contains(@class,'lia-form-boardid-input')]")).sendKeys(boardId);
		 driver.findElement(By.xpath("//input[contains(@class,'lia-form-boardtitle-input')]")).sendKeys(boardName);
	 }
	 
	 public void clickOnSave(){
		 driver.findElement(By.xpath("//div[contains(@class,'ui-dialog')]//input[contains(@class,'lia-button-Submit-action')]")).click();
		 
	 }

}
