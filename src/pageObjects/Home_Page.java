package pageObjects;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;


public class Home_Page {
	
				
	private static WebElement element = null;
	
public static WebElement Not_NowButton(WebDriver driver){
		
		element = driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(),'Not Now')]"));
				
		return element;	
		}


public static WebElement Support_Button(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[contains(text(),'Support')]"));
			
	return element;	
	}

public static WebElement amount_Due(WebDriver driver){
	
	element = driver.findElement(By.xpath("//span[@class='balance ng-binding']"));
			
	return element;	
	}

public static WebElement makepayment_Button(WebDriver driver){
	
	element = driver.findElement(By.xpath("//button[@aria-label='Make a Payment']"));
			
	return element;	
	}



}












