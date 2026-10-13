package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePage.BasePage;

public class LoginPage  extends BasePage{

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name=\"password\" and @type=\"password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement btnLogin;
	
	
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
		
		/*
		suppose if click() is not working..!
		sol2 : btnLogin.submit();
		sol3: 
			
		Actions act = new Actions(driver);
		act.moveToElement(btnLogin).click().perform();
		
		sol4: 
			JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", btnLogin);
		
		sol5:
			btnLogin.sendKeys(Keys.RETURN);
		
		
		sol6:
			WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
		
		*/
	}
	
	
	
}
