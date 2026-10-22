package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> x=driver.findElements(By.tagName("a"));
		
		//to find the count of link
		System.out.println("Count of link :"+x.size());
		
		//to print all link
		
		for(WebElement x1:x)
		{
		System.out.println("Links are :"+x1.getAttribute("href"));	

	    }
driver.close();
}
	}

