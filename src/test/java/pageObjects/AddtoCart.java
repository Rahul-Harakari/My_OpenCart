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

	@FindBy(xpath="//*[@id=\"product-list\"]/div[3]/div/div[1]/a/img") WebElement product;
	@FindBy(xpath="//*[@id=\"button-cart\"]") WebElement button_Apply;
	@FindBy(xpath="//*[@id=\"header-cart\"]/div/button") WebElement button_Cart;
	@FindBy(xpath="//*[@id=\"header-cart\"]/div/ul/li/table/tbody/tr/td[2]/a") WebElement producttxt_Cart;
	
	public void clickonProduct() {
		product.click();
		}
		
	
	
	public void clickonApply() {
		button_Apply.click();
	}
	
	public void clickon_Cart() {
		button_Cart.click();
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
