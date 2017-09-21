package selenium.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testdemo {
	@Test
  
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D:\\tet\\Selenium_Demp\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("login passed");
		
		
  }
}
