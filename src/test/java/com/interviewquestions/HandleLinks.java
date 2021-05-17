package com.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.partialLinkText("Deals")).click();//using Partial LinkText()
		
		//driver.findElement(By.linkText("Today's Deals")).click();//Using LinkText()
		
		//System.out.println(driver.getTitle());
		//How to Capture all links in a page
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no.of links Present in Page: "+links.size());
		
		//To Print all Links Text()
		//Using For loop
		/*for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}

		}*/
		
		
		for (WebElement link : links)
		{
		
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			
		}
		
		
		
		
}
	
}
