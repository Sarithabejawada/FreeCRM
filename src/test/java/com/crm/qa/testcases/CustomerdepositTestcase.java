
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Customerloginpage;
import com.crm.qa.pages.Depositpage;
import com.crm.qa.util.TestUtil;

public class CustomerdepositTestcase extends TestBase {
	Customerloginpage customerloginpage;
	TestUtil testutil;
	Depositpage depositpage;

	public CustomerdepositTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new Customerloginpage();
		depositpage = new Depositpage();
	}

	// Test
	@Test(priority = 1)
	public void customerdeposit() {

		customerloginpage = customerloginpage.navigatetocustomerselection();
		depositpage = depositpage.navigatetodeposit();
		depositpage = depositpage.enteramount();
		depositpage = depositpage.btn();
		Assert.assertTrue(depositpage.isDepositSuccessful(), "Amount was not deposited successfully.");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
