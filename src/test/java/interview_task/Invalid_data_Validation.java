package interview_task;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_data_Validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Scanner class for get data from user
				System.out.println("Enter name:=");
			    Scanner sc = new Scanner(System.in);
		        String Username = sc.nextLine();
		        System.out.println("Enter password:=");
		        String password = sc.next();
		        
		        //For set path and launch browser
		        System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.saucedemo.com/checkout-step-two.html");
		        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		        
		        
		        //Locators
		        driver.findElement(By.id("user-name")).sendKeys("Username");
		        driver.findElement(By.id("password")).sendKeys("password");
		        driver.findElement(By.id("login-button")).click();
		        
		          Thread.sleep(1000);
		          
		          
		          //get Actual message from webpage
		          String Actual_message = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		          
		          
		          //Expected message
		          String Expected_message ="Epic sadface: Username and password do not match any user in this service";
		          
		          if(Actual_message.equals(Expected_message)) {
		        	  
		        	  System.out.println("validation message display properly");
		          }
		          
		          else
		          {
		        	  System.out.println("validation message not display properly");
		          } 	  

	}

}
