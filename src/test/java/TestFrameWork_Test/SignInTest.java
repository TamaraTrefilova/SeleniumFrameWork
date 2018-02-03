package TestFrameWork_Test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;
import TestFrameWork_Lib.SignInPage;

public class SignInTest extends BaseTestSetup {
	HomePage home;
	SignInPage signInPage;

	@BeforeTest
	public void beforeTestDo() throws InterruptedException {
		home = new HomePage(driver);
		signInPage = new SignInPage(driver);
		home.SignIn.click();
		Thread.sleep(3000);
	}

	@Test
	public void signIn() throws InterruptedException {
		signInPage.sendKeys(signInPage.e_mail, SignInPage.E_MAIL);
		signInPage.sendKeys(signInPage.pswd, SignInPage.PSWD);
		signInPage.signIn.click();
		assertTrue(signInPage.customerName.isDisplayed());
	}
}
