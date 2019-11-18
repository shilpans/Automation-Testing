package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class AppConfigEditTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void appConfigEditTest(Hashtable<String,String> data)
	{
		log.debug("Inside appConfigEditTest");
		click("Edit_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("configValue_XPATH","Failed to click on appConfigEditTest"))));
		log.debug("appConfigEditTest Succefully executed");
		
		clear("configValue_XPATH");
		type("configValue_XPATH",data.get("configValue"));
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("appConfigEditTest Successfully executed!!!!!!!!!!");
		
		
	}

}
