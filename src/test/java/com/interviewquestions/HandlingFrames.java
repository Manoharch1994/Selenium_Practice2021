package com.interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//1st I frame
		/*driver.switchTo().frame(0);//using name of the Frame/ID of the Frame.
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium.cli']")).click();
		*/
		//2nd I frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[normalize-space()='Actions']")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
