package uiauotmation.menutest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import uiautomationSparkster.TestUtils.TestUtils;
import uiautomationSparkster.angulartest.HomePage;
import uisparkster.TestBase.Testbase;

public class Tc001_Menutest extends Testbase{

	HomePage homepage;
	TestUtils testutil;


public Tc001_Menutest() {
		
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
public void clickonmenuoption()  throws Exception 

{

	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");	
	 homepage=homepage.clickonmenuoption();	
	 homepage=homepage.clickonmenubar();
     homepage=homepage.checkcontrolpanel();

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