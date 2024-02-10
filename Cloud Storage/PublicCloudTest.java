import org.junit.Assert;
import org.junit.Test;

/**
*Test method for the public cloud object.
*/

public class PublicCloudTest {

/**
*Test method for the public cloud getter methods.
*/

	@Test public void getterTest() {
		PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 
         25.0, 20.0);
      Assert.assertEquals(c4.getCostFactor(), 2.0, 0);		
	}
	
/**
*Test method for the monthly cost method.
*/
   
   @Test public void monthlyCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 
         9.00, 25.0, 20.0);
      System.out.println(c4.getBaseStorageCost());
      System.out.println(c4.dataOverage());
      System.out.println(c4.getCostFactor());
         
      Assert.assertEquals(19, c4.monthlyCost(), 0);
   }
}
