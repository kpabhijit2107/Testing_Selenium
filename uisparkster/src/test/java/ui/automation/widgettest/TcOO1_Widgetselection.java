package ui.automation.widgettest;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import uiautomationSparkster.TestUtils.TestUtils;
import uiautomationSparkster.angulartest.AppPage;
import uiautomationSparkster.angulartest.HomePage;
import uiautomationSparkster.angulartest.Loginpage;
import uiautomationSparkster.angulartest.Widget_Page;
import uisparkster.TestBase.Testbase;

public class TcOO1_Widgetselection extends Testbase{
	
	 HomePage homepage;
	 TestUtils testutil;
	Loginpage loginpage;
	 Widget_Page widpage;
	 AppPage apppage;
	 
	 
	 public TcOO1_Widgetselection() {
			
			super();
			
		}
	
	
	 @BeforeMethod
	 public void setup() throws InterruptedException 
	 {
		 initialization();
		 loginpage=new  Loginpage();
		 
		homepage = loginpage.logintoapplication(prop.getProperty("username"), prop.getProperty("password"));
		apppage = new AppPage();
		homepage =new HomePage();
		testutil= new TestUtils();
		widpage = new Widget_Page();
		 
		 
	 }
	 
	 
	 
	 
	 @Test(priority=1)
	 public void clickonmenu()  throws Exception 
	 
	 {
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		// loginpage=loginpage.logintoapplication(username, password);
		 apppage=apppage.clickcheck();
		 homepage=homepage.clickonmenuoption();	
		 homepage=homepage.clickonmenubar();
	     homepage=homepage.checkcontrolpanel();

		 homepage=homepage.clickonmenu();	
		 homepage=homepage.clickonmenu1();
		
		 
		 widpage = widpage.widgetsselction();
		 
		 
	 }
	 
	 
	 @Test(priority=2)
	 public void clickonmenu2()  throws Exception 
	 
	 {
		
		
	     homepage=homepage.checkcontrolpanel();

		
		 
	 }
	 
	 
	 
	 
	 @AfterMethod
		public void tearDown(ITestResult result) throws EmailException 
		
	 {
		
		 if(result.getStatus()==ITestResult.FAILURE)
		 {  
			
				try {
					 TestUtils.sendreportonemail();
					TestUtils.takeScreenshotAtEndOfTest(driver, result.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		 }
		// driver.quit(); 
	
	

}
}
