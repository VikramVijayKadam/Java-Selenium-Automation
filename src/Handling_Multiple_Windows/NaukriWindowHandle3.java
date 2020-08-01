package Handling_Multiple_Windows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class NaukriWindowHandle3 
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
		
		System.out.println("********-After For-each loop-***********");
		
		ArrayList <String> tabs=new ArrayList<> (allWindows);
		System.out.println("Parent ID "+tabs.get(0));
		System.out.println("Child 01  "+tabs.get(1));
		System.out.println("Child 02  "+tabs.get(2));
		
		driver.quit();

		
	}

}
