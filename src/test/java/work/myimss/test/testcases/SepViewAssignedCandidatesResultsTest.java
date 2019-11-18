package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepViewAssignedCandidatesResultsTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepViewAssignedCandidatesResultsTest(Hashtable<String,String> data) throws InterruptedException
	{
		
		log.debug("Inside SepViewAssignedCandidatesResultsTest");
		Thread.sleep(2000);
		click("advancedSearch_XPATH");
		type("sepHiringId_XPATH",String.valueOf((int)Double.parseDouble(data.get("hiringId"))));
		click("apply_XPATH");
		
//		select("sepRecordsPerPage_XPATH",String.valueOf((int)Double.parseDouble(data.get("records"))));
//		Thread.sleep(2000);
		
		click("sepViewAssignedCandidates_XPATH");
		click("sepIsEvaluatedYes_XPATH");
		getText("sepStatus_XPATH");
		click("sepViewAnswers_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepEvaluationAnswers_XPATH","Failed to click on SepViewAssignedCandidatesResultsTest"))));
		Reporter.log("SepViewAssignedCandidatesResultsTest Successfully executed!!!!!!!!!!");
	}
}
