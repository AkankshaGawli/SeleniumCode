package Selenium;

import java.awt.Window;
import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a Script to scroll down and scroll up the window using pixel
public class ScrollUpDown {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		//to scroll Down
		j.executeScript("window.scrollBy(0,800)");//Here widow represents current window
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-500)");
	
driver.quit();
	}


}
