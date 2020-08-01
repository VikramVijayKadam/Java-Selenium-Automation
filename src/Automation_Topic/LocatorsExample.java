package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class LocatorsExample 
{

	public static void main(String[] args) throws InterruptedException 
	{

		Base_Class.ConfigueChrome();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage02.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("a")).click();
        Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Tag Name-Pass");
		
		driver.findElement(By.id("a1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("ID-Pass");
		
		driver.findElement(By.name("n1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Name-Pass");
		
		driver.findElement(By.className("c1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Class Name-Pass");
		
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("LinkText-Pass");
		
		driver.findElement(By.partialLinkText("oogle")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("PartialLinkText-Pass");
		
		// syntax-{{{---tag[Attribute Name='Attribute Value']---}}}
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("CSS selector-Pass");
		
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Xpath-Pass");
		
		driver.close();

	}

}
