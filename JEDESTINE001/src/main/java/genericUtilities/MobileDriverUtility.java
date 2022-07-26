package genericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
/**
 * contains all reusable Actions of Webdriver 
 * @author SAGAR NAYAK
 *
 */
public class MobileDriverUtility {

	/**
	 * it's an implicitly wait  Always wait for Element in DOM document & release the control if element available 
	 * Implicity Wait
	 * @param driver
	 * @param Time
	 */
	public void waitForPageToLoad(AndroidDriver<MobileElement> driver,int Time) {
		driver.manage().timeouts().implicitlyWait(Time,TimeUnit.SECONDS);
	}
	/**
	 * It will wait for JS element
	 * Implicity Wait
	 * @param driver
	 * @param Time
	 */
	public void waitForPageToLoadForJSElement(AndroidDriver<MobileElement> driver,int Time) {
		driver.manage().timeouts().setScriptTimeout(Time, TimeUnit.SECONDS);
	}
	/**
	 * it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * Explicity wait
	 * @param driver
	 * @param element
	 * @param Time
	 */
	public void waitForElementToBeClickable(AndroidDriver<MobileElement> driver,MobileElement element,int Time) {
		WebDriverWait wait=new WebDriverWait(driver, Time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * Explicity wait
	 * @param driver
	 * @param Title
	 * @param Time
	 */
	public void waitForTitleContains(AndroidDriver<MobileElement> driver,String Title,int Time) {
		WebDriverWait wait=new WebDriverWait(driver, Time);
		wait.until(ExpectedConditions.titleContains(Title));
	}
	/**
	 * Here we can change the polling time from 500ms(default) to any polling time
	 * Fluent Wait
	 * @param driver
	 * @param pollingTime
	 * @param element
	 */
	public void waitForElementToCustom(AndroidDriver<MobileElement> driver,int pollingTime,MobileElement element) {
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(pollingTime, TimeUnit.SECONDS);
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * Here we will scroll the page to a specific mobile element Through attribut name and attribute value of the Element
	 * @param driver
	 * @param An
	 * @param Av
	 */
	public void scrollToElement(AndroidDriver<MobileElement> driver,String An,String Av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+An+"(\""+Av+"\"))");
	}
	
	public void tapToElement(AndroidDriver<MobileElement> driver,MobileElement element) {
		driver.tap(1, element, 200);
	}
}
