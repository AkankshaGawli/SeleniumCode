package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//title of page 
//Current Url 


public class TitleURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url 
		driver.get("https://www.google.com/");

		//get the title of current URL
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		
		//get current URl of browser
		
		String url=driver.getCurrentUrl();
		System.out.println("Current Url:"+url);
		
		Thread.sleep(2000);
		driver.quit();//quite close all the instance of browser
	}

}
