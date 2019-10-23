package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class AdministrationTest extends TestBase {
	
	@Test
	public void administrationTest() throws InterruptedException
	{
		log.debug("Inside Administration Test");
		click("administration_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagement_XPATH","Failed to click on administration"))));
		log.debug("AdministrationTest Successfully executed");
		Reporter.log("AdministrationTest Successfully executed!!!!!!!!!!");
		
	}

}
