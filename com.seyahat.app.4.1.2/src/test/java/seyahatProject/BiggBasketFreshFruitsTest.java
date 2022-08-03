package seyahatProject;

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BiggBasketFreshFruitsTest {
	
	
	@Test
	
	public void getHighestPrice() throws MalformedURLException, InterruptedException
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
		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		+++
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Explore Bangalore Store']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Fruits & Vegetables']")).click();
		
		 WebElement freshfruits = driver.findElement(By.xpath("//android.widget.TextView[@text='Fresh Fruits']"));
		 freshfruits.click();
		 
		 String actual1 = freshfruits.getText();
		 //System.out.println(actual1);
		 String expected1="Fruits";
		 
		 Assert.assertTrue(actual1.contains(expected1));
		System.out.println("Fresh-Fruit page is displayed");

		List<WebElement> whole = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
		
		for(WebElement home:whole)
		{
			String fruitsname = home.getText();
			
			System.out.println(fruitsname);
			
		}
		List<WebElement> wholeprice = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
		
		
		for(WebElement paisa:wholeprice)
		{
			System.out.println(paisa.getText());
		}
		
		
		HashMap<Integer, String> finalproducts=new HashMap<Integer, String>();
		for(int i=0; i<wholeprice.size(); i++)
		{
			String productname = whole.get(i).getText();
			String productprice = wholeprice.get(i).getText();
			
			String productPrice = productprice.replaceAll("[^ 0-9]", "");
			
			int price = Integer.parseInt(productPrice);
			
			finalproducts.put(price, productname);
		}
			
			Set<Integer> allkeys = finalproducts.keySet();
			
			ArrayList<Integer> arr = new ArrayList<Integer>(allkeys);
			
			Collections.sort(arr);
			
			int highprice = arr.get(arr.size()-1);
			
			int  lowprice = arr.get(0);
			
			int actual2 = highprice;
			int expected2 = highprice;
			 
			 System.out.println("highestprice is"+highprice+"");
			 System.out.println("lowestprice is"+lowprice+"");
			// break;
			 
			 Assert.assertTrue(allkeys.contains(highprice));
			 System.out.println("The given price is higher");
			
			
		}		
	}		


