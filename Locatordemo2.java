package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

//Get link
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=10504602134542078656&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415");

//Searchbox
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kurti");

//Search button
driver.findElement(By.id("nav-search-submit-button")).click();

//Linktext or partial link text
//driver.findElement(By.linkText("Ananta Enterprise Womans Designer Foil with Printed Straight Casual Rayon Kurta")).click();
driver.findElement(By.partialLinkText("Ananta Enterprise")).click();


	}

}
