package test_Cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import pageObjects.Login_Page;
import pageObjects.Profile_Page;
import pageObjects.Billing_Page;
import pageObjects.Home_Page;
import pageObjects.Support_Page;
import pageObjects.Top_Nav;
import utilities.Framework;
import utilities.UIOperation;
import org.testng.Assert;
import org.testng.Reporter;
import utilities.BrowserFactory;



public class CPNI_Tests{

	WebDriver driver;
	UIOperation op;
	Framework op1;
		
@SuppressWarnings("unused")
@Test(enabled = true, priority = 0, timeOut = 80000, groups = { "A", "B" }, description = "CPNI Test Flows for Primary User xxx_22")
//dependsOnMethods= {"assert_homepage","click_about "},
//@Parameters({ "sUsername", "sPassword" })

//public void log_InFacebook(String sUsername, String sPassword)  throws Exception {
	public void CPNI_SpectrumPrimary()  throws Exception {
	
		//Variable Declaration
		UIOperation operation = new UIOperation(driver,op);
		Framework repeatable = new Framework(driver,op1);
		SoftAssert softAssert = new SoftAssert();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//operation.faceBook_Login();
		repeatable.user_LoginPrimary("xxx_22", "xxx01");
		repeatable.close_NotNow();
		Thread.sleep(8000);
	
		//Find the element Support Button and assert it is displayed 
		softAssert.assertTrue(Home_Page.Support_Button(driver).isDisplayed());
				
		//Does the expected text match what is displayed
		Assert.assertEquals(Home_Page.amount_Due(driver).getText(), "$0.00");	    
				
		//Edit Contact Info
		Top_Nav.Profile_Button(driver).click();
		repeatable.editContactInfo("Testing0298", "Tester123", "3035547854", "c-michael.klemm@charter.com");
				
		//Edit Password
		repeatable.editPasswordInfo("Testing01", "Testing01");
				
		//Edit Security Question
		repeatable.editSecurityQuestion("Favorite sports team?", "Vikings");
				
		//Edit Company Settings Address
		/*Profile_Page.company_SettingsButton(driver).click();
		Thread.sleep(2000);
		Profile_Page.edit_CompanySettingsButton(driver).click();
		Profile_Page.edit_Address1(driver).clear();
		Thread.sleep(1000);
		Profile_Page.edit_Address1(driver).sendKeys("15579 East Prairie Wind Ave");
		Profile_Page.edit_City(driver).clear();
		Thread.sleep(1000);
		Profile_Page.edit_City(driver).sendKeys("Parker");
		Profile_Page.Save_Billingy(driver).click();
		Thread.sleep(6000);	*/
		
		//Edit Security Code
		/*Profile_Page.Edit_PinCodeButton(driver).click();
		Thread.sleep(2000);
		Profile_Page.Pin(driver).sendKeys("1357");
		Thread.sleep(2000);
		Profile_Page.PinConfirmation(driver).sendKeys("1357");
		Thread.sleep(2000);
		Profile_Page.PinConfirmation_SaveButton(driver).click();
		Thread.sleep(6000);*/
		jse.executeScript("scroll(0, 0);");
		
		//Add User
		
		
		softAssert.assertAll();
}

@SuppressWarnings("unused")
@Test(enabled = false, priority = 1, timeOut = 80000, groups = { "A", "B" }, description = "CPNI Test Flows for Admin User xxx_22")

	public void CPNI_SpectrumAdm()  throws Exception {
	
		//Variable Declaration
		Framework framework = new Framework(driver,op1);
		SoftAssert softAssert = new SoftAssert();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//operation.faceBook_Login();
		framework.user_LoginAdm();
		Thread.sleep(5000);
		framework.close_NotNow();	
		
	
		//Find the element Support Button and assert it is displayed 
		softAssert.assertTrue(Home_Page.Support_Button(driver).isDisplayed());
		System.out.println("Support Button displayed");
		
				
		//Edit Contact Info
		Top_Nav.Profile_Button(driver).click();
		Thread.sleep(2000);
		Profile_Page.edit_Contact(driver).click();
		Profile_Page.firstName_Field(driver).clear();
		Profile_Page.firstName_Field(driver).sendKeys("Mikeadmin");
		Profile_Page.lastName_field(driver).clear();
		Profile_Page.lastName_field(driver).sendKeys("Testeradmin");
		Profile_Page.phone_Field(driver).clear();
		Profile_Page.phone_Field(driver).sendKeys("3034447777");
		Profile_Page.contact_SaveButton(driver).click();
		Thread.sleep(6000);	
		
		
		//Edit Password
		Profile_Page.edit_Password(driver).click();
		Profile_Page.enterpassword_Field(driver).sendKeys("Testing01");
		Profile_Page.enterpassword2_Field(driver).sendKeys("Testing01");
		Profile_Page.password_SaveButton(driver).click();
		Thread.sleep(6000);			
				
		//Edit Security Question
		Profile_Page.edit_Security(driver).click();
		WebElement mySelectElement = driver.findElement(By.id("prefcomQuestion"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText("Color or make of your first car?");
		Thread.sleep(1000);	
		Profile_Page.securityanswer_Field(driver).clear();
		Profile_Page.securityanswer_Field(driver).sendKeys("black");
		Profile_Page.security_SaveButton(driver).click();
		Thread.sleep(6000);		
		softAssert.assertAll();
		
		//Edit Company Settings Address
		Profile_Page.company_SettingsButton(driver).click();
		Profile_Page.edit_CompanySettingsButton(driver).click();
		Profile_Page.edit_Address1(driver).clear();
		Profile_Page.edit_Address1(driver).sendKeys("4653 Texas Road");
		Profile_Page.edit_City(driver).clear();
		Profile_Page.edit_City(driver).sendKeys("Denver");
		Profile_Page.Save_Billingy(driver).click();
		Thread.sleep(6000);	
		
		//Edit Security Code
		Profile_Page.Edit_PinCodeButton(driver).click();
		Thread.sleep(2000);
		Profile_Page.Pin(driver).sendKeys("1357");
		Thread.sleep(2000);
		Profile_Page.PinConfirmation(driver).sendKeys("1357");
		Thread.sleep(2000);
		Profile_Page.PinConfirmation_SaveButton(driver).click();
		Thread.sleep(6000);	
		jse.executeScript("scroll(0, 0);");
		
		//Add User
		
}


@BeforeMethod(enabled = true)

	public void verifyLoginpageTitle() throws Exception {
	
    	String expectedTitle = "SpectrumBusiness.net - Sign In";
    	String actualTitle = driver.getTitle();
    	//String currentURL = driver.getCurrentUrl();
    	    	
    	if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page Title Correct");
    	} else 
    		System.out.println("Login page Title NOT Correct");
    	
    	//Assert.assertEquals(actualTitle, expectedTitle, "Title NOT Correct");  
    	
}
	


@AfterMethod(enabled = true)

	public void log_Out() throws Exception {	
	
		UIOperation operation = new UIOperation(driver,op);
	
		operation.user_Logout();
		
}



@BeforeTest(enabled = true)

  public void launchBrowser() throws Exception  {
	
		WebDriver driver = BrowserFactory.getBrowser("Chrome");
	  
		//Variable Declarations
    	//String baseUrl = "https://www.facebook.com";
    	//String driverPathc = "C:\\Users\\Mike\\WebDriver\\chromedriver.exe";
    	//String driverPathg = "C:\\Users\\Mike\\WebDriver\\geckodriver.exe";
    	//String driverPathi = "C:\\Users\\Mike\\WebDriver\\IEDriverServer.exe";
	    
        //System.setProperty("webdriver.chrome.driver", driverPathc);
    	//System.setProperty("webdriver.gecko.driver", driverPathg);
    	//System.setProperty("webdriver.ie.driver", driverPathi);	  	  
	  
    	//Browser options		  
    	//Map<String, Object> prefs = new HashMap<String, Object>();		  
    	//Turns off download prompt, To Stop Save password prompts
    	//prefs.put("download.prompt_for_download", false);
    	//prefs.put("credentials_enable_service", false);	
    	//prefs.put("password_manager_enabled", false);
      
    	//ChromeOptions chromeOptions = new ChromeOptions();      
    	//chromeOptions.addArguments("chrome.switches","--disable-extensions");
    	//chromeOptions.addArguments("disable-popup-blocking");
    	//chromeOptions.addArguments("--disable-notifications");
    	//chromeOptions.addArguments("disable-infobars");
    	//chromeOptions.addArguments("--start-maximized");
    	//chromeOptions.setExperimentalOption("prefs", prefs);
    	//chromeOptions.addArguments("--test-type");
      	  
    	// Create a new instance of the driver	
    	//driver = new ChromeDriver(chromeOptions);
    	//driver = new FirefoxDriver();
    	//driver = new InternetExplorerDriver();
      
    	//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
    	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	//driver.manage().window().maximize();
      
    	//Launch Spectrum Website
    	driver.navigate().to("https://www.spectrumbusiness.net");
    	//driver.get(baseUrl);
              
    	//driver.manage().window().maximize(); 
}



@AfterTest(enabled = true)

  public void tearDown()  {

	  	driver.quit();
	
  }

}
