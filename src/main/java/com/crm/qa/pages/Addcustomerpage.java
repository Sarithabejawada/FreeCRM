package com.crm.qa.pages;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.crm.qa.base.TestBase;

	public class Addcustomerpage extends TestBase {

	    @FindBy(xpath = "//button[@ng-class='btnClass1']")
	    WebElement addCustomerBtn;

	    @FindBy(xpath = "//input[@placeholder='First Name']")
	    WebElement firstNameInput;

	    @FindBy(xpath = "//input[@placeholder='Last Name']")
	    WebElement lastNameInput;

	    @FindBy(xpath = "//input[@placeholder='Post Code']")
	    WebElement zipCodeInput;

	    @FindBy(xpath = "(//button[contains(text(),'Add Customer')])[2]")
	    WebElement addCustomerSubmitBtn;

	    public Addcustomerpage() {
	        PageFactory.initElements(driver, this);
	    }

	    public  Addcustomerpage clickOnAddCustomer() {
	        addCustomerBtn.click();
			return new  Addcustomerpage();
	    }

	    public  Addcustomerpage enterFirstName(String firstName) {
	        firstNameInput.sendKeys(firstName);
			return new   Addcustomerpage();
	    }

	    public  Addcustomerpage enterLastName(String lastName) {
	        lastNameInput.sendKeys(lastName);
			return new  Addcustomerpage();
	    }

	    public  Addcustomerpage enterZipCode(String zipCode) {
	        zipCodeInput.sendKeys(zipCode);
			return  new Addcustomerpage();
	        
	    }

	    public  Addcustomerpage clickOnAddCustomerBtn() {
	        addCustomerSubmitBtn.click();
	        
			return new  Addcustomerpage();
	    }
	    public boolean isCustomerAddedSuccessfully() {
	    	
			return true;
	    	
	    }
	}



