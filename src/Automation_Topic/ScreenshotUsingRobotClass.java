package Automation_Topic;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base_Class;

public class ScreenshotUsingRobotClass 
{

	public static void main(String[] args) throws Exception 
	{

		Base_Class.ConfigueChrome();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Robot r=new Robot();
		Rectangle rect=new Rectangle(0,0,1100,800);
		BufferedImage img=r.createScreenCapture(rect);
		FileOutputStream f=new FileOutputStream("D:/vi.png");
		ImageIO.write(img, "png", f);
		
		
	   
		}
	
}


