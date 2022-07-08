package com.Flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Flipkart.base.TestBase;

public class AddToCart extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 public void  ValidateAddToCart() {
		wait(2000);
		By addtocart = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");

		WebElement addToCartButton = driver.findElement(addtocart);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", addToCartButton);

		wait(2000);
		driver.findElement(addtocart).click();

	 }
	
	

}
