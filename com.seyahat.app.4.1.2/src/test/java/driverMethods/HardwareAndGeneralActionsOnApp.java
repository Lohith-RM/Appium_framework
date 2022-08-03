package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class HardwareAndGeneralActionsOnApp {
	
	
	@Test
	
	public void orentiationActionOnApps() throws MalformedURLException, InterruptedException
	
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", ".Calculator");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		//ScreenOrientation orent = driver.getOrientation();	//To get the present orientation name on device
		//System.out.println(orent);							
		
		//driver.rotate(ScreenOrientation.LANDSCAPE); 		//To rotate device screen for Landscape mode
		
		//Thread.sleep(5000);
		//driver.rotate(ScreenOrientation.PORTRAIT);			// To rotate device screen for Potrait mode		
		
		//driver.setConnection(Connection.WIFI);			// To Operate Wifi network hardware button
		
		//driver.setConnection(Connection.AIRPLANE);			// To Operate Airplane mode hardware button
		
		//driver.setConnection(Connection.DATA); 			// To Operate Mobile network hardware button
		
		//driver.setConnection(Connection.ALL);
		
		//driver.setConnection(Connection.NONE);	
		
		driver.runAppInBackground(10);					// To run the applications in background
		
		driver.startActivity("com.androidsample.generalstore", ".SplashActivity"); 		//To switch the applications
	}

}
