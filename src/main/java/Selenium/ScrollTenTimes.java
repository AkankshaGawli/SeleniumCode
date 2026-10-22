package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a Script to scroll down and scroll up the window upto 50px for 10 times
public class ScrollTenTimes {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		//scroll down
		
		for(int i=0;i<10;i++) {
			j.executeScript("window.scrollBy(0,50)");
			Thread.sleep(500);
		}
		
		Thread.sleep(3000);
		//Scroll Up
		
		for(int i=0;i<10;i++) 
		{
			j.executeScript("window.scrollBy(0,-50)");
			Thread.sleep(500);
		}
driver.quit();
	}

}
