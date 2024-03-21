package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.Search;

public class TC004_Searchproduct extends Baseclass {

	@Test(groups= {"sanity"})
	
	public void search() {
		logger.info("*****Test case started******");
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
		logger.info("Test cases executed");
	}
	
	
}
