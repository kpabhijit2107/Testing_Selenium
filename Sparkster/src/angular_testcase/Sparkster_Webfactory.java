package angular_testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sparkster_Webfactory 
{
public WebDriver driver;





@Test()
public void check() throws Exception
{
driver.findElement(By.xpath("//*[@id=\"menu_id\"]/nav/label")).click();
Actions action =new Actions(driver);


}

@BeforeTest()
public void open()
{
	  System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("http://localhost:4200/#");
	
	 



}



@AfterTest()
public void close()
{
	

}
}


