package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineTest {

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
		int num=Integer.parseInt(val);
		for(int i=1;i<=num+2;i++)
		{
		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click()", nextButton);
	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	      //driver.findElement(By.id("qsubmit")).click();
	     
	}
		driver.findElement(By.id("qsubmit")).click();  //submitbutton
		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
		System.out.println(hn);

	}
}
		
	

	
	
