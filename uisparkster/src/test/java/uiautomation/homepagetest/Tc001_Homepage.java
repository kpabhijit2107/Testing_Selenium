package uiautomation.homepagetest;

import uisparkster.TestBase.Testbase;
import uisparkster.TestBase.Testbase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import uiautomationSparkster.TestUtils.TestUtils;
import uiautomationSparkster.angulartest.HomePage;
import uiautomationSparkster.angulartest.Widget_Page;


public class Tc001_Homepage extends Testbase {



 HomePage homepage;
 TestUtils testutil;

 
 
 public Tc001_Homepage() {
		
		super();
		
	}

 
 @BeforeMethod
 public void setup() throws InterruptedException 
 {
	 initialization();
	 homepage =new HomePage();
	
	 testutil= new TestUtils();
	 
	 
	 
	 
 }
 
 @Test(priority=1)
 public void clickonmenu()  throws InterruptedException 
 
 {
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");	
	 homepage=homepage.clickonmenu();	
 }
	 
 @Test(priority=2)
 public void clickonmenu1()  throws Exception 
 {
	// JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");	
	 homepage=homepage.clickonmenu();	
	 homepage=homepage.clickonmenu1();
	
 }


 @AfterMethod
	public void tearDown(ITestResult result) 
	
 {
	 if(result.getStatus()==ITestResult.FAILURE)
	 {
		 
			try {
				TestUtils.takeScreenshotAtEndOfTest(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 }
	// driver.quit(); 
		
}
 
}




