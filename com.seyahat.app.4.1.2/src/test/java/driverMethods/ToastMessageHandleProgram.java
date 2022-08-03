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

public class ToastMessageHandleProgram {
	
	@Test
	
	public void toastMessageHandleOnApp() throws MalformedURLException, InterruptedException
	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// to tap on let's shop button
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		// to handle toast message using Universal xpath
		
		String toastMessage = driver.findElement(By.xpath("//hierarchy/android.widget.Toast[1]")).getText();
		
		//to print the displayed Toastmessage
		System.out.println(toastMessage);
		
		// to close the app
		driver.closeApp();   
	}

}
