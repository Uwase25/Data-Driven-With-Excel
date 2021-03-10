package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	
	// access excel reader class by calling class name
	
	ExcelReader exlread= new ExcelReader("src\\main\\java\\data\\Excel Test Cases.xlsx"); 
	String userName = exlread.getCellData("LoginInfo", "UserName", 2); //read from excel sheet file
	String password= exlread.getCellData("LoginInfo", "Password", 2);  // data/ column/ row
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		//to browser page
		driver= BrowserFactory.init(); 	// call by the name of the class
	
		// signin page by calling login page class
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
	
//	After login we do the assertion to validate by creating an object from Dashboard page with the help of Page Factory
		
		DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardHeader();
	
		BrowserFactory.tearDown();
	}
	
	
	
	
}
