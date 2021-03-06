package com.interviewquestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();//live posting
		
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpElement);
		
		List<WebElement> options=drpselect.getOptions();
		
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for (WebElement option : options)
		{
			
		originallist.add(option.getText());
		templist.add(option.getText());	
		}
		System.out.println("Original List Before Sorting: "+originallist);
		System.out.println("Temp List Before Sorting: "+templist);
		
		Collections.sort(templist);//sorting
		
		System.out.println("Original List After Sorting: "+originallist);
		System.out.println("Temp List After Sorting: "+templist);
		
		if(originallist.equals(templist))
		{
		
			System.out.println("Drop down Sorted");
		}
		else {
			System.out.println("Drop down UnSorted");
		}
		
		driver.close();
	}

		
}
