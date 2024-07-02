package testNg;

import org.testng.annotations.Test;

public class Sampletest {
	
@Test
public void createProduct()
{
	System.out.println("product is created");
}
@Test(enabled=false)
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