package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepAppConfigEditTest extends TestBase{
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepAppConfigEditTest(String configValue)
	{
		log.debug("Inside SepAppConfigEditTest");
		click("Edit_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("configValue_XPATH","Failed to click on SepAppConfigEditTest"))));
		log.debug("appConfigEditTest Successfully executed");
		
		clear("configValue_XPATH");
		type("configValue_XPATH",configValue);
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("SepAppConfigEditTest Successfully executed!!!!!!!!!!");
		
		
	}

}
