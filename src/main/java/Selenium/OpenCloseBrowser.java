package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Write a Script to open and close the browser based on user input 

public class OpenCloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Browser:");
		String browser=sc.nextLine();
		
		WebDriver driver=null;
		
		if(browser.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else 
		{
			System.out.println("Invalid Input");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
