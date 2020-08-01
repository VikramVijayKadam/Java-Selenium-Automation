package Handling_Multiple_Windows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class NaukriWindowHandle2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueChrome();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window=driver.getWindowHandle();
		System.out.println("Before Switching Title is = "+driver.getTitle());
		
		Thread.sleep(3000);
	    
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> i1=allWindows.iterator();
		
		while(i1.hasNext())
		{
			String child_window=i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				Thread.sleep(10000);
				
				System.out.println("After Switching Title is = "+driver.getTitle());
				
				driver.close();
			}
				
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("Back to Parent Window     = "+driver.getTitle());
		
		driver.quit();
		

	}

}
