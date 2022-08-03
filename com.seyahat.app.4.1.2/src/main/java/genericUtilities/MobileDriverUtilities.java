package genericUtilities;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtilities {
	
	/**
	 * To scroll the page using Attribute value and Attribute name
	 * @param driver
	 * @param an
	 * @param av
	 */
	public static void scrollToElement(AndroidDriver driver, String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	/**
	 * To ZoomIn the image using webelement
	 * @param driver
	 * @param element
	 */
	public static void zoomInApplication(AndroidDriver driver, WebElement element)
	
	{
		driver.zoom(element);
	}
	
	/**
	 * To zoomOut or pinch the image using webelement
	 * @param driver
	 * @param element
	 */
	public static void zoomOutOrPinchApplication(AndroidDriver driver, WebElement element )
	{
		driver.pinch(element);
	}
	
	/**
	 *  To perform Tap action using webelement
	 * @param driver
	 * @param fingers
	 * @param ele
	 * @param duration
	 */
	public static void tap( AndroidDriver driver, int fingers, WebElement ele, int duration)
	{
		driver.tap(fingers, ele, duration);
	}
	
	/**
	 *  To perform Tap action using Co-ordinates
	 * @param driver
	 * @param fingers
	 * @param X
	 * @param Y
	 * @param duration
	 */
	public static void tap(AndroidDriver driver, int fingers, int X, int Y, int duration)
	{
		driver.tap(fingers, X, Y, duration);
	}
	
	/**
	 *  To perform DragandDrop 
	 */
	
	public static void dragAndDropTheElement(AndroidDriver driver, WebElement src, WebElement dst)
	{
		TouchAction ta = new TouchAction(driver);
		
		ta.longPress(src).moveTo(dst).release().perform();
	}
	

	
}
