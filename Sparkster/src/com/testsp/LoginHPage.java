package com.testsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHPage {
	
	WebDriver driver;
	
	By username=By.name("email");
	By password=By.name("password");
	By loginButton=By.xpath("//button[@type='submit']");
	
	public void LoginPage(WebDriver driver) 
	{
		
		this.driver=driver;
		}
	public void typeusername() 
	{
		driver.findElement(username).sendKeys("abjeet.dhiraj@syncoms.com");
		
	}
	public void typepassword() 
	{
		driver.findElement(password).sendKeys("syncoms");
		
		
	}
	
	public void clickloginbutton() 
	{
		driver.findElement(loginButton).click();
	}
	}




