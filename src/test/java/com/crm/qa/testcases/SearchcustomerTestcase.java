
package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Bankmanagerloginpage;
import com.crm.qa.pages.Searchcustomerpage;

public class SearchcustomerTestcase extends TestBase {

	Bankmanagerloginpage managerLogin;
	Searchcustomerpage searchcustomerPage;

	public SearchcustomerTestcase() {
		super(); // Constructor call to initialize WebDriver and load URL
	}

	@BeforeMethod
	public void setup() {
		initialization();
		managerLogin = new Bankmanagerloginpage();
		searchcustomerPage = new Searchcustomerpage();
	}

	@Test(priority = 1)
	public void searchcustomers() {

		managerLogin = managerLogin.clickOnManagerLogin();
		searchcustomerPage = searchcustomerPage.clickOnCustomerLogin();
		searchcustomerPage = searchcustomerPage.searchCustomer("Harry");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
