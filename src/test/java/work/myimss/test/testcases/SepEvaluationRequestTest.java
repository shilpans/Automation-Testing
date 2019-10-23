package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepEvaluationRequestTest extends TestBase {
	
	@Test
	public void sepEvaluationRequestTest()
	{
		log.debug("Inside SepEvaluationRequestTest");
		click("sepEvaluationRequest_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("createRole_XPATH","Failed to click on SepEvaluationRequestTest"))));
		log.debug("SepEvaluationRequestTest Successfully executed");
		Reporter.log("SepEvaluationRequestTest Successfully executed!!!!!!!!!!");
		
	}

}
