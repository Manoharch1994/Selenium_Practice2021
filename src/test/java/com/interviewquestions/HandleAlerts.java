package com.interviewquestions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException
	
	{

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*//Alert window with OK Button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		//Alert Window with OK & Cancel Button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();//closing Alert by using OK Button
		driver.switchTo().alert().dismiss();//Closing Alert by using Cancel Button
		 */		
		
		//Alert Window with Input Box,Capture text from Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alertwindow=	driver.switchTo().alert();
		//Getting the Text from Alert
		System.out.println("The Message Present in Alert Window: "+alertwindow.getText());
		//Entering the Text from Alert
		alertwindow.sendKeys("Welcome to AlertPage");
		Thread.sleep(2000);
		//Closing the Alert with OK Button
		alertwindow.accept();
		
		
		
		
		
		
		
		
		
	}

}
