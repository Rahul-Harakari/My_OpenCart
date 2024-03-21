package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		}
	
	//Locators
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span") WebElement lnk_Myaccount;
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a") WebElement lnk_Register;
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a") WebElement lnk_Login;

	//Create the methods
	
	public void click_Myaccount() {
		lnk_Myaccount.click();
		
	}
	
	public void click_Register() {
		lnk_Register.click();
		
	}
	
	public void click_Login() {
		lnk_Login.click();
	}

}
