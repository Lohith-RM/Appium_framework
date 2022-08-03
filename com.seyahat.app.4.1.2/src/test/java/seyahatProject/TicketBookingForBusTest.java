package seyahatProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TicketBookingForBusTest {

	@Test
	
	public void tickectBookonAbhiBusApp() throws MalformedURLException, InterruptedException	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.app.abhibus");
		dc.setCapability("appActivity", "com.abhibus.mobile.WelcomeScreen");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.findElement(By.id("com.app.abhibus:id/btn_skip")).click();
//		//driver.tap(1, 74, 1463, 200);
//		
//		//Thread.sleep(8000);
//		driver.findElement(By.id("notnowButton")).click();
//		
//		driver.tap(1, 565, 1550, 200);
//		
//		driver.tap(1, 375, 679, 200);
//		
//		Thread.sleep(5000);
		
		//driver.findElement(By.id("com.app.abhibus:id/closeImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/sourceTextView")).click();
		
		driver.findElement(By.id("android:id/search_src_text")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangalore']")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/destinationTextView")).click();
		
		driver.findElement(By.id("android:id/search_src_text")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chennai']")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/lrt_onward_monthyear")).click();
		
		driver.findElement(By.xpath("//com.prolificinteractive.materialcalendarview.d[@content-desc=\"Calendar\"]/android.widget.CheckedTextView[31]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='IntrCity SmartBus'][1]")).click();
		
		Thread.sleep(2000);
		
		driver.tap(1, 503, 1044, 50);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.app.abhibus:id/doneButton")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Silk Board - Infront of Trident Renault Car Showroom']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Guindy']")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/emailEditText")).sendKeys("lohithgowdarm@gmail.com");
		
		driver.findElement(By.id("com.app.abhibus:id/mobileEditText")).sendKeys("7760954924");
		
		driver.findElement(By.id("com.app.abhibus:id/whatsappImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/whatsappImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/fullNameEditText")).sendKeys("Lohith");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.app.abhibus:id/ageEditText")).sendKeys("32");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.app.abhibus:id/maleImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/mainButtonTextView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/freeCancellationSwitchImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/insuranceCheckImageView")).click();
		
//		driver.findElement(By.id("com.app.abhibus:id/termsConditionsImageView")).click();
//		
//		driver.findElement(By.id("com.app.abhibus:id/termsConditionsImageView")).click();
		
		driver.findElement(By.id("com.app.abhibus:id/mainButtonTextView")).click();
		
		Thread.sleep(5000);
		
		driver.tap(1, 682, 220, 200);
		
		List<WebElement> info = driver.findElements(By.id("com.app.abhibus:id/expandedTicketLayout"));
		
		for(WebElement ticketdetails:info)
		{
			String journeydetails = ticketdetails.getText();
			
			System.out.println("Journey details");
			System.out.println(journeydetails);
			
		}
		
		driver.closeApp();
			
	}
}
