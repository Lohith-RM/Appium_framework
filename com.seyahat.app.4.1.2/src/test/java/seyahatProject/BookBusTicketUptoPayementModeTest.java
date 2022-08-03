package seyahatProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

import driverMethods.ScrollToElementsMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BookBusTicketUptoPayementModeTest extends ScrollToElementsMethod
{
	
	
	@Test
	
	public void bookTicketUptoPaymentMode() throws IOException
	
	{
		// Extract data from property file
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace2\\com.seyahat.app.4.1.2\\src\\test\\resources\\makemytripdetails..txt");
		Properties ps = new Properties();
		ps.load(fis);
		
		String from = ps.getProperty("FROM");
		String to = ps.getProperty("TO");
		String passengername = ps.getProperty("PASSENGERNAME");
		//String age = ps.getProperty("");
		String email = ps.getProperty("EMAIL");
		String mobilenumber = ps.getProperty("MOBILENUMBER");
		String pickuppoint= ps.getProperty("PICKUPPOINT");
		
		// Desired capabilities of device to connect the device and application
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.makemytrip");
		dc.setCapability("appActivity", "com.mmt.auth.login.ui.LoginDeeplinkActivity");
		
		// To connect the appium server using url
		URL url = new URL("http://localhost:4723/wd/hub");
		
		// Launch the driver using url and desired capabilities
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		// ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// login cancel button
		//MobileElement logincancelbutn = (MobileElement) driver.findElementByAccessibilityId("Go Back");
		//driver.tap(1, logincancelbutn, 200);
		
		driver.tap(1, 559, 1547, 200);
		
		// To tap on Train and Bus module
		MobileElement trainandbusicon = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Trains & Bus']"));
		driver.tap(1, trainandbusicon, 200);
		
		// To select the Book Bus Tickets module
		driver.tap(1, 643, 342, 200);
		
		// To select the Origin place
		MobileElement originplace = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'landing_search_origin_city')]"));
		driver.tap(1, originplace, 200);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter City Name']")).sendKeys(from);
		
		driver.tap(1, 654, 1440, 200);
		
		driver.hideKeyboard();
		
		driver.tap(1, 100, 100, 200);
		
		// To select the Destination place
		
		MobileElement destinationplace = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'landing_search_destination_city')]"));
		driver.tap(1, destinationplace, 200);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter City Name']")).sendKeys(to);
		
		driver.tap(1, 654, 1440, 200);
		
		driver.hideKeyboard();
		
		driver.tap(1, 100, 100, 200);
		
		// To open the calender
		
		MobileElement calndericon = (MobileElement) driver.findElementByAccessibilityId("landing_calendar");
		driver.tap(1, calndericon, 200);
		
		// To select the Date
		
		MobileElement date = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='July 22']/..//android.widget.TextView[@text='21']"));
		driver.tap(1, date, 200);
		
		driver.tap(1, 355, 1386, 200);
		
		// To search the buses
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='SEARCH BUSES']")).click();
		
		// To select the bus
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sri Durga Tourist']")).click();
		
		// To select the seat
		driver.tap(1, 574, 955, 200);
		
		// To tap next button
		
		driver.findElement(By.id("ss_next_button")).click();
		
		scrollToElement(driver, "text", pickuppoint);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yelachenahalli ']")).click();
		
		// to select the droppoint
		driver.findElement(By.xpath("//android.widget.TextView[@text='Kuloor']")).click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys(passengername);
		
		driver.hideKeyboard();
		
		driver.tap(1, 156, 858, 200);
		
		driver.tap(1, 442, 1080, 200);
		
		driver.tap(1, 97, 1197, 200);
		
		driver.hideKeyboard();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Male']")).click();
		
		
		scrollToElement(driver, "text", "MEGABUS");
		driver.findElement(By.xpath("//android.widget.TextView[@text='MEGABUS']")).click();
		
		scrollToElement(driver, "text", "Enter Contact Details");
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email ID']")).sendKeys(email);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Phone Number']")).sendKeys(mobilenumber);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='No']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']")).click();
		
		driver.closeApp();
		
	}

}
