package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepLangSubCategoryTest extends TestBase{
	@Test
	public void sepLangSubCategoryTest()
	{
		log.debug("Inside SepLangSubCategoryTest");
		click("sepLangCategory_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("createLang_XPATH","Failed to click on SepLangSubCategoryTest"))));
		log.debug("SepLangSubCategoryTest Successfully executed");
		Reporter.log("SepLangSubCategoryTest Successfully executed");
		
	}

}
