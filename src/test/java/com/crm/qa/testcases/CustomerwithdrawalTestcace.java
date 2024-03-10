
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Customerloginpage;
import com.crm.qa.pages.Withdrawalpage;
import com.crm.qa.util.TestUtil;

public class CustomerwithdrawalTestcace extends TestBase {
	Customerloginpage customerloginpage;
	TestUtil testutil;
	Withdrawalpage withdrawlpage;

	public CustomerwithdrawalTestcace() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new Customerloginpage();
		withdrawlpage = new Withdrawalpage();
	}

	// Test
	@Test(priority = 1)
	public void customerwithdrawl() {

		customerloginpage = customerloginpage.navigatetocustomerselection();

		withdrawlpage = withdrawlpage.clickOnWithdrawSection();

		withdrawlpage = withdrawlpage.enterAmount("300");

		withdrawlpage = withdrawlpage.clickOnWithdrawlButton();
		Assert.assertTrue(withdrawlpage.isTransactionSuccessful(), "Amount was not Withdrawed successfully.");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
