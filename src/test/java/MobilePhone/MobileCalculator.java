package MobilePhone;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileCalculator {

	static AppiumDriver driver;
	
	public static void main(String[] args) {
		try {
			CalculatorOpen();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	public static void CalculatorOpen() throws Exception {
		
	DesiredCapabilities caps = new DesiredCapabilities();
	
		caps.setCapability("appium:deviceName","OnePlus 6T");
		caps.setCapability("appium:udid","ef40bf68");
		caps.setCapability("platformName","Android");
		caps.setCapability("appium:platformVersion","11");
		caps.setCapability("appium:appPackage","com.oneplus.calculator");
		caps.setCapability("appium:appActivity","com.oneplus.calculator.Calculator");
		caps.setCapability("appium:automationName","UiAutomator2");
	
		URL url = new URL("http://127.0.0.1:4723/");
		
		driver = new AppiumDriver(url,caps);
		
		System.out.println("Application Started....");
		
		WebElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
		WebElement plus = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		WebElement three = driver.findElement(By.id("com.oneplus.calculator:id/digit_3"));
		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		WebElement results = driver.findElement(By.id("com.oneplus.calculator:id/result"));
		
		two.click();
		plus.click();
		three.click();
		equals.click();
		
		Thread.sleep(2000);
		
		String result = results.getText();
		
		System.out.println("\nResult is:" + " "+ result);
	}
}
