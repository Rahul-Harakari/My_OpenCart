package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddtoCart extends BasePage {
	
	WebDriver driver;
	public AddtoCart(WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"product-list\"]/div[3]/div/div[2]/form/div/button[1]") WebElement button_Cart;
	@FindBy(xpath="//*[@id=\"header-cart\"]/div/button") WebElement button_Cartmain;
	@FindBy(xpath="//*[@id=\"header-cart\"]/div/ul/li/table/tbody/tr/td[2]/a") WebElement producttxt_Cart;
	
	public void cartButton() {
		button_Cart.click();
		}
		
	
	
	public void cartmainButton() {
		button_Cartmain.click();
	}

	public boolean producttxt() {
		try {
		return producttxt_Cart.isDisplayed();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		return (false);
		}
		
		
		
		}


}
