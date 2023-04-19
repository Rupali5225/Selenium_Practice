
package day9.Calender;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redBusCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\Eclipse_Programs\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		WebElement FromCity = driver.findElement(By.cssSelector("input[id=\"src\"]"));
		FromCity.sendKeys("Pune");
		List<WebElement> CityFromList=driver.findElements(By.cssSelector("ul.homeSearch>li"));
		//for(int i=0;i<CityFromList.size();i++) {
	//	WebElement suggestion=CityFromList.get(i);
	//	System.out.println("Suggestion "+i+": "+suggestion.getText());
		//}
		CityFromList.get(1).click();
	//	FromCity.sendKeys(Keys.RETURN);
		//driver.findElement(By.cssSelector("input[id=\"src\"]")).sendKeys(Keys.RETURN);
		WebElement ToCity = driver.findElement(By.id("dest"));
		ToCity.sendKeys("Goa");
		List<WebElement> CityToList=driver.findElements(By.cssSelector("div[class=\"fl search-box\"]>div>ul>li"));
		CityToList.get(3).click();

		driver.findElement(By.id("onward_cal")).click();
		WebElement calender =  driver.findElement(By.cssSelector(".rb-monthTable>tbody>:nth-child(7)>:nth-child(5)"));
		//System.out.println("calender >>>>"+calender);
		calender.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search_btn")));
		driver.findElement(By.id("search_btn")).click();
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//		List<WebElement> DeparatureList = driver.findElements(By.cssSelector(".dt-time-filter>li>label"));
//		for(int i=0;i<=DeparatureList.size()-1;i++) {
//		//WebElement suggestion=ArrivalTimeList.get(i);
//		System.out.println("Arrival time : " +i+  ":" +DeparatureList.get(i).getText());
//		}
//		DeparatureList.get(3).click();
		
		
		//List<WebElement> BusType = driver.findElements(By.cssSelector(".details>:nth-child(5)>li>:nth-child(3)"));
		
		List<WebElement> BusType = driver.findElements(By.cssSelector(".details>:nth-child(5)>li>input"));
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".details>:nth-child(5)>li>input"))).click();

		//.details>:nth-child(5)>li>:nth-child(3)
//		for(int i=0;i<=BusType.size()-1;i++) {
//		//WebElement suggestion=ArrivalTimeList.get(i);
//			BusType.get(i).click();
//		System.out.println("bus Type : " +i+  ":" +BusType.get(i).getText());
//		}
//		WebElement w1 = BusType.get(2);
//		wait.until(ExpectedConditions.elementToBeClickable(w1));
//		w1.click();
		
		
		List<WebElement> DeparatureList = driver.findElements(By.cssSelector(".details>[class=\"list-chkbox\"]>li>input"));
		for(int i=0;i<=DeparatureList.size()-1;i++) {
		//WebElement suggestion=ArrivalTimeList.get(i);
		System.out.println("Arrival time : " +i+  ":" +DeparatureList.get(i).getText());
		}
		DeparatureList.get(3).click();	
		
		List<WebElement> BusNames = driver.findElements(By.cssSelector("li[id='10166393']>div>div>div>div>div"));
		List<WebElement> BusTime = driver.findElements(By.cssSelector("ul[class='bus-items']>div>li>div>div>div>:nth-child(6)>div>div>span"));

		
		
		for(int i=0;i<=BusNames.size()-1;i++) {
			//WebElement suggestion=ArrivalTimeList.get(i);
				//BusType.get(i).click();
			System.out.println("BusNames  : " +i+  ":" +BusNames.get(i).getText()  +"Price:" +BusTime.get(i).getText());

		}
		
		
		
		
	}

}
