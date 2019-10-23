package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepAdministrationTest extends TestBase {
	
	@Test
	public void sepAdministrationTest()
	{
		
		log.debug("Inside SepAdministration Test");
		click("administration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepAppConfig_XPATH","Failed to click on administration"))));
		log.debug("SepAdministrationTest Successfully executed");
		Reporter.log("SepAdministrationTest Successfully executed!!!!!!!!!!");
		
	}

}
