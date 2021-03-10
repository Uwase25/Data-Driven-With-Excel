package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

//	WAIT FOR ELEMENT METHOD
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
	
	
	WebDriverWait wait= new WebDriverWait(driver, timeInSeconds);
	           wait.until(ExpectedConditions.visibilityOf(elementLocator));
		
	}
// GENERATE RANDOM NUMBER 
	public int randomGenerator(int boundaryNumb) {
		Random rnd= new Random();
		
		int randomNumber= rnd.nextInt(boundaryNumb);
		return randomNumber;
	}
// DROPDOWN METHOD	

	public void selectDropDown(WebElement element, String visibleText ) {
	Select sel= new Select(element);
	sel.selectByVisibleText(visibleText);
	
	
	}
	
}
