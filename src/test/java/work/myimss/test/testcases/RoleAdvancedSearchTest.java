package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class RoleAdvancedSearchTest extends TestBase{
	

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void roleAdvancedSearchTest(String rolename) throws InterruptedException
	{
		log.debug("Inside RoleAdvancedSearchTest");
		click("advancedSearch_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("roleName_XPATH","Failed to click on Advanced search Role Management"))));
		log.debug("RoleAdvancedSearchTest Succefully executed");
		
		type("roleName_XPATH",rolename);
		click("apply_XPATH");
		Reporter.log("RoleAdvancedSearchTest Successfully executed!!!!!!!!!!");
	}


}
