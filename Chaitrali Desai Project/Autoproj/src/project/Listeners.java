package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listeners {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
		
		
		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[3]/a/div")).click();  //listeners test link
		String val = driver.findElement(By.name("count")).getAttribute("value");
		System.out.println(10);
		driver.findElement(By.id("countbtn")).click();//next buton
		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
		driver.findElement(By.id("loginbtn")).click();

	}

}
