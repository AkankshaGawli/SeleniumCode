package Selenium;

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
//perform drag and drop action without using dragAndDrop()
public class DragDrop {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement des=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		Thread.sleep(2000);
		a.clickAndHold(source).moveToElement(des).release(des).perform();
		
		Thread.sleep(2000);
		
TakesScreenshot ts=(TakesScreenshot) driver;
		
		// Capture screenshot
		File source1=ts.getScreenshotAs(OutputType.FILE);
		
		// Destination where screenshot will be saved
		File destination=new File("./Screenshots/DragandDrop.png");
		
		// Create folder if needed
		destination.getParentFile().mkdirs();
		
		// Copy screenshot
		Files.copy(source1.toPath(), destination.toPath());
		
		
		driver.quit();
		
		
		
	
		

	}

}
