package pageObjects;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;


public class Billing_Page {
	
				
	private static WebElement element = null;
	
public static WebElement makepayment_Arrow(WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]"));
		
				
		return element;	
		}

public static WebElement otheramount_Radio(WebDriver driver){
	
	element = driver.findElement(By.id("#radio_3"));
			
	return element;	
	}



public static WebElement otheramount_Textbox(WebDriver driver){
	
	element = driver.findElement(By.id("paymentAmount"));
			
	return element;	
	}

public static WebElement continue_button(WebDriver driver){
	
	element = driver.findElement(By.id("pay-bill-main"));
			
	return element;	
	}



}







