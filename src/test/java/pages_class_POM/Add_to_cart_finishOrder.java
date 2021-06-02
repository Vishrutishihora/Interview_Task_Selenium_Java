package pages_class_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_cart_finishOrder {
	
	public static WebElement finish(WebDriver driver) {
		WebElement element =driver.findElement(By.id("finish"));
		return element;
	}
	
	public static WebElement Back_to_home(WebDriver driver) {
		WebElement element = driver.findElement(By.id("back-to-products"));
		return element;
	}

}
