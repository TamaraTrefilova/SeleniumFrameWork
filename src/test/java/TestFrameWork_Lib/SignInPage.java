package TestFrameWork_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static String E_MAIL = "stamara@yandex.ru";
	public static String PSWD = "qwerty";
	public static String REGISTRATION = "Amazon Registration";
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= "#ap_email")
	public WebElement e_mail;
	
	@FindBy(id = "ap_password")
	public WebElement pswd;
	
	@FindBy(id="signInSubmit")
	public WebElement signIn;
	
	@FindBy(id="createAccountSubmit")
	public WebElement createAccount;
	
	@FindBy(id="ap_customer_name")
	public WebElement name;
	
	@FindBy(id="ap_email")
	public WebElement e_mail_new;
	
	@FindBy(id = "ap_password")
	public WebElement pswd_new;
	
	@FindBy(id = "ap_password_check")
	public WebElement pswd_check;
	
	@FindBy(css = "#continue")
	public WebElement submit;
	
	@FindBy(xpath="//span[text()='Hello, Tamara']")
	public WebElement customerName;
	
	public void sendKeys(WebElement element, String key) {
		element.sendKeys(key);
	}
	
	
}
