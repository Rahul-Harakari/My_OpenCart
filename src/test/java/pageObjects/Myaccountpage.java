package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Myaccountpage extends BasePage {

	
	public Myaccountpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]") WebElement txt_myaccount;
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]") WebElement btn_logout;
	
	public boolean validatemyaccount() {
		
		try {
		return txt_myaccount.isDisplayed();
		} catch(Exception E) {
			return (false);
		}
		
		
		}
	
	public void clicklogout() {
		btn_logout.click();
	}
	
}
