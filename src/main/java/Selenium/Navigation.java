package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open Browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//Delete all cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//Maximize Window 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//navigate to other url
		
		driver.navigate().to("https://www.facebook.com/");
		String title =driver.getTitle();
		System.out.println("Title:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("Current Url:"+url);
		
		Thread.sleep(2000);
		
		//navigate to previous page 
		
		driver.navigate().back();
		String t1=driver.getTitle();
		System.out.println("Title:"+t1);
		String url1=driver.getCurrentUrl();
		System.out.println("Current URL:"+url1);
		Thread.sleep(1000);
		
		//navigate to next page
		driver.navigate().forward();
		String t2=driver.getTitle();
		System.out.println("Title:"+t2);
		String url2=driver.getCurrentUrl();
		System.out.println("Current URL:"+url2);
		Thread.sleep(1000);
		
		//refresh page
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
		
		
		

	}

}
