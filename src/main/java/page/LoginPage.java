package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {  //constructor : method name same as class name) to receive the driver
		
		this.driver= driver; // this create a relationship between 2 drivers
	}

//  Element Library
	
	@FindBy(how= How.XPATH, using= "//*[@id='username']") WebElement USERNAME_FIELD_LOCATOR;
    @FindBy(how= How.XPATH, using= "//*[@id='password']") WebElement PASSWORD_FIELD_LOCATOR;
    @FindBy(how= How.XPATH, using= "//*[@name='login']") WebElement SIGNIN_BUTTON_FIELD;

// Interactive Actions
    
    public void insertUserName(String userName) {
    	USERNAME_FIELD_LOCATOR.sendKeys(userName);
    }
    
    public void insertPassword(String password) {
    	PASSWORD_FIELD_LOCATOR.sendKeys(password);
    }
    
    public void clickOnSigninButton() {
    	SIGNIN_BUTTON_FIELD.click();
    }
    
    
}
