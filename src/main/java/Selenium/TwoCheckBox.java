package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoCheckBox {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/checkbox.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//multichk1
		driver.findElement(By.xpath("//a[@class='nav-link active']//p[1]")).click();
		Thread.sleep(1000);
		
		
		List<WebElement> x= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		System.out.println("Total Checkboxes : " + x.size());

        for(int i = 0; i < 2; i++) {
            x.get(i).click();
            System.out.println("Checkbox " + (i + 1) + " clicked");
        }
		
		driver.close();
	}
}
