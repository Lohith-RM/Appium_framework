package seyahatProject;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchingBigBasketAppTest {
	
	@Test
	
	public void launchBigBasketApp() throws MalformedURLException, InterruptedException
	
	{
		// To Launch the Application
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME	, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// Click on Home button
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
		
		// Click on Drawer icon
		driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer")).click();
		
		//Click on offers
		driver.findElement(By.xpath("//android.widget.TextView[@text='Offers']")).click();
		
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Click on Fruits & vegetables image
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]")).click();
		
		//Click on Onion text and price
		MobileElement onion = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Onion (Loose)']"));	
		MobileElement onionprice = (MobileElement) driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.bigbasket.mobileapp:id/relativeLayoutBrand']//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
		System.out.println(onion.getText());
		System.out.println(onionprice.getText());
		
		Thread.sleep(3000);
		// Click on Potato text and price
		MobileElement potato = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Potato (Loose)']"));
		MobileElement potatoprice = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='₹38']"));		
		System.out.println(potato.getText());
		System.out.println(potatoprice.getText());
		
		Thread.sleep(3000);
		
		// Click on Tomato text and price
		MobileElement tomato = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Tomato - Local (Loose)']"));
		MobileElement tomatoprice = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='₹10']"));
		System.out.println(tomato.getText());
		System.out.println(tomatoprice.getText());
		
		Thread.sleep(3000);
	    // Price list
	   MobileElement price = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));    
	   System.out.println(price.getText());
	    
	    String actualname = price.getText();
	    Assert.assertTrue(actualname.contains((CharSequence) onion));
	    System.out.println("Onion product is present in offer demo");
	    
	   
	    
	    
	    //androidx.recyclerview.widget.RecyclerView
	    
//	  String contains = price.getText();
//	  
//	  System.out.println(contains);
//	  
//	  if(contains.equals(onionprice))
//	  {
//		  System.out.println("Onion");
//	  }
//	    
//	    
//		// more than 
//		
		
		
//		 List<WebElement> catageory = driver.findElements(By.xpath("(//android.widget.FrameLayout[@resource-id='com.bigbasket.mobileapp:id/gridTopView'])[1]"));
//		
//		for(WebElement listname:catageory)
//		{
//		
//			String list = listname.getText();
//			System.out.println(list);
//		}
//		
//		WebElement bevereage = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[4]"));
//		
//		System.out.println(bevereage.getText());
//		
//		
//		
//		WebElement Gourmet = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[4]"));
//		
//		System.out.println(Gourmet.getText());
//		
//		beautyhydiene=driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[6]"));
		
	}

}
