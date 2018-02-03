package TestFrameWork_Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;
import TestFrameWork_Lib.SignInPage;

public class NewAccountTest  extends BaseTestSetup{
	HomePage home;
	SignInPage signInPage;
	
	@BeforeTest
	public void beforeTestDo() {
		home = new HomePage(driver);
		home.SignIn.click();
		signInPage = new SignInPage(driver);
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void createNewAccount() {
		signInPage.createAccount.click();	
		assertTrue(driver.getTitle().equalsIgnoreCase(SignInPage.REGISTRATION));
		assertTrue(signInPage.e_mail_new.isDisplayed());
		assertTrue(signInPage.pswd_new.isDisplayed());
		assertTrue(signInPage.pswd_check.isDisplayed());
		assertTrue(signInPage.submit.isDisplayed());
		driver.navigate().back();
	}
}
