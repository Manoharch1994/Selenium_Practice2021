package com.interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//1.Select the Specific CheckBox
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();//Monday will select
		
		//2.select all checkBoxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*System.out.println("Total Checkboxes size: "+checkboxes.size());
		
		//selecting all check boxes using for loop
		for(int i=0;i<checkboxes.size();i++)
		{
		checkboxes.get(i).click();
			
		}*/
		 
		//Using For each Loop
		/*for (WebElement chbox : checkboxes) {
			chbox.click();
			
		}*/
		//3.Selecting check boxes by choice
		
		/*for (WebElement chbox : checkboxes) {
			
			String checkboxnames=chbox.getAttribute("id");
			if(checkboxnames.equals("monday") || checkboxnames.equals("saturday"))
			{
				chbox.click();
				
			}*/
		
		//4.Select Last 2 Check boxes
		//Total no.of check boxes - no.of check boxes want to select=Starting Index.
			/*int totalcheckboxes=checkboxes.size();
			for(int i=totalcheckboxes-4;i<totalcheckboxes;i++)
			{
				checkboxes.get(i).click();
			}
		*/
		
		
		
		int totalcheckboxes=checkboxes.size();
		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<2)
			{
				checkboxes.get(i).click();

			}
		}
	
		
		
		//driver.close();
	}

}
