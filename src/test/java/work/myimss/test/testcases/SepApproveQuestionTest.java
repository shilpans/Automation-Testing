package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepApproveQuestionTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepApproveQuestionTest(Hashtable<String,String> data)
	{
		
		log.debug("Inside SepApproveQuestionTest");
		click("sepApproveQuestion_XPATH");
//		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("advancedSearch_XPATH","Failed to click on SepApproveQuestionTest"))));
		click("reset_XPATH");
		type("sepResetComments_XPATH",data.get("comments"));
		click("submit_XPATH");
		getText("successAlert_XPATH");
		log.debug("SepApproveQuestionTest Successfully executed");
		Reporter.log("SepApproveQuestionTest Successfully executed!!!!!!!!!!");
	}
}
