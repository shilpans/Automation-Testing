package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepAppConfigAdvancedSearchTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepAppConfigAdvancedSearchTest(Hashtable<String,String> data)
	{
	
		log.debug("Inside SepAppConfigAdvancedSearchTest");
		click("advancedSearch_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("configName_XPATH","Failed to click on SepAppConfigAdvancedSearchTest"))));
		log.debug("SepAppConfigAdvancedSearchTest Succefully executed");
		
		type("configName_XPATH",data.get("configName"));
		click("apply_XPATH");
		Reporter.log("SepAppConfigAdvancedSearchTest Successfully executed!!!!!!!!!!");
		
	}

}
