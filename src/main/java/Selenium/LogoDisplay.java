package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplay {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		boolean logo=driver.findElement(By.xpath("//span[contains(text(),'Log in to Facebook')]")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("Logo is visible");
		}
		else 
		{
			System.out.println("Logo not visible");
		}
		driver.close();
	
	
	}

}
