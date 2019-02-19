package uiautomationSparkster.angulartest;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import uiautomationSparkster.TestUtils.TestUtils;
import uisparkster.TestBase.Testbase;

public class Widget_Page extends Testbase{

	@FindBy(xpath="//*[@id=\"menu_id\"]/nav")
	@CacheLookup
	
	WebElement clickonmenu;
	
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[1]/span")
	@CacheLookup
	WebElement clickwidgets;
	@FindBy(xpath="//*[@id=\"widgets\"]/div[2]/ul/li[1]/div/span[1]")
	@CacheLookup
	WebElement 	numeric;
	
	@FindBy(xpath="//*[@id=\"datepicker\"]")
	@CacheLookup
	WebElement 	datepick;
	
	@FindBy(xpath="//*[@id=\"dropdown\"]")
	@CacheLookup
	WebElement 	dropdown;
	
	@FindBy(xpath="//*[@id=\"combobox\"]")
	@CacheLookup
	WebElement 	combobox;
	@FindBy(xpath="//*[@id=\"maskedtextbox\"]")
	@CacheLookup
	WebElement 	maskedbox;
	@FindBy(xpath="//*[@id=\"label\"]")
	@CacheLookup
	WebElement 	labelbox;
	@FindBy(xpath="//*[@id=\"textbox\"]")
	@CacheLookup
	WebElement 	textbox;
	@FindBy(xpath="//*[@id=\"textarea\"]")
	@CacheLookup
	WebElement 	textareabox;
	@FindBy(xpath="//*[@id=\"multiselect\"]")
	@CacheLookup
	WebElement 	muliseclectbox;
	@FindBy(xpath="//*[@id=\"scrollview\"]")
	@CacheLookup
	WebElement 	scrollbox;
	@FindBy(xpath="//*[@id=\"gauge\"]")
	@CacheLookup
	WebElement 	gaugebox;
	
	@FindBy(xpath="//*[@class=\"k-icon k-i-arrowhead-e\"]")
	@CacheLookup
	WebElement 	imagenextclick;
	
	//@FindBy(xpath="//*[@id=\"gauge\"]")
	//@CacheLookup
	//WebElement 	gaugebox;
	
	
	@FindBy(xpath="//*[@class=\"k-link k-link-increase\"]")
	@CacheLookup
	WebElement 	numerictextupperarrowclick;
	@FindBy(xpath="//*[@class=\"k-link k-link-decrease\"]")
	@CacheLookup
	WebElement 	numerictextdownarrowclick;
	@FindBy(xpath="//*[@class=\"k-link k-link-increase\"]")
	@CacheLookup
	WebElement 	clickinsidecontainer4;
	@FindBy(css="#scon2 > div.row.innerContent.ui-sortable.ui-droppable > app-tree-view")
	@CacheLookup
	WebElement 	selcethandle;
	
	
	
	@FindBy(xpath="//*[@id=\"numericbox\"]//input[@class=\"k-input k-formatted-value\"]")
	@CacheLookup
	WebElement 	numerictexttoentervalue;
	@FindBy(xpath="//*[@id=\"menu_id\"]/nav")
	@CacheLookup
	
	WebElement closeonmenu;
	
	@FindBy(xpath="//*[@class=\"k-i-arrow-s k-icon\"]")
	@CacheLookup
	WebElement clickdropdown;
	
	@FindBy(xpath="//*[@class=\"k-i-arrow-s k-icon\"]")
	@CacheLookup
	WebElement selectdropdown;
	
	@FindBy(xpath="//*[@text()='Large']")
	@CacheLookup
	WebElement selectdropdownlist;
	@FindBy(xpath="//*[@class=\"ui-resizabl-handle ui-resizabl-s\"]")
	@CacheLookup
	WebElement 	resizeconatiner2;
	@FindBy(xpath="//*[@class=\"k-textbox\"]")
	@CacheLookup
	WebElement 	clickinsidebox;
	@FindBy(xpath="//*[@class=\"k-textarea\"]")
	@CacheLookup
	WebElement 	clickinsidearea;
	@FindBy(xpath="//*[@id=\"collaborate\"]/div[2]/ul/li/span")
	@CacheLookup
	WebElement clickonlocalization;
	@FindBy(xpath="//*[@id=\"user-sp\"]")
	@CacheLookup
	WebElement clickonspanish;
	public Widget_Page()
	{
		
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	 public  Widget_Page widgetsselction() throws InterruptedException, EmailException 
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 95);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			
			WebElement element = wait.until(ExpectedConditions.visibilityOf(clickonmenu));
			


	       // JavascriptExecutor js = (JavascriptExecutor)driver;
	       
			
			
			 
			 Actions action = new Actions(driver);
			
			 js.executeScript("arguments[0].click();", clickonmenu);
			 action.moveToElement(element).click().build().perform();
			 TestUtils.highLightElement(driver, clickonmenu );
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOf(clickwidgets));
			 TestUtils.highLightElement(driver,  clickwidgets);
			 clickwidgets.click();
			 Thread.sleep(3000);
			 wait.until(ExpectedConditions.visibilityOf(numeric));
			 TestUtils.highLightElement(driver,  numeric);
			 
			 numeric.click();
			 Thread.sleep(3000);
			 wait.until(ExpectedConditions.visibilityOf(datepick));
			 TestUtils.highLightElement(driver,  datepick);
			 datepick.click();
			 Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf( dropdown));
			TestUtils.highLightElement(driver,  dropdown);
		     dropdown.click();
			 Thread.sleep(3000);
			 wait.until(ExpectedConditions.visibilityOf( combobox));
				TestUtils.highLightElement(driver,  combobox);
				combobox.click();
				 Thread.sleep(3000);
				 wait.until(ExpectedConditions.visibilityOf( maskedbox));
					TestUtils.highLightElement(driver,  maskedbox);
					maskedbox.click();
					 Thread.sleep(3000);
					// wait.until(ExpectedConditions.visibilityOf( labelbox));
						//TestUtils.highLightElement(driver,  labelbox);
						//labelbox.click();
						 Thread.sleep(3000);
						 
						 wait.until(ExpectedConditions.visibilityOf( textbox));
							TestUtils.highLightElement(driver,  textbox);
							textbox.click();
							 Thread.sleep(3000);
							 wait.until(ExpectedConditions.visibilityOf( textareabox));
								TestUtils.highLightElement(driver,  textareabox);
								textareabox.click();
								 Thread.sleep(3000);
								 wait.until(ExpectedConditions.visibilityOf( muliseclectbox));
									TestUtils.highLightElement(driver,  muliseclectbox);
									muliseclectbox.click();
									 
              Thread.sleep(2000); 	
              action.clickAndHold (resizeconatiner2).build().perform();
 			 Thread.sleep(4000);
 			// TestUtils.highLightElement(driver,  resizeconatiner);
 			 action.moveToElement( resizeconatiner2,250, 50).build().perform();
 			 Thread.sleep(4000);
 			// TestUtils.highLightElement(driver,  resizeconatiner);
 			 action.release(resizeconatiner2).build().perform();  
										
 			 Thread.sleep(3000);
 			 wait.until(ExpectedConditions.visibilityOf(clickwidgets));
			 TestUtils.highLightElement(driver,  clickwidgets);
			 clickwidgets.click();
			 wait.until(ExpectedConditions.visibilityOf(scrollbox));
				TestUtils.highLightElement(driver,  scrollbox);
				scrollbox.click();
				 
				 Thread.sleep(5000);
				 wait.until(ExpectedConditions.visibilityOf( gaugebox));
					TestUtils.highLightElement(driver,  gaugebox);
					gaugebox.click();
					Thread.sleep(2000);
					closeonmenu.click();
					Thread.sleep(3000);
					wait.until(ExpectedConditions.visibilityOf( imagenextclick));
					 for (int i = 0; i < 2; i++) {
					TestUtils.highLightElement(driver,  imagenextclick);
					imagenextclick.click();
					 }
					 
			// wait.until(ExpectedConditions.visibilityOf( maskedtextbox));
			// TestUtils.highLightElement(driver,  maskedtextbox);
			// Thread.sleep(2000);
			// wait.until(ExpectedConditions.visibilityOf( numerictext));
			// Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOf( numerictext));
			// TestUtils.highLightElement(driver,  numerictext);
			// numerictext.click();
			// Thread.sleep(2000);
			 for (int i = 0; i < 7; i++) {
				 TestUtils.highLightElement(driver,   numerictextupperarrowclick);
			 numerictextupperarrowclick.click();
			 }
			 Thread.sleep(2000);
			 for (int i = 0; i < 5; i++) {
				 TestUtils.highLightElement(driver,   numerictextdownarrowclick);
				 numerictextdownarrowclick.click();
			 }
			Thread.sleep(2000);
			// wait.until(ExpectedConditions.visibilityOf( selectdropdown));
			 //selectdropdown.click();
			 //Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOf( clickinsidebox));
			 clickinsidebox.click();
			 Thread.sleep(2000);
			 clickinsidebox.clear();
			 Thread.sleep(2000);
			 clickinsidebox.sendKeys("080231859657");
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOf(clickinsidearea));
			 clickinsidearea.click();
			 Thread.sleep(2000);
			 clickinsidearea.sendKeys("Angular testing with selenium");
			 action.moveByOffset(-500, -50).click().build().perform();
			 Thread.sleep(2000);
			 clickonmenu.click();
			 Thread.sleep(2000);
			 clickonlocalization.click();
			 Thread.sleep(2000);
			 clickonspanish.click();
			 
			 Thread.sleep(90000);
			 
			
			 TestUtils.sendreportonemail();
			 Thread.sleep(90000);
			
			// Select list = new Select(selectdropdown);
			// list.selectByVisibleText("Large");
			// TestUtils.sendreportonemail();
			 
			// wait.until(ExpectedConditions.visibilityOf( numerictext));
			// numerictext.click();
			//numerictexttoentervalue.clear();
			// numerictexttoentervalue.sendKeys("12345");
			
			  //js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);"); 
			 // WebElement element1 = wait.until(ExpectedConditions.visibilityOf(WebFactory));
			 try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
		 return new Widget_Page();  
		 
	 }
     
	
	
	
	
	
	
	
	
	
	
}
