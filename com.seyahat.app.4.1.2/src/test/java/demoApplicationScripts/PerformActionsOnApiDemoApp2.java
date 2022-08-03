package demoApplicationScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionsOnApiDemoApp2 {
	
	@Test
	
	public void performActionOnApiDemoApp2() throws MalformedURLException
	{
        DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// tap on continue button
		MobileElement contnue = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, contnue, 200);
		
		// tap on ok button
		MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbtn, 200);
		
		// tap on App tab
		driver.findElementByAccessibilityId("Content").click();
		
		// tap on Notification tab
		driver.findElementByAccessibilityId("Search").click();
		
		// tap on incoming messages tab
		driver.findElementByAccessibilityId("Notifying Service Controller").click();
		
		// tap on show App notification ta;b
		driver.tap(1, 162, 347, 200);
		
		// to show the incoming notification on device
		driver.openNotifications();
		
		// to open the notification
		driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
		
		// to print the notification message
		String notification = driver.findElement(By.id("io.appium.android.apis:id/message")).getText();
		System.out.println(notification);
		
		// to close the application
		driver.closeApp();
		

	}

}
