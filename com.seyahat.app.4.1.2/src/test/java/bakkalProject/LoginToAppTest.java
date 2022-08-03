package bakkalProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class LoginToAppTest extends BaseClass{

	
	@Test
	
	public void ApplicationLogin()
	
	{
		// Click on More button and provide valid phone number and Name and click on submit button.
		
		driver.findElementByAccessibilityId("More").click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"077609 54924\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
		driver.findElement(By.id("in.dmart:id/btnLoginInUser")).click();
	}
}
