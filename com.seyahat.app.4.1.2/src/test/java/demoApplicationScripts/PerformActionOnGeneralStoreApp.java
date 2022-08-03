package demoApplicationScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jboss.netty.util.DefaultObjectSizeEstimator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnGeneralStoreApp {
	
	
	@Test
	
	public void productSelectOnApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		Thread.sleep(3000);
		
		MobileElement countryspinner = (MobileElement) driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']"));
		driver.tap(1, countryspinner, 200);
		
		TouchAction ta = new TouchAction(driver);
		ta.press(360, 1409).moveTo(398, 495).release().perform();
		
		MobileElement australia = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Australia']"));
		driver.tap(1, australia, 200);
		
//		List<WebElement> list = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']"));
//		
//		for(WebElement countrylist:list)
//		{
//			countrylist.getText();
//			System.out.println(countrylist);
//		}
//		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Aaradhya");
		
		driver.hideKeyboard();
		
		MobileElement femaleradiobtun = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		driver.tap(1, femaleradiobtun, 200);
		
		MobileElement loginbtn = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		driver.tap(1, loginbtn, 100);
		
		MobileElement addtocarttxt = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'][1]"));
		driver.tap(1, addtocarttxt, 200);
		
		MobileElement carticon = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		driver.tap(1, carticon, 200);
		
		String finalamnt = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		System.out.println(finalamnt);
		
		MobileElement backbutn = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_back"));
		driver.tap(1, backbutn, 100);
		
		
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice'][1]")).getText();
		System.out.println(price);
		
		if(finalamnt.equals(price))
		{
			System.out.println("Bill amount is same and product is selected");
		}
		
		else
		{
			System.out.println("Bill amount is not same and product is not selected");
		}
		
		
		
		
	}

}
