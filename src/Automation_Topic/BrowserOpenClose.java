package Automation_Topic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Base.Base_Class;

public class BrowserOpenClose 
{

	public static void main(String[] args) 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.close();
		
		Base_Class.ConfigueChrome();
		WebDriver driver1=new ChromeDriver();
		driver1.close();
		

	}

}
