package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTableValue {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-table']/following::p[1]")).click();
		Thread.sleep(2000);
		
	String s=driver.findElement(By.xpath("//td[@data-testid='webtable-cell-name-1' and text()='John Doe']")).getText();
		System.out.println("Value: "+s);
		driver.quit();
	}

}
