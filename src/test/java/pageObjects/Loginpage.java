package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//input [@name='email']") WebElement txt_Emailaddress;
	@FindBy(xpath="//input [@name='password']") WebElement txt_Password;
	@FindBy(xpath="//*[@id=\"form-login\"]/div[3]/button") WebElement btn_Loginq;
	
	
	public void emailaddress(String email) {
		txt_Emailaddress.sendKeys(email);
	}
	
	public void password(String pwd) {
		txt_Password.sendKeys(pwd);
	}
	
	public void loginClick() {
		btn_Loginq.click();
	}
	
	
	
	
}
