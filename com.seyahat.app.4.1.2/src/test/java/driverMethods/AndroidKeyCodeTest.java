package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidKeyCodeTest {
	
	@Test
	
	public void androidKeyCodeToControlDeviceHardwares() throws MalformedURLException
	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		//dc.setCapability("appPackage", "com.androidsample.generalstore");
		//dc.setCapability("appActivity", ".SplashActivity");
		dc.setCapability("noReset",true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
		System.out.println(AndroidKeyCode.BACK);
		System.out.println(AndroidKeyCode.ENTER);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
		
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		
		driver.pressKeyCode(AndroidKeyCode.BACK);	
	}

}
