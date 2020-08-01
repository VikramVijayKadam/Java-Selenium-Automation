package Handling_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class Demo01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Selenium");
		Thread.sleep(3000);
		String xp = "//div[@class='sbqs_c']";
		List<WebElement> a = driver.findElements(By.xpath(xp));
		int count=a.size();
		System.out.println(count);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).getText());
			
		}
		Thread.sleep(3000);
		for(WebElement b:a)
		{
			if(b.getText().equals("selenium framework"))
			{
				b.click();
				
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
