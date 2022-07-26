package Jedestine.Categories.Men;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TrileTest {
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "RAHUL");
		dc.setCapability(MobileCapabilityType.UDID, "THC3Y18B28001513");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
