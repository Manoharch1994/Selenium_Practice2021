package com.interviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtablePagination {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		//Sales-->Orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//Orders Table:
		
		//1.Total no.of pages in Table
		String Pagestext=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(Pagestext);
		
		
		
	}

}
