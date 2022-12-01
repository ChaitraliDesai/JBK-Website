package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectTestCases {
  
	//Testcase1
		@Test
		public void DynamicXpathTest() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
			
			
			driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[11]/a/div")).click();  //dynamicxpath test link
			String val = driver.findElement(By.name("count")).getAttribute("value");
			System.out.println(10);
			driver.findElement(By.id("countbtn")).click();//next buton
			driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
			driver.findElement(By.id("loginbtn")).click();
			int num=Integer.parseInt(val);
			for(int i=0;i<=num+2;i++)
			{
			  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
		      JavascriptExecutor js = (JavascriptExecutor)driver;
		      js.executeScript("arguments[0].click()", nextButton);
		      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
		     
		      
			}
			driver.findElement(By.id("qsubmit")).click();  //submitbutton
			String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
			System.out.println(hn);
			
			String Exptxt = "Sorry!!!";
			String acttxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Exptxt, acttxt);

		  
					
		
		}
		
		    //Testcase2
	        @Test
	        public void ManualTestingISTQB() {
		    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
						
			driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[1]/a/div")).click();
			String val = driver.findElement(By.name("count")).getAttribute("value");
			//System.out.println(10);
			driver.findElement(By.id("countbtn")).click();//next buton
			driver.findElement(By.id("loginmobile")).sendKeys("1111113339");
			driver.findElement(By.id("loginbtn")).click();
			int num=Integer.parseInt(val);
			for(int i=0;i<=num+2;i++)
			{
			  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
		      JavascriptExecutor js = (JavascriptExecutor)driver;
		      js.executeScript("arguments[0].click()", nextButton);
		      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
		     }
			driver.findElement(By.id("qsubmit")).click();  //submitbutton
			String hn = driver.findElement(By.xpath("//h3[text()='Your Result']")).getText();
			System.out.println(hn);
			
			
			String Exprest = "Your Result";
			String actrest = driver.findElement(By.xpath("//*[text()='Your Result']")).getText();
			Assert.assertEquals(actrest, Exprest);
		  
		  
	  }

	      //Testcase3
	      @Test
	      public void checkupdatefunc()
	      {
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
	        driver.findElement(By.xpath("//*[@id=\"emailid\"]")).sendKeys("chaitraledesai1234@gmail.com");// updated email
	          
	        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).clear();  //old no clear
	        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1111513339");//updated phone no
	          
	        driver.findElement(By.xpath("//*[@id=\"updatebtn\"]")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/span[1]")); 
	         
	        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/span[1]")).click();
	         
	         
	        String Expmsg = "Profile successfully updated";
	 		String actmsg = driver.findElement(By.id("msg")).getText();
	 		Assert.assertEquals(actmsg, Expmsg);
	      }
	      
	      
	        //Testcase4
	        @Test
	        public void Actionclass() {
	    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[2]/a/div")).click();  //action class test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		
	  		String Expresmsg = "Sorry!!! No Questions Found";
			String actresmsg = driver.findElement(By.xpath("//*[@id=\"noquestion\"]/h3")).getText();
			Assert.assertEquals(actresmsg, Expresmsg);
		  
	      }
	      
	      
	    //Testcase5
	      @Test
	      public void cucumbertest() {
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  	  WebDriver driver=new ChromeDriver();
	  	  driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  	  driver.manage().window().maximize();
	  		
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  	  driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[8]/a/div")).click();  //cucumber test link
	  	  String val = driver.findElement(By.name("count")).getAttribute("value");
	  	  System.out.println(10);
	  	  driver.findElement(By.id("countbtn")).click();//next buton
	  	  driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	   	  driver.findElement(By.id("loginbtn")).click();
	  	  int num=Integer.parseInt(val);
	  	  for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Exptext = "Sorry!!!";
			String acttext = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Exptext, acttext);
	      }
	      
	      
	    //Testcase6
	      @Test
	      public void Dashboardcase() {
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
	  		
	  		String Expectedtext = "My Profile";
			String actualtext = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
			Assert.assertEquals(Expectedtext, actualtext);

	      }
	      
	    //Testcase7
	      @Test
	      public void Excelsheetproperties() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[9]/a/div")).click();  //cucumber test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Exptext = "Sorry!!!";
			String acttext = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Exptext, acttext);
	      }
	      
	    //Testcase8
	      @Test
	      public void HTMLandCSS() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[10]/a/div")).click();  //htmlanddcss test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Expct = "Sorry!!!";
			String actul = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Expct, actul);
	      }
	      
	      
	    //Testcase9
	      @Test
	      public void Javascripttest() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[4]/a/div")).click();  //javascript test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		
	  		String Expct = "Sorry!!! No Questions Found";
			String actul = driver.findElement(By.xpath("//*[@id=\"noquestion\"]/h3")).getText();
			Assert.assertEquals(Expct, actul);

	      }
	      
	    //Testcase10
	      @Test
	      public void Jenkin() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[6]/a/div")).click();
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
	      
	      
	    //Testcase11
	      @Test
	      public void Listeners() {
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
	  		
	  		String Eptxt = "Sorry!!! No Questions Found";
			String actxt = driver.findElement(By.xpath("//*[@id=\"noquestion\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);

	      }
	      
	    //Testcase12
	      @Test
	      public void MavenTest() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[7]/a/div")).click();  //maven test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	  		
	  		
	      }
	      
	    //Testcase13
	      @Test
	      public void Onlinetest() {
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
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	  		

	      }
	      
	    //Testcase14
	      @Test
	      public void RobotClassAuto() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[5]/a/div")).click();
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
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
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//h3[text()='Your Result']")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
	      
	    //Testcase15
	      @Test
	      public void Testng() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[17]/a/div")).click();  //testng test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
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
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);

	      }
	      
	    //Testcase16
	      @Test
	      public void Junit() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[20]/a/div")).click();  //Junit test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
	      
	      //Testcase17
	      @Test
	      public void seleniumbasic() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[16]/a/div")).click();  //seleniumblevel test link
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
	      
	      //testcase18
	      @Test
	      public void logout() {
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
	      
	  		String Eptxt = "Take a Online";
			String actxt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/h1")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      
	      }
			
	      
	      //testcase19
	      @Test
	      public void Logtest() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[18]/a/div")).click();
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
			
	      //testcase20
	      public void SeleniumAdv() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[14]/a/div")).click();
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
	      
	      //testcase21
	      public void selwebdriver() {
	    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		driver.get("https://www.qa.jbktest.com/online-exam#Testing"); // jbktestlink
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec to see
	  		
	  		
	  		driver.findElement(By.xpath("//*[@id=\"Testing\"]/div/div[15]/a/div")).click();
	  		String val = driver.findElement(By.name("count")).getAttribute("value");
	  		System.out.println(10);
	  		driver.findElement(By.id("countbtn")).click();//next buton
	  		driver.findElement(By.id("loginmobile")).sendKeys("1111513339");
	  		driver.findElement(By.id("loginbtn")).click();
	  		int num=Integer.parseInt(val);
	  		for(int i=0;i<=num+2;i++)
	  		{
	  		  WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"quizsection\"]/div[2]/a[1]"));//next button
	  	      JavascriptExecutor js = (JavascriptExecutor)driver;
	  	      js.executeScript("arguments[0].click()", nextButton);
	  	      driver.navigate().to("https://www.qa.jbktest.com/online-exam#Testing");  ///jbktestlink
	  	     
	  	      
	  		}
	  		driver.findElement(By.id("qsubmit")).click();  //submitbutton
	  		String hn = driver.findElement(By.xpath("//*[@id=\"quizheading\"]")).getText();
	  		System.out.println(hn);
	  		
	  		String Eptxt = "Sorry!!!";
			String actxt = driver.findElement(By.xpath("//*[@id=\"msg\"]/h3")).getText();
			Assert.assertEquals(Eptxt, actxt);
	      }
}
	
			

	    	  
	      
	    	 

	  
	      

