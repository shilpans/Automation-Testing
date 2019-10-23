package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class UserManagementAdministrationTest extends TestBase{
	
	@Test
	public void userManagementAdministrationTest() throws InterruptedException
	{
		log.debug("Inside UserManagementAdministration Test");
		click("userManagement_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on userManagement"))));
		Reporter.log("UserManagementAdministration Test Successfully executed");
		
	}
}
