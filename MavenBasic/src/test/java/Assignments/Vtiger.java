package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

			//SeleniumUtility.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			WebElement usernameTxtField = driver.findElement(By.id("username"));
			usernameTxtField.clear();
			usernameTxtField.sendKeys("admin");
			WebElement passwordField = driver.findElement(By.id("password"));	
			passwordField.clear();
			passwordField.sendKeys("Test@123");
			driver.findElement(By.cssSelector("button[type='submit'][class=\"button buttonBlue\"]")).click();
			
			
			driver.findElement(By.xpath("//div[@id=\"appnavigator\"]//div//span")).click();
			driver.findElement(By.xpath("//span[text()= ' MARKETING']")).click();
			
	
			driver.findElement(By.xpath("//a[@"
					+ "href=\"index.php?module=Campaigns&view=List&app=MARKETING\"][@title=\"Campaigns\"]")).click();
			
			driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
			
			
			driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("xyz");

			driver.findElement(By.xpath("//div[@class=\"select2-container inputElement select2\"]//a[@tabindex=\"-1\"]//span[text()=\"Atlas Jeniffer\"]")).click();
			//driver.findElement(By.cssSelector("ul[class = 'select2-results']>li>ul>li")).click();
			driver.findElement(By.cssSelector("ul[id = 'select2-results-2']>li>ul>li>div")).click();
			
			//driver.findElement(By.xpath("//div[@class=\"select2-container inputElement select2\"]//a[@tabindex=\"-1\"]//span[text()=\"Atlas Jeniffer\"]")).click();

			
			driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
			
			driver.findElement(By.cssSelector("div[class=\"datepicker-days\"]>table>tbody>:nth-child(4)>:nth-child(4)")).click();
			
			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			
			
			//after submiting
			driver.findElement(By.cssSelector("div[class='module-action-content clearfix Campaigns-module-action-content']>div>a")).click();
			//select checkbox
			driver.findElement(By.cssSelector(".overflow-y>:nth-child(1)>td>div>span")).click();
			
			
			
			//Edit code
			
			driver.findElement(By.cssSelector("button[title=\"Edit\"]")).click();
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("test1");

			driver.findElement(By.xpath("//div[@class=\"select2-container inputElement select2\"]//a[@tabindex=\"-1\"]//span[@id=\"select2-chosen-16\"]")).click();
			//driver.findElement(By.cssSelector("ul[class = 'select2-results']>li>ul>li")).click();
			driver.findElement(By.cssSelector("ul[id = 'select2-results-16']>li>ul>li>div")).click();
			
			//driver.findElement(By.xpath("//div[@class=\"select2-container inputElement select2\"]//a[@tabindex=\"-1\"]//span[text()=\"Atlas Jeniffer\"]")).click();

			
			driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
			
			driver.findElement(By.cssSelector("div[class=\"datepicker-days\"]>table>tbody>:nth-child(4)>:nth-child(4)")).click();
			
			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			
			
			driver.findElement(By.cssSelector(".overflow-y>:nth-child(1)>td>div>:nth-child(1)")).click();
			driver.findElement(By.cssSelector("button[id=\"Campaigns_listView_massAction_LBL_DELETE\"]")).click();
			
			driver.switchTo().alert().accept();
	}

}
			
			/*driver.findElement(By.xpath("//input[@name=\"campaignname\"]")).sendKeys("ABC");
			
			driver.findElement(By.xpath("//div[@id = 'mCSB_9_container']")).click();
			List<WebElement> campignlist =  driver.findElements(By.cssSelector("ul[class=\"select2-results mCustomScrollbar _mCS_10 mCS_no_scrollbar\"]>li"));
			for(int i =0;i<=campignlist.size()-1;i++) {
				System.out.println("campign element" +i +":   " +campignlist.get(i));
			}
			campignlist.get(1).click();
			driver.findElement(By.id("s2id_autogen2")).sendKeys(Keys.TAB);

			
			driver.findElement(By.xpath("//div[@id = 'mCSB_11_container']")).click();
			List<WebElement> campignStatusList = driver.findElements(By.xpath("//ul[@class= 'select2-results mCustomScrollbar _mCS_12 mCS_no_scrollbar']//li"));
			for(int i =0;i<=campignStatusList.size()-1;i++) {
				System.out.println("campignStatusList element" +i +":   " +campignStatusList.get(i).getText());
			}
			campignStatusList.get(1).click();
			driver.findElement(By.cssSelector("input[id='s2id_autogen4']")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//input[@name= 'expectedrevenue']")).sendKeys("100");
			
//			//calender
//			driver.findElement(By.cssSelector("input[name=\"closingdate\"]")).click();
//			driver.findElement(By.cssSelector("div[class=\"date-picker-wrapper\"]>div[class=\"month-wrapper\"]>table>tbody>:nth-child(3)>:nth-child(4)>:nth-child(1)")).click();
//			driver.findElement(By.cssSelector("input[name=\"closingdate\"]")).sendKeys(Keys.TAB);
			
			
			driver.findElement(By.xpath("//div[@id = 'mCSB_13_container']")).click();
			driver.findElement(By.cssSelector("ul[class = 'select2-results mCustomScrollbar _mCS_14 mCS_no_scrollbar']>li>ul")).click();
*/
			

