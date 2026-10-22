package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.adactin.com/HotelApp/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement x=driver.findElement(By.id("username"));
		x.sendKeys("vengatram");
		
		WebElement x1=driver.findElement(By.id("password"));
		x.sendKeys(Keys.CONTROL,"ac");
		x1.sendKeys(Keys.CONTROL,"v");
		
		driver.findElements(By.id("login"));
		driver.close();
	}

}
