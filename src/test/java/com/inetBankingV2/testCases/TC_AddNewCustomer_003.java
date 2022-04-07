package com.inetBankingV2.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetBankingV2.pageObject.LoginPage;
import com.inetBankingV2.pageObject.NewCustomer;

public class TC_AddNewCustomer_003 extends BaseClass{

	@Test
	public void addNewCutomer() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Username is provided");
		lp.setPassword(passWord);
		logger.info("Password is provided");
		lp.buttonClick();
    
		Thread.sleep(3000);
		
		NewCustomer addCust=new NewCustomer(driver);
		addCust.clickAddNewCustomer();
		//driver.switchTo().frame("ad_iframe");
		//driver.findElement(By.xpath("//span[@class='ns-ctx2y-e-16']")).click();
		
		//driver.findElement(By.tagName("h2")).click();
		Thread.sleep(3000);
		addCust.custName("Prathamesh");
		addCust.custgender("male");
		addCust.custdob("12","27","92");
		addCust.custaddress("INDIA");
		addCust.custcity("HYD");
		addCust.custstate("AP");
		addCust.custpinno("5000074");
		addCust.custtelephonno("9878900091");
		
		String email=randomString()+"@gmail.com";
		addCust.custemailid(email);
		
		addCust.custpassword("abcdef");
		addCust.custsubmit();
		
		Thread.sleep(3000);
        
		
		boolean res=driver.getPageSource().contains("Customers registered successfully");
		if(res==true)
		{
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
			
		}
	}


}
