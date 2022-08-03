package genericUtilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public static AndroidDriver driver;
	public static AppiumDriverLocalService server;
	
	@BeforeSuite
	public void connectToDataBase()
	{
		System.out.println("Data Base connection is established");
	}

	@BeforeClass
	public void launchServer()
	{
		server = AppiumDriverLocalService.buildDefaultService();
		server.start();
		System.out.println("Serevr is launched successfully");
		
		driver.get("http://localhost:4723/wd/hub");
		
		System.out.println("Default server is connected successfully");
	}

	
	@BeforeMethod
	public void lauchApplication(String OSName, String Version, String Serialnum, String DeviceName, String PackageName, String ActivityName )
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, IpathConstantAppium.OSName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, IpathConstantAppium.Version);
		dc.setCapability(MobileCapabilityType.UDID, IpathConstantAppium.Serialnum);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, IpathConstantAppium.DeviceName);
		dc.setCapability("appPackage", IpathConstantAppium.PackageName);
		dc.setCapability("appActivity", IpathConstantAppium.ActivityName);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		driver = new AndroidDriver(dc);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.closeApp();
	}
	
	@AfterClass
	public void closeServer()
	{
		server.stop();
	}
	
	@AfterSuite
	public void closeToDataBase()
	{
		System.out.println("Data Base connection is closed");
	}
}

