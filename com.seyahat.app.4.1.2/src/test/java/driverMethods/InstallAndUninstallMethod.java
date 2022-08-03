package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAndUninstallMethod {
	
	@Test
	
	public void installAndUninstallApp() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.installApp("C:\\Users\\Admin\\eclipse-workspace2\\com.seyahat.app.4.1.2\\files\\General-Store.apk");
		boolean verify = driver.isAppInstalled("com.androidsample.generalstore");
		System.out.println("Application is installed");
		
		
		
	}

}
