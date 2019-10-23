package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class AppConfigAdvancedSearchTest extends TestBase
	{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	
	public void appConfigAdvancedSearchTest(String configName) throws InterruptedException
	{
		log.debug("Inside AppConfigAdvancedSearchTest");
		click("advancedSearch_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("configName_XPATH","Failed to click on appConfigAdvancedSearchTest"))));
		log.debug("appConfigAdvancedSearchTest Succefully executed");
		
		type("configName_XPATH",configName);
		click("apply_XPATH");
		Reporter.log("appConfigAdvancedSearchTest Successfully executed!!!!!!!!!!");
	}

}
