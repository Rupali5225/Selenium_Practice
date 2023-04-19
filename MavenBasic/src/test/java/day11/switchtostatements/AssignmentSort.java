package day11.switchtostatements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class AssignmentSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://jqueryui.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(0);

		Actions act = new Actions(driver);

		WebElement drag1 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		WebElement drag2 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
		WebElement drag3 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
		WebElement drag4 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
		WebElement drag5 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
		WebElement drag6 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
		WebElement drag7 = SeleniumUtility.driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
		act.dragAndDrop(drag7, drag1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(drag6, drag1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(drag5, drag1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(drag4, drag1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(drag3, drag1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(drag2, drag1).build().perform();
		Thread.sleep(1000);
		SeleniumUtility.driver.close();

	}

//		driver.findElement(By.cssSelector("a[href=\"http://jqueryui.com/sortable/\"]")).click();
//		
//		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
//		
//		driver.switchTo().frame(frame);
//		
//		List<WebElement> ItemsList = driver.findElements(By.id("ul[id=\"sortable\"]>li"));
//		
//		for(int i =0;i<=ItemsList.size()-1;i++) {
//			for(int j = ItemsList.size()-1;i>=0;i--) {
//				Actions action = new Actions(driver);
//				
//				driver.findElement(by.in)
//				WebElement a = ItemsList.get(i).getLocation();
//				WebElement b = ItemsList.get(j).getLocation().getX();
//
//				action.dragAndDrop(ItemsList.get(j).getLocation().getX(), ItemsList.get(i));
//			}
//		}
//		

}
