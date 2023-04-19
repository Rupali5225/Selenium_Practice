package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		SeleniumUtility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys("admin");
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys("manager");
		SeleniumUtility.driver.findElement(By.id("loginButton")).click();
		SeleniumUtility.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		SeleniumUtility.driver.findElement(By.id("container_tasks")).click();
		SeleniumUtility.driver.findElement(By.cssSelector("div[class = 'addNewButton']")).click();
		SeleniumUtility.driver.findElement(By.cssSelector("div[class = 'item createNewTasks']")).click();

		SeleniumUtility.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(SeleniumUtility.driver, 30);

//		FluentWait wait1 = new FluentWait(SeleniumUtility.driver).withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//		// implement condition for wait, poling works like 5,10,15 and 20
//		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
//				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>:nth-child(2)>div>div>div>div")));

		// explicit wait - to wait for the compose button to be click-able
		SeleniumUtility.driver.findElement(By.cssSelector(
				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)"))
				.click();
		WebDriverWait wait = new WebDriverWait(SeleniumUtility.driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>:nth-child(2)>div>div>div>div")));
		// click on the compose button as soon as the "compose" button is visible

		List<WebElement> CustomerList = SeleniumUtility.driver.findElements(By.cssSelector(
				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>:nth-child(2)>div>div>div>div"));
		// SeleniumUtility.driver.manage().timeouts().implicitlyWait(0, null)
		for (int i = 0; i <= CustomerList.size() - 1; i++) {
			System.out.println("CustomerList :" + CustomerList.get(i).getText());

		}
		CustomerList.get(5).click();
		SeleniumUtility.driver.findElement(By.cssSelector(
				"div[class=\"projectSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]>div>div>:nth-child(3)"))
				.click();
		List<WebElement> ProjectList = SeleniumUtility.driver
				.findElements(By.cssSelector(".projectSelector>div>:nth-child(2)>div>div>div>div"));
		// if (ProjectList.size() > 3) {
		ProjectList.get(0).click();
		// }
		WebElement projectName = SeleniumUtility.driver.findElement(By.cssSelector(
				"input[class=\"newProject newCustomerProjectField inputFieldWithPlaceholder\"][placeholder=\"Enter Project Name\"]"));
		projectName.sendKeys("pr001236");

		List<WebElement> TaskNameList = SeleniumUtility.driver.findElements(By.cssSelector(
				".tablePlaceholder>div>div>table>:nth-child(3)>tr>td>input[placeholder=\"Enter task name\"]"));
		TaskNameList.get(0).click();
		TaskNameList.get(0).sendKeys("pr");

		SeleniumUtility.driver.findElement(By.cssSelector("div[class = 'components_button withPlusIcon']")).click();
		SeleniumUtility.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		SeleniumUtility.driver
//				.findElement(By.cssSelector(
//						"label[class=\"components_checkboxContainer checkboxContainer\"]>span[class=\"checkmark \"]"))
//				.click();
		SeleniumUtility.driver
				.findElement(By.cssSelector("div[class='createdTasksTableContainer']>table>tbody>tr>td>div>div	"))
				.click();

		SeleniumUtility.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		SeleniumUtility.driver.findElement(By.cssSelector("div[class=\"delete button\"]")).click();
		SeleniumUtility.driver.findElement(By.xpath("//span[text()=\"Delete permanently\"]")).click();

//	
//			
//		}

	}

}
