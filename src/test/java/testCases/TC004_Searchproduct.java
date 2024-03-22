package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.Search;

public class TC004_Searchproduct extends Baseclass {

	@Test(priority=1, groups= {"sanity"})
	
	public void search() {
		logger.info("*****Test case started for - Valid iteam******");
		try {
		Search se=new Search(driver);
		se.searchBox(p.getProperty("iteam"));
		logger.info("Iteam inserted in search box");
		se.searchButton();
		logger.info("clicked on serach button");
		boolean iteamtext =se.validateiteam();
		if(iteamtext=true) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
			
		}
		logger.info("Test cases executed for valid iteam");
	}
	
	
	@Test(priority=2, groups= {"sanity"})
	
	public void invalidsearch() {
		logger.info("*****Test case started for Serach - Invalid Iteam******");
		
		try {
		Search se=new Search(driver);
		se.searchBox(p.getProperty("invalid_iteam"));
		logger.info("Invalid iteam inserted");
		se.searchButton();
		logger.info("clicked on serach button");
		
		boolean noiteam_txt = se.validatenoiteam();
		if(noiteam_txt==true) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
		
		logger.info("Test cases executed for invalid iteam");
		
	}
	
	
	
}
