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

import uisparkster.TestBase.Testbase;

public class AppPage extends Testbase {
	@FindBy(xpath="//span[text()='AI']")
	@CacheLookup
	WebElement clickonAI;
	
  
@FindBy(xpath="//span[text()='Documents']")
@CacheLookup
WebElement clickonDOC;


@FindBy(xpath="//span[text()='CEP']")
@CacheLookup
WebElement clickonCep;

@FindBy(xpath="//span[text()='Functions']")
@CacheLookup
WebElement clickonFunction;


@FindBy(xpath="//span[text()='Walkthough']")
@CacheLookup
WebElement clickonWalkthrough;


@FindBy(xpath="//span[text()='Integration']")
@CacheLookup
WebElement clickonIntegration;


@FindBy(xpath="//span[text()='Smart Transactions']")
@CacheLookup
WebElement clickonSmart;


@FindBy(xpath="//span[text()='Workflow']")
@CacheLookup
WebElement clickonWorkflow;


@FindBy(xpath="//span[text()='Market Place']")
@CacheLookup
WebElement clickonmarket;

@FindBy(xpath="//span[text()='Archived']")
@CacheLookup
WebElement clickonArchive;

@FindBy(xpath="//span[text()='Block Factory']")
@CacheLookup
WebElement clickonfactory;

@FindBy(xpath="/html/body/app-root/div[2]/div/div/app-home/p[2]/a")
WebElement navigate;




public AppPage()
{
	
	
	PageFactory.initElements(driver, this);
	
	
	
	
}

public AppPage clickcheck() throws InterruptedException, EmailException 
{
	 
	 WebDriverWait wait = new WebDriverWait(driver, 95);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(clickonAI));
		


      // JavascriptExecutor js = (JavascriptExecutor)driver;
      
		
		
		 
		 Actions action = new Actions(driver);
		
		 js.executeScript("arguments[0].click();", clickonAI);
		 action.moveToElement(element).click().build().perform();
		 TestUtils.highLightElement(driver, clickonAI );
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOf(clickonDOC));
		 TestUtils.highLightElement(driver,  clickonDOC);
		 clickonDOC.click();
		 Thread.sleep(3000);
		 
		 wait.until(ExpectedConditions.visibilityOf( clickonCep));
		 TestUtils.highLightElement(driver,   clickonCep);
		 clickonCep.click();
		 Thread.sleep(3000);

		 wait.until(ExpectedConditions.visibilityOf(clickonFunction));
		 TestUtils.highLightElement(driver,  clickonFunction);
		 clickonFunction.click();
		 Thread.sleep(3000);

		 wait.until(ExpectedConditions.visibilityOf( clickonWalkthrough));
		 TestUtils.highLightElement(driver,   clickonWalkthrough);
		 clickonWalkthrough.click();
		 Thread.sleep(3000);

		 wait.until(ExpectedConditions.visibilityOf(clickonIntegration));
		 TestUtils.highLightElement(driver,  clickonIntegration);
		 clickonIntegration.click();
		 Thread.sleep(3000);

		 wait.until(ExpectedConditions.visibilityOf( clickonSmart));
		 TestUtils.highLightElement(driver,   clickonSmart);
		 clickonSmart.click();
		 Thread.sleep(3000);
		 
		 wait.until(ExpectedConditions.visibilityOf( clickonWorkflow));
		 TestUtils.highLightElement(driver,   clickonWorkflow);
		 clickonWorkflow.click();
		 Thread.sleep(3000);
		 

		 wait.until(ExpectedConditions.visibilityOf( clickonmarket));
		 TestUtils.highLightElement(driver,   clickonmarket);
		 clickonmarket.click();
		 Thread.sleep(3000);
		 
		 wait.until(ExpectedConditions.visibilityOf(clickonArchive));
		 TestUtils.highLightElement(driver,  clickonArchive);
		 clickonArchive.click();
		 Thread.sleep(3000);
		 
		 wait.until(ExpectedConditions.visibilityOf(clickonfactory));
		 TestUtils.highLightElement(driver,  clickonfactory);
		 clickonfactory.click();
		 Thread.sleep(3000);
		 navigate.click();
		 

		 try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
		 return new AppPage(); 





}

}
