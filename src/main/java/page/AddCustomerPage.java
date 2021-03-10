package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage  extends BasePage{

	WebDriver driver;
	
//	constructor : method name same as class name) to receive the driver
	public AddCustomerPage(WebDriver driver) {
	
	this.driver= driver ; // this create a relationship between 2 drivers
	}
	
//	Element Library
	
	@FindBy(how=How.XPATH, using= "//input[@id='account']") WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//select[@id='cid']") WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//INPUT[@id='email']") WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//input[@id='phone']") WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//input[@id='address']") WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//input[@id='city']") WebElement CITY_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//input[@id='state']") WebElement STATE_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//input[@id='zip']") WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//select[@id='country']") WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how= How.XPATH, using= "//button[@id='submit']") WebElement SUBMIT_BUTTON_LOCATOR;
	
//	Interactive Methods
	
	public void insertFullName(String fullName) {
		
		int genNum= randomGenerator(999);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullName + genNum );
	}
	
public void insertCompanyName(String companyName) {
	
	selectDropDown(COMPANY_FIELD_LOCATOR, companyName);
}

public void insertEmailAddress(String email) {
	
	int genNum= randomGenerator(999);
	EMAIL_FIELD_LOCATOR.sendKeys(genNum + email);
}
	
public void insertPhoneNumber(String phone) {
	
	int gennum= randomGenerator(999);
	PHONE_FIELD_LOCATOR.sendKeys(phone + gennum);
}
	
	public void insertAddress(String address) {
		
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}
	
public void insertCity(String city) {
	CITY_FIELD_LOCATOR.sendKeys(city);
}
	
public void insertState(String state) {
	STATE_FIELD_LOCATOR.sendKeys(state);
	
}
 public void insertZipCode( String zip) {
	 int genNum= randomGenerator(900);
		 ZIP_FIELD_LOCATOR.sendKeys(zip + genNum);
 }

public void enterCountry(String country) {
	
	selectDropDown(COUNTRY_FIELD_LOCATOR, country);
}

public void clickOnSubmitButton() {
	
	SUBMIT_BUTTON_LOCATOR.click();
	waitForElement(driver, 3, SUBMIT_BUTTON_LOCATOR);
}
}
