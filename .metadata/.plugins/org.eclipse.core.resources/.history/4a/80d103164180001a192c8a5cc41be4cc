import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrangerPage {
	public static WebDriver driver = null;
	static int countitems=0;
	static int founded=0;
		
	//@Test
	public static int getMaxItem(WebDriver driver) {
		//Save MAX item in List 
	    List<WebElement> elements = driver.findElements(By.xpath("//li[@ng-repeat='item in items']"));
	    countitems = elements.size()+1;
	    return countitems;
	}
	public static void AddImage(WebDriver driver) {
		//Add an image to item
		WebElement uploadElement = driver.findElement(By.id("inputImage"));
		uploadElement.sendKeys("C:\\NewTest\\StrangerPage\\320_strange.jpg");
	}
	public static void AddText(WebDriver driver, String text) {
		WebElement textElement = driver.findElement(By.xpath("//textarea[@placeholder='Maximum allowed length: 300 characters']"));
		textElement.click();
		textElement.sendKeys(text);	
	}
	public static void ClickAddItem(WebDriver driver) {
		WebElement AddItem = driver.findElement(By.xpath("//button[@class='btn pull-right btn-success']"));
		AddItem.click();

	}
	public static void DeleteItem(WebDriver driver) {
		driver.findElement(By.xpath("//li["+ countitems +"]/div/div/div[1]/button[2]")).click();
	}	
	public static void OKDeleteItem(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"top\"]/div[4]/div/div/div[3]/button[1]")).click();
	}	
	public static void FindText(WebDriver driver, String TextToFind) {
		if (driver.findElement(By.xpath("//p[contains(text(),'"+TextToFind+"')]"))!=null) {	
			System.out.println("ITEM was founded.");; 
		}
		else	{
			System.out.println("Item was NOT founded.");
		}
	}
}

