package tesngdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Developmenttest 




{
   
	
	
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
	     Thread.sleep(1000);
	     
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/a/span[1]/i[@class=\"fa fa-pencil-square-o\"]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[3]/a/span[1]/i[@class=\"fa fa-th-list\"]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.partialLinkText("CreditCardNo")).click();
	     Thread.sleep(1000);
	    
	     driver.findElement(By.partialLinkText("Date")).click();
	     Thread.sleep(3000);
	    
	 
	
	     driver.findElement(By.xpath("//*[@id=\"mCSB_1_scrollbar_horizontal\"]/a[2][contains(@class,'mCSB_buttonRight')]")).click();
	   
		
	
	     driver.findElement(By.partialLinkText("DropDown")).click();
	   
	     Thread.sleep(3000);
	  
	     
	     
	      driver.findElement(By.xpath("//*[@id=\"02d11267-7902-4772-be82-42613b7ae979\"]/div[@class=\"row layoutrow ui-sortable ng-scope\"]")).click();
	     driver.findElement(By.partialLinkText("fa fa-ellipsis-v")).click();
	     Thread.sleep(1000);
	     
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
	   
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[1]/input[@type=\"text\"]")).sendKeys("astest2492");
	   
	     Thread.sleep(1000);
	   
	   
	  
	   
	   
	   
	   
	     driver.findElement(By.partialLinkText("SAVE")).click();
	   
		
	 
	     Thread.sleep(6000);
	    
	     Alert alert = driver.switchTo().alert();
	    
	     alert.accept();
	     
	     Thread.sleep(2000);
	     
	     Alert alert2 = driver.switchTo().alert();
		    
	     alert2.accept();
        
	    
	     Thread.sleep(60000);
       
       
       
         Alert alert1 = driver.switchTo().alert();
	    
	     alert1.accept();
	    
	    
	     Thread.sleep(8000);
	    
	    
	    
	    
	     driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div[2]/ul/li[7]/a/i[@class=\"fa fa-file-text faicons\"]")).click();
	    
	    Thread.sleep(5000);
	     
	    
	    driver.findElement(By.linkText("documentastest2492")).click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("currency")).click();
	    driver.findElement(By.xpath("//input [@id='currency']")).sendKeys("555");
	     driver.findElement(By.id("creditcardno")).sendKeys("4569321478962541");
	     driver.findElement(By.id("currency")).sendKeys("5000");
	     
	     
	     //driver.findElement(By.xpath("//*[@id=\"fafc749a-f72e-40c4-b40f-98501a422266\"]/div[2]/span/span/span/span[contains(@class,'k-icon k-i-calendar')] ")).click();
  
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.linkText("27")).click();
	     	
	     
	     
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // driver.findElement(By.xpath("//*[@id=\"mCSB_1_scrollbar_horizontal\"]/a[2][@class=\"mCSB_buttonRight\"]")).click();
		   
	    
   
	   
	    
	    
	    
	  
	    //Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//*[@id=\"897a9e80-10cb-4544-9df5-24afcf3a33a9\"]/div[2]/i[1][@class=\"fa fa-ellipsis-v\"]")).click();

	     
	     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	     
	     
	     
	     
	     
	     
	     
	     
	   
	  
  }
  
	
	@BeforeTest
  public void openurl()
  {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("");
	  //  driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li/a/cufon")).click();
	   

  }

  
	
	
	@AfterTest
  public void closedown() 
	{
		
    }

}





