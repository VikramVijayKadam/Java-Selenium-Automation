package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class PrintTheValueInTheTextbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage10_01.html");
		
		WebElement t1 = driver.findElement(By.id("t1"));
		
		String v = t1.getAttribute("value");
		
		System.out.println(v.length());
		
		for(int i=0;i<v.length();i++)
		{
			System.out.println(v.charAt(i));
			Thread.sleep(500);
			t1.sendKeys(Keys.BACK_SPACE);
		}

	}

}
