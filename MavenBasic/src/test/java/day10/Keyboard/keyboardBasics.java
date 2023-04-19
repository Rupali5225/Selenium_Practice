package day10.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilities.SeleniumUtility;

public class keyboardBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
		SeleniumUtility.driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	}

}
