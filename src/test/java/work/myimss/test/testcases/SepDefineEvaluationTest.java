package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepDefineEvaluationTest extends TestBase {
	@Test
	public void sepDefineEvaluationTest()
	{
		log.debug("Inside SepDefineEvaluationTest");
		click("sepDefineEvaluation_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on SepDefineEvaluationTest"))));
		log.debug("SepDefineEvaluationTest Successfully executed");
		Reporter.log("SepDefineEvaluationTest Successfully executed!!!!!!!!!!");
	}

}
