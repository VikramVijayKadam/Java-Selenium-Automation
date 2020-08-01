package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class ExampleForRelativeXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{

		Base_Class.ConfigueChrome();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage01.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("VIKRAM VIJAY KADAM");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[2]")).sendKeys("RAKSHITHA VIJAY KADAM");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input")).sendKeys("RAKSHITHA");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).sendKeys("null");
		Thread.sleep(2000);
		
		driver.close();

	}

}
