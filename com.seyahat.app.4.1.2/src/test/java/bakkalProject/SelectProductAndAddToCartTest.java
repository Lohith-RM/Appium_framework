package bakkalProject;

import org.openqa.selenium.By;

import genericUtilities.BaseClass;

public class SelectProductAndAddToCartTest extends BaseClass{
	
	public void selectProductAndAddingToCart()
	{
		// Click on View all catagories button.
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='in.dmart:id/img_banner'])[1]")).click();
		
		// Click on Grocery module.
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Grocery']")).click();
		
		// Click on Flours & Grains module.
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Flours & Grains']")).click();
		
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")
		
		// Click on pillsbury chakki fresh atta tab.
		
		//driver.findElement(By.)
	}

}
