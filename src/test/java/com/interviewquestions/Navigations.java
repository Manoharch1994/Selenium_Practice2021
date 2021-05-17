package com.interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
//Difference between get() and navigate():
//get():get method is used to navigate particular URL(web site) and wait till Page load.
	
//Navigate().to():is used to navigate particular URL(web site)and doesn't wait to page load 
//it maintains browser history or cookies to navigate back or forward.	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();//takes you to Snapdeal
		driver.navigate().forward();//takes you to Amazon
		
		driver.navigate().refresh();//refresh/reload the webpage.
		
		driver.quit();
		
		
		
		
		
	}

}
