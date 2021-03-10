package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) { // Constructor to be able to receive (no return type)
		this.driver = driver;
	}

//	Element Library

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Dashboard ')]")
	WebElement DASHBOARD_HEADER_FIELD;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement CUSTOMERS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_LOCATOR;
	
	
//	Interactive Methods

	public void validateDashboardHeader() {

		waitForElement(driver, 5, DASHBOARD_HEADER_FIELD);
	}

public void clickCustomerButton() {
	
	CUSTOMERS_FIELD_LOCATOR.click();
}

public void clickOnCustomerButton() {
	waitForElement(driver, 5, ADD_CUSTOMER_FIELD_LOCATOR);

	ADD_CUSTOMER_FIELD_LOCATOR.click();
	
}

public void clickOnListCustomersButton() {
	
	waitForElement(driver, 5,LIST_CUSTOMER_LOCATOR);
	
	LIST_CUSTOMER_LOCATOR.click();
}
}
