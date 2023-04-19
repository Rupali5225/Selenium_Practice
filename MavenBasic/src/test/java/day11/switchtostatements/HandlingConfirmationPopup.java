package day11.switchtostatements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingConfirmationPopup {
public static void main(String args[]) {
	WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	//get text from confirmation popup
	String alertText=driver.switchTo().alert().getText();
	System.out.println("Alert pop msg: "+alertText);
	//click on OK button of Alert
	//driver.switchTo().alert().accept();
	
	//click on Cancel button
	driver.switchTo().alert().dismiss();
}
}
