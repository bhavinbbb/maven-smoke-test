package com.common.actions;

import com.common.component.CommunityAdminComponent;
import com.common.component.CommunityPageComponent;
import com.common.component.CommunityStructureComponent;

public class createCategoryActions {
 
 public static void createNewBoard(String boardId,String boardName){

	 CommunityStructureComponent communityStructureComponent = new CommunityStructureComponent();
	 
	 communityStructureComponent.clickOnCreateNode();
	 communityStructureComponent.clickToCreateBoard();
	 communityStructureComponent.typeCreateForumForm(boardId, boardName);
	 communityStructureComponent.clickOnSave();
 }
 
 
 
}
