package day10.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class CopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SeleniumUtility.setUp("chrome", "http://demo.automationtesting.in/Register.html");
//		// identify first name input field
//		WebElement firstName = SeleniumUtility.driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//		// type first name as admin and use ctrl+a
//		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
//		
//		WebElement lastName = SeleniumUtility.driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//		
//		lastName.sendKeys(Keys.CONTROL,"v");

		
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		/*		
		 * Login in actitime without clicking on login button
		 */
		WebElement userName=driver.findElement(By.id("username"));
		SeleniumUtility.typeInput(userName, "admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		SeleniumUtility.typeInput(password, "manager");
		//press enter button from Keyboard
		password.sendKeys(Keys.ENTER);
	}

}
