package TestFrameWork_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;

public class NavigationLinksTest extends BaseTestSetup {
	HomePage home;

	@BeforeTest
	public void beforeTestDo() {
		home = new HomePage(driver);
	}

	@AfterMethod
	public void navigateBack() throws InterruptedException {
		driver.navigate().back();
	}

	@Test
	public void test_TryPrimeLink() throws InterruptedException {
		home.TryPrime.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon.com: Amazon Prime"));
	}

	@Test
	public void test_SignInLink() throws InterruptedException{
		home.SignIn.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon Sign In"));
	}

	@Test
	public void test_DayDealsLink() throws InterruptedException {
		home.linkDeals.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Gold Box Deals | Today's Deals - Amazon.com"));
	}
	
	@Test
	public void test_GiftCardsLink() throws InterruptedException {
		home.linkGiftCards.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon.com Gift Cards"));
	}
	
	@Test
	public void test_RegistryLink() throws InterruptedException {
		home.linkRegistry.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon.com: : Registry"));
	}
	
	@Test
	public void test_SellLink() throws InterruptedException {
		home.linkSell.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon.com: Sell Products Online with Selling on Amazon"));
	}
	
	@Test
	public void test_HelpLink() throws InterruptedException {
		home.linkHelp.click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Amazon.com Help"));
	}
}
