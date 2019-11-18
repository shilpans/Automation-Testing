package work.myimss.test.testcases;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class LoginTest extends TestBase{
	

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
		public void loginTest(Hashtable<String,String> data) throws InterruptedException
		{
			log.debug("Inside Login Test!!!!!!!!!!");

			clear("userName_XPATH");
			type("userName_XPATH",data.get("username"));
			clear("password_XPATH");
			type("password_XPATH",data.get("password"));
			click("signIn_XPATH");
			Thread.sleep(1000);
			
			WebElement xx=driver.findElement(By.xpath("//button[@id='modalok']"));
			
			if(xx.isDisplayed())
			{
				click("AlertOK_XPATH");
			}
			
			Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("apps_XPATH","Login not Successfull"))));
			log.debug("Login Successfully executed!!!!!!!!!!");
			Reporter.log("Login Successfully executed!!!!!!!!!!");
			
//			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//			Thread.sleep(3000);
//			Assert.assertTrue(alert.getText().contains(alertText));
//			Thread.sleep(3000);	
		
		}
	}	
	
	

