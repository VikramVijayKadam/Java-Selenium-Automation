package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToGetTheNoOfLinksPresentOnThePage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage11.html");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int linkCount = allLinks.size();
		System.out.println("No of Links = "+linkCount);
		
		for(int i=0;i<allLinks.size();i++)
		{
			String link=allLinks.get(i).getText();
			System.out.println(link);
		}
		
		
		
		driver.quit();
	}

}
