package genericUtilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public static AndroidDriver< MobileElement> driver;
	AppiumDriverLocalService server;
	@BeforeSuite
	public void connectToDataBase() {
		System.out.println("Data Base Connection is Established.");
	}
	@BeforeClass
	public void startTheServer() {
		 server = AppiumDriverLocalService.buildDefaultService();
		server.start();
		driver.get("http://localhost:4723/wd/hub");
		System.out.println("Appium Server Started Sucessifully.");
	}
	@BeforeMethod
	public void launchTheApp() {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, IPathConstant.platFormName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, IPathConstant.platFormVersion);
		dc.setCapability(MobileCapabilityType.UDID, IPathConstant.deviceID);
		dc.setCapability("appPackage", IPathConstant.appPackage);
		dc.setCapability("appActivity", IPathConstant.appActivity);
		driver=new AndroidDriver<MobileElement>(dc);
		System.out.println("Application is Sucessifully Launched");
		
	}
	@AfterMethod
	public void closeTheApp() {
		driver.closeApp();
		System.out.println("Application is Sucessifully Closed.");
	}
	@AfterClass
	public void closeTheServer() {
		server.stop();
		System.out.println("Appium Server Closed Sucessifully.");
	}
	@AfterSuite
	public void closeDataBaseConnection() {
		System.out.println("DataBase Connection is Closed Sucessifully.");
	}

}
