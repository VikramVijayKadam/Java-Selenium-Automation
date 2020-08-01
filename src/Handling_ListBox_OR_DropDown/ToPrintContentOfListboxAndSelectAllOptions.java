package Handling_ListBox_OR_DropDown;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Base.Base_Class;

public class ToPrintContentOfListboxAndSelectAllOptions 
{

	public static void main(String[] args)
	{
        System.out.print("Enter the Text To Search?: ");
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        String Text=sc.next();
        System.out.println("Searching........");
		Base_Class.ConfigueFirefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/JAVA/GENERAL/Java_Selenium_Automation/Automation_HTML_Pages/DemoPage15.html");
		
		WebElement listbox = driver.findElement(By.id("month"));
		Select sel=new Select(listbox);
		int found=0;
		
		List<WebElement> allOptions = sel.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			if(text.equals(Text))
				found++;
			
		}
			if(found==0)
			{
				System.out.println("Option is not found");
			}
			else if(found==1)
			{
				System.out.println("Option is Present");
			}
			else
			{
				System.out.println("Option is duplicate: count is:"+found);
			}
		
		driver.quit();
	}
	
}
