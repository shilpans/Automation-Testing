package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepQuestionApprovalTest extends TestBase{
	@Test
	public void sepQuestionApprovalTest()
	{
		
		log.debug("Inside SepQuestionApprovalTest");
		click("sepQuestionApproval_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on SepQuestionApprovalTest"))));
		
		log.debug("SepQuestionApprovalTest Successfully executed");
		Reporter.log("SepQuestionApprovalTest Successfully executed!!!!!!!!!!");
	}
}
