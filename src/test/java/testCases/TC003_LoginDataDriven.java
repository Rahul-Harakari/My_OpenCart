package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;
import utilities.DataProviders;

public class TC003_LoginDataDriven extends Baseclass {
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verifyloginddt(String email, String password, String exp) {
		logger.info("**** Starting TC_003_LoginDDT *****");
		try {
		HomePage hp=new HomePage(driver);
		hp.click_Myaccount();
		hp.click_Login();
		logger.info("clicked on the login button");
		
		Loginpage lp=new Loginpage(driver);
		lp.emailaddress(email);
		logger.info("Insert Email ID");
		lp.password(password);
		logger.info("Insert Password");
		Thread.sleep(2000);
		lp.loginClick();
		logger.info("clicked on the Login after adding valid email and Password");
		
		Myaccountpage mcc= new Myaccountpage(driver);
		boolean targetpage=mcc.validatemyaccount();
		
		if(exp.equalsIgnoreCase("valid")) {
			if(targetpage==true)
			{
				mcc.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				mcc.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
	
		}
		} catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Test case Executed *****");		
}
}