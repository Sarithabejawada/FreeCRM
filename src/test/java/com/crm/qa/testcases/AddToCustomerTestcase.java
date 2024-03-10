
package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Addcustomerpage;
import com.crm.qa.pages.Bankmanagerloginpage;

public class AddToCustomerTestcase extends TestBase {

	Bankmanagerloginpage managerLogin;
	Addcustomerpage addcustomer;

	public AddToCustomerTestcase() {
		super(); // Constructor call to initialize WebDriver and load URL
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		managerLogin = new Bankmanagerloginpage();
		addcustomer = new Addcustomerpage();

	}

	@Test(priority = 1)
	public void addcustomer() {

		managerLogin = managerLogin.clickOnManagerLogin();
		addcustomer = addcustomer.clickOnAddCustomer();
		addcustomer = addcustomer.enterFirstName("Saritha");
		addcustomer = addcustomer.enterLastName("Bejawada");
		addcustomer = addcustomer.enterZipCode("523105");
		addcustomer = addcustomer.clickOnAddCustomerBtn();
		Assert.assertTrue(addcustomer.isCustomerAddedSuccessfully(), "Customer was not added successfully.");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
