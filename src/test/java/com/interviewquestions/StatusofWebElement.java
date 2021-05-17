package com.interviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//is Displayed(), //isEnabled()
		WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display Status: "+searchstore.isDisplayed());//true
		
		System.out.println("Enable Status:  "+searchstore.isEnabled());//true
		
		//isSelected()-used for radio buttons,check boxes,drop downs
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selecting maleRadioButton Status:"+male.isSelected());
		System.out.println("Before Selecting FemaleRadioButton Status:"+female.isSelected());
		
		male.click();//Selects the male radio button
		
		System.out.println("After Selecting maleRadioButton Status:"+male.isSelected());
		System.out.println("After Selecting FemaleRadioButton Status:"+female.isSelected());
		
		female.isSelected();//selects female radio button
		
		System.out.println("After Selecting maleRadioButton Status:"+male.isSelected());
		System.out.println("After Selecting FemaleRadioButton Status:"+female.isSelected());
		
		driver.close();
	}
	

}
