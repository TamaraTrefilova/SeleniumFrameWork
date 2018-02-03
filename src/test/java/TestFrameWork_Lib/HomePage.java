package TestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static String PRIME = "Prime Video";
	public static String DEPARTMENTS = "Departments";
	public static String ALL_DEPARTMENTS = "All Departments";
	
	@FindBy (xpath="//span[contains(@class,'nav-hasPanel')]")
	public List<WebElement> departments;	
			
	@FindBy (xpath="//a[contains(@id,'nav-link-shopall')]")
	public WebElement linkDepartments;
	
	@FindBy (css="#nav-link-accountList > span.nav-line-1")
	public WebElement SignIn;
	
	@FindBy (css="#nav-orders > span.nav-line-2")
	public WebElement Orders;
	
	@FindBy (css="#nav-link-prime > span.nav-line-2")
	public WebElement TryPrime;
		
	@FindBy (css="#nav-cart > span.nav-line-2")
	public WebElement Cart;
		
	@FindBy (css="#twotabsearchtextbox")
	public WebElement SearchBox;
		
	@FindBy (id="searchDropdownBox")
	public WebElement DropBox;
		
	@FindBy (id="navFooter")
	public WebElement Footer;
	
	@FindBy (xpath="//div[contains(@class,'navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright')]")
	public WebElement FooterLinks;
	
	@FindBy(tagName="option")
	public List<WebElement> DropDownBox;
	
	@FindBy (id="nav-your-amazon")
	public WebElement linkAmazonCom;
	
	@FindBy (linkText="Today's Deals")
	public WebElement linkDeals;
	
	@FindBy (linkText="Gift Cards")
	public WebElement linkGiftCards;
	
	@FindBy (linkText="Registry")
	public WebElement linkRegistry;
	
	@FindBy (linkText="Sell")
	public WebElement linkSell;
	
	@FindBy (linkText="Help")
	public WebElement linkHelp;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
