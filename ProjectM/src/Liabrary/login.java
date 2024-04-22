package Liabrary;

import java.sql.Driver;

import org.openqa.selenium.By;

import AppUtils.lunchApp;

public class login extends lunchApp

{

	public static void Login(String id, String password) 
	{
		
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(id);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		
	}
	
	public  boolean isNameDisplay() 
	{
		
		if(driver.findElement(By.linkText("Jobs")).isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	public boolean isErrorMsgDisplyed() 
	{
		String ErrorMsg = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[1]")).getText();
		
if(ErrorMsg.toLowerCase().contains("invalid"))
{
	
	return true;
}
else
{
	return false;
	
}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
