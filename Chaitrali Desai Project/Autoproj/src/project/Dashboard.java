package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see 
		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[1]/a/p")).click();
		String val = driver.findElement(By.name("count")).getAttribute("value");
		System.out.println(val);
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("1111113339");
		driver.findElement(By.id("loginbtn")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"myaccount\"]/a[1]")).click();//my account dashboard  
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[1]/div/p")).click();//test details
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[1]/div/a")).click();//test attempted
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/a/span")).click();//back
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a")).click();//score
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/a/span")).click();//back
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[3]/div/div/div/div[1]/div/a")).click();//failed attempt
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/a/span")).click();//back
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[4]/div/div/div/div[1]/div/a")).click();//timeline chart
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/a/span")).click();//back
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[5]/div/div/div/div[1]/div/a")).click();//topic cover
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/a/span")).click();//back
           
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/a")).click();

	}
	
	}

