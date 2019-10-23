package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class UserEditTest extends TestBase {
	
	@Test
	public void userEditTest()
	{
		log.debug("Inside UserEditTest");
		click("Edit_XPATH");
//		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("roleCheckbox_XPATH","Failed to click on UserEditTest"))));
		log.debug("UserEditTest Succefully executed");
		
		
		click("roleCheckbox_XPATH");
		click("submit_XPATH");
		getText("successAlert_XPATH");
//		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("successAlert_XPATH"))));
		Reporter.log("UserEditTest Successfully executed!!!!!!!!!!");
	}
	
}
