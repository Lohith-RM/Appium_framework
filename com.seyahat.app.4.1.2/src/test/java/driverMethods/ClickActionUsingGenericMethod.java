package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickActionUsingGenericMethod {
	
	static AndroidDriver driver;
	
	
	public static void tap(int fingers, WebElement ele, int duration)
	{
		driver.tap(fingers, ele, duration);
	}
	
	public static void tap(int fingers, int X, int Y, int duration)
	{
		driver.tap(fingers, X, Y, duration);
	}
	@Test
	public void clickActionUsingGenericMethod() throws MalformedURLException, InterruptedException
	{	
	
	DesiredCapabilities dc = new DesiredCapabilities();
	
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
	dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	dc.setCapability("appActivity", ".Calculator");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	
	driver = new AndroidDriver(url, dc);
	
	Thread.sleep(3000);
	
	WebElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
	tap(1, five, 500);
	
	Thread.sleep(2000);
	
//	WebElement multi = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
//	tap(1, multi, 500);
	
	driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul")).click();
	
	WebElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
	tap(1, nine, 500);
	
//	WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
//	tap(1, 603, 1409, 500);
	
	driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
	
	
	String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
	
	System.out.println(result);
	
	}
}
