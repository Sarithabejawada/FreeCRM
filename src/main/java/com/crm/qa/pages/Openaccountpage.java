
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class Openaccountpage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	WebElement openAccountBtn;

	@FindBy(xpath = "(//option[@ng-repeat='cust in Customers'])[4]")
	WebElement customerDropdown;

	@FindBy(xpath = "//option[@value='Rupee']")
	WebElement currencyDropdown;

	@FindBy(xpath = "//button[contains(text(),'Process')]")
	WebElement processBtn;

	public Openaccountpage() {
		PageFactory.initElements(driver, this);
	}

	public Openaccountpage clickOnOpenAccount() {
		openAccountBtn.click();
		return new Openaccountpage();
	}

	public Openaccountpage ClickonCustomerDropdown() {
		customerDropdown.click();
		return new Openaccountpage();

	}

	public Openaccountpage ClickonCurrencyDropdown() {
		currencyDropdown.click();

		return new Openaccountpage();

	}

	public Openaccountpage Processbutton() {
		processBtn.click();
		return new Openaccountpage();
	}

	public boolean isAccountOpenedSuccessfully() {
		// TODO Auto-generated method stub
		return true;
	}
}
