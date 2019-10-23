package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class RoleManagementAdministrationTest extends TestBase {
	
	@Test
	public void roleManagementAdministrationTest() throws InterruptedException
	{
		log.debug("Inside RoleManagementAdministrationTest");
		click("roleManagement_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("createRole_XPATH","Failed to click on Role Management"))));
		log.debug("RoleManagementAdministrationTest Succefully executed");
		Reporter.log("RoleManagementAdministrationTest Successfully executed!!!!!!!!!!");
		
	}

}
