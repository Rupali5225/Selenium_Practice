package day12.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrm extends SeleniumUtility {
  @Test
	public void testCase1() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Thread.sleep(1500);
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByName('username')[0].value='Admin'");
		//identifying elements from the UI using JavaScript and typing required value in it
		Thread.sleep(1500);

		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
		Thread.sleep(1500);
		Thread.sleep(1500);

		js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
		
//		WebElement element=driver.findElement(By.id("loginButton"));
//		js.executeScript("arguments[0].click();", element);
	}
}
