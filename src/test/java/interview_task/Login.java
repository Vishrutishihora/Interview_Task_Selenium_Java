package interview_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set path of driver
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");

		//Launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/checkout-step-two.html");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);


		//Locators
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String Actual_title =driver.getTitle();
		String Expected_title ="Swag Labs";

		if(Actual_title.equals(Expected_title))
		{
			System.out.println("Login sucessfully");
		}

		else 
		{
			System.out.println("Login fail");
		}

		driver.close();
	}

}
