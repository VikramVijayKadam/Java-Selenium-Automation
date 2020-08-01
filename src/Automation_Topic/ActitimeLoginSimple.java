package Automation_Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base_Class;

public class ActitimeLoginSimple 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		
		String eLoginTitle = "actiTIME - Login";
		String aLoginTitle=driver.getTitle();
		System.out.println(driver.getTitle());
		if(eLoginTitle.equals(aLoginTitle))
		{
			System.out.println("PASS:LoginPage is displayed");
		}
		else
		{
			System.out.println("FAIL:LoginPage is not Displayed");
		}
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
        Thread.sleep(4000);
			
        String eHomePage = "actiTIME - Enter Time-Track";
        String aHomePage=driver.getTitle();
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        if(eHomePage.equals(aHomePage))
        {
        	System.out.println("PASS:HomePage is Displayed");
        }
        else
        {
        	System.out.println("FAIL:HomePage is not Displayed");
        }
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).sendKeys(Keys.ENTER);//we can use instead of .click();
		Thread.sleep(4000);
		driver.quit();

	}

}
