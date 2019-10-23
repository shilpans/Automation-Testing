package work.myimss.test.testcases;

import java.lang.reflect.Method;
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

public class LoginTest extends TestBase{
	

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
		public void loginTest(String username,String password) throws InterruptedException
		{
			log.debug("Inside Login Test!!!!!!!!!!");
			type("userName_XPATH",username);
			type("password_XPATH",password);
			click("signIn_XPATH");
			log.debug("Login Successfully executed!!!!!!!!!!");
			Reporter.log("Login Successfully executed!!!!!!!!!!");
			
			Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("apps_XPATH","Login not Successfull"))));
			
//			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//			Thread.sleep(3000);
//			Assert.assertTrue(alert.getText().contains(alertText));
//			Thread.sleep(3000);	
//			alert.accept();
		
		}
	}	
	
	

