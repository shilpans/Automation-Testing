package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepQuestionManagementTest extends TestBase	{
		
	@Test
		public void sepQuestionManagementTest()
		
		{
			log.debug("Inside SepQuestionManagementTest");
			click("sepQuestionManagement_XPATH");
			Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepSubmitQuestion_XPATH","Failed to click on SepQuestionManagementTest"))));
			
			log.debug("SepQuestionManagementTest Successfully executed");
			Reporter.log("SepQuestionManagementTest Successfully executed!!!!!!!!!!");
		}

}
