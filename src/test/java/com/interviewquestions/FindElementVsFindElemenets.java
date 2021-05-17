package com.interviewquestions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElemenets {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//findElement()----Returns the Single Web element.
		
		/*//Scenario-1 when the findElement locating to single element.
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.sendKeys("Mobiles");
		
		//Scenario-2 when the findElement locating to multiple elements.
		WebElement footerlinks=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(footerlinks.getText());
		
	//Scenario-3 Located element not presented in web page it will throw noSuchelement Exception.	
	WebElement SearchBtn=driver.findElement(By.xpath("//button[normalize-space()='Serch']"));*/
		
		
	//2.findElements()--Returns multiple web elements.
	//Scenario-1 	
	/*List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	System.out.println("Number of Links Cpatured:"+footerlinks.size());	
	
	//for traversing all the elements in the list we will use loop.
		for (WebElement ele : footerlinks)
		{
		System.out.println(ele.getText());			
		}
	*/
	
	//Scenario-2 we used findElements method but its locating to single element.
	//It will return located element
	/*List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println("size of captured elements: "+logo.size());*/

	//Scenario-3: When findElements not found any Xpath in web page it will return empty list.
		
	List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer-uppe']"));
	System.out.println("captured link count is:"+footerlinks.size());

		
		
		
	}

}
