package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepDefineSectionTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepDefineSectionTest(Hashtable<String,String> data)
	{
		log.debug("Inside SepDefineSectionTest");
		click("sepDefineSection_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sepTotalSection_XPATH","Failed to click on SepDefineSectionTest"))));
		
//		type("sepTotalSection_XPATH",String.valueOf((int)Double.parseDouble(data.get("emsId"))));
		type("sepTotalSection_XPATH",String.valueOf((int)Double.parseDouble(data.get("totalSection"))));
		click("sepDefineSectionNext_XPATH");
		type("sepDefineSectionName_XPATH",data.get("sectionName"));
		type("sepDefineSectionQuestionType_XPATH",data.get("questionType"));
		type("sepDefineSectionLangType_XPATH",data.get("langType"));
		type("sepDefineSectionLangSubCategory_XPATH",data.get("langSubCategory"));
		type("sepDefineSectionMaxQuestions_XPATH",String.valueOf((int)Double.parseDouble(data.get("maxQuestions"))));
		type("sepDefineSectionMaxTime_XPATH",String.valueOf((int)Double.parseDouble(data.get("maxTime"))));
		type("sepDefineSectionCutOffPercent_XPATH",String.valueOf((int)Double.parseDouble(data.get("cutOffPercent"))));
		click("submit_XPATH");
		getText("successAlert_XPATH");
		log.debug("SepDefineSectionTest Successfully executed");
		Reporter.log("SepDefineSectionTest Successfully executed!!!!!!!!!!");
	}

}
