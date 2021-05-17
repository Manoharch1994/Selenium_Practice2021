package com.interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=driver.findElement(By.id("Email"));
		//email.clear();//clearing the existed text
		//email.sendKeys("admin@admin.com");//clearing the existed text and entering new text.
		
		//how to get already existed text in field using Attribute.
		System.out.println("Result from getAttribute() method:" +email.getAttribute("value"));
		
		//Login Button using getAttribute,getText() methods.
		WebElement loginbutton=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(loginbutton.getAttribute("type"));
		System.out.println(loginbutton.getAttribute("class"));
		
		System.out.println(loginbutton.getText());
		
			
	}

}
