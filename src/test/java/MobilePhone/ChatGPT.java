package MobilePhone;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class ChatGPT {
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		
		try {
			OpenChatGPT();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static <MobileElement> void OpenChatGPT() throws Exception {
		DesiredCapabilities AI = new DesiredCapabilities();
		
		AI.setCapability("appium:deviceName","OnePlus 6T");
		AI.setCapability("appium:udid","ef40bf68");
		AI.setCapability("platformName","Android");
		AI.setCapability("appium:platformVersion","11");
		AI.setCapability("appium:appPackage","com.openai.chatgpt");
		AI.setCapability("appium:appActivity","com.openai.chatgpt.MainActivity");
		AI.setCapability("appium:automationName","UiAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AppiumDriver(url,AI);
		
		System.out.println("Application Opened....");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Continue\"]")));
		
		WebElement Click = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue\"]"));
		Click.click();
		
		Thread.sleep(5000);
		
		//WebElement Type = driver.findElement(By.xpath("//android.widget.EditText/android.view.View[1]"));
		WebElement Type = driver.findElement(By.xpath("//android.widget.EditText"));
		Type.click();
		Type.sendKeys("Mobile Testing");
		
		WebElement Enter = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Mobile Testing \"]/android.view.View[5]/android.widget.Button\r\n"
				+ ""));
		Enter.click();
		
		
		
		System.out.println("Mobile Testing Loaded.");
		
	}

	

}
