package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//Approach1 for selecting date
	//	driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("10/14/1999");
		//Approach2 for selecting date
	
		//select month and year
		
		String year = "2024";
		String date = "14";
		String month = "October";
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		while(true) {
			
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month)&& yr.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//select date
		List<WebElement> dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	/*	for(WebElement dt : dates) {
			if(dt.getText().equals(date)) {
				dt.click();
			}*/
		for(int i=0; i<dates.size(); i++) {
			if(dates.get(i).getText().equals(date)) {
				dates.get(i).click();
			}
		}
		}
		
	}


