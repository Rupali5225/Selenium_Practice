package day13.switchtowindow;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import utilities.SeleniumUtility3;

public class ErailDemo extends SeleniumUtility {
public static void main (String args[]) throws InterruptedException {

		WebDriver driver = setUp("chrome", "https://erail.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		
		// get current window unique id
		String homePageWinId = driver.getWindowHandle();// T1
		System.out.println("Home page window ID: " + homePageWinId);
		
		driver.findElement(By.xpath("//a[text()=\"eCatering\"]")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// get all windows unique IDs which are opened by selenium current instance
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);// T1,T2

		// remove home window id from all window id dn you will get child window id
		allWinIds.remove(homePageWinId);// T2
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);

		// get child window id using iterator
		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		System.out.println("childWinId : " +childWinId );
		// now you can switch you control from Main window to child window
		driver.switchTo().window(childWinId);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(SeleniumUtility.driver, 60);
		//wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder=\"Search Train or Station to explore\"]"))));
		WebElement search = driver
				.findElement(By.xpath("//input[@placeholder=\"Search Train or Station to explore\"]"));
		search.click();
		driver
		.findElement(By.xpath("//input[@placeholder=\"Start typing Nagpur, NGP, Rajdhani\"]")).sendKeys("12627");
		WebElement train =  driver.findElement(
				By.cssSelector("div[class=\"top-109px absolute h-full overflow-y-auto\"]>div>button"));
		train.click();
		
		WebElement date =driver.findElement(By.xpath("//input[@class=\"form-input custom-date-picker h-11.5 pl-12 text-sm\"]"));
		date.click();
		for(int i = 0; i<4 ; i++) {
			date.sendKeys(Keys.ARROW_DOWN);
		}
		
		Thread.sleep(1000);
		for(int i = 0; i<2 ; i++) {

			date.sendKeys(Keys.ARROW_RIGHT);
		}
		
		date.sendKeys(Keys.ENTER);
		//datepicker.click();
		//datepicker.sendKeys(Keys.TAB);

		//datepicker.click();
		//datepicker.click();


//		datepicker.sendKeys(Keys.TAB);
//		datepicker.sendKeys(Keys.PAGE_DOWN);
//
//		datepicker.click();
//		
		
		/*
		WebElement Station = driver.findElement(By.xpath("//select[@placeholder=\"Boarding Station\"]"));
		Station.click();
		Select selectSkill = new Select(Station);
		selectSkill.selectByIndex(2);
		
//		driver.findElement(By.xpath("//button[text()=\"FIND FOOD\"]")).click();
//		
//		List<WebElement> RestaurantNames = driver.findElements(By.cssSelector("div[class=\"w-2/3 pl-6 flex flex-col gap-4 pt-10 pb-24\"]>div>:nth-child(2)>div>h5"));
//		for(int i=0;i<=RestaurantNames.size()-1;i++) {
//			System.out.println("RestaurantNames : " +i +RestaurantNames.get(i).getText());
//		}




		driver.switchTo().window(homePageWinId);
		
		WebElement from = driver.findElement(By.cssSelector("input[placeholder=\"From Station\"]"));
		//from.click();
		from.clear();
		from.sendKeys("pune");
		from.sendKeys(Keys.ENTER);
		
		WebElement To = driver.findElement(By.cssSelector("input[placeholder=\"To Station\"]"));
		To.click();
		To.clear();
		To.sendKeys("banglore");
		To.sendKeys(Keys.ENTER);
		
		WebElement Date = driver.findElement(By.cssSelector("input[title=\"Select Departure date for availability\""));
		Date.click();
		driver.findElement(By.cssSelector("table[class=\"Month\"]>tbody>:nth-child(6)>:nth-child(3)")).click();
		driver.findElement(By.cssSelector("input[value=\"Get Trains\"]")).click();
		
		List<WebElement> trainNo = driver.findElements(By.cssSelector("table[class=\"DataTable TrainList TrainListHeader stickyTrainListHeader\"]>tbody>tr[onmouseout=\"HideCalendar()\"]>:nth-child(2)"));
		for(int i =0;i<trainNo.size();i++) {
		System.out.println("trainNo : " +trainNo.get(i).getText());
		
		}
*/
		

	}


}
