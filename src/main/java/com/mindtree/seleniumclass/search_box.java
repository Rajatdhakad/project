package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("powders");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]/*[1]")).click();
		String Search_result = driver.findElement(By.xpath("//div[text()=concat('for ','\"','powders','\"')]")).getText();
		System.out.println("Search_result"+Search_result);
	}

}
