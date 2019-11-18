package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class InValidLoginTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void inValidLoginTest(Hashtable<String,String> data)
	{
		log.debug("Inside Login Test!!!!!!!!!!");
		
		type("userName_XPATH",data.get("username"));
		type("password_XPATH",data.get("password"));
		click("signIn_XPATH");
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("apps_XPATH","InValidLoginTest not Successfull"))));
		
		log.debug("InValidLoginTest Successfully executed!!!!!!!!!!");
		Reporter.log("InValidLoginTest Successfully executed!!!!!!!!!!");
	}

}
