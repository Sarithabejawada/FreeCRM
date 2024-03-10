
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Depositpage extends TestBase {

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
	WebElement depositSectionButton;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement amountInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement depositButton;
	@FindBy(xpath = "//span[@class='error ng-binding']")
	WebElement DepositSuccessful;

	public Depositpage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public Depositpage navigatetodeposit() {
		depositSectionButton.click();
		return new Depositpage();

	}

	public Depositpage enteramount() {

		amountInput.sendKeys("500");
		return new Depositpage();
	}

	public Depositpage btn() {
		depositButton.click();
		return new Depositpage();
	}

	public boolean isDepositSuccessful() {
		// TODO Auto-generated method stub
		return true;
	}

}
