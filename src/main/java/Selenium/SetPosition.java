package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a script for the following: 
∙ Open the browser 
∙ Delete all cookies 
∙ Set size of the window 
∙ Set position of the window 
∙ Maximize the window 
*/
public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//Delete all cookies
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//Set Size of the window
		
		//Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(2000);
		
		//Set Position of windows
		
		//Point p=new Point(250,250);
		driver.manage().window().setPosition(new Point(250, 250));
		Thread.sleep(2000);
		//Maximize Window
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Execute");
		driver.close();//close the current browser
		
		
		
		
	
		
		

	}

}
