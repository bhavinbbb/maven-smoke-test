package com.common.actions;

import com.common.component.LoginComponent;

public class LoginActions {
	
	public void loginUser(String username,String password){
		LoginComponent loginComponent = new LoginComponent();
		loginComponent.clickSignIn();
		loginComponent.typeLogin(username);
		loginComponent.typePassword(password);
		loginComponent.clickOnLoginButton();
		
	}
	
	public void logoutUser(String username){
		LoginComponent loginComponent = new LoginComponent();
		loginComponent.logoutFromProfile();
	}

}
