package TestNG;

import java.io.EOFException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class function_blockly 

{
 public WebDriver driver;
 
 @Test()
 public void login_function() throws Exception
 {
	 
	 driver.findElement(By.name("email")).sendKeys("abjeet.dhiraj@syncoms.com");
     
	 driver.findElement(By.name("password")).sendKeys("syncoms");
     
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     Thread.sleep(32000);
     driver.findElement(By.xpath("//div[@id=(\"sidebar-menu\")]/div[@class=\"menu_section\"]/ul[@class=\"nav side-menu\"]/li[@class=\"ng-scope\"]/a[1]/i[@class=\"fa WebDesigner-icon faicons\"]")).click();
     Thread.sleep(5000);
     
     driver.findElement(By.xpath(" //a[@href = '#/WebFactory' and (text() = 'Web Factory' or . = 'Web Factory')]")).click();
     Thread.sleep(40000);
     driver.findElement(By.xpath("//label[(text() = ' Function' or . = ' Function')]")).click();

     Thread.sleep(50000);
     
     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[1]/div/ul/li[3]/a/i[@class=\"fa fa-puzzle-piece\"]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("edit")).click();
	 Thread.sleep(5000);
	 
	 //logic block move
	 Actions actions = new Actions(driver); 
	  
	  WebElement logicblockmove =driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > text"));
	  
	    actions.clickAndHold (logicblockmove).build().perform();
	    Thread.sleep(2000);
	    actions.moveToElement( logicblockmove,277, 62).build().perform();
	    Thread.sleep(2000);
	    actions.release(logicblockmove).build().perform(); 
	    Thread.sleep(4000);
	   //set block
	    driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[5]")).click();
	    
	    WebElement SETblockmove = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > g:nth-child(2)>path.blocklyPathDark"));
		WebElement SETblockmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > text"));
		 
		actions.clickAndHold (SETblockmove ).build().perform();
		 Thread.sleep(2000);
		 actions.moveToElement(SETblockmove1).build().perform();
		 Thread.sleep(2000);
		 actions.release(SETblockmove1).build().perform();
		    
		 Thread.sleep(5000);
			   
		 WebElement SETblockmoveafterdrop = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > g.blocklyEditableText "));
		 WebElement SETblockmoveafterdrop1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > path.blocklyPath"));
		    
		    
		 actions.clickAndHold (SETblockmoveafterdrop).build().perform();
		 Thread.sleep(2000);
		 actions.moveToElement(SETblockmoveafterdrop1,100, 50).build().perform();
	     Thread.sleep(2000);
		 actions.release(SETblockmoveafterdrop).build().perform(); 
		 Thread.sleep(3000);
		 
		 //delete set block
		 
		 WebElement setblock = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g > g:nth-child(8) > path.blocklyPathDark"));
		 actions.contextClick(setblock).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[10]/div/div[6]")).click();
		 Thread.sleep(3000);
		    
	     //rename create block
		 
		 driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g > g:nth-child(7)")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[10]/input")).clear();

         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("A");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g > g:nth-child(9)")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//html/body/div[10]/div//div[7]")).click();
         
         //move create block
         
         driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[4]")).click();
		  
	     Thread.sleep(1000);
	     WebElement Createblockmove = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > g:nth-child(10)"));
	     WebElement Createblockmove1 = driver.findElement(By.cssSelector(" #blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2)"));

	     actions.clickAndHold (Createblockmove ).build().perform();
		 Thread.sleep(2000);
		 actions.dragAndDrop(Createblockmove ,Createblockmove1).build().perform();
		 Thread.sleep(2000);
		 actions.release(Createblockmove1).build().perform();  
		    
		 Thread.sleep(4000);
		    
		 WebElement Createblockmoveccmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
		 WebElement Createblockmovecc1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
		    
		 actions.clickAndHold (Createblockmoveccmove1).build().perform();
		 Thread.sleep(2000);
		 actions.moveToElement(Createblockmovecc1,270,-10 ).build().perform();
		 Thread.sleep(2000);
		 actions.release(Createblockmoveccmove1).build().perform(); 
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(6) > text")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/input")).clear();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("SUM");
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(8) > text")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[10]/div//div[7]")).click();
	     Thread.sleep(2000);
	   
		//2nd create block move
		
		
		driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[4]")).click();
		  
		WebElement Createblockmove2 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(9)"));
		WebElement Createblockmove21 = driver.findElement(By.cssSelector(" #blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2)"));

		actions.clickAndHold (Createblockmove2 ).build().perform();
		Thread.sleep(2000);
		
		actions.dragAndDrop(Createblockmove2 ,Createblockmove21).build().perform();
		Thread.sleep(2000);
		actions.release(Createblockmove21).build().perform();  
		Thread.sleep(1000);
		  WebElement Createblockmovebbmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
		    WebElement Createblockmovebb1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
					    
			actions.clickAndHold (Createblockmovebbmove1).build().perform();
			Thread.sleep(2000);
			actions.moveToElement(Createblockmovebb1,270,-15 ).build().perform();
			Thread.sleep(2000);
			actions.release(Createblockmovebbmove1).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(6)")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("/html/body/div[10]/input")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("B");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(8) > text")).click();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//html/body/div[10]/div//div[7]")).click();
			 
         
         
         
        //Select block  move 
         
         
         

				driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[5]")).click();
				  
				WebElement Createblockmove3 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > g:nth-child(14)"));
				WebElement Createblockmove31 = driver.findElement(By.cssSelector(" #blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2)"));

				actions.clickAndHold (Createblockmove3 ).build().perform();
				Thread.sleep(2000);
				
				actions.dragAndDrop(Createblockmove3 ,Createblockmove31).build().perform();
				Thread.sleep(2000);
				actions.release(Createblockmove31).build().perform();  
				Thread.sleep(1000);
				WebElement Createblockmovesmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
			    WebElement Createblockmoves1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
						    
				actions.clickAndHold (Createblockmovesmove1).build().perform();
				Thread.sleep(2000);
				actions.moveToElement(Createblockmoves1,10,40 ).build().perform();
				Thread.sleep(2000);
				actions.release(Createblockmovesmove1).build().perform();
				Thread.sleep(1000);
				
				//selecting all dropdown list
				
				driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable.blocklySelected > g.blocklyEditableText")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("/html/body/div[10]/div/div[2]")).click();
                
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable.blocklySelected > g.blocklyDraggable > g > text")).click();         
                Thread.sleep(2000);
                
                driver.findElement(By.xpath("/html/body/div[10]/div/div[3]")).click();
                Thread.sleep(2000);
                
                driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(4) > g > g > text")).click();
                driver.findElement(By.xpath("/html/body/div[10]/div/div[4]")).click();
                //set block dropdownlist
                
                driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyDraggable > g.blocklyEditableText")).click();
    			Thread.sleep(1000);
    			driver.findElement(By.xpath("//html/body/div[10]/div//div[4]")).click();
    				
    			Thread.sleep(4000);
    			
    			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(4) > g")).click();
    			Thread.sleep(1000);
    			driver.findElement(By.xpath("//html/body/div[10]/div//div[2]")).click();
    			
    			
    			Thread.sleep(4000);
    			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(5) > g")).click();
    			Thread.sleep(1000);
    			driver.findElement(By.xpath("//html/body/div[10]/div//div[3]")).click();
    			
    			//function name change
    			
    			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g > g.blocklyDraggable > g.blocklyDraggable > g.blocklyDraggable > g.blocklyEditableText")).click();
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("//html/body/div[10]//input")).clear();
    			
    			Thread.sleep(2000);
    			
    			DateFormat dateformat = new SimpleDateFormat("MMddyyyyHHmmss");
    			
    			Date date = new Date();
    			
    			String date1 =dateformat.format(date);
    			
    			driver.findElement(By.xpath("//html/body/div[10]//input")).sendKeys("fun"+date1);
    			
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a/span[contains(@class,'k-icon k-i-close')]")).click();
    			 Thread.sleep(3000);
    		
    			 
    		//saving a function
    			 
    			 driver.findElement(By.partialLinkText("SAVE")).click();
    			   
    				
    			 
    		     Thread.sleep(6000);
    		    
    		     Alert alert = driver.switchTo().alert();
    		    
    		     alert.accept();
    		    
    		    
    		     Thread.sleep(90000);
    	       
    	       
    	       
    	         Alert alert1 = driver.switchTo().alert();
    		    
    		     alert1.accept();
    		    
    		    
    		     Thread.sleep(10000);
    		    
    		    // creating a document
    		     
    		     
    		     driver.findElement(By.xpath("//div[@id=(\"sidebar-menu\")]/div[@class=\"menu_section\"]/ul[@class=\"nav side-menu\"]/li[@class=\"ng-scope\"]/a[1]/i[@class=\"fa WebDesigner-icon faicons\"]")).click();
    		     Thread.sleep(5000);
    		     
    		     driver.findElement(By.xpath(" //a[@href = '#/WebFactory' and (text() = 'Web Factory' or . = 'Web Factory')]")).click();
    		     Thread.sleep(10000);
    		     
    		     Alert alert2 = driver.switchTo().alert();
     		    
    		     alert2.accept();
    		     Thread.sleep(40000);
    		    
    		     
    		     driver.findElement(By.xpath("//label[(text() = ' Document' or . = ' Document')]")).click();
    		   
    		     Thread.sleep(80000);
    		     
    		     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[1]/div/ul/li[3]/a/i[@class=\"fa fa-puzzle-piece\"]")).click();
    			  Thread.sleep(5000);
    			  driver.findElement(By.id("edit")).click();
    			  Thread.sleep(5000);
    			  
    			  
    			 // Actions actions = new Actions(driver); 
    			  
    			  WebElement whenblockmove =driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > text:nth-child(6) "));
    			  
    			  actions.clickAndHold (whenblockmove).build().perform();
    			  Thread.sleep(2000);
    			  actions.moveToElement( whenblockmove,277, 62).build().perform();
    			  Thread.sleep(2000);
    			    actions.release(whenblockmove).build().perform();  
    			  
    			    driver.findElement(By.xpath("//*[@id=\":1lt.label\" or @id=\":2k9\"]")).click();
    			 Thread.sleep(1000);
    			 WebElement SETblockmove01 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(1) "));
    			 WebElement SETblockmove11 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyEditableText "));
    			  actions.clickAndHold (SETblockmove01 ).build().perform();
    			  Thread.sleep(2000);
    			  actions.moveToElement(SETblockmove11).build().perform();
    			  Thread.sleep(2000);
    			    actions.release(SETblockmove11).build().perform();  
    			    
    			    
    			    Thread.sleep(5000);
    			   
    			    WebElement SETblockmoveafterdrop02 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > g.blocklyEditableText "));
    				 WebElement SETblockmoveafterdrop021 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
    			    
    			    
    				 actions.clickAndHold (SETblockmoveafterdrop02).build().perform();
    				  Thread.sleep(2000);
    				  actions.moveToElement(SETblockmoveafterdrop021,215, 61).build().perform();
    				 Thread.sleep(2000);
    				 actions.release(SETblockmoveafterdrop02).build().perform(); 
    			     Thread.sleep(3000);
    			    
    			    
    			     driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyDraggable > g:nth-child(7) > text")).click();
    			    
    			     Thread.sleep(3000);
    			     driver.findElement(By.xpath("/html/body/div[10]/input")).clear();
    			     Thread.sleep(3000);
    			    
    			     driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("NAME");
    			    
            
         
         
         
 }      
@BeforeTest()  
public void open()
{


	    System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
	    driver.get("https://ui.invent.sparkster.me/");
	
	   


}
@AfterTest()
public void close()
{
	




}



}


