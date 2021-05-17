package com.interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Jenkins");
		
		List<WebElement> searchresults=driver.findElements(By.xpath(""));
		
		System.out.println("Size of AutoSuggestions:"+searchresults.size());
		
		/*for (WebElement result : searchresults) 
		{
			if(result.getText().equals("jenkins pipeline"))
			{
				result.click();
				break;
			}
		}
		*/
		
	}

}
