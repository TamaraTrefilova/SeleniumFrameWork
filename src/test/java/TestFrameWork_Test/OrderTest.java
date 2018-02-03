package TestFrameWork_Test;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestFrameWork_Lib.OrderPage;


public class OrderTest extends BaseTestSetup {
	OrderPage page;
	
	@BeforeTest
	public void beforeTestDo() throws InterruptedException {
		page = new OrderPage(driver);
		Thread.sleep(3000);
	}
	
	@Test
	public void order() throws InterruptedException {
		page.search.sendKeys(OrderPage.ORDER);
		page.go.click();
		for(WebElement element: page.list) {
			if(element!=null) {
				element.click();
				break;
			}
		}		
		page.button.click();
		Thread.sleep(2000);
		page.submit.click();
		Thread.sleep(6000);
		assertTrue(page.text.getText().equalsIgnoreCase(OrderPage.TEXT));
	}
}
