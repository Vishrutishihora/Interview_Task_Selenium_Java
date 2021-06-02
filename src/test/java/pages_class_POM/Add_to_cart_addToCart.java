package pages_class_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_cart_addToCart {
 
	public static WebElement addTocart(WebDriver driver) {
		WebElement element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 return element;
	}
}
