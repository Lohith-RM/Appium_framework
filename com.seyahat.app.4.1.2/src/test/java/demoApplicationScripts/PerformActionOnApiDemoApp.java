package demoApplicationScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnApiDemoApp {
@Test
	
	public void clickActiononApp() throws MalformedURLException
	
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		//continue button
		MobileElement contnue = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, contnue, 200);
		
		//ok button
		MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbtn, 200);
		
		//views button
		driver.tap(1, 94, 1208, 200);
		
		//controls button
		
		driver.tap(1, 97, 641, 200);
		//MobileElement control = (MobileElement) driver.findElementByAccessibilityId("Custom");
		//driver.tap(1, control, 200);
		
		//light theme button
		MobileElement lighttheme = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]"));
		driver.tap(1, lighttheme, 200);
		
		//edit text box
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Lohith");
		
		//keyboard close
		driver.hideKeyboard();
		
		//checkbox-01
		MobileElement checkbox1 = (MobileElement) driver.findElementByAccessibilityId("Checkbox 2");
		driver.tap(1, checkbox1, 200);
		
		//checkbox-02
		MobileElement checkbox2 = (MobileElement) driver.findElementByAccessibilityId("RadioButton 1");
		driver.tap(1, checkbox2, 200);
		
		//radio button-01
		MobileElement radiobtn1 = (MobileElement) driver.findElementByAccessibilityId("RadioButton 2");
		driver.tap(1, radiobtn1, 200);
		
		//radio button-02
		driver.tap(1, 36, 682, 200);
		
		//star button
		driver.tap(1, 31, 766, 200);
		
		//toggle-01
		driver.tap(1, 54, 840, 200);
		
		//toggle-02
		driver.tap(1, 61, 863, 200);
		
		MobileElement toggle2 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, toggle2, 200);
		
		//dropdown
		MobileElement dropdown = (MobileElement) driver.findElementByAccessibilityId("textColorPrimary");
		driver.tap(1, dropdown, 200);
		
		//select earth option
		WebElement earth = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Mars']"));
		driver.tap(1, earth, 200);
		
		MobileElement dropdown1 = (MobileElement) driver.findElementByAccessibilityId("textColorPrimary");
		driver.tap(1, dropdown1, 200);
		
		List<WebElement> list = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		
		for(WebElement titles:list)
		{
			
			String planets = titles.getText();
		System.out.println(planets);
		}
		
		//save button
		driver.tap(1, 49, 199, 200);

	}
}
