package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	
	//constructor 
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver,15);
	}
	
	//abstract methods
	 public abstract String getPageTitle();
	 public abstract String getPageHeader(By locator);
	 public abstract WebElement getElement(By locator);
	 public abstract void waitForElementToPresent(By locator);
	 

}
