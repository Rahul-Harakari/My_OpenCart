package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddtoCart;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;
import pageObjects.Search;

public class TC005_AddToCart extends Baseclass {

	
	@Test(priority=1,groups= {"sanity"} )
	
	public void logintoApp(){
		
		logger.info("*** Login to the application ***");
		
		try {
			HomePage hp=new HomePage(driver);
			hp.click_Myaccount();
			hp.click_Login();
			logger.info("clicked on the login button");
			
			Loginpage lp=new Loginpage(driver);
			lp.emailaddress(p.getProperty("email"));
			lp.password(p.getProperty("password"));
			lp.loginClick();
			logger.info("clicked on the Login after adding valid email and Password");
			
			Myaccountpage mcc= new Myaccountpage(driver);
			boolean mc =mcc.validatemyaccount();
			if (mc==true) {
				Assert.assertTrue(true);
				logger.info("My Account text is validated");
			}else {
				Assert.fail();
			}
			}catch(Exception e) {
				Assert.fail();
			}
			
			logger.info("Test case executed");	
	}
	
	
	@Test(priority=2,groups= {"sanity"} )
	
	public void validateCart() {
		
		logger.info("*****Test case started for - Valid iteam******");
		try {
		Search se=new Search(driver);
		se.searchBox(p.getProperty("iteam"));
		logger.info("Iteam inserted in search box");
		se.searchButton();
		logger.info("clicked on serach button");
		
		}catch(Exception e) {
			Assert.fail();
		
		}
		
	}	
			@Test(priority=3,groups= {"sanity"})
			
			public void additeamtocart() {
			try {	
		AddtoCart ac=new AddtoCart(driver);
		ac.cartButton();
		logger.info("clicked on the cart button");
		ac.cartmainButton();
		logger.info("clicked on the cart Main button");
		
		boolean iteamStatus= ac.producttxt();
		if(iteamStatus==true) {
			Assert.assertTrue(true);
		}
			else {
				Assert.fail();
			}
			}catch(Exception e) {
				Assert.fail();
			}
		
		logger.info("Test case Executed");	
		
	
			}
}
