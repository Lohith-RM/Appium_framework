package demoApplicationScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnTouchScreenApp {
	
@Test
	
	public void orentiationActionOnApps() throws MalformedURLException, InterruptedException
	
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		Dimension size = driver.findElement(By.id("jp.rallwell.siriuth.touchscreentest:id/surfaceView")).getSize();
		
		System.out.println(size);
		
		//horizontal
		driver.swipe(20, 49, 684, 49, 2000);
		driver.swipe(20, 162, 684, 162, 2000);
		driver.swipe(20, 275, 684,275, 2000);
		driver.swipe(20, 388, 684, 388, 2000);
		driver.swipe(20, 501, 684, 501, 2000);
		driver.swipe(20, 614, 684, 614, 2000);
		driver.swipe(20, 727, 684, 727, 2000);
		driver.swipe(20, 840, 684, 840, 2000);
		driver.swipe(20, 953, 684, 953, 2000);
		driver.swipe(20, 1066, 684, 1066, 2000);
		driver.swipe(20, 1179, 684, 1179, 2000);
		driver.swipe(20, 1292, 684, 1292, 2000);
		driver.swipe(20, 1405, 684, 1405, 2000);
		driver.swipe(20, 1518, 684, 1518, 2000);
		
		// vertical
		
		driver.swipe(20, 49, 20,1518, 2000);
		driver.swipe(120, 49, 120, 1518, 2000);
		driver.swipe(220, 49, 220,1518, 2000);
		driver.swipe(320, 49, 320, 1518, 2000);
		driver.swipe(420, 49, 420, 1518, 2000);
		driver.swipe(520, 49, 520, 1518, 2000);
		driver.swipe(620, 49, 620, 1518, 2000);
		driver.swipe(720, 49, 720, 1518, 2000);
//		driver.swipe(820, 49, 820, 1518, 2000);
//		driver.swipe(920, 49, 920, 1518, 2000);
//		driver.swipe(1020, 49, 1020, 1518, 2000);
//		driver.swipe(1120, 49, 1120, 1518, 2000);
//		driver.swipe(1220, 49, 1220, 1518, 2000);
//		driver.swipe(1320, 49, 1320, 1518, 2000);
		
		driver.closeApp();
			
	}
}
