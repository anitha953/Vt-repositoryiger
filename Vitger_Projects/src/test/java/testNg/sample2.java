package testNg;

import org.testng.annotations.Test;

public class sample2 {
	@Test(priority = -1)
	public void createProduct()
	{
		System.out.println("product is created");
	}
	@Test(priority =0)
	public void modifyProduct()
	{
		System.out.println("Product modified");
		
	}
	@Test(priority = 1)
	public void deleteProduct()
	{
		System.out.println("Product deleted");
		

	}
	}

