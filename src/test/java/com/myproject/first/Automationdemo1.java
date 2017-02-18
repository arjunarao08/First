package com.myproject.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Automationdemo1 
{
	public WebDriver driver;
	@Test
	public void inputforms()
	{
		//this is my second commit
		//this is my second commit
		//this is my 5th commit
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.id("user-message")).sendKeys("hai arjun");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.findElement(By.id("sum1")).sendKeys("15");
		driver.findElement(By.id("sum2")).sendKeys("30");
		driver.findElement(By.xpath("//form[@id='gettotal']/button")).click();
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		
	}

}
