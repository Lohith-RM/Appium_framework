package webApplicationsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApplicationTestThroughChromeInspectTest {
	
	@Test
	
	public void webApplicationTest() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "R58R35AN7BH");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//dc.setBrowserName("Chrome");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.abhibus.com/");
		
		//driver.findElement(By.xpath("//div[@class='home-bus-icon']")).click();
		
		driver.findElement(By.xpath("//div[@id='sourceCity']")).click();
		driver.findElement(By.xpath("//div[@class='search-bar']//input[@type='text']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		
		driver.findElement(By.xpath("//span[text()='Going To']")).click();
		driver.findElement(By.xpath("//div[@class='search-bar']//input[@type='text']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//div[text()='Mysore']")).click();
		
		driver.findElement(By.xpath("//div[@class='container-month']")).click();
		
		driver.findElement(By.xpath("//i[@class='right-arrow']")).click();
		
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		
		driver.findElement(By.xpath("//div[@id='1170589262']//h3[text()='SRS Travels and Logistics Private Limited']")).click();
		
		driver.findElement(By.xpath("//div[text()='₹ 650']")).click();
		
		driver.findElement(By.xpath("//div[text()='UPPER']")).click();
		
		driver.findElement(By.xpath("//a[text()='10U']")).click();
		
		driver.findElement(By.xpath("//div[@class='bus-details2']")).click();
		
		driver.findElement(By.xpath("//div[@class='bus-details3 booking-details-close ng-scope']")).click();
		
		driver.findElement(By.xpath("//input[@id='procced']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Boarding Point']")).sendKeys("kalasipalyam");
		
		driver.findElement(By.xpath("//div[@class='brd ng-scope']//div[@class='ng-binding']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Dropping Point']")).sendKeys("Gandhi");
		
		driver.findElement(By.xpath("//label[@class='ng-binding ng-scope']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lohithgowdarm@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7760954924");
		
		driver.findElement(By.xpath("//div[@class='whatsapp-option ng-scope']")).click();
		
		driver.findElement(By.xpath("//div[@class='whatsapp-option ng-scope']")).click();
		
		driver.findElement(By.xpath("//input[@id='psgrNames0']")).sendKeys("kiran");
		
		driver.findElement(By.xpath("//input[@id='psgrAge0']")).sendKeys("33");
		
		//error occur
		driver.findElement(By.xpath("//label[@class='rb-switcher male']//input[@name='sex0']")).click();
		
		driver.findElement(By.xpath("//input[@id='proccedpay']")).click();
		
		driver.closeApp();
		
		driver.close();
		
		
		
		
		
		
		
	
	
	}

}
