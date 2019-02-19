package uiautomationSparkster.angulartest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uiautomationSparkster.TestUtils.TestUtils;
import uisparkster.TestBase.Testbase;

public class HomePage extends Testbase {
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav/label")
	@CacheLookup
	WebElement Menu;
	
	@FindBy(css="#widgets > div.panel-heading.color-violet")
	@CacheLookup
	WebElement menubar;
	
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement menubarwidgets;
	
	
	
	@FindBy(xpath="//*[@id=\"mainlayout\"]")
	@CacheLookup
	WebElement 	clickonlayout;
	
	@FindBy(xpath="//*[@id=\"layout\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement 	clickonconatiner;
	
	@FindBy(xpath="//*[@id=\"addcontainer\"]")
	@CacheLookup
	WebElement 	addcontainer;
	
	@FindBy(xpath="//*[contains(@class,'row innerContent ui-sortable ui-droppable')]")
	@CacheLookup
	WebElement 	clickinsdicontainer;
	
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav")
	@CacheLookup
	WebElement 	closemenu;
	
	@FindBy(xpath="//*[@id=\"con3\"]/div[1][@class=\"row innerContent ui-sortable ui-droppable\"]")
	@CacheLookup
	WebElement 	clickinsdicontainer2;
	
	@FindBy(xpath="//*[@id=\"con2\"]/div[1][@class=\"row innerContent ui-sortable ui-droppable\"]")
	@CacheLookup
	WebElement 	clickinsideconatiner3;
	@FindBy(xpath="//*[@class=\"ui-resizabl-handle ui-resizabl-s\"]")
	@CacheLookup
	WebElement 	resizeconatiner;
	@FindBy(xpath="//*[@id=\"con2\"]/div[1][@class=\"row innerContent ui-sortable ui-droppable\"]")
	@CacheLookup
	WebElement 	againclickinsidecontainer3;
	
	
	//*****************************MenuSelctionoption click**************************************************
	
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav/label")
	@CacheLookup
	WebElement Menuu;
	
	@FindBy(xpath="//*[@id=\"menu-templates\"]")
	@CacheLookup
	WebElement tempaltes;
	
	@FindBy(xpath="//*[@id=\"menu-layout\"]")
	@CacheLookup
	WebElement layout;
	
	@FindBy(xpath="//*[@id=\"menu-libraries\"]")
	@CacheLookup
	WebElement libraries;
	
	@FindBy(xpath="//*[@id=\"menu-widgets\"]")
	@CacheLookup
	WebElement widget;
	
	@FindBy(xpath="//*[@id=\"menu-properties\"]")
	@CacheLookup
	WebElement properties;
	
	@FindBy(xpath="//*[@id=\"menu-collaborate\"]")
	@CacheLookup
	WebElement collabartes;
	
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav")
	@CacheLookup
	WebElement closeMenuu;
	
	//*********************************checkmenu bar option*****************************************************
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav")
	@CacheLookup
	WebElement Menuuu;
	
	@FindBy(xpath="//*[@id=\"templates\"]/div[2]/ul/li/span")
	@CacheLookup
	WebElement clicktest2;
	
	@FindBy(xpath="//*[@id=\"collaborate\"]/div[2]/ul/li/span")
	@CacheLookup
	WebElement clickcontrolpanel;
	
	@FindBy(xpath="//*[@id=\"libraries\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement clickpaperjs;
	
	@FindBy(xpath="//*[@id=\"libraries\"]/div[2]/ul/li[2]/span")
	@CacheLookup
	WebElement clickbabylonjs;
	
	@FindBy(xpath="//*[@id=\"properties\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement clickwidgets;
	
	@FindBy(xpath="//*[@id=\"properties\"]/div[2]/ul/li[2]/span")
	@CacheLookup
	WebElement clicklayouts;
	
	@FindBy(xpath="//*[@id=\"properties\"]/div[2]/ul/li[3]/span")
	@CacheLookup
	WebElement clickthirdparty;
	
	@FindBy(xpath="//*[@id=\"layout\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement clickcontainers;
	
	@FindBy(xpath="//*[@id=\"layout\"]/div[2]/ul/li[2]/span")
	@CacheLookup
	WebElement clicklayouts1;
	

	@FindBy(xpath="//*[@id=\"layout\"]/div[2]/ul/li[3]/span")
	@CacheLookup
	WebElement clickcontent;
	@FindBy(xpath="//*[@id=\"layout\"]/div[2]/ul/li[4]/span")
	@CacheLookup
	WebElement clickmulticontainer;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement clickwidgets1;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[2]/span")
	@CacheLookup
	WebElement clicktable;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[3]/span")
	@CacheLookup
	WebElement clicknumber;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[4]/span")
	@CacheLookup
	WebElement clickcontainer;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[5]/span")
	@CacheLookup
	WebElement clickchart;
	
	@FindBy(xpath="//*[@id=\"user-fr\"]")
	@CacheLookup
	WebElement clickonfrench;
	
	@FindBy(xpath="//*[@id=\"user-sp\"]")
	@CacheLookup
	WebElement clickonspanish;
	
	public HomePage()
	{
		
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	 public HomePage clickonmenu() 
	 {
		  
		 Menu.click();
		 
		 return new HomePage();  
		 
	 }
     
	 public HomePage clickonmenu1() throws Exception 
	 {
		  
		   
		    WebDriverWait wait = new WebDriverWait(driver, 95);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			
			WebElement element = wait.until(ExpectedConditions.visibilityOf(menubarwidgets));
			


	       // JavascriptExecutor js = (JavascriptExecutor)driver;
	       
			
			
			 
			 Actions action = new Actions(driver);
			
			 js.executeScript("arguments[0].click();", menubar);
			 
			 action.clickAndHold(menubarwidgets).build().perform();
			 
			 action.moveToElement( menubarwidgets,-700, -100).build().perform();
			 
			 Thread.sleep(2000);
			 
			 action.release(menubarwidgets).build().perform(); 
			 
			 TestUtils.highLightElement(driver, menubarwidgets );
			 
			 
			 
			
			  //js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);"); 
			 // WebElement element1 = wait.until(ExpectedConditions.visibilityOf(WebFactory));
			 try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			 action.moveByOffset(-250, -50).click().build().perform();
			// wait.until(ExpectedConditions.visibilityOf(clickonlayout));
			// clickonlayout.click();
			 Thread.sleep(4000);
			 wait.until(ExpectedConditions.visibilityOf(clickonconatiner));
			 TestUtils.highLightElement(driver,  clickonconatiner);
			 clickonconatiner.click();
			 Thread.sleep(4000);
			 for (int i = 0; i < 3; i++) {
			 wait.until(ExpectedConditions.visibilityOf(addcontainer));
			 TestUtils.highLightElement(driver,  addcontainer);
			 addcontainer.click();
			 }
			 Thread.sleep(4000);
			// wait.until(ExpectedConditions.visibilityOf(clickinsdicontainer));
			// clickinsdicontainer.click();
			 wait.until(ExpectedConditions.visibilityOf(closemenu));
			 TestUtils.highLightElement(driver,  closemenu);
			 closemenu.click();
			 Thread.sleep(4000);
		
			 	 action.moveByOffset(-250, -50).click().build().perform();
			 Thread.sleep(2000);
			// action.moveByOffset(-350, -50).click().build().perform();
			 
			// wait.until(ExpectedConditions.visibilityOf(clickinsdicontainer2));
			// TestUtils.highLightElement(driver,  clickinsdicontainer2);
			// clickinsdicontainer2.click();
			// Thread.sleep(4000);
			// wait.until(ExpectedConditions.visibilityOf(clickinsideconatiner3));
			// TestUtils.highLightElement(driver,  clickinsideconatiner3);
			// clickinsideconatiner3.click();
			// Thread.sleep(4000);
			// TestUtils.highLightElement(driver,  resizeconatiner);
			 action.clickAndHold (resizeconatiner).build().perform();
			 Thread.sleep(4000);
			// TestUtils.highLightElement(driver,  resizeconatiner);
			 action.moveToElement( resizeconatiner,250, -100).build().perform();
			 Thread.sleep(4000);
			// TestUtils.highLightElement(driver,  resizeconatiner);
			 action.release(resizeconatiner).build().perform();  
			 action.moveByOffset(-500, -50).click().build().perform();
			    
			// Thread.sleep(4000);
			 //wait.until(ExpectedConditions.visibilityOf(againclickinsidecontainer3));
			 //TestUtils.highLightElement(driver,  clickinsideconatiner3);
			 //gainclickinsidecontainer3.click();
			 
			 
			 
			 try {
					Thread.sleep(15000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 return new HomePage(); 
		 
	
	 
			 
	
		
		
	}
	
//*********************************************click menu option*************************************************************
public HomePage clickonmenuoption() throws Exception  {
	
	
 String mainWindow=driver.getWindowHandle();
	 
	 Set<String> set =driver.getWindowHandles();

	 Iterator<String> itr= set.iterator();
	 while(itr.hasNext()){
	 String childWindow=itr.next();
	    
	 if(!mainWindow.equals(childWindow)){
	 driver.switchTo().window(childWindow);
	 System.out.println(driver.switchTo().window(childWindow).getTitle());
	 }}
	 Thread.sleep(2000);
	 WebDriverWait wait = new WebDriverWait(driver, 95);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(Menuu));
		


      // JavascriptExecutor js = (JavascriptExecutor)driver;
      
		
		
		 
		 Actions action = new Actions(driver);
		
		 js.executeScript("arguments[0].click();", Menuu);
		 action.moveToElement(element).click().build().perform();
		 TestUtils.highLightElement(driver, Menuu );
		 Thread.sleep(2000);
		 Menuu.click();
		 wait.until(ExpectedConditions.visibilityOf(tempaltes));
		 TestUtils.highLightElement(driver,  tempaltes);
		 tempaltes.click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(layout));
		 TestUtils.highLightElement(driver, layout);
		 layout.click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf( libraries));
		 TestUtils.highLightElement(driver,   libraries);
		 libraries.click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(widget));
		 TestUtils.highLightElement(driver,  widget);
		 widget.click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf( collabartes));
		 TestUtils.highLightElement(driver,   collabartes);
		 collabartes.click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(properties));
		 TestUtils.highLightElement(driver,  properties);
		Thread.sleep(2000);
		 
		 
		 wait.until(ExpectedConditions.visibilityOf( closeMenuu));
		 TestUtils.highLightElement(driver,   closeMenuu);
		 closeMenuu.click();
	
	return new HomePage();
	


	 }
//***************************************menubar click chek method*****************************************
	public HomePage clickonmenubar() throws Exception{
		
		
		 WebDriverWait wait = new WebDriverWait(driver, 95);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			
			WebElement element = wait.until(ExpectedConditions.visibilityOf(Menuuu));
			


	      // JavascriptExecutor js = (JavascriptExecutor)driver;
	      
			
			
			 
			 Actions action = new Actions(driver);
			
			 js.executeScript("arguments[0].click();", Menuuu);
			 action.moveToElement(element).click().build().perform();
			 TestUtils.highLightElement(driver, Menuuu );
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOf( clicktest2));
			 TestUtils.highLightElement(driver,   clicktest2);
			 clicktest2.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-250, -50).click().build().perform();
		     
			 wait.until(ExpectedConditions.visibilityOf(  clickcontrolpanel));
			 TestUtils.highLightElement(driver,    clickcontrolpanel);
			 clickcontrolpanel.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-250, -50).click().build().perform();
		
			 wait.until(ExpectedConditions.visibilityOf(clickpaperjs));
			 TestUtils.highLightElement(driver,   clickpaperjs);
			 clickpaperjs.click();
			 Thread.sleep(2000);
			
		
			 wait.until(ExpectedConditions.visibilityOf( clickbabylonjs));
			 TestUtils.highLightElement(driver,   clickbabylonjs);
			 clickbabylonjs.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-350, -50).click().build().perform();
			 
			 wait.until(ExpectedConditions.visibilityOf(  clickwidgets));
			 TestUtils.highLightElement(driver,   clickwidgets);
			 clickwidgets.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-250, -50).click().build().perform();
		
			 wait.until(ExpectedConditions.visibilityOf( clicklayouts));
			 TestUtils.highLightElement(driver,   clicklayouts);
			 clicklayouts.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-250, -50).click().build().perform();
		
			 wait.until(ExpectedConditions.visibilityOf(  clickthirdparty));
			 TestUtils.highLightElement(driver,    clickthirdparty);
			 clickthirdparty.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-550, -100).click().build().perform();
			
			 wait.until(ExpectedConditions.visibilityOf(clickcontainers));
			 TestUtils.highLightElement(driver,  clickcontainers);
			 clickcontainers.click();
			 Thread.sleep(2000);
		
			 wait.until(ExpectedConditions.visibilityOf( clicklayouts1));
			 TestUtils.highLightElement(driver,  clicklayouts1);
			 clicklayouts1.click();
			 Thread.sleep(2000);
		
			 wait.until(ExpectedConditions.visibilityOf( clickcontent));
			 TestUtils.highLightElement(driver,    clickcontent);
			 clickcontent.click();
			 Thread.sleep(2000);
		
			 wait.until(ExpectedConditions.visibilityOf( clickmulticontainer));
			 TestUtils.highLightElement(driver,   clickmulticontainer);
			 clickmulticontainer.click();
			 Thread.sleep(2000);
			 action.moveByOffset(-650, -200).click().build().perform();
		

			 wait.until(ExpectedConditions.visibilityOf( clickwidgets1));
			 TestUtils.highLightElement(driver,   clickwidgets1);
			 clickwidgets1.click();
			 Thread.sleep(2000);
			 

			 wait.until(ExpectedConditions.visibilityOf( clicktable));
			 TestUtils.highLightElement(driver,    clicktable);
			 clicktable.click();
			 Thread.sleep(2000);
			 

			 wait.until(ExpectedConditions.visibilityOf(  clicknumber));
			 TestUtils.highLightElement(driver,    clicknumber);
			 clicknumber.click();
			 Thread.sleep(2000);
			 

			// wait.until(ExpectedConditions.visibilityOf( clickcontainer));
			// TestUtils.highLightElement(driver,  clickcontainer);
			// clickcontainer.click();
			// Thread.sleep(2000);
			 

			// wait.until(ExpectedConditions.visibilityOf( clickchart));
			// TestUtils.highLightElement(driver,   clickchart);
		//	 clickchart.click();
			// Thread.sleep(2000);
			 return new HomePage();	 

	}
	
public HomePage checkcontrolpanel() throws Exception  {
	
	
	
	
	

		 WebDriverWait wait = new WebDriverWait(driver, 95);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			
			WebElement element = wait.until(ExpectedConditions.visibilityOf(clickcontrolpanel));
			


	      // JavascriptExecutor js = (JavascriptExecutor)driver;
	      
			
			
			 
			 Actions action = new Actions(driver);
			
			 js.executeScript("arguments[0].click();", clickcontrolpanel);
			 action.moveToElement(element).click().build().perform();
			 TestUtils.highLightElement(driver, clickcontrolpanel );
			 Thread.sleep(2000);
		
			// wait.until(ExpectedConditions.visibilityOf( clickonfrench));
			// TestUtils.highLightElement(driver,  clickonfrench);
			// clickonfrench.click();
			// Thread.sleep(4000);
			 
			 
			 wait.until(ExpectedConditions.visibilityOf(closemenu));
			 TestUtils.highLightElement(driver,  closemenu);
			 closemenu.click();
			 Thread.sleep(2000);
			 
		//	 TestUtils.sendreportonemail();
			// action.moveByOffset(-450, -200).click().build().perform();
			 
		    
			 
			 
			 /*wait.until(ExpectedConditions.visibilityOf( clickcontrolpanel));
			 TestUtils.highLightElement(driver, clickcontrolpanel);
			 clickcontrolpanel.click();
			 Thread.sleep(2000);
		
		
			 wait.until(ExpectedConditions.visibilityOf(  clickonspanish));
			 TestUtils.highLightElement(driver,  clickonspanish);
			 clickonspanish.click();
			 Thread.sleep(2000);*/
		

			
			//Thread.sleep(90000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	          return new HomePage();

}
	

}




























