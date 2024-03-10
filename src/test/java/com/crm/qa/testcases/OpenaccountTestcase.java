package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Bankmanagerloginpage;
import com.crm.qa.pages.Openaccountpage;

	public class OpenaccountTestcase extends TestBase {

		 Bankmanagerloginpage managerLogin;
		 Openaccountpage openaccount;

	    public OpenaccountTestcase() {
	        super(); // Constructor call to initialize WebDriver and load URL
	    }

	    @BeforeMethod
	    public void setUp() {
	        initialization();
	        managerLogin = new Bankmanagerloginpage();
	        openaccount = new Openaccountpage();
	    
	    }
	    
	    @Test(priority = 1)
		public void openaccount() {
			
		
			managerLogin = managerLogin.clickOnManagerLogin();
			openaccount = openaccount.clickOnOpenAccount();
			openaccount = openaccount.ClickonCustomerDropdown();
			openaccount = openaccount.ClickonCurrencyDropdown();
			openaccount = openaccount.Processbutton();
			Assert.assertTrue(openaccount.isAccountOpenedSuccessfully(), "Account was not opened successfully.");
	    }
	    @AfterMethod
		public void tearDown(){
			driver.quit();
		}
	}



