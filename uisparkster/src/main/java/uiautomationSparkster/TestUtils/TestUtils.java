package uiautomationSparkster.TestUtils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import uisparkster.TestBase.Testbase;



public class TestUtils extends Testbase{
	
	

	
	public static long PAGE_LOAD_TIMEOUT = 95;
	public static long IMPLICIT_WAIT = 95;
	public static long   setScriptTimeout = 95;
	//for reusable doc fetch
	public static String  date1;
	 
	// public static String docname=null ;
	// public static String docname1 =null ;
	  public static String data=null;
	  
	  public static String text = null ;
	
	 
	
	
	 
	//public static String TESTDATA_SHEET_PATH = "/Users/qa/testdata/TestData.xlsx";
	
	//static Workbook book;
	//static Sheet sheet;
	
	public static  void switchToFrame()
	{
		driver.switchTo().frame("walkthroughVid");
	}
	

	public static void takeScreenshotAtEndOfTest(WebDriver driver , String screenshotname) throws IOException 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File( "./screenshots/" + screenshotname + ".png"));
		
	}

	
	public static void highLightElement(WebDriver driver, WebElement element)
	{
		
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	
	
	
	
	
	
	
	   public static void sendreportonemail() throws EmailException 
	   
	   {
		   System.out.println("email started"); 
		   
		   EmailAttachment attachment = new EmailAttachment();
		   
		   attachment.setPath("C:/seelniumautomation/uisparkster/test-output/emailable-report.html");
		   attachment.setDisposition(EmailAttachment.ATTACHMENT);
		   attachment.setDescription("Angular Selenium Report ");
		   attachment.setName("Sparkster");

		   
		   MultiPartEmail email = new MultiPartEmail();
		   
		   email.setHostName("smtp.googlemail.com");
		    //email.setSmtpPort(587);
		   email.setSmtpPort(465);
		   email.setAuthenticator(new DefaultAuthenticator("abhijitpatel110@gmail.com", "patel21."));
		   email.setSSLOnConnect(true);
		   email.addTo("swarup.roul23@syncoms.com", "Swarup");
		   
		   email.addCc("abhijit.patel@syncoms.com", "sds");
		   //email.addCc("amit.k@syncoms.com", "amit kumar");
		   
		   email.setFrom("abhijitpatel110@gmail.com","Abhijit Patel");
		   email.setSubject("Selenium Report");
		   email.setMsg("Here is the screenshot picture of saved document.  Thanks : abhijit patel  ");

		   // add the attachment
		  email.attach(attachment);
		   
		   email.send();
		
		
		   System.out.println("email sent");
	}
	   
	   
	 public static String changeDOCName(String name , WebElement element )
	 {
		 
		
	     
	    // DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	     
		 DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
	     Date date = new Date();
	     
	     
	     String date1= dateFormat.format(date);
	     
	     
	    
	     element.sendKeys(name+date1);
	    
	     
		 return date1;
	     
	     //return docname;
		 
	 }

  public static  void retrivedocname(  String name ) 
  
  {
	
	  driver.findElement(By.partialLinkText(name+TestUtils.date1));
	}
	 
	 
	  
	   
 
	  
  
	
public static String pastedocname(WebElement element, String value)
{
	
	//String  docname1 = Keys.chord(Keys.CONTROL , "v");
	
    Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	//Transferable clipData = clipboard.getContents(value); 
	
	//copydocname( value);
	//element.click();
	//return clipData;
	
	
	//System.out.println(docname1);

	 Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
    try {
        if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            String text = (String)t.getTransferData(DataFlavor.stringFlavor);
          
            return text;
        }
    } catch (UnsupportedFlavorException e) {
    } catch (IOException e) {}
    return null; 
	
	
	
	
	// return docname1 ;
}



public static void waitforwebdriver(WebElement element)
{

	
	 WebDriverWait wait = new WebDriverWait(driver, 20);

	 WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(element));
	
	
	
}






}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


