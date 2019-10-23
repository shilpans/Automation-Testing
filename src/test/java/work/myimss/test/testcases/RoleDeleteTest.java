package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class RoleDeleteTest extends TestBase {
	
	@Test
	public void roleDeleteTest() throws InterruptedException
	{
		log.debug("Inside RoleDeleteTest");
		click("delete_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("roleName_XPATH","Failed to click on RoleEditTest"))));
		log.debug("RoleDeleteTest Succefully executed");
		
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("RoleDeleteTest Successfully executed!!!!!!!!!!");
	}

}
