package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base_Class;

public class ActitimeLoginWithExplicitWaitCondition 
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
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.titleContains("Login"));
		ActitimeLoginWithExplicitWaitCondition.verifyTitle(driver, "actiTIME - Login");
		
	    
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		wait.until(ExpectedConditions.titleContains("Enter"));
        ActitimeLoginWithExplicitWaitCondition.verifyTitle(driver, "actiTIME - Enter Time-Track");
        
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		ActitimeLoginWithExplicitWaitCondition.verifyTitle(driver, "actiTIME - Login");
		Thread.sleep(4000);
		driver.quit();

	}

}
