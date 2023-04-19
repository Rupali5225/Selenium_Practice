package day11.switchtostatements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			//get text from Alert popup
			String alertText=driver.switchTo().alert().getText();
			System.out.println("Alert pop msg: "+alertText);
			//click on OK button of Alert
			driver.switchTo().alert().accept();
		}
	

}
