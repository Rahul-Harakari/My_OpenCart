package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {

	WebDriver driver;
	public AccountRegistrationPage (WebDriver driver){
	
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//input[@name='firstname']") WebElement inputfirstname;
	
	@FindBy(xpath="//input[@name='lastname']") WebElement inputlastname;
	
	@FindBy(xpath="//input[@name='email']") WebElement inputemail;
	
	@FindBy(xpath="//input[@name='password']") WebElement inputpassword;
	
	@FindBy(xpath="//input[@name='agree']") WebElement nameagree;
	
	@FindBy(xpath="//button[@type='submit']") WebElement btncontinue;
	
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement txt_accountcreation;
	
	// Methods
	
	public void setFirstname(String fname) {
		
		inputfirstname.sendKeys(fname);
	}
	
public void setLastname(String lname) {
		
	inputlastname.sendKeys(lname);
	}
	
public void setemail(String email) {
	
	inputemail.sendKeys(email);
}

	
public void setpassword(String password) {
	
	inputpassword.sendKeys(password);
}
	
public void setagreement() {
	try {
	WebDriverWait mywaita=new WebDriverWait (driver, Duration.ofSeconds(10000));
	mywaita.until(ExpectedConditions.elementToBeClickable(nameagree)).click();
	System.out.println("clicked on agreement");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}	

public void clickContinue() {
	//WebDriverWait mywaitb=new WebDriverWait (driver, Duration.ofSeconds(10000));  // Adding the explicit 
	//mywaitb.until(ExpectedConditions.elementToBeClickable(btncontinue)).click();
	btncontinue.submit();
	
	//Actions act=new Actions(driver);
	//act.moveToElement(btncontinue).click().perform();
}	

public String textvalidation() {
	try {
	return (txt_accountcreation.getText());
	}
	catch(Exception e) {
		return (e.getMessage());
	}
	
}



}
