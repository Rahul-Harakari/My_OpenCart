package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;

public class TC002_LoginTest extends Baseclass {
	
	@Test(groups= {"sanity","master"})
	public void verifylogin(){
		
		logger.info("***** Test Case for Login *****");
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
	

}
