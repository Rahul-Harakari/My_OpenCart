package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Search extends BasePage{
	
	WebDriver driver;
	public Search (WebDriver driver){
		super(driver);
		}

	@FindBy(xpath="//input[@placeholder='Search']") WebElement field_Search;
	@FindBy(xpath="//button[@class='btn btn-light btn-lg']") WebElement button_Search;
	@FindBy(xpath="//*[@id=\"product-list\"]/div[2]/div/div[2]/div/h4/a") WebElement product_Text;
	
	
	public void searchBox(String iteam) {
		field_Search.sendKeys(iteam);
	}
	
	public void searchButton() {
		button_Search.click();
	}
	
	public boolean validateiteam() {
		try {
		return product_Text.isDisplayed();
		}
		catch (Exception e) {
			return (false);
		}
	}
	
}
