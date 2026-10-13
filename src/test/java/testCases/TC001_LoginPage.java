package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginPage extends BaseClass{

	@Test
	public void verify_Login() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
	}
}
