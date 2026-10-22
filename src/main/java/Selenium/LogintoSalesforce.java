package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoSalesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\a.balkrishna.gawli\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email' and @id='username']")).sendKeys("akanksha@casestudy.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='button r4 wide primary' and@id='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password' and @id='password']")).sendKeys("Gawli@1997");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @id='Login']")).click();
		Thread.sleep(45000);
		driver.findElement(By.xpath("//button[@title='App Launcher' and @data-target-selection-name='181c7013df09423d8f755b49c067f6f3']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@class='slds-input' and @id='input-129' and @type='search']")).sendKeys("SeleniumApp");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @id='Login']")).click();
		driver.quit();
		

	}

}
