package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.Profile_Page;
import pageObjects.Top_Nav;



public class Framework {
	WebDriver driver;
			
    public Framework (WebDriver driver, Framework op1)
    {
        this.driver = driver;
        
               
    }
			//LOGIN METHODS
			public void user_LoginPrimary(String username, String password)  throws Exception {			
			//Login to Spectrum as Primary user	
		    Login_Page.Login_Username(driver).clear();
		    Login_Page.Login_Pass(driver).clear();
			Login_Page.Login_Username(driver).sendKeys(username);
			Login_Page.Login_Pass(driver).sendKeys(password);
			Login_Page.Signin_Button(driver).click();
			}			
			
			public void user_LoginAdm()  throws Exception {					
			//Variable Declaration
			String username = "xxx_22";
			String password = "xxxx01";					    
					    
			//Login to Spectrum	as Admin User
			Login_Page.Login_Username(driver).clear();
			Login_Page.Login_Pass(driver).clear();
			Login_Page.Login_Username(driver).sendKeys(username);
			Login_Page.Login_Pass(driver).sendKeys(password);
			Login_Page.Signin_Button(driver).click();			
			}
				
			
			//MODAL METHODS
			public void close_NotNow() throws InterruptedException {
			
				WebDriverWait wait = new WebDriverWait(driver, 15);
			    if (isDisplayed()) {
				        WebElement notNow = wait.until(
				               visibilityOfElementLocated(By.xpath("//span[@class='ng-binding'][contains(text(),'Not Now')]")));
				        notNow.click();
				    }
				  }
				 
				  private Boolean isDisplayed() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(driver, 15);					  
				     try {
				        WebElement popup = wait.until(
				                visibilityOfElementLocated(By.xpath("//span[@class='ng-binding'][contains(text(),'Not Now')]")));
				        return popup.isDisplayed();
				     }
				     catch (Exception ex) {
				       return false;
				   }
				 }
				  		


	//PROFILE AND SETTINGS METHODS		
			
	public void editContactInfo(String Firstname, String Lastname, String PhoneNumber, String EmailAddress) throws InterruptedException  {
		Profile_Page.edit_Contact(driver).click();
		Profile_Page.firstName_Field(driver).clear();
		Profile_Page.firstName_Field(driver).sendKeys(Firstname);
		Profile_Page.lastName_field(driver).clear();
		Profile_Page.lastName_field(driver).sendKeys(Lastname);
		Profile_Page.phone_Field(driver).clear();	
		Profile_Page.phone_Field(driver).sendKeys(PhoneNumber);
		Profile_Page.emailAddressField(driver).clear();
		Profile_Page.emailAddressField(driver).sendKeys(EmailAddress);
		Profile_Page.contact_SaveButton(driver).click();
		Thread.sleep(10000);
		Assert.assertTrue(Profile_Page.edit_Contact(driver).isDisplayed(), "Save Contact Failed");
		}
		
	
	public void editPasswordInfo(String Password, String RePassword) throws InterruptedException {
		Profile_Page.edit_Password(driver).click();
		Profile_Page.enterpassword_Field(driver).sendKeys(Password);
		Profile_Page.enterpassword2_Field(driver).sendKeys(RePassword);
		Profile_Page.password_SaveButton(driver).click();
		Thread.sleep(10000);
		Assert.assertTrue(Profile_Page.edit_Password(driver).isDisplayed(), "Save Password Failed");			
		}	
	
	
	
	public void editSecurityQuestion(String Question, String Answer) throws InterruptedException {
		Profile_Page.edit_Security(driver).click();
		WebElement mySelectElement = driver.findElement(By.id("prefcomQuestion"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(Question);
		Profile_Page.securityanswer_Field(driver).clear();
		Profile_Page.securityanswer_Field(driver).sendKeys(Answer);
		Profile_Page.security_SaveButton(driver).click();	
		Thread.sleep(10000);
		Assert.assertTrue(Profile_Page.edit_Security(driver).isDisplayed(), "Save Security Question Failed");
		}
		
	
	
	
}		
	

					
			
				
			
				
				
			
			
			
			
			
			
			







