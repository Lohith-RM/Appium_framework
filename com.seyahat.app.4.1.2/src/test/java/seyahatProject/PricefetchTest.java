package seyahatProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PricefetchTest {
	
	@Test
	public void pricefetch() throws MalformedURLException
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
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Offers']")).click();
		
	    driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<WebElement> prdtname = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
		
		List<WebElement> price = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
		
			for(int i=0; i<price.size();i++)
				
			{
				String price1 = price.get(i).getText();
					
				String pr = price1.substring(1);			
				
				double in = Double.parseDouble(pr);
				
				//for(int n=0; n<price.size();n++)
					if(in>=50)
					{
					
				System.out.println(prdtname.get(i).getText()+"is the product having high prices"+in);
				break;
			}
		}
			}
	
	}
	

