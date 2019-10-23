package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class ApplicationConfigurationAdministrationTest extends TestBase {
	
	@Test
	public void applicationConfigurationAdministrationTest() throws InterruptedException
	{
		log.debug("Inside ApplicationConfigurationAdministrationTest");
		click("applicationConfiguration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on Application Configuartion Management"))));
		log.debug("ApplicationConfigurationAdministrationTest Succefully executed");
		Reporter.log("ApplicationConfigurationAdministrationTest Succefully executed");
		
	}


}
