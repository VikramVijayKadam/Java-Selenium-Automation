 package Handling_Multiple_Windows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class NaukriWindowHandle4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueChrome();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		System.out.println("Before Switching Title is = "+driver.getTitle());
		
		Thread.sleep(3000);
	    
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String tabID : allWindows)
		{
			System.out.println(tabID);
		}
		
		System.out.println("After For-each loop");
		
		ArrayList <String> tabs=new ArrayList<> (allWindows);
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent_window);
		Thread.sleep(5000);
	  //or
	 // driver.switchTo().window(tabs.get(0));
		System.out.println("Title of Current window is "+driver.getTitle());
		
		driver.quit();
		
	}

}
