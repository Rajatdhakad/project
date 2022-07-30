package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_sort_by {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		driver.findElement(By.xpath("//a[text()='Shop Products']")).click();
		driver.findElement(By.xpath("//select[@name='sortBy']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@name='sortBy']")));
		select.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='clear']"));
		
		// TODO Auto-generated method stub

	}

}
