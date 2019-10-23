package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepEvaluationTest extends TestBase {
	@Test
	public void sepEvaluationTest()
	{
		log.debug("Inside SepEvaluationTest");
		click("sepEvaluation_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepDefineEvaluation_XPATH","Failed to click on SepEvaluationTest"))));
		log.debug("SepEvaluationTest Successfully executed");
		Reporter.log("SepEvaluationTest Successfully executed!!!!!!!!!!");
	}

}
