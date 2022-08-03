package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomAndPinchMethod {
	
	@Test
	
	public void zoomAndPinchOnAppTest() throws MalformedURLException, InterruptedException
	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
	    AndroidDriver driver = new AndroidDriver(url, dc);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	    driver.findElement(By.id("android:id/button1")).click();
	    
	   MobileElement basicfeature = (MobileElement) driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageDisplay"));
	    driver.tap(1, basicfeature, 200);
	    
	    WebElement image = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	    
	    driver.zoom(image);   // To zoom the displayed image (zoom in)
	    
	    Thread.sleep(2000);
	    
	    driver.pinch(image);  // To pinch the image  (zoom out)
	    
	 
	}

}
