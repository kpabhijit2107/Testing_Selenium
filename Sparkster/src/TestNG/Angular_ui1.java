package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Angular_ui1 


{
 public WebDriver driver;
 
 
 
 
//testcases 
 @Test()
 public void check_click() throws Exception
 {
 
//render ui design	 
driver.findElement(By.xpath("//*[@id=\"widget\"]/ul/li[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[2]")).click();
Thread.sleep(2000);




 driver.findElement(By.xpath("//*[@id=\"widget\"]/ul/li[2]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"widget\"]/ul/li[3]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"widget\"]/ul/li[4]")).click();
 Thread.sleep(2000);
 
 
 
 
 //number field properties changed 
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).click();
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).clear();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).sendKeys("Number Input");
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/input")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/input")).clear();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/input")).sendKeys("10");
 Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"propertyBox\"]/p/button")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[2]/span/span/input[1]")).click();
 Thread.sleep(1000);

 for (int i = 0; i < 10; i++){
driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[2]/span/span/span[2]/span[1]")).click();
 
 
 
 }
 
 Thread.sleep(4000);
 // Dropdown list  properties check
 driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[3]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).click();
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).clear();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).sendKeys("Car List");
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).click();


 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).clear();
 
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).sendKeys("[{\"text\":\"Audi\",\"value\":\"1\"},{\"text\":\"Bmw\",\"value\":\"2\"},{\"text\":\"Hyundai\",\"value\":\"3\"},{\"text\":\"Jaguar\",\"value\":\"4\"}]");

 
 
 driver.findElement(By.xpath("//*[@id=\"propertyBox\"]/p/button")).click();
 Thread.sleep(2000);

 

 
 
 //graph properties for line chart
driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[4]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).click();

driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).sendKeys("{\"type\":\"line\",\"stack\":true}");

driver.findElement(By.xpath("//*[@id=\"propertyBox\"]/p/button")).click();
Thread.sleep(2000);





//graph properties for pie chart
driver.findElement(By.xpath("//*[@id=\"Wf-container\"]/div[4]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).click();

driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[4]/textarea")).sendKeys("{\"type\":\"pie\",\"stack\":true}");
driver.findElement(By.xpath("//*[@id=\"propertyBox\"]/p/button")).click();
Thread.sleep(2000);
driver.findElement(By.className("k-button")).click();
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).click();
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mainProperty\"]/p[1]/input")).sendKeys("Fetch");
driver.findElement(By.xpath("//*[@id=\"propertyBox\"]/p/button")).click();



 }
 

 
 
 
 
 
 
 
 

 
 
 //opening web page
 
 @BeforeTest()
 public void open()
 {
	   
	   
		  
	    System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("http://127.0.0.1:5084/uitesting/index.html");
	
	   
	   
 }

 
 
 
 
 
 //closing the browser
 @AfterTest()
 public void close()
{
	

}
 
}


