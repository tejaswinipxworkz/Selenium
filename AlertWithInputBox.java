package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithInputBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
	 driver.switchTo().alert().sendKeys("Welcome");
	 driver.switchTo().alert().accept();

	}

}
