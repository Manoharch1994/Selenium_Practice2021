package com.interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		//1.How Many Rows in table
		int tablerows=driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println("Total no.of rows in table: "+tablerows);
		
		//2.How Many Columns in table
		int tablecolumns=driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();
		System.out.println("Total no.of Columns in table: "+tablecolumns);
		
		//3.Retrieve the specific row/column data
		
		String colValue=driver.findElement(By.xpath("//table[@class='data-list']//tr[2]/td[1]")).getText();
		System.out.println("The Column Value: "+colValue);
		
		//3.Retrieve All the data from Table
		System.out.println("Data From the Table........");
		for(int r=1;r<=tablerows;r++)
		{
			for(int c=1;c<=tablecolumns;c++) {
				String tabledata=driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(tabledata+"          ");
			}
			System.out.println();
		}
		
		
		driver.quit();

	}

}
