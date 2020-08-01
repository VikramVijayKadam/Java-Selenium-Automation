package Automation_Topic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToPrintContainsOfTableInTableFormat 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage14.html");
		
		List<WebElement> allTR = driver.findElements(By.xpath("//tr"));
		for(int i=0;i<allTR.size();i++)
		{
			WebElement tr = allTR.get(i);
			List<WebElement> allTD = tr.findElements(By.xpath("//td"));
			for(int j=0;j<allTD.size();j++)
			{
				WebElement td = allTD.get(j);
				String text = td.getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		
		driver.quit();
		

	}

}
