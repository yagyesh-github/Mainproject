package com.general.stores;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	private WebDriver driver;
	SoftAssert soft = new SoftAssert();
  
	@Test
	public void testEasy() {
		System.setProperty("webdriver.chrome.driver", "/home/yagyeshjaiswal9/Downloads/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://localhost:8888");
		String title = driver.getTitle();
		AssertJUnit.assertEquals("Food Box", title);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}