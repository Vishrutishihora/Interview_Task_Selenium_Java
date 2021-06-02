package pages_test_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_class_POM.Add_to_cart_Checkout;
import pages_class_POM.Add_to_cart_addToCart;
import pages_class_POM.Add_to_cart_checkoutInfo;
import pages_class_POM.Add_to_cart_finishOrder;
import pages_class_POM.Add_to_cart_login;

public class Add_cart_test {
	public WebDriver driver = null;
	   
	  @BeforeTest
      public void openapp() 
	  {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/checkout-step-two.html");
      }
	  
	  
	  @Test(priority=1)
	  public void login()
	  {
		 
		  Add_to_cart_login.user_name(driver).sendKeys("standard_user");
		  Add_to_cart_login.password(driver).sendKeys("secret_sauce");
		  Add_to_cart_login.login_button(driver).click();
		  

	  }
	  
	  
	  @Test (priority=2)
	  public void add_to_cart() 
	  {
		  Add_to_cart_addToCart.addTocart(driver).click();
	  }
	  
	  @Test(priority=3)
	  public void Checkout() {
		  Add_to_cart_Checkout.click_on_cart(driver).click();
		  Add_to_cart_Checkout.click_on_checkout(driver).click();
	  }
	  
	  @Test(priority=4)
	  public void Enter_checkout_info() {
		  Add_to_cart_checkoutInfo.first_name(driver).sendKeys("Vishruti");
		  Add_to_cart_checkoutInfo.last_name(driver).sendKeys("Shihora");
		  Add_to_cart_checkoutInfo.postal_code(driver).sendKeys("380015");
		  Add_to_cart_checkoutInfo.continue_btn(driver).click();
		  
	  }
	  
	 @Test(priority=5)
	  public void finish_Order() {
		  Add_to_cart_finishOrder.finish(driver).click();
		  Add_to_cart_finishOrder.Back_to_home(driver).click();
	  }
	  
      
	  
	  @AfterTest
	  public void close() {
		  driver.close();
	  }
}
