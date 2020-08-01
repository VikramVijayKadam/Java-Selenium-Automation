package Automation_Topic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToPrintContainsOfTable 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage13.html");
		
		List<WebElement> allTB = driver.findElements(By.xpath("//td"));
		for(int i=0;i<allTB.size();i++)
		{
			String t = allTB.get(i).getText();
			System.out.println(t);
		}
		
		driver.quit();
		

	}

}
