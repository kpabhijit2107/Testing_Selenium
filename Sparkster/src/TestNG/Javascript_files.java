package TestNG;


import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javascript_files {

	
	public WebDriver driver;


	
	
	
	@BeforeMethod
public void setup() {
	//setting capabilities
	DesiredCapabilities capibilties = DesiredCapabilities.chrome();
	LoggingPreferences logginPreferences = new LoggingPreferences();
	logginPreferences.enable(LogType.BROWSER, Level.ALL);
	capibilties.setCapability(CapabilityType.LOGGING_PREFS,logginPreferences );
	  System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver(capibilties);

}


	
	
	
	
	@AfterMethod
public void tearDown() {
	driver.quit();
}


	
	
	
	
	
	//method creation page reload
public void extractJSlogsInfo() {


LogEntries logEntries =driver.manage().logs().get(LogType.BROWSER);
for(LogEntry entry : logEntries) {
	
	//System.out.println(new Date(entry.getTimestamp() + "" + entry.getLevel() + "" +entry.getMessage()));
	
	System.out.println(entry.getTimestamp() + "" + entry.getLevel() + "" +entry.getMessage());
	
	
	
	
}

 }






@Test
public void testMethod() {
	
	driver.get("http://127.0.0.1:50508/uitesting/index.html");
	//calling method
	extractJSlogsInfo();
}

}






