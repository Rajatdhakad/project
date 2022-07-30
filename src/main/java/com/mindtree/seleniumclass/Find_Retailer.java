package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Retailer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("liquids");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]/*[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]")).click();
		
		// TODO Auto-generated method stub

	}

}
