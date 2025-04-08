package PercyPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.percy.selenium.Percy;





public class PercyAppiumTest {
    WebDriver driver;
    Percy percy;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\202503199\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        percy = new Percy(driver);
    }

    @Test
    public void testVisual() throws InterruptedException {
      //  try {
            // Open webpage
            driver.get("https://cont-sites.bajajfinserv.in/investments");
            Thread.sleep(6000);

            percy.snapshot("InvestmentMallPDP");
             
    
            // Take a Percy snapshot
          //  percy.snapshot("Bajaj Hamaramall Homepage");
            
       /* 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the test
            if (driver != null) {
                driver.quit();
                */
        }}
         
    