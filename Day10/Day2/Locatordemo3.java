package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//Get link
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=10504602134542078656&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        driver.manage().window().maximize();
		//finding how many sliders are present in webpage
		List<WebElement> sliders = driver.findElements(By.className("a-carousel-card"));
		System.out.println("Number of slides present in webpage "+sliders.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images present in webpage "+images.size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present in webpage "+links.size());
		
	}

}
