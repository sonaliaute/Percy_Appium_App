package PercyPOC;

import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class PercyPOC {

	public static void main(String[] args) {
		

		    // Set up WebDriver (ChromeDriver must match your browser version) 
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\202503199\\Drivers\\chromedriver.exe"); 
	    	WebDriver driver = new ChromeDriver(); 
  
		        // Initialize Percy 
		        Percy percy = new Percy(driver); 
  
		        // Open a webpage 
        		driver.get("https://hamaramall.com/"); 
		  
		        // Take a Percy snapshot 
		        percy.snapshot("Example Page"); 
		  
		        // Close the browser 
		        driver.quit(); 

		    } 

		}
