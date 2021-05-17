package com.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDownGenericMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='drp1']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		//ProductTypes
		List<WebElement> producttypes= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of ProductTypes: "+producttypes.size());
		selectoptionfromDropdown(producttypes, "Loans");
		
		//Products
		driver.findElement(By.xpath("//a[normalize-space()='Select Product']")).click();
		//Products
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("number pf Products: "+products.size());
		selectoptionfromDropdown(products, "Home Loan");
		
		
	}
	public static void selectoptionfromDropdown(List<WebElement> options,String value)
	{
	
		for (WebElement option : options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}	
		}
		
	}
	
	
	
	
}
