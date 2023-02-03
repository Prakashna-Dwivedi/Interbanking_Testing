package com.interBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	  public WebDriver ldriver;
	  
	 public AddCustomerPage(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver,this);
	  }
	  
	  By lnkAddNewCustomer=By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	  By txtCustomerName=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	  
	
		@FindBy(how = How.NAME,using ="rad1")
		@CacheLookup
		WebElement rdGender;
		
		@FindBy(how = How.NAME,using ="dob")
		@CacheLookup
		WebElement txtdob;
		
		By txtaddress=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");

		By txtcity=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
		
		By txtstate=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
		By txtpinno=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
		By txttelephoneno=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
		By txtemailid=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
		
		
		
		By txtpassword=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
		
			
		By btnSubmit=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
				
		
		public void clickAddNewCustomer() throws InterruptedException{
			Thread.sleep(1000);
			ldriver.findElement(lnkAddNewCustomer).click();
		}

		public void custName(String cname) throws InterruptedException {
			ldriver.findElement(txtCustomerName).click();
			Thread.sleep(2000);
		}
		public void custgender(String cgender)
		{
			
				rdGender.click();
			
		}
		public void custdob(String mm,String dd,String yy)
		{
			txtdob.sendKeys(mm);
			txtdob.sendKeys(dd);
			txtdob.sendKeys(yy);
		}
		

		public void custaddress(String caddress)
		{
			ldriver.findElement(txtaddress).sendKeys(caddress);
		}

		public void custcity(String ccity)
		{
			ldriver.findElement(txtcity).sendKeys(ccity);
		}

		public void cust(String cstate)
		{
			ldriver.findElement(txtstate).sendKeys(cstate);
		}
	

		public void custstate(String cstate)
		{
			ldriver.findElement(txtstate).sendKeys(cstate);
		}

		public void custpinno(String cpinno) 
		{
			ldriver.findElement(txtpinno).sendKeys(String.valueOf(cpinno));
			
		}

		public void custtelephone(String ctelephoneno){
			ldriver.findElement(txttelephoneno).sendKeys(ctelephoneno);
		}

		public void custemailid(String cemailid)
		{
			ldriver.findElement(txtstate).sendKeys(cemailid);
		}

		public void custpassword(String cpassword)
		{
			ldriver.findElement(txtpassword).sendKeys(cpassword);
		}
		

		public void custsubmit()
		{
			ldriver.findElement(btnSubmit).click();
		}


}
