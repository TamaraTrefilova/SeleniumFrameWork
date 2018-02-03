package TestFrameWork_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.HomePage;

public class HomePageContentTest extends BaseTestSetup {
	HomePage home;

	@BeforeTest
	public void beforeTestDo() {
		home = new HomePage(driver);
	}

	@Test
	public void test_Home_Page_DepartmentsLink() {
		Assert.assertTrue(home.linkDepartments.isDisplayed());
	}
	
	@Test
	public void test_Home_Page_DepartmentsList() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(home.linkDepartments).build().perform();
		Thread.sleep(3000);
		boolean prime = false;
		for (WebElement wbe : home.departments) {
			if (wbe.getText().equalsIgnoreCase(HomePage.PRIME)) {
				prime = true;
				break;
			}
		}
		Assert.assertTrue(prime);
	}

	@Test
	public void test_Home_Page_SignInLink() {
		Assert.assertTrue(home.SignIn.isDisplayed());
	}

	@Test
	public void test_Home_Page_OrdersLink() {
		Assert.assertTrue(home.Orders.isDisplayed());
	}

	@Test
	public void test_Home_Page_OrdersCart() {
		Assert.assertTrue(home.Cart.isDisplayed());
	}
	
	@Test
	public void test_Home_Page_DropBox() {
		home.DropBox.click();
		Actions actionA = new Actions(driver);
		actionA.moveToElement(home.DropBox).build().perform();
		boolean allDepartments = false;
		for (WebElement wbe : home.DropDownBox) {
			if (wbe.getText().equalsIgnoreCase(HomePage.ALL_DEPARTMENTS)) {
				allDepartments = true;
				break;
			}
		}
		Assert.assertTrue(allDepartments);		
	}
	
	@Test
	public void test_Home_Page_TryPrime() {
		Assert.assertTrue(home.TryPrime.isDisplayed());
	}
	
	@Test
	public void test_Home_Page_SearchBox() {
		Assert.assertTrue(home.SearchBox.isDisplayed());
	}
	
	@Test
	public void test_Home_Page_Footer() {
		Assert.assertTrue(home.Footer.isDisplayed());
	}
	
	@Test
	public void test_Home_Page_FooterLinks() {
		Assert.assertTrue(home.FooterLinks.isDisplayed());
	}

}
