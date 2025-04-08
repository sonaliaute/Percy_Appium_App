package appiumv2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.percy.appium.AppPercy;

public class PercyMobileApp {
	public static AndroidDriver driver;
	public static AppPercy percy;
	@Test	
	  public static void main(String[] args) throws MalformedURLException, InterruptedException, URISyntaxException {
		  
		  UiAutomator2Options options = new UiAutomator2Options();
	       options.setDeviceName("XiaomiRedmiNote7S");
	       options.setPlatformName("Android");
	     //options.setChromedriverExecutable("C:\\Users\\202503199\\Drivers\\chromedriver.exe");
	       options.setAutoGrantPermissions(true);
	       options.setCapability("autoAcceptAlerts", true);
	       options.setAutomationName("UIAutomator2");
	       options.setAppPackage("org.altruist.BajajExperia");
	       options.setAppActivity("com.bfl.superapp.onboarding.revamp.activity.SplashActivity");
	       options.setCapability("noReset", true);
    
	    AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4725").toURL(), options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    System.setProperty("PERCY_TOKEN", "app_a47afb7578cefb0348b4eb9cd45a3a06bab514affd6400e987b4f0b7f44e4e33");
	       System.setProperty("PERCY_BRANCH", "main");
	    AppPercy percy = new AppPercy(driver);
	    
	    //Percy Screenshot function which captures and uploads screenshot to percy
	    percy.screenshot("First Screenshot");
	    driver.quit();
	  }
}


