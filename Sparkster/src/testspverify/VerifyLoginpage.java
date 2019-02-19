package testspverify;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import com.testsp.LoginHPage;

	public class VerifyLoginpage 
	     
	        
	{ 
		@Test
		public void VerifyValidLogin()

		{
			
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SPARKSTER\\New folder\\chromedriver.exe");
		driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);       
		        driver.get("http://127.0.0.1:5500/uitesting/index.html");
		        
		        LoginHPage lg=new LoginHPage();
		        lg.typepassword();
		        lg.typepassword();
		        lg.clickloginbutton();
		        
		}	      

}
