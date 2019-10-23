package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class MyimssAdminTest extends TestBase	{
	
	@Test
	public void myimssAdminTest() throws InterruptedException
	{
		log.debug("Inside MyimssAdminTest Test");
		click("MyimssAdminOpenApp_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("admin_XPATH","Fail to click on MyimssAdmin"))));
		log.debug("MyimssAdminTest Successfully executed");
		Reporter.log("MyimssAdminTest Successfully executed!!!!!!!!!!");
		
	}
	
	

}
