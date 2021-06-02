package pages_class_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_cart_login {
	public static WebElement  user_name(WebDriver driver)
	{
		WebElement element =driver.findElement(By.id("user-name"));
		
		WebElement element2 =driver.findElement(By.id("login-button"));
        return element;
	}
	
     public static WebElement password(WebDriver driver)
       {
    	
    	WebElement element1 = driver.findElement(By.id("password"));
    	return element1;
    	}
     
     public static WebElement login_button(WebDriver driver) 
        {
     	
    	 WebElement element =driver.findElement(By.id("login-button"));
    	 return element;
     	}
     
     
    }

