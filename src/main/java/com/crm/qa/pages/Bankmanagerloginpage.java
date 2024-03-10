package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Bankmanagerloginpage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement managerLoginBtn;

	public Bankmanagerloginpage() {
		PageFactory.initElements(driver, this);
	}

	public Bankmanagerloginpage clickOnManagerLogin() {
		managerLoginBtn.click();
		return new Bankmanagerloginpage();
	}
}
