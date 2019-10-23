package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;


public class UserAdvancedSearchTest extends TestBase{
	

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void userAdvancedSearchTest(String fname) throws InterruptedException
	{
		log.debug("Inside UserAdvancedSearchTest");
		click("advancedSearch_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("fname_XPATH","Failed to click on Advanced search User Management"))));
		log.debug("userAdvancedSearchTest Succefully executed");
		Reporter.log("userAdvancedSearchTest Successfully executed");

		type("fname_XPATH",fname);
		click("apply_XPATH");
		Reporter.log("UserAdvancedSearchTest Successfully executed!!!!!!!!!!");
	}


}
