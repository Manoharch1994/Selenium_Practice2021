package com.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		//Product Types
		driver.findElement(By.xpath("//div[@class='drp1']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		
		List<WebElement> producttypes= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("Number of ProductTypes: "+producttypes.size());
		
		//trying to  to select the Loans value from drop down
		
		for (WebElement ptype : producttypes)
		{
			if(ptype.getText().equals("Loans"))
			{
				ptype.click();
				break;
			}	
		}
		//Products
		driver.findElement(By.xpath("//a[normalize-space()='Select Product']")).click();
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("number pf Products: "+products.size());
		for (WebElement product : products)
		{
			if(product.getText().contains("Home Loan"))
			{
				product.click();
				break;
			}
		}
		
		
		
	}

}
