package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToPortal {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		
		String s=driver.findElement(By.id("username")).getAttribute("value");
		String s1=driver.findElement(By.id("password")).getAttribute("value");
		
		System.out.println("UserName:"+s);
		System.out.println("Password:"+s1);
		
		driver.findElement(By.id("login")).click();
		driver.close();
		
		
		
		

	}

}
