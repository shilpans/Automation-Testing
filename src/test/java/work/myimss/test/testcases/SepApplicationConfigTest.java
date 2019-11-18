package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepApplicationConfigTest extends TestBase {
	
	@Test
	public void sepApplicationConfigTest()
	{
		log.debug("Inside SepApplicationConfig Test");
//		wait.until(ExpectedConditions.visibilityOf(OR.getProperty("sepAppConfig_XPATH")));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", "sepAppConfig_XPATH");
		
		click("sepAppConfig_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on Application Configuartion Management"))));
		log.debug("SepApplicationConfigTest Succefully executed");
		Reporter.log("SepApplicationConfigTest Succefully executed");
		
	}

}
