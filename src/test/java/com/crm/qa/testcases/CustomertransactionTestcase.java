
package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Customerloginpage;
import com.crm.qa.pages.Transactionpage;
import com.crm.qa.util.TestUtil;

public class CustomertransactionTestcase extends TestBase {
	Customerloginpage customerloginpage;
	TestUtil testutil;
	Transactionpage transactionpage;

	public CustomertransactionTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new Customerloginpage();
		transactionpage = new Transactionpage();
	}

	// Test
	@Test(priority = 1)
	public void customertransaction() {

		customerloginpage = customerloginpage.navigatetocustomerselection();
		transactionpage = transactionpage.clickOnTransactionSection();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
