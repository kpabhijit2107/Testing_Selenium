package uiautomationSparkster.angulartest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uiautomationSparkster.TestUtils.TestUtils;
import uisparkster.TestBase.Testbase;

public class Loginpage  extends Testbase{

	
		
		
		
		//@FindBy(xpath="/html/body/header/div[2]/div/nav/ul/li/a/cufon")
		//WebElement HomeLogin;
		
		//clicking for entering Email-id
		@FindBy(xpath="//input[@id=\"nemail\"]")
		WebElement Loginemail;
		
		//clicking area for password
		@FindBy(xpath=" //input[@id=\"npassword\"]")
		WebElement Loginpassword;
		
		
		//clicking on submit
		@FindBy(xpath="//input[@id='signin']")
		WebElement Loginsubmit;
		
		//invalidlogin message 
		
		@FindBy(xpath="//*[@id=\"page-top\"]/header/div/div/div/div/div[2] ")
		WebElement LoginInvalidmsg;
		
		@FindBy(xpath="/html/body/app-root/div[2]/div/div/app-home/p[2]/a")
		WebElement navigate;
		
		
		
		
		public Loginpage() 
		{
			
			PageFactory.initElements(driver, this);
			
		}


		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}

		
		public HomePage logintoapplication(String username, String password ) throws InterruptedException 
		{
			
			//HomeLogin.click();
			//TestUtils.highLightElement(driver, HomeLogin );
			
			Loginemail.sendKeys( prop.getProperty("username"));
			TestUtils.highLightElement(driver, Loginemail );
			
			Loginpassword.sendKeys(prop.getProperty("password"));
			TestUtils.highLightElement(driver, Loginpassword );
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Loginsubmit.click();
			//TestUtils.highLightElement(driver, Loginsubmit );
			//Thread.sleep(4000);
			//navigate.click();
			return new HomePage();
			
				
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
