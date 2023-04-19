package day11.switchtostatements;
import java.awt.Font;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

import utilities.SeleniumUtility;


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.rakuten.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("header_sign_in")).click();
		
		WebElement frame = driver.findElement(By.id("auth-microsite-iframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("emailAddress")).click();

		driver.findElement(By.id("emailAddress")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("password")).click();

		driver.findElement(By.id("password")).sendKeys("abcd@1234");
		
		driver.findElement(By.id("email-auth-btn")).click();
		
		WebElement errorMSg =driver.findElement(By.cssSelector("div[role = 'alert']"));
		String errorColorInRGBA = errorMSg.getCssValue("color");
		String FontOfErr = errorMSg.getCssValue("font");
		String errMsgText = errorMSg.getText();
		
		System.out.println("errorColorInRGBA : "+errorColorInRGBA +"FontOfErr : "+FontOfErr+ "errMsgText : "+errMsgText);

		
	

		
		
		
		}

}
