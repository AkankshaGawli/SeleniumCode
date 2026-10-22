package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.sreenidhirajakrishnan.com/practice?utm_source=sp_auto_dm&utm_referrer=sp_auto_dm");
		
		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//input[@id='text-input' and @placeholder='Enter your name']")).sendKeys("abc");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='password-input' and @placeholder='Enter password']")).sendKeys("Test@123");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='email-input' and @placeholder='Enter email']")).sendKeys("nehagawli12@gmail.com");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='phone-input' and @placeholder='Enter phone']")).sendKeys("7758029862");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//textarea[@id='textarea-input' and @placeholder='Tell us about yourself']")).sendKeys("Hello");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@type='submit' and @class='btn-primary practice-submit']")).click();
		 System.out.println("Pass");
		 
		 driver.quit();
	}

	

}
