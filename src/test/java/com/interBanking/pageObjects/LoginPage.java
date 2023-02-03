package com.interBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
			
		public WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement btnLogin;
		
		@FindBy(linkText="Log out")
		@CacheLookup
		WebElement lnkLogout;
		
			public void setUserName(String uname)
		{
			txtEmail.sendKeys(uname);
		}
			
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
			
		public void clickLogin()
		{
			btnLogin.click();
		}
		
		public void clickLogout()
		{
			lnkLogout.click();
		}
	
		
		
	}

