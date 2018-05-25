package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Top_Nav {
	
	private static WebElement element = null;
	
	
	public static WebElement arrow_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[3]/div[2]/i"));
				
		}catch (Exception e){
			 
			System.err.println("ARROW BUTTON not Found.");
 
			throw(e); 
		}	
		
		return element;	
		
	}
	
		
	
	public static WebElement Signout_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("//div[contains(text(),'Sign Out')]"));
				
		}catch (Exception e){
			 
			System.err.println("SIGNOUT BUTTON not Found.");
			
			//Code to capture screenshot.
 
			throw(e); 
		}	
		
		return element;	
		
	}
	
		
	
	public static WebElement AccountSummary_Button(WebDriver driver){
		
		try{
			
			element = driver.findElement(By.xpath("//span[contains(text(),'Account Summary')]"));
					
		}catch (Exception e){
			 
			System.err.println("ACCOUNT SUMMARY BUTTON not Found.");
 
			throw(e); 
		}	
		
		return element;	
		
	}
	
		
	
	public static WebElement Billing_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Billing')]"));
				
		}catch (Exception e){
			 
			System.err.println("BILLING BUTTON not Found.");
 
			throw(e); 
		}	
		
		return element;	
		
	}
	
		
		
	public static WebElement Voice_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Voice')]"));
				
		}catch (Exception e){
			 
			System.err.println("VOICE BUTTON not Found.");
 
			throw(e); 
		}	
		
		return element;	
		
	}
	
	
		
	public static WebElement Profile_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Profile and Settings')]"));
		
		}catch (Exception e){
			 
			System.err.println("PROFILE and SETTINGS BUTTON not found.");
 
			throw(e); 
        }
				
		return element;	
		
	}
	

	
	public static WebElement User_Button(WebDriver driver){
		
		try{
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
				
		}catch (Exception e){
			 
			System.err.println("USERS BUTTON not found.");
 
			throw(e); 
        }
				
		return element;	
		
	}
	
	
	
	
}
