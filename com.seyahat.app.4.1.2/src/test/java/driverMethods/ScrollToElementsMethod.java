package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollToElementsMethod {
	
	
	@Test
	
	public void scrollToElement() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
	    
      Thread.sleep(3000);
		
		MobileElement countryspinner = (MobileElement) driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']"));
		driver.tap(1, countryspinner, 200);
		
		 scrollToElement(driver, "text", "Australia");   // To Scroll the dropdown
		 
		 
		driver.runAppInBackground(5);
		
		driver.startActivity("io.appium.android.apis", ".ApiDemos");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		//driver.findElement(By.id("android:id/button1")).click();
		driver.tap(1, 107, 1208, 2000);
		
		scrollToElement(driver, "text", "WebView");
		
		driver.findElementByAccessibilityId("WebView").click();
		
		driver.closeApp();
			    
	}
	
	public static void scrollToElement(AndroidDriver driver, String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	

}
