package TestNG;

import java.io.EOFException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.LazyList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class blockly_sp {
	
	public WebDriver driver;
	 

	@Test()
	public void Login() throws Exception
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
	   
	     Thread.sleep(50000);
	     
	     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[1]/div/ul/li[3]/a/i[@class=\"fa fa-puzzle-piece\"]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("edit")).click();
		  Thread.sleep(5000);
		  
		  
		  Actions actions = new Actions(driver); 
		  
		  WebElement whenblockmove =driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > text:nth-child(6) "));
		  
		  actions.clickAndHold (whenblockmove).build().perform();
		  Thread.sleep(2000);
		  actions.moveToElement( whenblockmove,277, 62).build().perform();
		  Thread.sleep(2000);
		    actions.release(whenblockmove).build().perform();  
		  
		    driver.findElement(By.xpath("//*[@id=\":1lt.label\" or @id=\":2k9\"]")).click();
		 Thread.sleep(1000);
		 WebElement SETblockmove = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(1) "));
		 WebElement SETblockmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyEditableText "));
		  actions.clickAndHold (SETblockmove ).build().perform();
		  Thread.sleep(2000);
		  actions.moveToElement(SETblockmove1).build().perform();
		  Thread.sleep(2000);
		    actions.release(SETblockmove1).build().perform();  
		    
		    
		    Thread.sleep(5000);
		   
		    WebElement SETblockmoveafterdrop = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > g.blocklyEditableText "));
			 WebElement SETblockmoveafterdrop1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
		    
		    
			 actions.clickAndHold (SETblockmoveafterdrop).build().perform();
			  Thread.sleep(2000);
			  actions.moveToElement(SETblockmoveafterdrop1,215, 61).build().perform();
			 Thread.sleep(2000);
			 actions.release(SETblockmoveafterdrop).build().perform(); 
		     Thread.sleep(3000);
		    
		    
		     driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyDraggable > g:nth-child(7) > text")).click();
		    
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("/html/body/div[10]/input")).clear();
		     Thread.sleep(3000);
		    
		     driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("NAME");
		    
		    //creat block move
		     driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[4]")).click();
		  
		     Thread.sleep(1000);
		     WebElement Createblockmove = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(9) "));
		     WebElement Createblockmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyEditableText "));

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
			 actions.moveToElement(Createblockmovecc1,-132,-41 ).build().perform();
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
				   
				    
			//2nd create block
				    
			driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[4]")).click();
			
			WebElement Createblockmove2 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(9)"));
			WebElement Createblockmove21 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyEditableText "));

			actions.clickAndHold (Createblockmove2 ).build().perform();
			Thread.sleep(2000);
			//actions.moveToElement(Createblockmove21).build().perform();
			actions.dragAndDrop(Createblockmove2 ,Createblockmove21).build().perform();
			Thread.sleep(2000);
			actions.release(Createblockmove21).build().perform();  
			Thread.sleep(1000);
					    
					    
					    
					    
			WebElement Createblockmovebbmove1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
		    WebElement Createblockmovebb1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
					    
			actions.clickAndHold (Createblockmovebbmove1).build().perform();
			Thread.sleep(2000);
			actions.moveToElement(Createblockmovebb1,-132,-46 ).build().perform();
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
			
			//3rd block
						    
			driver.findElement(By.xpath("//*[@id=\":0\"]/div[2]//div[4]")).click();
			Thread.sleep(1000);
			WebElement Createblockmove3 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklyFlyout > g > g.blocklyBlockCanvas > rect:nth-child(9)"));
			WebElement Createblockmove31 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyEditableText "));

			actions.clickAndHold (Createblockmove3 ).build().perform();
		    Thread.sleep(2000);
		    actions.dragAndDrop(Createblockmove3 ,Createblockmove31).build().perform();
			Thread.sleep(2000);
			actions.release(Createblockmove31).build().perform();  
			Thread.sleep(1000);
			
			WebElement Createblockmovecccmove11 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath"));
		    WebElement Createblockmoveccc1 = driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g.blocklyDraggable.blocklySelected > path.blocklyPath "));
					    
			actions.clickAndHold (Createblockmovecccmove11).build().perform();
			Thread.sleep(2000);
			actions.moveToElement(Createblockmoveccc1,-132,-52 ).build().perform();
			Thread.sleep(2000);
			actions.release(Createblockmovecccmove11).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable.blocklySelected > g:nth-child(6)")).click();
			driver.findElement(By.xpath("/html/body/div[10]/input")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[10]/input")).sendKeys("A");
			Thread.sleep(2000);	 
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable.blocklySelected > g:nth-child(8) > text")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//html/body/div[10]/div//div[7]")).click();
			
			//set block dropdwon list
			
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyDraggable > g.blocklyEditableText")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[10]/div//div[5]")).click();
				
			Thread.sleep(4000);
			
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(4) > g")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[10]/div//div[3]")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(2) > g.blocklyDraggable > g.blocklyDraggable > g:nth-child(5) > g")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html/body/div[10]/div//div[4]")).click();
			
			
			//Document name change
			
			driver.findElement(By.cssSelector("#blocklyWebFui > div > svg.blocklySvg > g > g.blocklyBlockCanvas > g:nth-child(1) > g.blocklyEditableText")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//html/body/div[10]//input")).clear();
			
			Thread.sleep(2000);
			
			DateFormat dateformat = new SimpleDateFormat("MMddyyyyHHmmss");
			
			Date date = new Date();
			
			String date1 =dateformat.format(date);
			
			driver.findElement(By.xpath("//html/body/div[10]//input")).sendKeys("doc"+date1);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a/span[contains(@class,'k-icon k-i-close')]")).click();
			 Thread.sleep(3000);
		
			
			
	         //adding field through ui
	         
	         
		     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[4]/a/i[@class=\"fa fa-object-ungroup\"]")).click();
		     
		     Thread.sleep(2000);
		     
		     
		     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a/span[1]/i[@class=\"fa fa-table\"]")).click();
		     Thread.sleep(1000);
		     
		     driver.findElement(By.id("containerWidthButton")).click();
		     Thread.sleep(3000);
		     
		     
		     driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/a/span[1]/i[@class=\"fa fa-pencil-square-o\"]")).click();
		     Thread.sleep(1000);
		
		     //driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[1]/a/span[1]/i")).click();
			  
		     //Thread.sleep(1000);
		     

		     JavascriptExecutor js = (JavascriptExecutor)driver;
		     Thread.sleep(2000);
		     
		     WebElement credtcard =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[9]/a/span[1]/i"));
		     js.executeScript("arguments[0].scrollIntoView(true);", credtcard); 
		     credtcard.click();
		    
		     
		     
		     WebElement email =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[5]/a/span[1]"));
		     js.executeScript("arguments[0].scrollIntoView(true);", email); 
		     email.click();
		     
		     Thread.sleep(2000);
		     WebElement zipcode =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/div/div/ul/li[15]/a/span[1]/i"));
		     js.executeScript("arguments[0].scrollIntoView(true);", zipcode); 
		     zipcode.click();
		    
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/footer/div/div/div[2]/div/div[2]/ul/li[1]/a/i[@class=\"fa fa-picture-o\"]")).click();
		        
	         
	         driver.findElement(By.xpath("//*[@id=\"tab1\"]/ul/li[3]/div/img[@src='https://cdn.invent.sparkster.me/img/webfactory/img2.jpg']")).click();
	         Thread.sleep(3000);
	      
	        
	  	    // UI background change
	         
	         Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"idWorkArea\"]/div[5]/div[1][@class=\"work-area mainWorkArea deviceFactoryArea\"]")).click();
		     Thread.sleep(2000);
			 
	         driver.findElement(By.id("edit")).click();
	         
	         Thread.sleep(1000);
	       
	         
	         driver.findElement(By.xpath("//*[@id=\"layout_tabstrip\"]/ul/li[2]/span[2]/p[contains(text(),'Background')]")).click();
	         
	         Thread.sleep(1000);
	         
	         driver.findElement(By.xpath("//*[@id=\"layout_tabstrip-2\"]/div[2]/div/div[1]/div/div/div/div[2]/span/span/span[2]/span[@class=\"k-icon k-i-arrow-s\"]")).click();
	          
	         Thread.sleep(1000);
	        
	          
	         driver.findElement(By.xpath("//*[@id=\"bgimage-layout_listbox\"]/li[4]/span[2]/h3[contains(text(),'James-padolsey')]")).click();
	       
	        
	       
	          
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[15]/div[1]/div/a/span[@class=\"k-icon k-i-close\"]")).click();
			
	         // Saving a document and render back
		    Thread.sleep(3000);

		     driver.findElement(By.partialLinkText("SAVE")).click();
		   
			
		 
		     Thread.sleep(6000);
		    
		     Alert alert = driver.switchTo().alert();
		    
		     alert.accept();
		    
		    
		     Thread.sleep(90000);
	       
	       
	       
	         Alert alert1 = driver.switchTo().alert();
		    
		     alert1.accept();
		    
		    
		     Thread.sleep(10000);
		    
		    
		     driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div[2]/ul/li[6]/a/i[contains(@class,'fa fa-file-text faicons')]")).click();
		    
		     Thread.sleep(5000);
		     
		    
		    
		     driver.findElement(By.partialLinkText("doc"+date1)).click();
		    
		   
		    
		     Thread.sleep(65000);
		    
		   //Perform transaction
		     driver.findElement(By.id("name")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.id("name")).sendKeys("john");
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//html/body/app-root/app-layout-creation/div[1]/div/div[1]/div/app-container-creation/app-tree-view/div//div[@class='col-lg-240 content ui-resizable']//div")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.id("a")).sendKeys("100");
		     Thread.sleep(4000);
		     driver.findElement(By.id("b")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.id("b")).sendKeys("180");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//*[@id=\"mybutton\"]")).click();
		     Thread.sleep(2000);
		     
		     driver.findElement(By.id("creditcardno")).sendKeys("4569321478962545");
		     Thread.sleep(2000);
		    
		  
		     driver.findElement(By.id("email")).sendKeys("xyz@hotmail.com");
		     Thread.sleep(2000);
		     
		     driver.findElement(By.id("zipcode")).sendKeys("560068");
		     Thread.sleep(2000);
		     
		    
		     driver.findElement(By.id("save")).click();
		     
		     Thread.sleep(70000);
		     Alert alert2=driver.switchTo().alert();
		     alert2.accept();
		     
		     Thread.sleep(8000);
		     
		     driver.findElement(By.id("name")).sendKeys("john");
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
		     
		     Thread.sleep(60000);
		     
		     Alert alert3=driver.switchTo().alert();
		     alert3.accept();
		     
		
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


