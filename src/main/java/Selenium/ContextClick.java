package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args)throws InterruptedException, AWTException,IOException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Thread.sleep(2000);
		
		a.contextClick(gmail).perform();
		Thread.sleep(2000);
		
		//Robot Class 
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Convert WebDriver into TakesScreenshot
TakesScreenshot ts=(TakesScreenshot) driver;
		
		// Capture screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		// Destination where screenshot will be saved
		File destination=new File("./Screenshots/ContextClick.png");
		
		//to get path 
		//System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
		
		// Create folder if needed
		
		//destination.getParentFile().mkdirs();
		
		// Copy screenshot
		Files.copy(source.toPath(), destination.toPath());
		driver.quit();
		
		
	}
	

}
