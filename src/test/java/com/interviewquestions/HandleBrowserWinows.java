package com.interviewquestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWinows {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//getWindowHandle()--which will return a String windowID
			//String windowID=driver.getWindowHandle();
			//System.out.println(windowID);//CDwindow-2BB42AEE051DDBB7B476FB39E05EBB4C
										 //CDwindow-EAC53E6E9EA0C214B84DA2CA57BFFC94
			
			//Opens another browser window -- child Window
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		//getwindowHandles()
			Set<String> windowIDs=driver.getWindowHandles();//return ID's of multiple browser windows.
			
			//Using Iterator:
			
			Iterator<String> it=windowIDs.iterator();
			
			String ParentwindowID=it.next();
			String ChildwindowID=it.next();
			
			//System.out.println("Parent Window ID: "+ParentwindowID);
			//System.out.println("Child Window ID: "+ChildwindowID);
			
			//How to use windowID's for switching
			
			driver.switchTo().window(ParentwindowID);
			System.out.println("Parent Window title: "+driver.getTitle());
			
			driver.switchTo().window(ChildwindowID);
			System.out.println("Child Window title: "+driver.getTitle());
			
		

		
		
		
		
		
		
	}

}
