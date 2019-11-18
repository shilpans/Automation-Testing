package work.myimss.test.testcases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepReportsTest extends TestBase {
	@Test
	public void sepReportsTest() throws InterruptedException
	{
		log.debug("Inside SepReportsTest!!!!!!!!!!");
		
		click("sepReports_XPATH");
		
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepAuditDetails_XPATH","SepReportsTest not Successfull"))));
		
		log.debug("SepReportsTest Successfully executed!!!!!!!!!!");
		Reporter.log("SepReportsTest Successfully executed!!!!!!!!!!");
		
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//		Thread.sleep(3000);
//		Assert.assertTrue(alert.getText().contains(alertText));
//		Thread.sleep(3000);	
//		alert.accept();
	
	}
}	


