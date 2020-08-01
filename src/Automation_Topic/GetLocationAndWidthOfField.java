package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class GetLocationAndWidthOfField 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		int x1 = driver.findElement(By.name("username")).getLocation().getX();
		int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(x1);
		System.out.println(x2);
		if(x1==x2)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		int w1 = driver.findElement(By.name("username")).getSize().getWidth();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println(w1);
		System.out.println(w2);
		if(w1==w2)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		driver.quit();

	}

}
