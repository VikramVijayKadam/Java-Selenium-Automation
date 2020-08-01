package Handling_Multiple_Windows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class GoogleWindowHandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueChrome();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F_%2Fchrome%2Fnewtab%3Fei%3DAeDPWY7FCIHdvASk3IuQCQ%26espv%3D2%26yv%3D2&hl=en");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window=driver.getWindowHandle();
		System.out.println("Before Switching Title is = "+driver.getTitle());
		
		Thread.sleep(3000);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;	
	    jse.executeScript("window.scrollBy(0,400)", "");
	    Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String child_window=i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				Thread.sleep(10000);
				
				System.out.println("After Switching Title is ="+driver.getTitle());
				
				driver.close();
			}
				
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("Back to Parent Window ="+driver.getTitle());
		
		driver.quit();
		

	}

}
