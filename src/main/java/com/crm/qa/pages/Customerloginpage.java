package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Customerloginpage extends TestBase {

	// Page Factory - OR:
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerloginbutton;

	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement dropdown;

	@FindBy(xpath = "//option[contains(text(),'Hermoine Granger')]")
	WebElement name;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement Loginbutton;

	@FindBy(xpath = "//span[contains(text(),'Hermoine Granger')]")
	WebElement message;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
	WebElement deposit;

	@FindBy(xpath = "//button[@ng-click='withdrawl()']")
	WebElement withdrawl;

	@FindBy(xpath = "//button[@ng-click='transactions()']")
	WebElement Transactions;

//			@FindBy(xpath="//button[@class='btn btn-lg tab'])[2]")
//			WebElement Depositclick;
//			
//		@FindBy(xpath="//button[@class='btn btn-lg tab'])[3]")
//		WebElement withdrawlclick;
//			

	// Initializing the Page Objects:
	public Customerloginpage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public Customerloginpage navigatetocustomerselection() {
		customerloginbutton.click();
		dropdown.click();
		name.click();
		Loginbutton.click();
		return new Customerloginpage();
	}

	public boolean navigatetocustomerhomepage() {
		return message.isDisplayed();
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public Depositpage navigatetodeposit() {
		deposit.click();
		return new Depositpage();

	}

	public Withdrawalpage navigatetowithdrawl() {
		withdrawl.click();
		return new Withdrawalpage();
	}

	public Transactionpage navigatetotransactions() {
		Transactions.click();
		return new Transactionpage();

	}

}
