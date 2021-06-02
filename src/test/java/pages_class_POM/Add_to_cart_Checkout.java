package pages_class_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_cart_Checkout {
	
	public static WebElement  click_on_cart(WebDriver driver)
	{
		WebElement element =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    return element;
	}
	
	public static WebElement  click_on_checkout(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("checkout"));
	    return element;
	}
	

}
