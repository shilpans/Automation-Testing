package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class RoleEditTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void roleEditTest(String rolename,String roledescription, String emsrole) throws InterruptedException
	{
		log.debug("Inside RoleEditTest");
		click("roleEdit_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("roleName_XPATH","Failed to click on RoleEditTest"))));
		log.debug("RoleEditTest Succefully executed");
		
		clear("roleDescription_XPATH");
		type("roleDescription_XPATH",roledescription);
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("RoleEditTest Successfully executed!!!!!!!!!!");
	}

}
