package test_Cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import pageObjects.Login_Page;

public class Spectrum_Login_Failed {
	
@Test(enabled = true)
	
	public void faceBook_Login_Failed()	{
		
		//Sets the path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
								
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								
		//Launch FaceBook Website
								
		driver.get("https://www.facebook.com");
									      
		driver.manage().window().maximize();
										
		// Find the elements that's ID attribute is 'email' and 'pass' and 'login button'
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();
								
		// Print a Log In Successful message to Console
		System.out.println("Login Failed");
								
		// Find the element that's ID attribute is 'profile_pic_header_1747741116' and assert it is displayed      
		driver.findElement(By.id("profile_pic_header_1747741116")).isDisplayed();
										
		driver.quit();
	}
	
}
