package crossFlatformAndCrossBrowserTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApiDemoAppTest {

	@Parameters({"version","serialnumber","port"})
	//@Test
	@Test(groups = "regressionTest")
	
	public void appiumParallelExecutionTest(String version, String serialnumber, String port ) throws MalformedURLException
	
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.UDID, serialnumber );
		
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:"+port+"/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.closeApp();

	}
}
