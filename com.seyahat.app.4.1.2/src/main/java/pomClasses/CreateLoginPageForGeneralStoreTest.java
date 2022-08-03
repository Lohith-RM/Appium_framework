package pomClasses;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateLoginPageForGeneralStoreTest {
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement usertxtbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement maleradiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement femaleradiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement submitbtn;

	public WebElement getUsertxtbox() {
		return usertxtbox;
	}

	public MobileElement getMaleradiobtn() {
		return maleradiobtn;
	}

	public MobileElement getFemaleradiobtn() {
		return femaleradiobtn;
	}

	public MobileElement getSubmitbtn() {
		return submitbtn;
	}
	
	public CreateLoginPageForGeneralStoreTest(AndroidDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void login()
	
	{
		usertxtbox.sendKeys("keerthana");
		femaleradiobtn.click();
		submitbtn.click();
	}

}
