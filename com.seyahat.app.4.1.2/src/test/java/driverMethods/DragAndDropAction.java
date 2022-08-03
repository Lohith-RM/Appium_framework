package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDropAction {

	@Test
	
	public void dragAndDropActionOnApiDemoApp() throws MalformedURLException
	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
	    AndroidDriver driver = new AndroidDriver(url, dc);
		
		MobileElement cntun = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, cntun, 200);
		
		MobileElement ctnbtun = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, ctnbtun, 200);
		
		driver.tap(1, 169, 1210, 200);
		
		MobileElement dragndropbutn = (MobileElement) driver.findElementByAccessibilityId("Expandable Lists");
		driver.tap(1, dragndropbutn, 200);
		
		MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		driver.tap(1, src, 200);
		
	MobileElement dst = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_hidden"));
	//driver.tap(1, dst, 200);
	
	TouchAction ta = new TouchAction(driver);
	
	ta.longPress(src).moveTo(dst).release().perform();
		
		
		
		
		
	}
}
