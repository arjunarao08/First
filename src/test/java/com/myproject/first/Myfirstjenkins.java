package com.myproject.first;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myfirstjenkins 
{
	WebDriver driver;
	@Test
	public void method1()
	{
		System.out.println("Method 1 started");
		Assert.assertTrue(true);
		System.out.println("Method 1 completed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method 2 started");
		Assert.fail("fail sucess");
		System.out.println("Method 2 completed");
	}
 
}
