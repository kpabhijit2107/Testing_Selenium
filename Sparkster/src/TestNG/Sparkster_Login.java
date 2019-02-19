package TestNG;

import org.testng.annotations.Test;

import com.sun.glass.ui.Robot;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Sparkster_Login {
	
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
	     Thread.sleep(40000);
	     
	     driver.findElement(By.xpath("//label[(text() = ' Document' or . = ' Document')]")).click();
	   
	     Thread.sleep(35000);
	      
	     
	    
	     
	     
         
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[4]/a/i[@class=\"fa fa-object-ungroup\"]")).click();
	     
	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a/span[1]/i[@class=\"fa fa-table\"]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.id("containerWidthButton")).click();
	     Thread.sleep(3000);
	     
	     
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
	    
	//  WebElement number =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[8]/a/span[1]/i"));
	//  js.executeScript("arguments[0].scrollIntoView(true);", number); 
	//  number.click();
	  
	  
	     WebElement phnumber =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[9]/a/span[1]/i"));
	     js.executeScript("arguments[0].scrollIntoView(true);", phnumber); 
	     phnumber.click();
	  
	      WebElement label =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[10]/a/span[1]/i"));
	     js.executeScript("arguments[0].scrollIntoView(true);", label); 
	     label.click();
	    
	    
	    
	     WebElement zipcode =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[11]/a/span[1]/i"));
	     js.executeScript("arguments[0].scrollIntoView(true);", zipcode); 
	     zipcode.click();
	    
	 
	    
	 
	    
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
        
         
         driver.findElement(By.xpath("//*[@id=\"tab1\"]/ul/li[18]/div/img[@src='https://cdn.invent.sparkster.me/img/webfactory/img19.jpg']")).click();
   
         
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
        
          
         driver.findElement(By.xpath("//*[@id=\"bgimage-layout_listbox\"]/li[4]/span[2]/h3[contains(text(),'James-padolsey')]")).click();
       
        
       
          
         Thread.sleep(2000);
        
        
         driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a/span[@class=\"k-icon k-i-close\"]")).click();
         
         Thread.sleep(3000);
      
	     
	     
        
	   
	    
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[1]/input[@type=\"text\"]")).clear();
	   
	     Thread.sleep(2000);
	   
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[1]/input[@type=\"text\"]")).sendKeys("astest840");
	 
	   
	     Thread.sleep(1000);
	   
	     driver.findElement(By.partialLinkText("SAVE")).click();
	   
		
	 
	     Thread.sleep(6000);
	    
	     Alert alert = driver.switchTo().alert();
	    
	     alert.accept();
	    
	    
	     Thread.sleep(90000);
       
       
       
         Alert alert1 = driver.switchTo().alert();
	    
	     alert1.accept();
	    
	    
	     Thread.sleep(10000);
	    
	    
	     driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div[2]/ul/li[6]/a/i[contains(@class,'fa fa-file-text faicons')]")).click();
	     //driver.findElement(By.partialLinkText("fa fa-file-text faicons")).click();
	     //driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div[2]/ul/li[3]/a/i[@class=\"fa fa-file-text faicons\"]")).click();
	    
	     Thread.sleep(5000);
	     
	    
	    
	     driver.findElement(By.linkText("documentastest840")).click();
	    
	   
	    
	     Thread.sleep(65000);
	    
	   // File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //   FileUtils.copyFile(scrFile, new File("D:\\screenshot1.png"));
	  
	     driver.findElement(By.id("creditcardno")).sendKeys("4569321478962545");
	    
	  
	     driver.findElement(By.id("email")).sendKeys("xyz@hotmail.com");
	     driver.findElement(By.id("phoneno")).sendKeys("5555555555");
	     driver.findElement(By.id("label")).sendKeys("abh123");
	     driver.findElement(By.id("zipcode")).sendKeys("560068");
	     
	    
	     driver.findElement(By.id("save")).click();
	     
	     Thread.sleep(70000);
	     Alert alert2=driver.switchTo().alert();
	     alert2.accept();
	     
	     Thread.sleep(8000);
	     
	     driver.findElement(By.id("creditcardno")).sendKeys("4569321478962545");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("search")).click();
	     Thread.sleep(20000);
	     
	     driver.findElement(By.id("modify")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("zipcode")).clear();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("zipcode")).sendKeys("560044");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("save")).click();
	     Thread.sleep(8000);
	     
	     
	  //   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(scrFile, new File("D:\\screenshot1.png"));
	      
	 
	    
	     //driver.findElement(By.partialLinkText("k-icon k-i-calendar")).click();
	     //driver.findElement(By.xpath("//*[@id=\"ae07da6a-03f7-4230-8882-b3bf89f2746a\"]/div[2]/span/span/span/span[contains(@class,'k-icon k-i-calendar')]")).click();
	     
	//     driver.findElement(By.linkText("27")).click();
	     	
	
	   }
    
	@BeforeTest
  public void openurl()
  {
	  
	  
	  
	    System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("https://ui.invent.sparkster.me/");
	
	   

  }

  
	
	
	@AfterTest
  public void closedown() 
	{
	    driver.quit();
    }

}
