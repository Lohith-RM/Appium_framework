package crossFlatformAndCrossBrowserTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchTouchScreenAppTest {
	
	@Parameters({"version","serialnumber","port"})
	//@Test
	@Test(groups = "smokeTest")
	public void appiumGroupsExceutionTest2(String version, String serialnumber, String port) throws MalformedURLException
	
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		dc.setCapability(MobileCapabilityType.UDID, serialnumber);
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");		
		URL url = new URL("http://localhost:"+port+"/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		driver.closeApp();
		
	}
}
