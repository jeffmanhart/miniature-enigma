package pageObjects;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Profile_Page {
	
	WebDriver driver;			
	private static WebElement element = null;
	
public static WebElement edit_Contact(WebDriver driver){
		
	element = driver.findElement(By.xpath("//div[@aria-label='Edit Contact Info Card']"));
					
	return element;	
	}


public static WebElement firstName_Field(WebDriver driver){
	
	element = driver.findElement(By.id("profileFirstName"));
			
	return element;	
	}


public static WebElement lastName_field(WebDriver driver){
	
	element = driver.findElement(By.id("profileLastName"));
			
	return element;	
	}


public static WebElement phone_Field(WebDriver driver){
	
	element = driver.findElement(By.id("profilePhoneNum"));
			
	return element;	
	}


public static WebElement contact_SaveButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Save Contact Info Card']"));
			
	return element;	
	}

public static WebElement edit_Password(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Edit Password Card']"));
			
	return element;	
	}


public static WebElement enterpassword_Field(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomPassword"));
			
	return element;	
	}


public static WebElement enterpassword2_Field(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomPasswordConfirmation"));
			
	return element;	
	}


public static WebElement password_SaveButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Save Password Card']"));
			
	return element;	
	}


public static WebElement edit_Security(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Edit Security Info Card']"));
			
	return element;	
	}



public static WebElement dropdown_Security(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomQuestion"));
			
	return element;	
	}



public static WebElement securityanswer_Field(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomSecurityAnswer"));
			
	return element;	
	}


public static WebElement security_SaveButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Save Security Info Card']"));
			
	return element;	
	}



public static WebElement company_SettingsButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//span[contains(text(),'COMPANY SETTINGS')]"));
			
	return element;	
	}

public static WebElement edit_CompanySettingsButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//sb-card[@class='sb-card--three-columns ng-isolate-scope']//div[@class='sb-card ng-scope ng-isolate-scope']//div[@class='sb-card__content-container']//div[@class='sb-card__header-container']//div[@class='sb-card__header']//div[@class='sb-card__header--top']//div[@class='sb-card__header--right-side']//div[@class='sb-card__header-buttons']//div[@class='sb-card--inactive']//div"));
			
	return element;	
	}


public static WebElement edit_Address1(WebDriver driver){
	
	element = driver.findElement(By.id("companyAddressOne"));
			
	return element;	
	}


public static WebElement edit_City(WebDriver driver){
	
	element = driver.findElement(By.id("companyCity"));
			
	return element;	
	}



public static WebElement Save_Billingy(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='sb-card__header-buttons animate-card-link']//div[@class='sb-card--active']//div[@class='sb-card__save-edit']"));
			
	return element;	
	}



public static WebElement Edit_PinCodeButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Edit Security Code Card']"));
			
	return element;	
	}



public static WebElement Pin(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomPin"));
			
	return element;	
	}



public static WebElement PinConfirmation(WebDriver driver){
	
	element = driver.findElement(By.id("prefcomPinConfirmation"));
			
	return element;	
	}



public static WebElement PinConfirmation_SaveButton(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@aria-label='Save Security Code Card']"));
			
	return element;	
	}



public static WebElement emailAddressField(WebDriver driver){
	
	try{
	
	element = driver.findElement(By.id("profileEmail"));
			
	}catch (Exception e){
		 
		System.err.println("Email Address Field not Found.");
		
		//Code to capture screenshot.

		throw(e); 
	}	
	
	return element;	
	
}






}





