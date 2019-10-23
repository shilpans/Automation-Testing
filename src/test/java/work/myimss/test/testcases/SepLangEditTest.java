package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepLangEditTest extends TestBase
	{
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepLangEditTest(String name)
	{
		log.debug("Inside SepLangEditTest");
		click("Edit_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("langName_XPATH","Failed to click on SepLangEditTest"))));
		log.debug("SepLangEditTest Successfully executed");
		
		clear("langName_XPATH");
		type("langName_XPATH",name);
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("SepLangEditTest Successfully executed!!!!!!!!!!");
		
	}

}
