package com.interBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.interBanking.pageObjects.AddCustomerPage;
import com.interBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	@Test
	public void addNewCustomer() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		
		lp.clickLogin();
		Thread.sleep(3000);
		
		logger.info("providing customer details....");
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		addcust.custName("pavan");
		addcust.custgender("male");
		addcust.custdob("10","dec","1986");
		Thread.sleep(2000);
		
		addcust.custaddress("India");

		addcust.custcity("HYD");

		addcust.custstate("AP");
		addcust.custpinno("500074");
		
		addcust.custtelephone("986532014");

		String email = randomestring() + "@gmail.com";
		addcust.custemailid(email);
						
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
	Thread.sleep(3000);
		logger.info("Validation started-------");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("testcases passes....");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("testcases failed......");
		}
	}
}