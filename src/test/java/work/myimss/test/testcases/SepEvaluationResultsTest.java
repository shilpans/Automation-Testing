package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepEvaluationResultsTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepEvaluationResultsTest(Hashtable<String,String> data)
	{
		log.debug("Inside SepEvaluationResultsTest!!!!!!!!!!");
		
		click("sepEvaluationResults_XPATH");
		click("sepEvaluationResultsFilter_XPATH");
		select("sepEvaluationResultsFilterId_XPATH",String.valueOf((int)Double.parseDouble(data.get("evaluationId"))));
//		select("selectLang_XPATH",data.get("language"));
		
		click("sepGenerateReport_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepEvaluationResultsNameEmailMobile_XPATH","SepEvaluationResultsTest not Successfull"))));
		click("sepEvaluationResultsPdf_XPATH");
		
		log.debug("SepEvaluationResultsTest Successfully executed!!!!!!!!!!");
		Reporter.log("SepEvaluationResultsTest Successfully executed!!!!!!!!!!");
		
		
	}

}
