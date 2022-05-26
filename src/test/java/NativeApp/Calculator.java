package NativeApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();


		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Samsung");// Android Emulator

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");

		dc.setCapability("appPackage","com.google.android.calculator");

		dc.setCapability("appActivity","com.android.calculator2.Calculator");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver(url,dc);

		Thread.sleep(500);

		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();  // 7
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();   // +
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click(); // -
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();   // 8
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();      // =

		String result = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();

		if(result.equals("15"))

			System.out.println("Result is Passed....");
		else

			System.out.println("Result is failed....");




	}

}
