package com.vTiger.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vTiger.ObjectRepository.CreateNewProductPage;
import com.vTiger.ObjectRepository.HomePage;
import com.vTiger.ObjectRepository.ProductsPage;
import com.vTiger.genericLib.Base;
@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class CreateProductTest extends Base
{
	public HomePage hp;
	public ProductsPage pp;
	public CreateNewProductPage cnp;
	@Test
	public void createProductTest()
	{
		hp = PageFactory.initElements(driver, HomePage.class);
		pp = PageFactory.initElements(driver, ProductsPage.class);
		cnp = PageFactory.initElements(driver, CreateNewProductPage.class);
		
		hp.getProductsLink().click();
		pp.getCreateProductImg().click();
		
		String productName = flib.getExcelData("Products", 1, 0);
		String manufacturer = flib.getExcelData("Products", 1, 2);
		String productCategory = flib.getExcelData("Products", 1, 3);
		String imagePath = "D:\\ALL SELENIUM\\WorkSpace\\ELF-3-BSC-BCA\\vTiger\\" + flib.getExcelData("Products", 1, 5);
		cnp.createProduct(productName, manufacturer, productCategory, imagePath, driver);
		
		System.out.println("Bye");
	}
}
