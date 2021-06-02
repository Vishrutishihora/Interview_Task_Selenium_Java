package pages_class_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_cart_checkoutInfo {
	
	public static WebElement  first_name(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("first-name"));
	    return element;
	}
    
	public static WebElement  last_name(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("last-name"));
	    return element;
	}
	
	public static WebElement  postal_code(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("postal-code"));
	    return element;
	}
	
	public static WebElement  continue_btn(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("continue"));
	    return element;
	}
}
