package com.inetBankingV2.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement txtbtnLogin;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void buttonClick() {
		txtbtnLogin.click();
	}
	 
	public void clickLogout() {
		lnkLogout.click();
	}
}
