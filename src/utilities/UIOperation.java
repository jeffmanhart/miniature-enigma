package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.Top_Nav;




public class UIOperation {
	
		WebDriver driver;
	    public UIOperation(WebDriver driver, UIOperation op){
	        this.driver = driver;
	        
	    }
		
		public void user_Logout() throws Exception {
		Thread.sleep(1000);
		Top_Nav.Signout_Button(driver).click();
		}
		
		
}
		

