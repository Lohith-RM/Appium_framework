package crossFlatformAndCrossBrowserTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchGenralStoreAppTest {
	
	@Parameters({"version","serialnumber","port"})
	//@Test
	@Test(groups = "regrissonTest")
	
	public void appiumGroupsExceutionTest1(String port, String version, String serialnumber) throws MalformedURLException
	
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		dc.setCapability(MobileCapabilityType.UDID, serialnumber);
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:"+port+"/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		driver.closeApp();
		
		

	}

}
