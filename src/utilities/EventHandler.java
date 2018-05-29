package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
	 
	public class EventHandler implements WebDriverEventListener {
	 
		public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
	 
			System.out.println("After ChangeValueOf on" + arg0.toString());
		}
	 
		public void afterClickOn(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("After ClickOn on " + arg0.toString());
		}
	 
		public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			System.out.println("Find happened on " + arg1.toString() 
					+ " Using method " + arg0.toString());
		}
	 
		public void afterNavigateBack(WebDriver arg0) {
			// TODO Auto-generated method stub
	 
			System.out.println("After navigateback to " + arg0.getCurrentUrl());
		}
	 
		public void afterNavigateForward(WebDriver arg0) {
			// TODO Auto-generated method stub
			System.out.println("AfterNavigateForward to " + arg0.getCurrentUrl());
		}
	 
		public void afterNavigateTo(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("AfterNavigateTo to " + arg0);
		}
	 
		public void afterScript(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("AfterScript to, Script is " + arg0);
		}
	 
		public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
	 
			System.out.println("BeforeChangeValueOf method");
		}
	 
		public void beforeClickOn(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("About to click on the " + arg0.toString());
	 
		}
	 
		public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			System.out.println("Just before finding element " + arg1.toString());
	 
		}
	 
		public void beforeNavigateBack(WebDriver arg0) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateBack " + arg0.getCurrentUrl());
	 
		}
	 
		public void beforeNavigateForward(WebDriver arg0) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateForward " + arg0.getCurrentUrl());
	 
		}
	 
		public void beforeNavigateTo(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeNavigateTo " + arg0);
		}
	 
		public void beforeScript(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("Just before beforeScript " + arg0);
		}
	 
		public void onException(Throwable arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			System.out.println("Exception occured at " + arg0.getMessage());
	 
		}

		@Override
		public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateRefresh(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateRefresh(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		
}


