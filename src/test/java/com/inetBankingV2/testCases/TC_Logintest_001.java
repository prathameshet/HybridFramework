package com.inetBankingV2.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBankingV2.pageObject.LoginPage;

public class TC_Logintest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		
		logger.info("Url is opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(userName);
		logger.info("Username Entered");
		lp.setPassword(passWord);
		logger.info("Password Entered");
		
		lp.buttonClick();
		
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
}
