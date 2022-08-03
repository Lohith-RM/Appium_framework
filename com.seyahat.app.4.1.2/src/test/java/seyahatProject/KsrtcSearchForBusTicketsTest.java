package seyahatProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class KsrtcSearchForBusTicketsTest {

	@Test
	
	public void searchingforAvailableBusTickets() throws MalformedURLException, InterruptedException
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
				
				driver.findElement(By.xpath("//android.widget.EditText[@text='Going To:']")).sendKeys("Mysore");
				driver.hideKeyboard();
				driver.findElement(By.xpath("//android.widget.TextView[@text='MYSORE']")).click();
				
				// Click on Date of Departure text field and select the valid departure date.
				
				driver.findElement(By.xpath("//android.widget.EditText[@text='Date Of Departure']")).click();
				driver.findElement(By.xpath("//android.view.View[@content-desc=\"27\"]/android.widget.TextView")).click();
				
				// Click on Date of Return text field and select the valid return date.
				
				driver.findElement(By.xpath("//android.widget.EditText[@text='Date Of Return']")).click();
				driver.findElementByAccessibilityId("home").click();
				driver.findElement(By.xpath("//android.view.View[@content-desc=\"2\"]/android.widget.TextView")).click();
				
				// Click on Single Lady check box to select and deselect
				
				driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='singleLady']")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='singleLady']")).click();
				
				// Click on Check Availability button.
				
				driver.findElement(By.xpath("//android.widget.Button[@text='Check Availability']")).click();
				
				Thread.sleep(5000);
				
				driver.closeApp();
				
	}
}
