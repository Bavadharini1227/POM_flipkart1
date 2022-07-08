package com.Flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Flipkart.base.TestBase;

public class PlaceOrderPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	By placeorder = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[9]/div/form/button/span");
	
	public void ValidatePlaceOrder() {
		wait(2000);
		driver.findElement(placeorder).click();
	}

}
