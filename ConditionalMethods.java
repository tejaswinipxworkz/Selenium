package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	
	//WebElement image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']\r\n"));
//	System.out.println(image.isDisplayed());
	
	boolean image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']\r\n")).isDisplayed();
	System.out.println("Image status : "+image);
	
/* WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
 System.out.println("Display status : "+ searchbox.isDisplayed());
 System.out.println("Enabling status : "+ searchbox.isEnabled());*/
	
   driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
   WebElement Maleradio_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
   WebElement Femaleradio_button = driver.findElement(By.xpath("//input[@id='gender-female']"));
   
   System.out.println("Before selection of Maleradio button :"+ Maleradio_button.isSelected());
   System.out.println("Before selection of Femaleradio button :"+ Femaleradio_button.isSelected());
   
   
   System.out.println("After selection of Maleradio button");
   Maleradio_button.click();
   System.out.println("After selection of Maleradio button :"+ Maleradio_button.isSelected());
   System.out.println("After selection of maleradio button :"+ Femaleradio_button.isSelected());
   
   
   System.out.println("After selection of Femaleradio button");
   Femaleradio_button.click();
   System.out.println("After selection of Femaleradio button :"+ Maleradio_button.isSelected());
   System.out.println("After selection of Femaleradio button :"+ Femaleradio_button.isSelected());
	}

}
