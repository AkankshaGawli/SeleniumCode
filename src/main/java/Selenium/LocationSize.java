package Selenium;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationSize {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactin.com/HotelApp/index.php");
		
		WebElement x=driver.findElement(By.id("username"));
		
		//WebElement x1=(WebElement) driver.manage().window().getSize();
	
		//get Size 
		
		Dimension dm=x.getSize();
		 System.out.println("Width: " + dm.getWidth());
	        
		 System.out.println("Height: " + dm.getHeight());
		 
		 //Location
		 
		 Point P=x.getLocation();
		 System.out.println("X Coordinate: "+P.getX());
	     System.out.println("Y Coordinate: "+P.getY());
	        
	        driver.quit();
		
		
		
		

	}

}
