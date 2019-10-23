package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepLangAdvancedSearchTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepLangAdvancedSearchTest(String name)
	{
		log.debug("Inside SepLangAdvancedSearchTest");
		click("advancedSearch_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("SepAdvancedSearchLangName_XPATH","Failed to click on SepLangAdvancedSearchTest"))));
		log.debug("SepLangAdvancedSearchTest Succefully executed");
		
		type("SepAdvancedSearchLangName_XPATH",name);
		click("apply_XPATH");
		Reporter.log("SepLangAdvancedSearchTest Successfully executed!!!!!!!!!!");
	}

}
