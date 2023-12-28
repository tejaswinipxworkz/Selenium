package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);
      //act.contextClick(button).perform();//Directly performing the action
        
      Action right_click =  act.contextClick(button).build();//Creating action and storing it an one varioable
      right_click.perform();//Performing the action
		

	}

}
