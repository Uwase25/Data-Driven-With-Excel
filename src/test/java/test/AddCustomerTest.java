package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
 
	WebDriver driver;
	
//  Read from excel	

	ExcelReader exlread= new ExcelReader("src\\main\\java\\data\\Excel Test Cases.xlsx"); 
    String userName= exlread.getCellData("LoginInfo", "UserName",2);
    String password= exlread.getCellData("LoginInfo", "Password", 2);

    String fullName= exlread.getCellData("AddContactInfo", "FullName", 2);
    String companyName= exlread.getCellData("AddContactInfo", "CompanyName", 2);
    String email= exlread.getCellData("AddContactInfo", "Email", 2);
    
    String phone= exlread.getCellData("AddContactInfo", "Phone", 2);
    String address= exlread.getCellData("AddContactInfo", "Address", 2);
    String city= exlread.getCellData("AddContactInfo", "City", 2);
   
    String country= exlread.getCellData("AddContactInfo", "Country", 2);
    String state= exlread.getCellData("AddContactInfo", "State", 2);
    String zip= exlread.getCellData("AddContactInfo", "Zip", 2);

    
    @Test
public void validUserShouldBeAbleToAddCustomer() {
	
	driver= BrowserFactory.init();
	
	// signin page by calling login page class name
	LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
	          loginPage.insertUserName(userName);
	          loginPage.insertPassword(password);
	          loginPage.clickOnSigninButton();
	                                               // Add this driver to Dashboard Page
    DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
              dashboardPage.validateDashboardHeader();
              dashboardPage.clickCustomerButton();
              dashboardPage.clickOnCustomerButton();
              
   
 AddCustomerPage addCustomerPage= PageFactory.initElements(driver, AddCustomerPage.class);    
             addCustomerPage.insertFullName(fullName);  
             addCustomerPage.insertCompanyName(companyName);
             addCustomerPage.insertEmailAddress(email);
             addCustomerPage.insertPhoneNumber(phone);
             addCustomerPage.insertAddress(address);
             addCustomerPage.insertCity(city);
             addCustomerPage.insertState(state);
             addCustomerPage.insertZipCode(zip);
             addCustomerPage.enterCountry(country);
             addCustomerPage.clickOnSubmitButton();

             dashboardPage.clickOnListCustomersButton();
    
    }
    
    
    
    
    
}


