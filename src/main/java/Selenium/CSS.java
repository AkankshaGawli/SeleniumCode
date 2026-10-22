package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/index.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement x=driver.findElement(By.xpath("//td[@class='login_register']"));
		
		System.out.println("Font-Size: "+x.getCssValue("font-size"));
		System.out.println("Color: "+x.getCssValue("color"));
		System.out.println("Font-Weight : "+x.getCssValue("font-weight"));
		System.out.println("Font-Family: "+x.getCssValue("font-family"));
		System.out.println("Background: "+x.getCssValue("background"));
		driver.close();

	}

}
