package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see 
		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[1]/a/p")).click();
		String val = driver.findElement(By.name("count")).getAttribute("value");
		System.out.println(val);
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
		driver.findElement(By.id("loginbtn")).click();
		
		//profile updation
		
		driver.findElement(By.xpath("//*[@id=\"myaccount\"]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"name\"]")).clear(); //old text clear
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Chaitrali Desai");//updated name
        
        driver.findElement(By.xpath("//*[@id=\"emailid\"]")).clear(); //old emailid clear
        driver.findElement(By.xpath("//*[@id=\"emailid\"]")).sendKeys("chaitraliidesaii1234@gmail.com");// updated email
        
        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).clear();  //old no clear
        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1111513339");//updated phone no
        
       driver.findElement(By.xpath("//*[@id=\"updatebtn\"]")).click();
       driver.findElement(By.xpath("/html/body/div/div/div[1]/div/span[1]")); 
       
       driver.findElement(By.xpath("/html/body/div/div/div[1]/div/span[1]")).click();
        
	}

}
