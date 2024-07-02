package testNg;

import org.testng.annotations.Test;

public class sample1 {
	@Test(invocationCount = 2)
	public void createProduct()
	{
		System.out.println("product is created");
	}
	@Test
	public void modifyProduct()
	{
		System.out.println("Product modified");
		
	}
	@Test
	public void deleteProduct()
	{
		System.out.println("Product deleted");
		

	}
	}

