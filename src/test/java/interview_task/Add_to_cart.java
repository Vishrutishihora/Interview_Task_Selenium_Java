package interview_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        
        //Verify Login Functionality
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        //Add to Cart
        driver.manage().window().maximize();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        
        //Checkout product
        
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
        
        //Enter CheckoutInformation
        driver.findElement(By.id("first-name")).sendKeys("vishruti");
        driver.findElement(By.id("last-name")).sendKeys("Shihora");
        driver.findElement(By.id("postal-code")).sendKeys("380015");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        
        //Finish order
        
 
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(1000);
       
        
	}

	
}
