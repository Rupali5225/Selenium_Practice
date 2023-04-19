package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class FlipKartDepenedentIndependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
			SeleniumUtility.driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
			SeleniumUtility.driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();
			SeleniumUtility.driver.findElement(By.cssSelector("img[src=\"https://rukminim1.flixcart.com/fk-p-flap/844/140/image/ff23ee143f2a3f50.jpg?q=50\"]\r\n" + 
					"")).click();
			
			SeleniumUtility.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			WebElement e1 = SeleniumUtility.driver.findElement(By.xpath("//div[div[div[text() = 'SAMSUNG Galaxy F14 5G (OMG Black, 128 GB)']]]/div[2]/div/div/div"));
			System.out.println("vnbvnvvnv"+e1.getText());
//			List<WebElement> CustomerList = SeleniumUtility.driver.findElements(By.xpath("//a[div[text()='Poco M4 Pro AMOLED']]/div[4]")); 
//					
//
//			for (int i = 0; i <= CustomerList.size() - 1; i++) {
//				System.out.println("customelist" + i + ":" + CustomerList.get(i).getText());
//			}
	}

}
