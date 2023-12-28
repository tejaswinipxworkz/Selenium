package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
	WebElement Min_Slider =	driver.findElement(By.xpath("//span[1]"));
	System.out.println("Curent location of the min slider : "+ Min_Slider.getLocation()); //(59, 250)
	act.dragAndDropBy(Min_Slider, 100, 250).perform();
	System.out.println("Location of the min slider after moving : "+ Min_Slider.getLocation()); //(161, 250)
	
	WebElement Max_Slider =	driver.findElement(By.xpath("//span[2]"));
	System.out.println("Curent location of the max slider : "+ Max_Slider.getLocation()); //(59, 250)
	act.dragAndDropBy(Max_Slider, -44, 250).perform();
	System.out.println("Location of the max slider after moving : "+ Max_Slider.getLocation()); //(161, 250)
	}}
