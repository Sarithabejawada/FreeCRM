
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Withdrawalpage extends TestBase {

	@FindBy(xpath = "//button[@ng-class='btnClass3']")
	WebElement withdrawSectionButton;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement amountInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement withdrawButton;

	@FindBy(xpath = "//span[@class='error ng-binding']")
	WebElement withdrawalSuccessful;

	public Withdrawalpage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public Withdrawalpage clickOnWithdrawSection() {
		withdrawSectionButton.click();
		return new Withdrawalpage();
	}

	public Withdrawalpage enterAmount(String amount) {
		amountInput.sendKeys("300");
		return new Withdrawalpage();
	}

	public Withdrawalpage clickOnWithdrawlButton() {
		withdrawButton.click();
		return new Withdrawalpage();

	}

	public String getWithdrawSuccessMessage() {
		return withdrawalSuccessful.getText();
	}

	public boolean isTransactionSuccessful() {
		// TODO Auto-generated method stub
		return true;
	}
}
