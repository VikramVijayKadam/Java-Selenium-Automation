package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ToVerifyWhetherCheckboxIsSelectedOrNot 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		
		WebElement chbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		chbox.click();
		
		//boolean a=chbox.isSelected
		
		if(chbox.isSelected())
		{
			System.out.println("CheckBox is Selected");
		}
		else
		{
			System.out.println("CheckBox is Not Selected");

			
		}
		
		driver.quit();
	}
	

}
