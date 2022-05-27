package NativeApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dial_a_number {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();


		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Samsung");// Android Emulator

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");

		dc.setCapability("appPackage","com.samsung.android.dialer");

		dc.setCapability("appActivity","com.samsung.android.dialer.DialtactsActivity");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver(url,dc);

		Thread.sleep(3000);

		driver.findElement(By.id("com.samsung.android.dialer:id/nine")).click(); //9
		driver.findElement(By.id("com.samsung.android.dialer:id/eight")).click(); //8
		driver.findElement(By.id("com.samsung.android.dialer:id/zero")).click(); // 0
		driver.findElement(By.id("com.samsung.android.dialer:id/six")).click(); //6
		driver.findElement(By.id("com.samsung.android.dialer:id/five")).click(); //5
		driver.findElement(By.id("com.samsung.android.dialer:id/two")).click(); //2
		driver.findElement(By.id("com.samsung.android.dialer:id/six")).click(); //6
		driver.findElement(By.id("com.samsung.android.dialer:id/six")).click(); //6
		driver.findElement(By.id("com.samsung.android.dialer:id/zero")).click(); //0
		driver.findElement(By.id("com.samsung.android.dialer:id/four")).click(); //4
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.samsung.android.dialer:id/dialButton")).click(); // dial button
		
		Thread.sleep(5000);

		driver.quit();
		
		
		
	}

}
