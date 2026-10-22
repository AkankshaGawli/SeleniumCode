package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//new Register
public class NewRegister {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//td[@class='login_register']//a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class='login_title']/span[1]")).isDisplayed();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Akanksha1997");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pune@2026");
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys("Pune@2026");
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("Akanksha Gawli");
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys("nehagawli@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='tnc_box']")).click();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
