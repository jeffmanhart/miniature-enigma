package pageObjects;

import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;


public class Login_Page {
	
	private static WebElement element = null;
	
public static WebElement Login_Username(WebDriver driver){
	
	element = driver.findElement(By.id("smbLoginUsername"));
	
	return element;	
	}

public static WebElement Login_Pass(WebDriver driver){
	
	element = driver.findElement(By.id("smbLoginPassword"));
	
	return element;	
	}
	

public static WebElement Signin_Button(WebDriver driver){
	
	element = driver.findElement(By.xpath("//button[@aria-label='Sign In']"));
	
	return element;
	}

}
