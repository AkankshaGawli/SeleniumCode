package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// select using list to select all checkbox 
public class CheckBoxes {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/checkbox.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class='nav-link active']//p[1]")).click();
		Thread.sleep(1000);
		
		List<WebElement> x= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement y:x) 
		{
			y.click();
			Thread.sleep(3000);
			System.out.println("check box values  are :"+y.getAttribute("value"));
		}
			driver.close();
		
	}

}
