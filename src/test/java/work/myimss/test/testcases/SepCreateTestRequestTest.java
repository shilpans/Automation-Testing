package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepCreateTestRequestTest extends TestBase {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepCreateTestRequestTest(String hiringId,String emsId,String requestType,String assignTo,String jobDescription,String endDate)
	{
		
		log.debug("Inside SepCreateTestRequestTest");
		click("createRole_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepHiringId_XPATH","Failed to click on SepCreateTestRequestTest"))));
		log.debug("SepCreateTestRequestTest Successfully executed");
		
		type("sepHiringId_XPATH",hiringId);
		type("sepEmsId_XPATH",emsId);
		type("sepJobDescription_XPATH",jobDescription);
		type("sepRequestType_XPATH",requestType);
		type("sepAssignTo_XPATH",assignTo);
		
		type("sepEndDate_XPATH",endDate);
		
		click("submit_XPATH");
		
		Reporter.log("SepCreateTestRequestTest Successfully executed!!!!!!!!!!");
		
		
	}
}
