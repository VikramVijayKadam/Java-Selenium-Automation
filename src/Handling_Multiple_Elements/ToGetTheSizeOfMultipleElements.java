package Handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToGetTheSizeOfMultipleElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage11.html");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int linkCount = allLinks.size();
		System.out.println(linkCount);
		
		WebElement link = allLinks.get(0);
		link.click();
		
		Thread.sleep(10000);
		
		
		driver.quit();
	}

}
