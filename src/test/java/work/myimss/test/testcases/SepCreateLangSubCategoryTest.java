package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepCreateLangSubCategoryTest extends TestBase
	{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepCreateLangSubCategoryTest(Hashtable<String,String> data)
	{
		log.debug("Inside SepCreateLangSubCategory");
		click("createLang_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("selectLang_XPATH","Failed to click on SepCreateLangSubCategoryTest"))));
		
		select("selectLang_XPATH",data.get("language"));
		type("langName_XPATH",data.get("name"));
		
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("SepCreateLangSubCategory Successfully executed!!!!!!!!!!");
		
		log.debug("SepLangSubCategoryTest Successfully executed");
		
	}

}
