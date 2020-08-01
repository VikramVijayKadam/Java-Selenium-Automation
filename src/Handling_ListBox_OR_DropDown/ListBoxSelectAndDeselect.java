package Handling_ListBox_OR_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Base.Base_Class;

public class ListBoxSelectAndDeselect 
{

	public static void main(String[] args) 
	{

		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage15.html");
		
		WebElement listbox = driver.findElement(By.id("month"));
		
		Select sel=new Select(listbox);
		sel.selectByIndex(1);
		sel.selectByValue("m");
		sel.selectByVisibleText("APR");
		
		
		if(sel.isMultiple())
		{
			sel.deselectByIndex(1);
			sel.deselectByValue("m");
			sel.deselectByVisibleText("APR");
			sel.deselectAll();
		}
		else
		{
			System.out.println("Sorry not Possible");
		}
		
		driver.quit();

	}

}
