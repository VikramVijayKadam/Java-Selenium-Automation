package Automation_Topic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base_Class;

public class ScreenshotWithoutUsingRobot 
{

	public static void main(String[] args) throws IOException 
	{

		Base_Class.ConfigueChrome();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//http://localhost:82/login.do
		
		File v= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		
		driver.quit();
		File d=new File("D:/vikram1.png");
		FileUtils.copyFile(v, d);
		
	}
	
}


