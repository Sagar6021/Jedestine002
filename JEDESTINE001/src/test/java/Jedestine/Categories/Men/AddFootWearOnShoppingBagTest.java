package Jedestine.Categories.Men;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.MobileDriverUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddFootWearOnShoppingBagTest extends BaseClass {
	AndroidDriver<MobileElement> driver;
	@Test
	public void addFootWearOnShoppingBagTest() throws MalformedURLException, InterruptedException {
		MobileDriverUtility mLib=new MobileDriverUtility();
		
		mLib.waitForPageToLoad(driver, 10);
		
		//Click On Profile Icone
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Profile']")).click();
		
		//Click On login/SignUp Link
		//driver.findElement(By.xpath("//android.widget.TextView[@text='LOG IN/SIGN UP']")).click();
		
		//Enter Mobile Number
		//driver.findElementByAccessibilityId("mobile").sendKeys("8144194223");
		
		//Click On Continue
		//driver.findElementByAccessibilityId("form-button").click();
		//Thread.sleep(4000);
		
		//Click On Categories Module
		driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']")).click();
		
		//Click On Men Module
		driver.findElement(By.xpath("//android.widget.TextView[@text='MEN']")).click();
		
		//Click On FootWear Module
		driver.findElement(By.xpath("//android.widget.TextView[@text='Footwear']")).click();
		
		//Click On Sports Shoes Link
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sports Shoes']")).click();
		
		
		//scrollToElement(driver, "class", "_highlighter-box_619e8 _inspected-element-box_619e8");
		
		//Click On Training & Gym Shoes Link
		
		
		//Click On Men's sports shoe store
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"feed_banner|https://www.myntra.com/mens-sports-shoes-store\"])[1]/android.widget.ImageView")).click();
		
		//Click On Product
		driver.findElement(By.xpath("//android.widget.TextView[@text='Red Tape']")).click();
		
		mLib.scrollToElement(driver, "content-desc", "size_select_0");
		
		//Click On size(6)
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='size_select_0']/android.view.ViewGroup/android.view.ViewGroup")).click();
		
		//Click On Add TTo Bag
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO BAG']")).click();
		
		//Click On Go To Bag
		driver.findElement(By.xpath("//android.widget.TextView[@text='GO TO BAG']")).click();
		
		//Check The Product
		boolean productStatus = driver.findElement(By.xpath("//android.widget.TextView[@text='Red Tape']")).isDisplayed();
		Assert.assertEquals(productStatus, true);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		
		//Click On Profile Icone
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Profile']")).click();
		
		mLib.scrollToElement(driver, "text", "LOG OUT");
		
		//Click On LogOut Link
		//driver.findElement(By.xpath("//android.widget.TextView[@text='LOG OUT']")).click();
	}
	

}
