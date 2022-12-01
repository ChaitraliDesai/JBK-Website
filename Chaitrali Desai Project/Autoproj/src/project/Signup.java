package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see 
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("Chaitu Desai");//name
		driver.findElement(By.id("emailid")).sendKeys("cdesai@gmail.com");//emailid
		driver.findElement(By.id("mobile")).sendKeys("1111513339");//mobno
		driver.findElement(By.id("agree")).click();//tick checkbox
		driver.findElement(By.id("emailbtn")).click();// proceed button
				
		
		
		
	}

}
