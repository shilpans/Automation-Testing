package work.myimss.test.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;

public class SepLangDeleteTest extends TestBase {
	@Test
	public void sepLangDeleteTest()
	{
		log.debug("Inside SepLangDeleteTest");
		click("SepLangDelete_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("selectLang_XPATH","Failed to click on SepLangDeleteTest"))));
		log.debug("SepLangDeleteTest Successfully executed");
		
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("SepLangDeleteTest Successfully executed!!!!!!!!!!");
		
	}

}
