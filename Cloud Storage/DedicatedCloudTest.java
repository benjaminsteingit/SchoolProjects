//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

/**
*Test class for cloud objects.
*/

public class DedicatedCloudTest {



	/**
	 * Method for testing the Getter methods.
	 */
	@Test public void getServerCostTest() {
		DedicatedCloud c1 = new DedicatedCloud("Cloud One", 
         40.00, 10.00); 
		Assert.assertEquals(c1.getName(), "Cloud One");
		Assert.assertEquals(c1.getBaseStorageCost(), 40.00, 0);
		Assert.assertEquals(c1.getServerCost(), 10.00, 0);
		Assert.assertEquals(c1.monthlyCost(), 50.00, 0);
		Assert.assertEquals(c1.getCount(), 1);
		c1.resetCount();
		Assert.assertEquals(c1.getCount(), 0);
   }
	
	/**
	 * Methods for testing the setter methods.
	 */
	@Test public void setterTest() {
		DedicatedCloud c1 = new DedicatedCloud("Cloud One", 
         40.00, 10.00);
		c1.setName("Cloud 1");
		Assert.assertEquals("Cloud 1", c1.getName());
		c1.setBaseStorageCost(50.00);
		Assert.assertEquals(c1.getBaseStorageCost(), 50.00, 0);
		c1.setServerCost(20.00);
		Assert.assertEquals(c1.getServerCost(), 20.00, 0);
		
	}
   
   /**
   *Method for testing the to String method.
   */
	@Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 
         40.00, 10.00);
         
      Assert.assertEquals(c1.toString(), c1.toString());
      System.out.print(c1.toString());
      System.out.print(c1);
   }
}
