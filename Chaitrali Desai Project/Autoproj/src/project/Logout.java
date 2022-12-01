package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[1]/a")).click(); //click on home pg
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/h1/a")).click();  //click on online test
		driver.findElement(By.xpath("//*[@id=\"Placement-Policy\"]/div/div/a/div")).click();  //start placement quiz
		
		
		
		String val = driver.findElement(By.name("count")).getAttribute("value");
		System.out.println(val);
		driver.findElement(By.id("countbtn")).click();//next buton
		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.xpath("//*[@id=\"myaccount\"]/a[2]")).click();
	}

}
