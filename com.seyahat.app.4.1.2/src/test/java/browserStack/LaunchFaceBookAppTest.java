package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchFaceBookAppTest {
	
	public static final String USERNAME = "lohithrm_1P9V76";
	public static final String AUTOMATE_KEY = "ro4aaLSwyRszzrzqxjrz";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main (String[] args) throws MalformedURLException
	{
		//Desired capabilities of device to connect the device and application
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability("os_version", "12.0");
				dc.setCapability("device", "Samsung Galaxy S22");
				dc.setCapability(MobileCapabilityType.UDID, "R5CT11V0ZGX");
				//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
				dc.setCapability("build", "Build#1");
				dc.setCapability("project", "Samplesandboxproject");
				//dc.setCapability("appPackage", "com.facebook.katana");
				//dc.setCapability("appActivity", ".LoginActivity");
				
				// To connect the appium server using url
				URL url = new URL("http://localhost:4723/wd/hub");
				
				// Launch the driver using url and desired capabilities
				WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
				
				driver.get("http://www.gmail.com");
	}

}
