import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestPage {
	
	public static void main(String[] args) {
		
		// Initialize driver Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("http://immense-hollows-74271.herokuapp.com/");
		driver.manage().window().maximize();
		
		// Get max item
		StrangerPage.getMaxItem(driver);
		System.out.println("Get max item in list:"+ StrangerPage.getMaxItem(driver) +" - Pass- SUCCESS");

		// Add image to item
		StrangerPage.AddImage(driver);
		System.out.println("Add an image to item - Pass- SUCCESS");

		// Add text to new item
		StrangerPage.AddText(driver, "Get your new TShirt!");	
		System.out.println("Add Text to new Item - Pass- SUCCESS");
		
		//Click to Add Item
		StrangerPage.ClickAddItem(driver);
		System.out.println("Add Text to new Item - Pass- SUCCESS");
		
		// PAUSE 
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		// Delete Item
		StrangerPage.DeleteItem(driver);
		// PAUSE 
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
		// Delete item added	
		StrangerPage.OKDeleteItem(driver);
		System.out.println("Delete new Item - Pass- SUCCESS");
		
		// Find TEXT in list items
		StrangerPage.FindText(driver, "Creators: Matt Duffer, Ross Duffer");

		//Close Browser
		driver.close();
	}	
	
	

}
