package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToVerifyWhetherTextboxIsDisplayedOrNot 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		
		WebElement textbox = driver.findElement(By.name("username"));
		textbox.click();
		
		//boolean a=textbox.isDisplayed
		
		if(textbox.isDisplayed())
		{
			System.out.println("Textbox is Selected");
		}
		else
		{
			System.out.println("Textbox is Not Selected");

			
		}
		
		driver.quit();
	}
	

}
