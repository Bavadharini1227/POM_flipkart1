package com.Flipkart.Testscenarios;

import org.testng.annotations.Test;

import com.Flipkart.base.TestBase;
import com.Flipkart.pages.AddToCart;
import com.Flipkart.pages.LoginPage;
import com.Flipkart.pages.PlaceOrderPage;
import com.Flipkart.pages.SearchProductPage;
import com.Flipkart.pages.SelectProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
  
  @BeforeClass
  public void setUp() {
		launchBrowser();
		navigateToURL();
  }

  @AfterClass
  public void tearDown() {
  }
  
  @Test(priority=1)
  public void loginTest() {
	  LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("8668077307", "Bhargav123");
		Assert.assertTrue(actResult);
  }
  
  @Test(priority=2)
  public void searchProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		boolean actResult = searchProductPage.validateSearchProduct(" dell laptop");
		Assert.assertTrue(actResult);
  }
  
  @Test(priority=3)
  public void selectProductTest() {
	  SelectProductPage selectProduct = new SelectProductPage();
	  boolean actResult = selectProduct.ValidateSelectProduct();
		Assert.assertTrue(actResult);
	  
  }
  
  @Test(priority=4)
  public void addToCartTest() {
	  AddToCart addproduct = new AddToCart();
	  addproduct.ValidateAddToCart();
	  
  }
  
  @Test
  public void placeOrderTest() {
	  PlaceOrderPage placeorder1= new PlaceOrderPage();
	  placeorder1.ValidatePlaceOrder();
  }
  
  @Test
  public void makePayment() {
  }
  
  @Test
  public void logoutTest() {
  }

}
