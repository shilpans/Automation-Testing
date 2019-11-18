package work.myimss.test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import work.myimss.test.base.TestBase;
import work.myimss.test.utilities.TestUtil;

public class SepSubmitQuestionTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void sepSubmitQuestionTest(Hashtable<String,String> data) throws InterruptedException
	{
		log.debug("Inside SepSubmitQuestionTest");
		click("sepSubmitQuestion_XPATH");
		
		click("sepQuestionType_XPATH");
		type("sepRequestTypeSearch_XPATH",data.get("questionType"));
		if(data.get("questionType").contentEquals("Single Select MCQ"))
		{
			click("sepQuestionTypeSearchSSM_XPATH");
		}else if(data.get("questionType").contentEquals("Multi Select MCQ"))
		{
			click("sepQuestionTypeSearchMSM_XPATH");
		}else if(data.get("questionType").contentEquals("Descriptive"))
		{
			click("sepQuestionTypeSearchDesc_XPATH");
		}else{
			System.out.println("invalid question type");
		}
		
		
		click("sepComplexity_XPATH");
		type("sepRequestTypeSearch_XPATH",data.get("complexity"));
		if(data.get("complexity").contentEquals("Low"))
		{
			click("sepComplexityLow_XPATH");
		}else if(data.get("complexity").contentEquals("Medium"))
		{
			click("sepComplexityMedium_XPATH");
		}else if(data.get("complexity").contentEquals("High"))
		{
			click("sepComplexityHigh_XPATH");
		}else{
			System.out.println("invalid complexity");
		}
		
		
		click("sepLangType_XPATH");
		type("sepRequestTypeSearch_XPATH",data.get("langType"));
		click("sepLangTypeApptitude_XPATH");
		
		
		click("sepLangSubCategory_XPATH");
		type("sepRequestTypeSearch_XPATH",data.get("langSubCategory"));
		click("sepLangSubCategoryGeneralAptitude_XPATH");
		
		click("sepIsTimeBoundYes_XPATH");
		clear("sepMaxTime_XPATH");
		type("sepMaxTime_XPATH",String.valueOf((int)Double.parseDouble(data.get("maxTime"))));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, question']")));
		type("sepQuestion_XPATH",data.get("question"));
		driver.switchTo().defaultContent();
		
		
		if(data.get("questionType").contentEquals("Single Select MCQ"))
		{
			type("sepSingleAnsA_XPATH",data.get("ansA"));
			type("sepSingleAnsB_XPATH",data.get("ansB"));
			type("sepSingleAnsC_XPATH",data.get("ansC"));
			type("sepSingleAnsD_XPATH",data.get("ansD"));
			type("sepSingleAnsE_XPATH",data.get("ansE"));
			
			if(data.get("rad1").contentEquals("yes"))
			{
				click("sepSingleAnsACorrect_XPATH");
			}else if(data.get("rad2").contentEquals("yes"))
			{
				click("sepSingleAnsBCorrect_XPATH");
			}else if(data.get("rad3").contentEquals("yes"))
			{
				click("sepSingleAnsCCorrect_XPATH");
			}else if(data.get("rad4").contentEquals("yes"))
			{
				click("sepSingleAnsDCorrect_XPATH");
			}else if(data.get("rad5").contentEquals("yes"))
			{
				click("sepSingleAnsECorrect_XPATH");
			}else
			{
				System.out.println("Invalid SSMCQ input");
			}
		}else if(data.get("questionType").contentEquals("Multi Select MCQ"))
		{
			type("sepMultiAnsA_XPATH",data.get("ansA"));
			type("sepMultiAnsB_XPATH",data.get("ansB"));
			type("sepMultiAnsC_XPATH",data.get("ansC"));
			type("sepMultiAnsD_XPATH",data.get("ansD"));
			type("sepMultiAnsE_XPATH",data.get("ansE"));
			
			if(data.get("chk1").contentEquals("yes"))
			{
				click("sepMultiAnsACorrect_XPATH");
			}
			if(data.get("chk2").contentEquals("yes"))
			{
				click("sepMultiAnsBCorrect_XPATH");
			}
			if(data.get("chk3").contentEquals("yes"))
			{
				click("sepMultiAnsCCorrect_XPATH");
			}
			if(data.get("chk4").contentEquals("yes"))
			{
				click("sepMultiAnsDCorrect_XPATH");
			}
			if(data.get("chk5").contentEquals("yes"))
			{
				click("sepMultiAnsECorrect_XPATH");
			}
			
		}else if(data.get("questionType").contentEquals("Descriptive"))
		{
			codeMirrorType("sepDescCodeTemplate_XPATH",data.get("codeTemplate"));
			type("sepDescSampleInput_XPATH",data.get("sampleInput"));
			type("sepDescSampleOutput_XPATH",String.valueOf((int)Double.parseDouble(data.get("sampleOutput"))));
			type("sepDescClassName_XPATH",data.get("className"));
			type("sepDescMethodName_XPATH",data.get("mathodName"));
			type("sepDescMethodParameterCount_XPATH",String.valueOf((int)Double.parseDouble(data.get("parameterCount"))));
			type("sepDescMethodParameterDT_XPATH",data.get("parameterDT"));
			type("sepDescReturnDT_XPATH",data.get("returnDT"));
			type("sepDescLinestoLock_XPATH",data.get("linestoLock"));
			
//			WebElement codeMirror = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div[12]/div/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre"));
//					Actions a = new Actions(driver);
//					a.click(codeMirror).perform();
//					a.sendKeys("Hello World").perform();
		}
		else
		{
			System.out.println("Invalid question Type input");
		}
		
		Thread.sleep(2000);
		click("sepSubmit_XPATH");
		getText("successAlert_XPATH");
				
		log.debug("SepSubmitQuestionTest Successfully executed");
		Reporter.log("SepSubmitQuestionTest Successfully executed!!!!!!!!!!");
	}

}
