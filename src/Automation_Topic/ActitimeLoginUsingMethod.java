package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ActitimeLoginUsingMethod 
{
  public static void verifyTitle(WebDriver driver, String eTitle)
  {
	  String aTitle=driver.getTitle();
	  System.out.println("Expected:"+eTitle);
	  System.out.println("Actual:"+aTitle);
	  if(aTitle.equals(eTitle))
	  {
		  System.out.println("PASS:Expected Page is Displayed");
	  }
	  else
	  {
		  System.out.println("FAIL:Expected Page is not Displayed");
	  }
		  
	  
  }
	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");	
		ActitimeLoginUsingMethod.verifyTitle(driver, "actiTIME - Login");
	
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
        Thread.sleep(4000);
        ActitimeLoginUsingMethod.verifyTitle(driver, "actiTIME - Enter Time-Track");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		ActitimeLoginUsingMethod.verifyTitle(driver, "actiTIME - Login");
		Thread.sleep(4000);
		driver.quit();

	}

}
