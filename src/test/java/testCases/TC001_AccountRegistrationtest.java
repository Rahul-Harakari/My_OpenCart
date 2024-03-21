package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;


public class TC001_AccountRegistrationtest extends Baseclass{
	
	
	@Test(groups= {"regression","master"})
	public void verify_account_registration() throws InterruptedException {
		
		logger.info("******Starting the Test******");
		logger.debug("Drbugging the application");
		
		try {
		HomePage pg=new HomePage(driver);
		pg.click_Myaccount();
		logger.info("click on My account");
		pg.click_Register();
		logger.info("click on My Register");
		AccountRegistrationPage arg=new AccountRegistrationPage(driver);
		arg.setFirstname(randomeString().toUpperCase());
		logger.info("customer First Name");
		arg.setLastname(randomeString().toUpperCase());
		logger.info("customer Last Name");
		arg.setemail(randomeString()+"@gmail.com");
		logger.info("customer Email");
		String password=randomAlphaNumeric();
		
		arg.setpassword(password);
		logger.info("customer password");
		Thread.sleep(3000);
		arg.setagreement();
		logger.info("clicked on the agreement");
		Thread.sleep(3000);
		arg.clickContinue();
		logger.info("clicked on continue");
		
		Thread.sleep(2000);
		// Getting stale element exception
		String confmsg=arg.textvalidation();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Account creation failed");
		
		} catch (Exception E) {
			logger.error("Test case failed");
			Assert.fail();
		}
		logger.info("test case executed");
	}
	
}
