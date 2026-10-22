package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// select checkbox an display it's value  // need to check 
public class CheckBoxForLoop {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaautomationlabs.com/testing/checkbox.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[@class='nav-link active']//p[1]")).click();
		Thread.sleep(1000);
		
		/*List<WebElement> x= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<x.size();i++)
		{
			if(x.get(i).getAttribute("value").equals("Checkbox 1")||(x.get(i)).getAttribute("value").equals("Enable Checkbox 1"))
			{
				x.get(i).click();
			}
			if(x.get(i).isSelected())
			{
				System.out.println("Selected Values are:"+x.get(i).getAttribute("value"));
			}
		}*/
		
		List<WebElement> checkboxes =
		        driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkbox : checkboxes) {

		    String value = checkbox.getAttribute("value");

		    if (value.equals("Checkbox 1") ||
		        value.equals("Enable Checkbox 1")) {

		        if (!checkbox.isSelected()) {
		            checkbox.click();
		        }

		        System.out.println("Selected Value: " + value);
		    }
		}
Thread.sleep(5000);
driver.quit();
	}

}
