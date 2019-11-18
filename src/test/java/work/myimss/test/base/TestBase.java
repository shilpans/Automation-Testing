package work.myimss.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import work.myimss.test.utilities.ExcelReader;
import work.myimss.test.utilities.ExtentManager;
import work.myimss.test.utilities.TestUtil;


public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static Properties OR=new Properties();
	public static FileInputStream fis;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;

	
	@BeforeSuite
	public void setUp() throws IOException
	{
		if(driver==null)
		{
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			config.load(fis);
			log.debug("config file loaded !!!!");
			
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis);
			log.debug("OR file loaded !!!!");
		}
		
		
		if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
			log.debug("Firefox launched!!!!");
		}
		else if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			log.debug("Chrome launched!!!!");
		}
		else if(config.getProperty("browser").equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			log.debug("IE launched!!!!");
		}
		
		driver.get(config.getProperty("testsiteurl"));
		log.debug("Naviagted to ---> "+config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		wait=new WebDriverWait(driver,5);
		
	}
	
	public void click(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		}else if(locator.endsWith("_CSS"))
		{
		driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).click();
		}
		test.log(LogStatus.INFO,"Clicking on: "+locator);
	}
	
	public void submit(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).submit();
		}else if(locator.endsWith("_CSS"))
		{
		driver.findElement(By.cssSelector(OR.getProperty(locator))).submit();
		}else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).submit();
		}
		test.log(LogStatus.INFO,"Clicking on: "+locator);
	}
	
	public void type(String locator, String value)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		}else if(locator.endsWith("_CSS"))
		{
		driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
		}else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
		}
		test.log(LogStatus.INFO,"Typing in: "+locator+"entered value as: "+value);
	}
	
	static List<WebElement> element;
	public static WebElement codeMirror;
	public void codeMirrorType(String locator, String value)
	{
		if (locator.endsWith("_XPATH")) {
			codeMirror = driver.findElement(By.xpath(OR.getProperty(locator)));
		} else if (locator.endsWith("_CSS")) {
			codeMirror = driver.findElement(By.cssSelector(OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			codeMirror = driver.findElement(By.id(OR.getProperty(locator)));
		}
		
		Actions a = new Actions(driver);
		a.click(codeMirror).perform();
		a.sendKeys(value).perform();
	   
		test.log(LogStatus.INFO,"Typing in: "+locator+"entered value as: "+value);
	   
	}

	public void clear(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).clear();
		}else if(locator.endsWith("_CSS"))
		{
		driver.findElement(By.cssSelector(OR.getProperty(locator))).clear();
		}else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).clear();
		}
		test.log(LogStatus.INFO,"Clearing on: "+locator);
	}
	
	String alertText;
	public void getText(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
			alertText=driver.findElement(By.xpath(OR.getProperty(locator))).getText();
		}else if(locator.endsWith("_CSS"))
		{
			alertText=driver.findElement(By.cssSelector(OR.getProperty(locator))).getText();
		}else if(locator.endsWith("_ID"))
		{
			alertText=driver.findElement(By.id(OR.getProperty(locator))).getText();
		}
		test.log(LogStatus.INFO,"Alert Text is : "+alertText);
	}
	
	static WebElement dropdown;

	public void select(String locator, String value) {

		if (locator.endsWith("_CSS")) {
			dropdown = driver.findElement(By.cssSelector(OR.getProperty(locator)));
		} else if (locator.endsWith("_XPATH")) {
			dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			dropdown = driver.findElement(By.id(OR.getProperty(locator)));
		}
		
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);

		test.log(LogStatus.INFO, "Selecting from dropdown : " + locator + " value as " + value);

	}
	
	static WebElement sss;
	public void radioSelect(String locator, String value)
	{
		if (locator.endsWith("_CSS")) {
			sss = driver.findElement(By.cssSelector(OR.getProperty(locator)));
		} else if (locator.endsWith("_XPATH")) {
			sss = driver.findElement(By.xpath(OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			sss = driver.findElement(By.id(OR.getProperty(locator)));
		}
		
		if(sss.getText()=="1")
		{
			
		}
		
	}
	
	public boolean isElementPresent(By by)
	{
		try{
			
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e){
			
			return false;
			
			
		}
	}
	
	public static void verifyEquals(String expected, String actual) throws IOException {

		try {

			Assert.assertEquals(actual, expected);

		} catch (Throwable t) {

			TestUtil.captureScreenshot();
			// ReportNG
			Reporter.log("<br>" + "Verification failure : " + t.getMessage() + "<br>");
			Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + "><img src=" + TestUtil.screenshotName
					+ " height=200 width=200></img></a>");
			Reporter.log("<br>");
			Reporter.log("<br>");
			// Extent Reports
			test.log(LogStatus.FAIL, " Verification failed with exception : " + t.getMessage());
			test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));

		}

	}
	
	@AfterSuite
	public void tearDown()
	{
//		if(driver!=null){
//		driver.quit();
//		
//		}
//		log.debug("Test Execution completed");
	}
}


