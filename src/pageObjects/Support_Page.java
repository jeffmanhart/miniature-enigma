package pageObjects;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;

public class Support_Page {

	
	private static WebElement element = null;
	
	public static WebElement About_Button(WebDriver driver){
			
			element = driver.findElement(By.xpath("//div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/ul/li[2]/a"));
					
			return element;	
			}

	public static WebElement Parker_CO_link(WebDriver driver){
		
		element = driver.findElement(By.linkText("Parker, Colorado"));
				
		return element;	
		}
}
