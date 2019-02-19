package tesngdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SparksterDemo {
	
	
	public WebDriver driver;
	 

	@Test()
  public void verifylogin() throws Exception
  {  
	     
		 
		 driver.findElement(By.name("email")).sendKeys("abjeet.dhiraj@syncoms.com");
	     
		 driver.findElement(By.name("password")).sendKeys("syncoms");
	     
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     Thread.sleep(32000);
	     driver.findElement(By.xpath("//div[@id=(\"sidebar-menu\")]/div[@class=\"menu_section\"]/ul[@class=\"nav side-menu\"]/li[@class=\"ng-scope\"]/a[1]/i[@class=\"fa WebDesigner-icon faicons\"]")).click();
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath(" //a[@href = '#/WebFactory' and (text() = 'Web Factory' or . = 'Web Factory')]")).click();
	     Thread.sleep(50000);
	     
	     driver.findElement(By.xpath("//label[(text() = ' Document' or . = ' Document')]")).click();
	   
	     Thread.sleep(35000);
	      
	     
	    
	     
	     
         
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[4]/a/i[@class=\"fa fa-object-ungroup\"]")).click();
	     
	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a/span[1]/i[@class=\"fa fa-table\"]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.id("containerWidthButton")).click();
	     Thread.sleep(1000);
	     
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/a/span[1]/i[@class=\"fa fa-pencil-square-o\"]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[1]/a/span[1]/i")).click();
	  
	     Thread.sleep(1000);
	     
	   
	    driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[3]/a/span[1]/i")).click();
	  
	     Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[4]/a/span[1]/i")).click();
	 
	
	
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	
	   WebElement email =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[6]/a/span[1]/i"));
	   js.executeScript("arguments[0].scrollIntoView(true);", email); 
	   email.click();
	    
	  WebElement number =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[8]/a/span[1]/i"));
	  js.executeScript("arguments[0].scrollIntoView(true);", number); 
	  number.click();
	  
	  
	  WebElement phnumber =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[9]/a/span[1]/i"));
	  js.executeScript("arguments[0].scrollIntoView(true);", phnumber); 
	  phnumber.click();
	    
	    
	  WebElement zipcode =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[11]/a/span[1]/i"));
	  js.executeScript("arguments[0].scrollIntoView(true);", zipcode); 
	  zipcode.click();
	  
	 
	    
	  
	     Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[1]/a/i[@class=\"fa fa-picture-o\"]")).click();
        
         
         driver.findElement(By.xpath("//*[@id=\"tab1\"]/ul/li[3]/div/img[@src='https://cdn.invent.sparkster.me/img/webfactory/img2.jpg']")).click();
         Thread.sleep(3000);
         
 driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[4]/a/i[@class=\"fa fa-object-ungroup\"]")).click();
	     
	     Thread.sleep(2000);
	     
         driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a/span[1]/i[@class=\"fa fa-table\"]")).click();
   	  Thread.sleep(2000);
   	  driver.findElement(By.id("containerWidthButton")).click();
	     Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[1]/a/i[@class=\"fa fa-picture-o\"]")).click();
        
         
         driver.findElement(By.xpath("//*[@id=\"tab1\"]/ul/li[20]/div/img[@src='https://cdn.invent.sparkster.me/img/webfactory/img21.jpg']")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[4]/a/i[@class=\"fa fa-object-ungroup\"]")).click();
         Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/a/span[1]/i[@class=\"fa fa-pencil-square-o\"]")).click();
        
         
      driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[3]/div/a/span[1]/i[@class=\"fa fa-object-group\"]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[3]/div/div/ul/li[1]/a/button[@class=\"sample1\"]")).click();
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[5]/div[1][@class=\"work-area mainWorkArea deviceFactoryArea\"]")).click();
	     
	     Thread.sleep(1000);
	 
         driver.findElement(By.id("edit")).click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//*[@id=\"layout_tabstrip\"]/ul/li[2]/span[2]/p[contains(text(),'Background')]")).click();
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//*[@id=\"layout_tabstrip-2\"]/div[2]/div/div[1]/div/div/div/div[2]/span/span/span[2]/span[@class=\"k-icon k-i-arrow-s\"]")).click();
          
         Thread.sleep(1000);
        
          
         driver.findElement(By.xpath("//*[@id=\"bgimage-layout_listbox\"]/li[3]/span[2]/h3[contains(text(),'Markus-spiske')]")).click();
        
       
          
         Thread.sleep(2000);
        
        
         driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a/span[@class=\"k-icon k-i-close\"]")).click();
         
         Thread.sleep(3000);
      
	     
	     
        
	    
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[1]/input[@type=\"text\"]")).clear();
	   
	     Thread.sleep(2000);
	   
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[1]/input[@type=\"text\"]")).sendKeys("astest2507");
	   
	     Thread.sleep(1000);
	   
	   
	   
	   
	   
	   
	   
	   
	     driver.findElement(By.partialLinkText("SAVE")).click();
	   
		
	 
	     Thread.sleep(6000);
	    
	     Alert alert = driver.switchTo().alert();
	    
	     alert.accept();
	     
	    
        
	    
	     Thread.sleep(70000);
       
       
       
         Alert alert1 = driver.switchTo().alert();
	    
	     alert1.accept();
	    
	    
	     Thread.sleep(5000);
	    
	    
	    
	    
	     driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div[2]/ul/li[7]/a/i[@class=\"fa fa-file-text faicons\"]")).click();
		    
		    Thread.sleep(5000);
		     
		    
		    driver.findElement(By.linkText("documentastest2507")).click();
		    
		    Thread.sleep(5000);
		    driver.findElement(By.id("creditcardno")).sendKeys("4569321478962545");
		    
			  
		    driver.findElement(By.id("email")).sendKeys("xyz@hotmail.com");
		    driver.findElement(By.id("phoneno")).sendKeys("5555555555");
		    driver.findElement(By.id("label")).sendKeys("abh123");
		    driver.findElement(By.id("zipcode")).sendKeys("560068");
		     
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	     
	     
	     
	     
	     
 }
  
	
	


	@BeforeTest
  public void openurl()
  {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("http://127.0.0.1:5500/uitesting/index.html");
	   // driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li/a/cufon")).click();
	   

  }

  
	
	
	@AfterTest
  public void closedown() 
	{
		
    }

}



