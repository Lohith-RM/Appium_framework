package seyahatProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class KsrtcSingleTripJourneyTest {
	
	@Test
	
	public void singleTripTest() throws MalformedURLException, InterruptedException
	
	{
		//Desired capabilities of device to connect the device and application
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.ksrtc.awatar.new");
		dc.setCapability("appActivity", "com.abhibus.app.ksrtc.SplashScreenActivity");
		
		// To connect the appium server using url
		URL url = new URL("http://localhost:4723/wd/hub");
		
		// Launch the driver using url and desired capabilities
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		// ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Click on Login Module
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]/android.widget.TextView")).click();
		
		Thread.sleep(4000);
		// Click on UserName Text field and provide the Valid UserName  and Password credentials.
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userName']")).sendKeys("lohithgowdarm@gmail.com");
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("lohithrm24@");
		
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='submitBtn']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Close']")).click();
		
		// Click on Leaving From text field and enter the valid city name and select the entered city name.
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Leaving From:']")).sendKeys("Bangalore");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='ui-id-6']")).click();
		
		// Click on Going To text field and enter the valid city name and select the entered city name.
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Going To:']")).sendKeys("Chennai");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.TextView[@text='CHENNAI']")).click();
		
		// Click on Date of Departure text field and select the valid departure date.
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Date Of Departure']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"28\"]/android.widget.TextView")).click();
		
		// Click on Check Availability button.
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Check Availability']")).click();
		
		Thread.sleep(5000);
		
		// Click on Select seats button.
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]")).click();
		
		// Click on Boarding Point Dropdown box and select the valid Place.
		
		driver.findElement(By.xpath("//android.view.View[@resource-id='ForwardBoardId']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='MYSORE ROAD SATELLITE BS 7760990530 - 23:39']")).click();
		
		//Click on Dropping Point Dropdown box and select the valid Place.
		
		driver.findElement(By.xpath("//android.view.View[@resource-id='ForwardDroppingId']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='CHENNAI KMBD BUS STAND - 05:29']")).click();
		
		// Click on Show Layout button.
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Show layout']")).click();
		
		Thread.sleep(2000);
		
		// Click on Seat layout to Select and Deselect the seat by using valid Seat Number.
		
		driver.findElement(By.xpath("//android.view.View[@text='18']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.view.View[@text='18']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on Seat layout to Select seat by using valid Seat Number.
		driver.findElement(By.xpath("//android.view.View[@text='18']")).click();
		
		scrollToElement(driver, "text", "Name");
		
		// Click on Mobile No. text field and enter the valid mobile number.
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='mobileNo']")).sendKeys("7760954924");
		
		// Click on Email Id text field and enter the valid email id.
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("lohithgowdarm@gmail.com");
		
		// Click on Name text field and enter the valid name.
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='passengerNameForward0']")).sendKeys("Lohith");
		
		// Click on Gender dropdown and select the valid gender.	
		driver.findElement(By.xpath("//android.view.View[@resource-id='genderCodeIdForward0']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='MALE']")).click();
		
		// Click on Age text filed and enter the valid age number.
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='passengerAgeForward0']")).sendKeys("32");
		
		// Click on Concession dropdown and select the valid concession.
		
		driver.findElement(By.xpath("//android.view.View[@resource-id='concessionIdsForward0']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='GENERAL PUBLIC']")).click();
		
		//Click on Nationality dropdown and select the valid Nationality.
		
		driver.findElement(By.xpath("//android.view.View[@resource-id='nationalityForward0']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='INDIA']")).click();
		
		// Click on Continue button
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='BookNowBtn']")).click();
		
		Thread.sleep(5000);
		
		driver.closeApp();
	}
	
	public static void scrollToElement(AndroidDriver driver, String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
