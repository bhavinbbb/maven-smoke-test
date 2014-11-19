package com.common.actions;

import com.common.component.LoginComponent;
import com.common.component.RNRLoginComponent;

public class RNRLoginActions {
	
	public void loginUser(String username,String password){
		RNRLoginComponent loginComponent = new RNRLoginComponent();
		loginComponent.typeLogin(username);
		loginComponent.typePassword(password);
		loginComponent.submitLogin();
		
	}
	
	public void logoutUser(String username){
		LoginComponent loginComponent = new LoginComponent();
		loginComponent.logoutFromProfile();
	}
	
	public void logoutFromAdminUser(String username){
		LoginComponent loginComponent = new LoginComponent();
		loginComponent.logoutFromAdmin();
	}
	
	public void verifyUserLoggedIn(){
		
	}

}
