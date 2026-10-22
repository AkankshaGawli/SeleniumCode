package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDown {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		
		//WebElement w=driver.findElement(By.xpath("//i[@class='nav-icon fas fa-sliders-h']"));
		WebElement body = driver.findElement(By.tagName("body"));
		
		body.sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
