package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class Keys_importOrgOpenqaSeleniumKeys 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage10_01.html");
		
		driver.findElement(By.xpath("html/body/input[1]")).sendKeys(Keys.CONTROL+"ac");//SelectAll & Copy
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys(Keys.CONTROL+"v");//paste
		Thread.sleep(4000);		
		
		
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);//SelectAll & Delete
		Thread.sleep(4000);	
		driver.findElement(By.id("t1")).sendKeys("VIKRAM");
		
		Thread.sleep(4000);	
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL+"a");//SelectAll 
		driver.findElement(By.id("t1")).sendKeys(Keys.BACK_SPACE);//BackSpace
		Thread.sleep(4000);	
		driver.findElement(By.id("t1")).sendKeys("RAKSHITHA");
		
		Thread.sleep(4000);	
		driver.findElement(By.id("t1")).sendKeys(Keys.HOME+" "+Keys.DELETE);//move cursor to starting letter & Delete
		Thread.sleep(4000);	
		driver.findElement(By.id("t1")).sendKeys("VIKRAM VIJAY KADAM");
		Thread.sleep(4000);	
		
		driver.quit();

	}

}
