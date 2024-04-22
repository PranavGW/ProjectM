package AppUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchApp 
{
    public static WebDriver driver ;
    
	public static void Lunch(String url) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
	}
	
	public static void closeApp()
	{
		driver.close();
	}
	
	
}
