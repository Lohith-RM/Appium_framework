package driverMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServerUsingScript2 {
	
	@Test
	
	public void startDifferentPortServerScript() throws MalformedURLException
	
	{
		// to start appium server along with different port numbers
		AppiumDriverLocalService server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()  
		.withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723).withLogFile(new File("../AppiuSDET35/Logs.txt")));
		
		
		server.start(); // start code
				
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		dc.setCapability("noReset",true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		server.stop();  //stop code

	}

}
