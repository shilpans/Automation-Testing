package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepAuditDetailsTest extends TestBase{
	@Test
	public void sepAuditDetailsTest() throws InterruptedException
	{
		log.debug("Inside SepAuditDetailsTest!!!!!!!!!!");
		Thread.sleep(3000);
		click("sepAuditDetails_XPATH");
		
		Thread.sleep(3000);
		click("sepGenerateReport_XPATH");
		
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepAuditDetailsTypeAction_XPATH","SepAuditDetailsTest not Successfull"))));
		click("sepAuditDetailsPdf_XPATH");
		Thread.sleep(3000);
		log.debug("SepAuditDetailsTest Successfully executed!!!!!!!!!!");
		Reporter.log("SepAuditDetailsTest Successfully executed!!!!!!!!!!");
		
		
	}

}
