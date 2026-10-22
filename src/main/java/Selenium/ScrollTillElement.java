package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollTillElement {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		WebElement w=driver.findElement(By.xpath("//i[@class='nav-icon fas fa-sliders-h']/following::p[1]"));
		
		//scroll Down up to praticular Element 
		
		
		
		j.executeScript("arguments[0].scrollIntoView(true);", w);
		
		Thread.sleep(2000);
		w.click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
