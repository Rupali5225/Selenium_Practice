package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class OrangeHrmInsertionDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[name=\"middleName\"]")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("ABC");
		
		WebElement id = driver.findElement(By.cssSelector("div[class='oxd-input-group oxd-input-field-bottom-space']>div>input[class=\"oxd-input oxd-input--active\"]"));
		String id1 = id.getAttribute("value");
		System.out.println("id is : "+id1);
		
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		 WebElement searchIdTxtField=driver.findElement(By.cssSelector("div[class=\"oxd-input-group oxd-input-field-bottom-space\"]>div>input[class=\"oxd-input oxd-input--active\"]"));
		 searchIdTxtField.sendKeys(id1);
		 driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		 
	//	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 WebElement SearchedId = driver.findElement(By.cssSelector("div[class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]>:nth-child(2)>div"));
		System.out.println("SearchedId.getAttribute(\"value\")" +SearchedId.getText());
		 if(SearchedId.getText()==id1) {
			 System.out.println("found");
		 }
		 else {
			 System.out.println("NOT");
		 }
		// driver.findElement(By.cssSelector("div[class = 'orangehrm-container']>div>:nth-child(2)>div>div>div>div>div>label>span>i")).click();

		// driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]")).click();
	}

}
