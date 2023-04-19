package day11.switchtostatements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;
public class HandlingPromptPopup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");

		WebElement w1 = driver.findElement(By.xpath("//button[text()='Try it']"));
		w1.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertetxt "+ "is"+alertText);
		driver.switchTo().alert().sendKeys("Pune");
		
		//click on OK button of Alert
				//driver.switchTo().alert().accept();
				
				//click on Cancel button
				driver.switchTo().alert().dismiss();
	}

}
