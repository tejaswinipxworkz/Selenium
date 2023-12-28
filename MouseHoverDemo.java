package Day8;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
	WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions action = new Actions(driver);
	//action.moveToElement(desktop).moveToElement(mac).click().build().perform();//First build the action then perform
	action.moveToElement(desktop).moveToElement(mac).click().perform();	//Directly perform theaction
	}

}
