package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToPrintFontFamilyOfField 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		
		WebElement username = driver.findElement(By.name("username"));
		String fontsize = username.getCssValue("font-size");
		System.out.println("Font Size = "+fontsize);
		
		String fontcolor = username.getCssValue("color");
		System.out.println("Font Color = "+fontcolor);
		
		String fontType = username.getCssValue("font-family");
		System.out.println("Font Type = "+fontType);
		
		driver.quit();
	}
	

}
