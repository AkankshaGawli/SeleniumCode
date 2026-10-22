package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//select one value from check box 
public class CheckBox {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qaautomationlabs.com/testing/checkbox.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='nav-link active']//p[1]")).click();
		Thread.sleep(1000);
		
		Boolean x= driver.findElement(By.xpath("//input[@id='myCheckbox']")).isEnabled();
		System.out.println("CheckBox is Enable"+x);
		
	WebElement x1=	driver.findElement(By.xpath("//input[@id='myCheckbox']"));
			x1.click();
			System.out.println("Checkbox which checked is : "+x1.getAttribute("value") );
	
		driver.close();
		

	}

}
