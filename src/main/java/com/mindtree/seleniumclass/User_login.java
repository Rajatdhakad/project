package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		driver.findElement(By.xpath("//img[@alt='P&G Everyday icon']")).click();
		driver.findElement(By.xpath("//p[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@type='email'][@name='signInEmailAddress']")).sendKeys("rajatdhakad.rd786@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][@name='currentPassword']")).sendKeys("Rajat123@");
		driver.findElement(By.xpath("//input[@type='submit'][@value='LOG IN']")).click();
		System.out.println("User login Successfull");
		// TODO Auto-generated method stub

	}

}
