package day12.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class LoginOrangeHrm extends SeleniumUtility {
	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementById('username').value='Admin'");
		
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
		
		js.executeScript("document.getElementById('loginButton').click();");
		
//		WebElement element=driver.findElement(By.id("loginButton"));
//		js.executeScript("arguments[0].click();", element);
	}
}
