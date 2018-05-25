package utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	 
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
 
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;
 
		switch (browserName) {
		case "Firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				//System.setProperty("webdriver.firefox.driver","C:\\Users\\Mike\\WebDriver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				drivers.put("Firefox", driver);
				
				
			}
			break;
			
			
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver","C:\\Users\\Mike\\WebDriver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				drivers.put("IE", driver);
				
			}			
			break;
			
			
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Mike\\WebDriver\\chromedriver.exe");
				
				Map<String, Object> prefs = new HashMap<String, Object>();				
		    	prefs.put("download.prompt_for_download", false);
		    	prefs.put("credentials_enable_service", false);	
		    	prefs.put("password_manager_enabled", false);
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("chrome.switches","--disable-extensions");
		    	chromeOptions.addArguments("disable-popup-blocking");
		    	chromeOptions.addArguments("--disable-notifications");
		    	chromeOptions.addArguments("disable-infobars");
		    	chromeOptions.addArguments("--start-maximized");
		    	chromeOptions.setExperimentalOption("prefs", prefs);
		    	chromeOptions.addArguments("--test-type");
		    	driver = new ChromeDriver(chromeOptions);	
		    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    	drivers.put("Chrome", driver);			
			}			
			break;
		}
		
		return driver;
	}
	
	
	
	
 
	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}
}
