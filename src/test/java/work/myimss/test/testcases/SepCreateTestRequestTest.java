package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepCreateTestRequestTest extends TestBase {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepCreateTestRequestTest(Hashtable<String,String> data) throws InterruptedException
	{
		
		log.debug("Inside SepCreateTestRequestTest");
		click("sepCreateTest_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepHiringId_XPATH","Failed to click on SepCreateTestRequestTest"))));
		log.debug("SepCreateTestRequestTest Successfully executed");
		
		type("sepHiringId_XPATH",data.get("hiringId"));
		log.debug(data.get("emsId"));
		log.debug(data.get("emsId").trim());

		type("sepEmsId_XPATH",String.valueOf((int)Double.parseDouble(data.get("emsId"))));
		type("sepJobDescription_XPATH",data.get("jobDescription"));
		
		click("sepRequestType_XPATH");
		type("sepRequestTypeSearch_XPATH",data.get("requestType"));
		click("sepRequestTypeInternalRequirement_XPATH");
				
		click("sepAssignTo_XPATH");
		type("sepAssignToSearch_XPATH",data.get("assignTo"));
		click("sepAssignToSearchShilpans_XPATH");
		
		type("sepEndDate_XPATH",data.get("endDate"));
		
		click("submit_XPATH");
		getText("successAlert_XPATH");
		
		Reporter.log("SepCreateTestRequestTest Successfully executed!!!!!!!!!!");
		
		
	}

}
