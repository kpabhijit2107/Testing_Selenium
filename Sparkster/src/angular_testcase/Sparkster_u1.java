package angular_testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sparkster_u1 


{

	
public WebDriver driver;	


@Test()
public void check_click() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"userSettings\"]/span[2]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"notifications\"]/i")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"todos\"]/i")).click();
 
		
	}
 @BeforeTest()
 public void open()
 {
	  
	    System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("http://localhost:4200/");
	
	 
 }
 
 
 @AfterTest()
 public void close()
{
	

}
}
