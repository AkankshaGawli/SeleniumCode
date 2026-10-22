package Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsOk {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("venkat123");
		
TakesScreenshot ts=(TakesScreenshot) driver;
		
		// Capture screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		// Destination where screenshot will be saved
		File destination=new File("./Screenshots/Ale.png");
		
		//to get path 
		//System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
		
		// Create folder if needed
		
		//destination.getParentFile().mkdirs();
		
		// Copy screenshot
		Files.copy(source.toPath(), destination.toPath());
		driver.quit();

	}

}
