package seyahatProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PercentageSortTest {
	
	@Test
	
	public void PercentageSortingItems() throws MalformedURLException, InterruptedException
	{
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME	, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Offers']")).click();
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[3]")).click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<WebElement> scroll1 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtPromoAddSavings']"));
		
		List<WebElement> name1 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
		
		
		for(WebElement page1:scroll1)
		{
			String list1 = page1.getText();
			System.out.println(list1);
		
		
		for(WebElement prdname1:name1)
		{
			String namelist1 = prdname1.getText();
			System.out.println(namelist1);
		
		
		driver.swipe(511, 1330, 442, 403, 200);
		//driver.swipe(388, 623, 266, 174, 200);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<WebElement> scroll2 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtPromoAddSavings']"));
		List<WebElement> name2 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
		
		
		for(WebElement page2:scroll2)
		{
			String list2 = page2.getText();
			System.out.println(list2);
		
		
		for(WebElement prdname2:name2)
		{
			String namelist2 = prdname2.getText();
			System.out.println(namelist2);
					
		String listprice1 = list1.replace("[^0-9]", "");
		String listprice2 = list2.replace("[^0-9]", "");
		
		
		 double price1 = Double.parseDouble(listprice1);
		 double Price2 = Double.parseDouble(listprice2);
		 
		 
		 
		
//		HashMap<double, String> map = new HashMap<Integer, String>();
//		
//		for(int i=0; i<name1.size();i++)
//		{
//			map.put(price1, namelist1);
//			map.put(Price2, namelist2);
//			
//		}
//r		System.out.println(map);
		
	}
		}
		}
		}
	}
	
}
