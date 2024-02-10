import org.junit.Assert;
import org.junit.Test;

/**
*Test method for the shared cloud object.
*/

public class SharedCloudTest {

/**
*Test method for the shared cloud getters.
*/

	@Test public void getterTest() {
		SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
		Assert.assertEquals(c2.getDataStored(), 12.0, 0);
		Assert.assertEquals(c2.getDataLimit(), 20.0, 0);
		Assert.assertEquals(c2.getCostFactor(), 1.0, 0);
		Assert.assertEquals(c2.dataOverage(), 0, 0);
		c2.setDataLimit(3.0);
		Assert.assertEquals(c2.dataOverage(), 9.0, 0);
	
	}
	
/**
*Test method for the shared cloud setters.
*/   
   
	@Test public void setterTest() {
		SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
		c2.setDataStored(22.0);
		Assert.assertEquals(c2.getDataStored(), 22.0, 0);
		
	}
   
/**
*Test method for the monthly cost method.
*/
   
   @Test public void monthlyCostTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 
         9.00, 12.0, 20.0); 
      System.out.println(c2.getBaseStorageCost());
      System.out.println(c2.dataOverage());
      System.out.println(c2.getCostFactor());
         
      Assert.assertEquals(9, c2.monthlyCost(), 0);
   }
   
/**
*Test method for the toSting method.
*/

   @Test public void toStringTest() {
   
      SharedCloud c2 = new SharedCloud("Cloud Two", 
         9.00, 12.0, 20.0);
         
      Assert.assertEquals(c2.toString(), c2.toString());
   
   }

}
