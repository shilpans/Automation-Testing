package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

//import work.myimss.test.utilities.TestUtil;

public class CreateRoleTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void createRoleTest(Hashtable<String,String> data)
	{
		log.debug("Inside CreateRole Test");
		click("createRole_XPATH");
//		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("roleName_XPATH","Failed to click on Create Role"))));
//		log.debug("CreateRoleTest Succefully executed");	
		
		type("roleName_XPATH",data.get("rolename"));
		type("roleDescription_XPATH",data.get("roledescription"));
		type("emsRole_XPATH",data.get("emsrole"));
		
		click("submit_XPATH");
		getText("successAlert_XPATH");
		Reporter.log("CreateRoleTest Successfully executed!!!!!!!!!!");
		
//		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("alertSuccess_XPATH","Failed to Create Role"))));
//		log.debug("CreateRoleTest Succefully executed");
	
		
		
	}

}
