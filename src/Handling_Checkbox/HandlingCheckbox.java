package Handling_Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class HandlingCheckbox 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage12.html");
		
		String xp="//input[@type='checkbox']";
		List<WebElement> allCheckBox = driver.findElements(By.xpath(xp));
		
		
		//using simple for-loop
		for(int i=0;i<allCheckBox.size();i++)
		{
			allCheckBox.get(i).click();
		}
		
		//using for-each loop
		for(WebElement ch:allCheckBox)
		{
			ch.click();
		}
		
		//select all the checkbox from reverse order
		for(int i=allCheckBox.size()-1;i<allCheckBox.size();i--)
		{
			allCheckBox.get(i).click();
		}
		
		//select all alternative checkbox
		for(int i=0;i<allCheckBox.size();i+=2)
		{
			allCheckBox.get(i).click();
		}
		
		//select 1st and last checkbox
		for(int i=0;i<allCheckBox.size();i++)
		{
			if (i==0 || i==allCheckBox.size()-1)
			{
			allCheckBox.get(i).click();
			}
		}
		
		driver.quit();

	}

}
