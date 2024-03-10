
package com.crm.qa.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Transactionpage extends TestBase {

	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement transactionSectionButton;

	/*
	 * @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]") WebElement
	 * RightarrowButton;
	 * 
	 * @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]") WebElement
	 * LefttarrowButton;
	 * 
	 * @FindBy(xpath = "(//button[@class='btn btn-primary'])[2]") WebElement
	 * topButton;
	 */

	@FindBy(xpath = "//span[@class='success ng-binding']")
	WebElement successMessage;

	public Transactionpage() {
		PageFactory.initElements(driver, this);
	}

	public Transactionpage clickOnTransactionSection() {
		transactionSectionButton.click();
		return new Transactionpage();
	}

	/*
	 * public void clickOnRightArrowButton() { RightarrowButton.click(); }
	 * 
	 * public void clickOnTopButton() { topButton.click(); } public void
	 * clickOnLeftButton() { LefttarrowButton.click(); }
	 */
	public boolean isTransactionSectionDisplayed() {
		// Check if the transaction section is displayed
		try {
			return transactionSectionButton.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
