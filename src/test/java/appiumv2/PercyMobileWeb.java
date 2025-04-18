package appiumv2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.percy.appium.AppPercy;

public class PercyMobileWeb {
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

	    System.setProperty("PERCY_TOKEN", "web_c5685c845846d3d9d32387a9dfdc80031696c2d556770275da66b5588bd004d2");
	       System.setProperty("PERCY_BRANCH", "web-demo");
	    AppPercy percy = new AppPercy(driver);
	    
	    //Percy Screenshot function which captures and uploads screenshot to percy
	    percy.screenshot("First Screenshot");
	    driver.quit();
	  }
}

