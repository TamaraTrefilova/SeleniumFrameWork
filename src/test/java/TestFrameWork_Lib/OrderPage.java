package TestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	public static String ORDER = "Fire 7 Tablet with Alexa, 7\" Display, 8 GB, Black - with Special Offers";
	public static String TEXT = "1 item added to Cart";
	
	@FindBy(css = "#twotabsearchtextbox")
	public WebElement search;

	@FindBy(css = "#nav-search > form > div.nav-right > div > input")
	public WebElement go;

	@FindBy(css = "#result_0 > div > div.a-fixed-left-grid > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div:nth-child(1) > a")
	public WebElement item;

	@FindBy (linkText="Fire 7 Tablet with Alexa, 7\" Display, 8 GB, Black")
	public List<WebElement> list;
	
	@FindBy(css = "#add-to-cart-button")
	public WebElement button;

	@FindBy(css = "#a-autoid-32 > span > input")
	public WebElement submit;

	@FindBy(id = "confirm-text")
	public WebElement text;

	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
