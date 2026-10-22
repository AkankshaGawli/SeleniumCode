package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayvalueFromTable {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/web-table.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-table']/following::p[1]")).click();
		Thread.sleep(2000);
		List<WebElement>tRows=driver.findElements(By.tagName("tr"));
		for(WebElement rows:tRows)
		{
			List<WebElement>tData=driver.findElements(By.tagName("td"));
			for(WebElement data:tData)
			{
				System.out.println("Table Data:"+data.getText());
			}
		}
		driver.quit();
		
	}

}
