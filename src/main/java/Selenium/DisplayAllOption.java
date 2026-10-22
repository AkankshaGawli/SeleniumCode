package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//To print all the options:  working 
public class DisplayAllOption {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropdown=driver.findElement(By.name("coffee"));
		
		Select s=new Select(dropdown);
		List<WebElement> options=s.getOptions();
		
		for(WebElement options1:options)
		{
			//get all the text
			System.out.println("Text : " + options1.getText());
			//to get all the option
			System.out.println("DropDown Option are :"+options1.getAttribute("value"));
		}
		
Thread.sleep(1000);
driver.quit();
	}

}
