package Handling_ListBox_OR_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Base.Base_Class;

public class ToPrintContentOfListboxInSortedOrder 
{

	public static void main(String[] args) 
	{

		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage15.html");
		
		WebElement listbox = driver.findElement(By.id("month"));
		
		Select sel=new Select(listbox);
		
		List<WebElement> allOptions = sel.getOptions();
		
		int count = allOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(allOptions.get(i).getText());
			sel.selectByIndex(i);
		}
		driver.quit();

	}

}
