package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToVerifyWhetherButtonIsEnabledOrNot 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		
		WebElement Button =driver.findElement(By.xpath("//a[@id='loginButton']/div"));
		
		
		//boolean a=Button.isEnabled
		
		if(Button.isEnabled())
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is not Enabled");

			
		}
		
		driver.quit();
	}
	

}
